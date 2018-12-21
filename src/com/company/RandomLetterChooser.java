package com.company;

public class RandomLetterChooser extends RandomStringChooser {

    public RandomLetterChooser(String str)
    {
        super(getSingleLetters(str));
    }

    public static String[] getSingleLetters(String str)
    {
        String[] out = new String[str.length()];
        for(int i = 0; i < str.length(); i++)
        {
            out[i] = Character.toString(str.charAt(i));
        }
        return out;
    }

}
