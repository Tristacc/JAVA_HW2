package com.homeWork;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n != 0) {
            in.nextLine();
            String name = in.nextLine();
            double st1_c = in.nextDouble();
            double st1_e = in.nextDouble();
            double st1_s = in.nextDouble();
            double st1_m = in.nextDouble();
            in.close();
            double st1_average = (st1_c + st1_e + st1_s + st1_m) / 4;

            if (st1_average < 60){ System.out.println("FAIL");}
            else if (st1_average >= 60 ){ System.out.println("PASS");}

            n=n-1;
        }



        }

    }


