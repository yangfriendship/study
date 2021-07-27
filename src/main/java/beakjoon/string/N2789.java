package beakjoon.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class N2789 {

    static char[] ignores = new char[]{'C', 'A', 'M', 'B', 'R', 'I', 'D', 'G', 'E'};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer bf = new StringBuffer();

        String input = br.readLine();
        for (char c : input.toCharArray()) {
            boolean flag = false;
            for (char ignore : ignores){
                if (ignore == c){
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                bw.write(c);
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }

}