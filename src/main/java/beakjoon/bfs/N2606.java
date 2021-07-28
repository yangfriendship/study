package beakjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2606 {

    static int count = 0;
    static int[][] computers;
    static int node;
    static boolean[] visited;
    static int totalCnt;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        totalCnt = Integer.parseInt(br.readLine());
        node = Integer.parseInt(br.readLine());
        visited = new boolean[totalCnt];
        computers = new int[totalCnt][totalCnt];

        for (int i = 0; i < node; i++) {
            String[] strings = br.readLine().split(" ");
            int com1 = Integer.parseInt(strings[0]) - 1;
            int com2 = Integer.parseInt(strings[1]) - 1;
            computers[com1][com2] = 1;
            computers[com2][com1] = 1;
        }

        search(0);
        System.out.println(count);
    }

    public static void search(int dept) {
        visited[dept] = true;

        for (int i = 0; i < totalCnt; i++) {
            if (computers[dept][i] == 1 && !visited[i]) {
                count++;
                search(i);
            }
        }
    }
}