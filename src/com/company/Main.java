package com.company;

public class Main {

    public static void main(String[] args) {
        String Символи = "Ні, NO, N, -, No";

        int options = 2;
        switch (Символи) {
            case "Так, ОК, Yes, Y, +, Ok":
                switch (options) {
                    case 1:
                        System.out.println("Погодитись");
                        break;
                    case 2:
                        System.out.println("Погодитись");
                        break;
                    case 3:
                        System.out.println("Погодитись");
                        break;
                    case 4:
                        System.out.println("Погодитись");
                        break;
                    case 5:
                        System.out.println("Погодитись");
                        break;
                    case 6:
                        System.out.println("Погодитись");
                        break;
                    default:
                        System.out.println("Ви вказали неіснуючий символ!");
                }
                break;
            case "Ні, NO, N, -, No":
                switch (options) {
                    case 1:
                        System.out.println("Відмовитись");
                        break;
                    case 2:
                        System.out.println("Відмовитись");
                        break;
                    case 3:
                        System.out.println("Відмовитись");
                        break;
                    case 4:
                        System.out.println("Відмовитись");
                        break;
                    case 5:
                        System.out.println("Відмовитись");
                        break;
                    default:
                        System.out.println("Ви вказали неіснуючий символ!");

                }

        }
    }
}