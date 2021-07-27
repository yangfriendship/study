package beakjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2154 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int N = Integer.parseInt(input);
        int checkSize = input.length();
        StringBuffer bf = new StringBuffer();
        int index = 0;
        for (int i = 1; i <= N; i++) {
            bf.append(i);
        }
        for (int i = 0; i < bf.length() - checkSize + 1; i++) {
            boolean flag = false;
            for (int j = 0; j < checkSize; j++) {
                if (bf.charAt((i + j)) != input.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                index = i + 1;
                break;
            }
        }

        System.out.println(index);
    }

}