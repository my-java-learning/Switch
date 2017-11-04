package com.example;

public class Main {

    public static void main(String[] args) {
//        int value = 3;
//
//        if(value == 1){
//            System.out.println("Value was 1");
//        } else if(value == 2){
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

//        int switchValue = 3;
//
//        switch (switchValue){
//            case 1:
//                System.out.println("Value was 1");
//                break;
//
//            case 2:
//                System.out.println("Value was 2");
//                break;
//
//            case 3: case 4: case 5:
//                System.out.println("Was 3 or 4 or 5");
//                System.out.println("It was : " + switchValue);
//                break;
//
//            default:
//                System.out.println("Was not 1 or 2 or 3 or 4 or 5");
//                break;
//        }

//        char switchChar = 'B';
//
//        switch (switchChar){
//            case 'A':
//                System.out.println("Char: A");
//                break;
//
//            case 'B':
//                System.out.println("Char: B");
//                break;
//
//            case 'C':
//                System.out.println("Char: C");
//                break;
//
//            case 'D':
//                System.out.println("Char: D");
//                break;
//
//            case 'E':
//                System.out.println("Char: E");
//                break;
//
//            default:
//                System.out.println("Char was not an A or B or C or D or E");
//                break;
//        }

        String switchString = "January";

        switch (switchString.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not sure");
                break;
        }
    }
}
