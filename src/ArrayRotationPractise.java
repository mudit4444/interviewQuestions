import java.util.Arrays;

public class ArrayRotationPractise {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};

        ArrayRotationPractise obj = new ArrayRotationPractise();
        obj.leftRotation(arr1, 2);
        obj.rightRotate(arr2 , 2);
    }

    public void leftRotation(int[] arr, int n) {

        int len = arr.length;
        for (int i = 0; i <= n; i++) {

            int first = arr[0];

            for (int j = 0; j < len-1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[len - 1] = first;
        }
        System.out.println("Printing the left rotated array");
        System.out.println(Arrays.toString(arr));
    }

        public void rightRotate ( int[] arr, int n){
            int len = arr.length;

            for (int i = 0; i <= n; i++) {

                int last = arr[len - 1];

                for (int j = len-1; j > 0; j--) {
                    arr[j] = arr[j-1];
                }
                arr[0] = last;
            }
            System.out.println("Printing the right rotated array");
            System.out.println(Arrays.toString(arr));
        }
}