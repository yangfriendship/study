package beakjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1371 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] chars = new int[26];
        String input = "";
        while ((input = br.readLine()) != null) {
            char[] charArray = input.toCharArray();

            for (int i = 0; i < charArray.length; i++) {
                char target = charArray[i];
                try {
                    chars[target - 97] = chars[target - 97] + 1;
                } catch (Exception e) {
                    // do noting
                }
            }
        }
        printEqualMax(chars);
    }

    private static void printEqualMax(int[] chars) {
        StringBuffer bf = new StringBuffer();
        int max = Integer.MIN_VALUE;
        for (int num : chars) {
            if (num > max) {
                max = num;
            }
        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == max) {
                bf.append((char) (97 + i));
            }
        }
        System.out.println(bf);
    }

}