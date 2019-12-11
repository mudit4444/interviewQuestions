import java.util.*;
import java.io.*;

//a+2^0.b , (a+2^0.b + 2^1.b), (a+2^0.b + 2^1.b + 2^2.b)

    public class MultiLoopQuestion {

        public static void main(String[] argh) {
            Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            System.out.println("Enter the variables");
            for (int i = 0; i < t; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();

                series(a, b, n);
            }
        }

        public static void series(int a, int b, int n) {
            double sum = a+b;
            for (int i = 1; i < n; i++) {
                    sum += ((Math.pow(2 , i) )* b);
                    System.out.println("the sum is " + sum);
                }
            //System.out.println(sum);
        }
    }
