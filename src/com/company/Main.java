package com.company;

public class Main {

    public static void main(String[] args) {
        String[] wordArr = {"Wheels", "on", "the", "bus"};
        RandomStringChooser x = new RandomStringChooser(wordArr);
        System.out.println("Part A:");
        for(int i = 0; i < 6; i++)
        {
            System.out.println(x.getNext() + " ");
        }

        System.out.println("\nPart B:");
        RandomLetterChooser y = new RandomLetterChooser("cat");
        for(int i = 0; i < 4; i++)
        {
            System.out.println(y.getNext() + " ");
        }

    }
}
