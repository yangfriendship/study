package beakjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N1225 {


    public static void main(String[] args) throws IOException {
        long sum = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        br.close();

        char[] leftNumber = inputs[0].toCharArray();
        char[] rightNumber = inputs[1].toCharArray();

        for (int i = 0; i < leftNumber.length; i++) {
            for (int j = 0; j < rightNumber.length; j++) {
                sum += multiplyChar(leftNumber[i], rightNumber[j]);
            }
        }

        System.out.println(sum);
    }

    static int multiplyChar(char x, char y) {
        return (y - 48) * (x - 48);
    }

}