package Nikola.e10;
import java.util.Scanner;
public class main10 {
    public static void main(String[] args) {

            //int num1;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number 1: ");
            //num1 = Integer.parseInt(sc.nextLine());
            float f = sc.nextFloat();
            System.out.println(f + "*10 is=" + f*10);

            Scanner SCA = new Scanner(System.in);
            System.out.print("Enter your Name: ");
            String Name1 = SCA.nextLine();
            System.out.println("hello " + Name1 + " have a nice day!");
            System.out.print("How old are you? ");
            int age = SCA.nextInt();
            int byear = 2020 - age;
            System.out.println("If it is still 2020. You was born: " + byear);

            //calc scanner
            System.out.println("Enter 2 numbers(use enter after the every number!: ) ");
            float n1 = SCA.nextFloat();
            float n2 = SCA.nextFloat();
            float sum = n1 + n2;
            float dif = n1 - n2;
            float p = n1 * n2;
            float d = n1 / n2;
            System.out.println(n1 + " + " + n2 + " = " + sum);
            System.out.println(n1 + " - " + n2 + " = " + dif);
            System.out.println(n1 + " * " + n2 + " = " + p);
            System.out.println(n1 + " / " + n2 + " = " + d);

            //Scanner in = new Scanner(System.in);

        //System.out.println("Enter a string: ");
        //String s = in.nextLine();
        //System.out.println("You entered: " + s);
        //System.out.println("Enter a number: ");
        //int i = in.nextInt();
        //System.out.println("You entered: " + i);
        //System.out.println("Enter a decimal number: ");
        //float f = in.nextFloat();
        //System.out.println("You entered: " + f);

        }

}
