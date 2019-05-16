package Mario;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("How many classes did you have?: ");
        int classes = input.nextInt();
        String grades = "";
        int total = 0;
        int dec;



        for (int j = 0; j < classes; j++) {

            Scanner inputters = new Scanner(System.in);
            System.out.print("What is your Grade?: ");
            grades = inputters.nextLine();


            if (grades.equals("A")){
                dec = 4;
                total += dec;

            } else if (grades.equals("B")){
                dec = 3;
                total += dec;

            } else if (grades.equals("C")){
                dec = 2;
                total += dec;

            } else if (grades.equals("D")){
                dec = 1;
                total += dec;

            } else if (grades.equals("F")){
                dec = 0;
                total += dec;

            }

        }


        double GPA = total / classes;
        System.out.println(GPA);

        DecimalFormat formatter = new DecimalFormat("0.##");
        System.out.println( formatter.format(GPA));

    }
}
