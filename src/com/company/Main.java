package com.company;

public class Main {

    static boolean CzyToPalindrom (String p) {
        int i = 0;
        int j = p.length() - 1;
        while (i<j) {
            if (p.charAt(i) != p.charAt(j))
                return  false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String p = "xyzjxjzyx";

        if (CzyToPalindrom(p))
            System.out.print("Tak");
        else
            System.out.print("Nie");
    }
}