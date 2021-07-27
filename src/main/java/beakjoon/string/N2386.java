package beakjoon.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class N2386 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";

        while ((input = br.readLine()).length() != 1) {
            char target = input.charAt(0);
            String str = input.substring(2);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == target || (char) (str.charAt(i) + 32) == target) {
                    count++;
                }
            }
            bw.write(target);
            bw.write(" ");
            bw.write(count + "\n");

        }

        bw.flush();
        br.close();
        bw.close();
    }

}