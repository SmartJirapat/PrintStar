import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int rows = 5;

        //Define Line
        for (int i=1; i<= rows ; i++)
        {

            //Define Space
            for (int j = i; j < rows ; j++) {
                if (i == rows/2+1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }

            }
            for (int k = 1; k <= (2*i -1) ;k++) {
                if ( k == 1+((2*i-2)/2) || k == (2*i-2) || k == 1 ){
                    if (i == (rows/2 + 2)){
                        System.out.print("*");
                    }
                }
                if (k == i*2-2 || k == i*2-1 ){
                    if (i == rows/2+1){
                        System.out.print("*");
                    }
                }
                if( k==1 || k==(2*i-1) ) {
                    if (i != rows/2+1 && i != rows/2 + 2) {
                        System.out.print("*");
                    }
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
}