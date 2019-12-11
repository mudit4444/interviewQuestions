import java.util.Scanner;

public class toSum {
    Scanner sc = new Scanner(System.in);

    public void sum() {
        int i=0;
        System.out.println("Enter the length of the array");
        int len = sc.nextInt();
        int arr[] = new int[len];

        //the magic number
        System.out.println("The magic number, whose sum needs to be matched to ");
        int magicNumber = sc.nextInt();

        //for(int i= 0; i <= len ; i++) {
        while(i < len) {
            System.out.println("Enter the " +i + " element of the array");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.println("Final array is " + arr.toString());

        //Computating the sum as per the required value match

        for(int j = 0 ; j <= len ; j++) {
            if(arr[j] + arr[j+1] > magicNumber) {
                return;
            }
            else {
                if(arr[j]+arr[j+1] == magicNumber) {
                    System.out.println("the numbers are " +j + "and" + j+1);
                }
            }
        }
    }

    public static void main(String args[]) {
        toSum object = new toSum();
        object.sum();
    }
}
