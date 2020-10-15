package Nikola.e11;
import java.util.Scanner;
public class Main11 {
    public static void main(String[] args){
        //Input number: 5
        //Value of 5 + 55  + 555 is 615
        //int i = 0;
        Scanner SCA = new Scanner(System.in);
        System.out.print("Enter your number: ");
        String n = SCA.nextLine();
        if (n.matches("[0-9]")) {
            System.out.println(n + " + " + n + n + " + " + n + n + n + " = "
                    + (Integer.parseInt(n) + Integer.parseInt(n + n) + Integer.parseInt(n + n + n)));
        } else {
            System.out.println("Error: invalid input.");
        }

    }
}
