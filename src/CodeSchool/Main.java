package CodeSchool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        checkNumber(inputPhoneNumber());
    }

    public static String inputPhoneNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input phone number:");
        String phoneNumber1 = sc.nextLine();
        return phoneNumber1;
    }

    public static void checkNumber(String phoneNumber) {

        if (phoneNumber.length() == 9 && phoneNumber.matches("[0-9]+")) {
            String phoneNumberSub = phoneNumber.substring(0, 3);

            switch (phoneNumberSub) {

                case "093":
                case "094":
                case "098":
                    System.out.println(phoneNumber + " phone number is Vivacell");
                    break;

                case "099":
                case "095":
                    System.out.println(phoneNumber + " phone number is Beeline");
                    break;

                case "044":
                    System.out.println(phoneNumber + " phone number is Ucom");
                    break;
                default:
                    System.out.println(phoneNumberSub + " phoneCode does not exist");

            }
        } else {
            System.out.println(phoneNumber + " Wrong phone number \nPhone number length is 9 (Ex.099999999) and Enter only number(0-9)");
            checkNumber(inputPhoneNumber());
        }
    }
}
