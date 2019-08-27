package se.ec.ahmedNew;


import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

    public class App {

        public static void main(String[] args) {
            Scanner calc = new Scanner(System.in);
            double fnum=0,snum=0;
            String result="";
            boolean bool=true;
            while(bool) {
                try {
                    System.out.println("enter a number");
                    fnum = Double.parseDouble(calc.nextLine());
                    System.out.println("enter + - * /");
                    result = calc.nextLine();
                    System.out.println("enter a second number");
                    snum = Double.parseDouble(calc.nextLine());
                }catch (NumberFormatException a){
                    System.out.println("");
                }
                switch (result) {
                    case "+":
                        System.out.println(plus(fnum,snum));
                        break;
                    case "-":
                        System.out.println(minus(fnum,snum));
                        break;
                    case "*":
                        System.out.println(multi(fnum,snum));
                        break;
                    case "/":
                        System.out.println(divide(fnum,snum));
                        break;
                    default:
                        System.out.println("you have a error dude");
                        break;
                }

                System.out.println("Do you wish to continue yes/no?");
                String desicion = calc.nextLine();



                if (desicion.contains("Yes") || desicion.contains("yes")) {
                    System.out.println("thats the spirit keep going");
                    bool=true;


                }
                if (desicion.contains("No") || desicion.contains("no")) {
                    System.out.println("You are done calculating!");
                    System.out.println("lazy dude");
                    bool=false;

                }


            }
        }
        public static double plus (double fnum,double snum)
        {
            return fnum + snum;
        }
        public static double minus(double fnum, double snum){
            return fnum-snum;
        }
        public static double multi(double fnum,double snum){
            return fnum*snum;
        }
        public static double divide(double fnum, double snum){
            return fnum/snum;
        }
    }

