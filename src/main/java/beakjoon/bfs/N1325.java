package beakjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class N1325 {

    static boolean[] visit;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        visit = new boolean[N];
        ArrayList<Integer>[] map = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            map[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken()) - 1;
            int B = Integer.parseInt(st.nextToken()) - 1;
            map[B].add(A);
        }
        List<Integer> result = new LinkedList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            visit = new boolean[N];
            int count = search(map, i);
            result.add(count);
            max = Math.max(max, count);
        }

        final StringBuffer sb = new StringBuffer();
        int loopSize = result.size();
        for (int i = 0; i < loopSize; i++) {
            if (result.get(i) == max) {
                sb.append(i + 1).append(" ");
            }
        }
        System.out.println(sb);
    }

    private static int search(ArrayList<Integer>[] map, int root) {
        int result = 0;
        Queue<Integer> que = new LinkedList<>();
        que.add(root);
        visit[root] = true;

        while (!que.isEmpty()) {
            Integer curr = que.remove();
            for (int i = 0; i < map[curr].size(); i++) {
                int target = map[curr].get(i);
                if (visit[target]) {
                    continue;
                }
                result++;
                visit[target] = true;
                que.add(target);
            }
        }
        return result;
    }

}
