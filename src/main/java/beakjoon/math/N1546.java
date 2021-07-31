package beakjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1546 {

    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int repeat = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] scores = new int[repeat];
        double result = 0;

        // input
        for (int i = 0; i < repeat; i++) {
            int input = Integer.parseInt(st.nextToken());
            if (input > max) {
                max = input;
            }
            scores[i] = input;
        }

        // cacl
        for (int i = 0; i < repeat; i++) {
            result += calc(scores[i]);
        }

        System.out.println(String.format("%.6f", result / repeat));
    }

    private static float calc(int score) {
        return score / max * 100;
    }

}