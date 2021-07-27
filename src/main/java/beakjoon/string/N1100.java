package beakjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1100 {

    static int LENGTH = 8;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        for (int i = 0; i < LENGTH; i++) {
            String input = br.readLine();
            for (int j = 0; j < LENGTH; j++) {
                if (isWhite(i, j) && input.charAt(j) == 'F') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static boolean isWhite(int y, int x) {
        return (y + x) % 2 == 0;
    }

}
