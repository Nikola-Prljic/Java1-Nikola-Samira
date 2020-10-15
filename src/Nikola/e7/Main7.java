package Nikola.e7;

public class Main7 {
    public static void main (String[] args){
        int i;
        double[] a = {12, 95, 3, 10, 45.7};
        int n = 5;
        double Average = 0;

        for(i=0; i<n; i++){
            Average += a[i];
        }

        System.out.println("The average value of "+ (int)a[0] +" "+ (int)a[1]+" "+ (int)a[2]+" "+ (int)a[3]+" " + a[4] + " = "+ Average/n);


    }
}
