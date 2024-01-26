/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cifer.coffeestoremanagement.util;

import java.util.Scanner;

/**
 *
 * @author hd
 */
public class Utils {

    private static Scanner sc;

    public static String autoGenerateId(String prefix, int length, int currentSize) {
        String format = "%0" + length + "d"; // %07d
        return prefix + String.format(format, currentSize);
    }

    public static String getString(String welcome, int stringLength) {
        String result = "";
        sc = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.print(welcome);
            result = sc.nextLine();
            if (!result.isEmpty() && result.length() <= stringLength) {
                check = false;
            }
            if (check) {
                System.out.println("Something wrong, input again");
            }
        } while (check);
        return result;
    }

    public static int getNumber(String welcome, int min, int max) {
        int result = 0;
        boolean check = true;
        sc = new Scanner(System.in);
        do {
            try {
                System.out.print(welcome);
                String stringResult = sc.nextLine();
                result = Integer.parseInt(stringResult);
                if (result >= min && result <= max) {
                    check = false;
                }
                if (check) {
                    System.out.println("Something wrong, input again");
                }
            } catch (Exception e) {
                System.out.println("Something wrong, input again");
            }
        } while (check);
        return result;
    }

    public static String getPhoneNumber(String welcome) {
        String result = "";
        sc = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.print(welcome);
            result = sc.nextLine();
            if (!result.isEmpty() && result.matches("^[0-9]{10}$")) {
                check = false;
            }
            if (check) {
                System.out.println("Something wrong, input again");
            }
        } while (check);
        return result;
    }

    public static String updateString(String welcome, int stringlength, String oldValue) {
        String result = "";
        System.out.print(welcome);
        sc = new Scanner(System.in);
        result = sc.nextLine();
        boolean check = true;
        do {
            if (result.isEmpty()) {
                result = oldValue;
                System.out.println("Program will keep the old info");
                check = false;
            } else if (result.length() <= stringlength) {
                check = false;
            }
            if (check) {
                System.out.println("Something wrong, input again");
            }
        } while (check);

        System.out.println("Update successfully");
        return result;
    }

    public static int updateNumber(String welcome, int min, int max, int oldValue) {
        int result = 0;
        boolean check = true;
        sc = new Scanner(System.in);
        do {
            try {
                System.out.print(welcome);
                String str = sc.nextLine();
                if (str.isEmpty()) {
                    result = oldValue;
                    check = false;
                    System.out.println("Program will keep the old info");
                } else {
                    result = Integer.parseInt(str);
                    if (result >= min && result <= max) {
                        check = false;
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        } while (check);
        System.out.println("Update successfully");
        return result;
    }

    public static String updatePhoneNumber(String welcome, String oldValue) {
        String result = "";
        boolean check = true;
        sc = new Scanner(System.in);
        do {
            try {
                System.out.print(welcome);
                String str = sc.nextLine();
                if (str.isEmpty()) {
                    result = oldValue;
                    check = false;
                    System.out.println("Program will keep the old info");
                } else if (str.matches("^[0-9]{10}$")) {
                    result = str;
                    check = false;
                } else {
                    System.out.println("Something wrong, input again");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (check);
        System.out.println("Update successfully");
        return result;
    }

    public static boolean getBoolean(String welcome) {
        boolean check = false;
        System.out.print(welcome);
        sc = new Scanner(System.in);
        int loopCheck = 1;
        do {
            String str = sc.nextLine();
            if ("y".equalsIgnoreCase(str)) {
                check = true;
                loopCheck = 0;
            } else if ("n".equalsIgnoreCase(str)) {
                check = false;
                loopCheck = 0;
            } else {
                System.out.println("Something wrong, input again, just use Y/N");
            }
        } while (loopCheck == 1);
        return check;
    }
}
