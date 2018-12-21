package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RandomStringChooser {
    private ArrayList<String> tempList;

    public RandomStringChooser(String[] str)
    {
        tempList = new ArrayList();
        for(int i = 0; i < str.length; i++)
        {
            tempList.add(str[i]);
        }
    }

    public String getNext()
    {
        if(tempList.size() > 0)
        {
            int x = (int)(Math.random() * (tempList.size()-1));
            String out = tempList.get(x).toString();
            tempList.remove(x);
            return out;
        }
        return "NONE";
    }
}
