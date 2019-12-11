import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class DivsionCheckEnY {

    public static void main(String[] args) {
        List<Integer> songs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Etner the values");
 
        int num = scanner.nextInt();

        for(int i = 0 ; i < num ; i ++) {
            int val = scanner.nextInt();
            songs.add(val);
        }
        getCount(songs);
    }

    public static int getCount(List<Integer> songs) {
        int count = 0;
        for (int i = 0; i < songs.size(); i++) {
            for (int j = i + 1; j < songs.size(); j++) {
                if ((songs.get(i) + songs.get(j) % 60 == 0)) {
                    count++;
                }
            }
        }
        return count;
    }
}