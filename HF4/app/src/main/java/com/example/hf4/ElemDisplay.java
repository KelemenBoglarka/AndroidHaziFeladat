package com.example.hf4;

public class ElemDisplay {
    protected static final Integer[] imageArray = new Integer[]{
            R.drawable.aud,
            R.drawable.cad,
            R.drawable.chf,
            R.drawable.dkk,
            R.drawable.eur,
            R.drawable.gbr,
            R.drawable.huf,
            R.drawable.usd
    };
    protected static final String[] nameArray = new String[]{
            "AUD","CAD","CHF","DKK","EUR","GBR","HUF","USD"
    };
    protected static final String[] infoArray = new String[]{
            "Dolar australian","Dolar canadian", "Coroana daneza",
            "Lira sterlina", "Euro","Franc elvetian", "Forint maghiar",
             "Dolar american"

    };
    protected static final double[] buyInfoArray = new double[]{
            2.9600, 3.095,4.23,0.585,4.41,6.125,0.01236,3.975
    };
    protected static final double[] sellInfoArray = new double[]{
            3.06, 3.265, 4.33, 0.615, 4.55, 6.355, 0.0146, 4.145
    };

    public static Integer[] getImageArray() {
        return imageArray;
    }

    public static String[] getNameArray() {
        return nameArray;
    }

    public static String[] getInfoArray() {
        return infoArray;
    }

    public static double[] getBuyInfoArray() {
        return buyInfoArray;
    }

    public static double[] getSellInfoArray() {
        return sellInfoArray;
    }
}
