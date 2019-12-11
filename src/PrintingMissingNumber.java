import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class PrintingMissingNumber {

    private final static Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main(String[] args) {

        int arr[] = {1,2,5};
        findMissing(arr);


    }
    public static void sorting(int[] arr) {
        List<Integer> myarr = new ArrayList(Arrays.asList(arr));
        Collections.sort(myarr);

        //return sortedArray;
    }
    public static void findMissing(int[] arr) {

        List<Integer> myarr = new ArrayList(Arrays.asList(arr));
        Collections.sort(myarr);
        for(int i=0 ; i< myarr.size() ; i++) {
            if(arr[i] != 1) {
                log.info("1 is the missing one");
            }

            if(arr[i+1] - arr[i] > 1){
                log.info("There is someone else too who is missing");
                log.info(+ (arr[i] +1 ) + "is the missing one");
            }
        }
    }
}
