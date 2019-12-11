import java.util.Scanner;

public class FindingPrime {

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter til where you need prime number");
        int num = sc.nextInt();*/
        int i;
        int num;
        String primenumber = "";
        for (i = 1; i <= 100; i++) {//for the numbers to be checked as prime
            int count =0;
            for (num = i; num >= 1; num--) {                      // for the divisor

                if (i % num == 0) {
                    count++;
                }
            }
            if (count == 2) {
                primenumber = primenumber + i + " ";
            }
        }
        System.out.println("Prime number are ");
        System.out.println(primenumber + "");
    }
    }
