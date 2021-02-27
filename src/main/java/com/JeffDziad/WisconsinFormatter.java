package com.JeffDziad;

public class WisconsinFormatter implements DriversLicenseFormatter {

    @Override
    public String formatLicenseNumber(DriversLicense driversLicense) {
        //SSSS-FFFY-YDDD-NN
        String SSSS = driversLicense.getSoundexCode();
        int FFF = driversLicense.getFirstNameMiddleInitial();
        int intYY = driversLicense.getBirthYear();
        String stringYY = Integer.toString(intYY);
        char firstYY = stringYY.charAt(2);
        char secondYY = stringYY.charAt(3);
        int DDD = driversLicense.getBirthMonthDayGender();
        String dddFormatted = String.format("%03d", DDD);
        int NN = driversLicense.getOverflow();
        String nnFormatted = String.format("%d%d", NN, NN);
        return String.format("%s-%d%c-%c%s-%s", SSSS, FFF, firstYY, secondYY, dddFormatted, nnFormatted);
    }

}
