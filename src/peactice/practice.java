package peactice;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String st1 = in.nextLine();
        double st1_c = in.nextDouble();
        double st1_e = in.nextDouble();
        double st1_s = in.nextDouble();
        double st1_m = in.nextDouble();
        in.nextLine();
        String st2 = in.nextLine();
        double st2_c = in.nextDouble();
        double st2_e = in.nextDouble();
        double st2_s = in.nextDouble();
        double st2_m = in.nextDouble();
        in.nextLine();
        String st3 = in.nextLine();
        double st3_c = in.nextDouble();
        double st3_e = in.nextDouble();
        double st3_s = in.nextDouble();
        double st3_m = in.nextDouble();
        in.close();


        double st1_sum = (st1_c + st1_e + st1_s + st1_m) / 4;
        double st2_sum = (st2_c + st2_e + st2_s + st2_m) / 4;
        double st3_sum = (st3_c + st3_e + st3_s + st3_m) / 4;

        System.out.println(st1 + " " + st1_sum);
        System.out.println(st2 + " " + st2_sum);
        System.out.println(st3 + " " + st3_sum);
    }
}
