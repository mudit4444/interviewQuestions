public class RandomPractise {

    final static int i= 2001;

    public void settingValue() {
        //i =100;
    }

    public static void main(String args[]) {
        //i =100;                                         //on printing the value, the output comes out 0.
        RandomPractise random = new RandomPractise();
        //random.i=1001;                                // value comes out as 1001
        System.out.println("value of i = " + i);
    }
    /*static {
        i =10;
    }*/

}
