package Nikola.e8;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class main8 {
    public static void main(String[] args)throws IOException {
        //byte – 8 bits and signed

        //short – 16 bits and signed

        //char – 16 bits and unsigned, so that it may represent Unicode characters

        //int – 32 bits and signed

        //long – 64 bits and signed

        //float – 32 bits and signed

        //double – 64 bits and signed

        //boolean – it's not numeric, may only have true or false values

        System.out.print("Write something: ");

        // Using Console to input data from user
        //Enter data using BufferReader
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        // Reading data using readLine
        String name = reader.readLine();

        // Printing the read line
        System.out.println(name);

    }
}
