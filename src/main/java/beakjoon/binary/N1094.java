package beakjoon.binary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1094 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int count = 0;
        while (X != 0) {
            int num = X % 2;
            if (num == 1) {
                count++;
            }
            X /= 2;
        }
        System.out.println(count);
    }

}
