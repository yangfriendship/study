package beakjoon.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class N2459 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 3; i++) {
            String input = br.readLine();
            int count = 1;
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < input.length() - 1; j++) {
                if ((input.charAt(j) - '0') != (input.charAt(j + 1) - '0')  ) {
                    max = Math.max(max, count);
                    count = 1;
                    continue;
                }
                count++;
                if(j ==  input.length() -2){
                    max = Math.max(max, count);

                }
            }
            bw.write(max + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

}