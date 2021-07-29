package beakjoon.binary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class N1920 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Integer> numbers = Arrays.stream(br.readLine().split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
        Collections.sort(numbers);

        int M = Integer.parseInt(br.readLine());
        Integer[] targets = Arrays.stream(br.readLine().split(" "))
            .map(Integer::parseInt)
            .toArray(Integer[]::new);

        for (int i = 0; i < targets.length; i++) {
            int target = targets[i];
            int left = 0;
            int right = numbers.size() - 1;
            boolean flag = false;
            while (right >= left) {
                int mid = (left + right) / 2;
                Integer number = numbers.get(mid);
                if (target == number) {
                    flag = true;
                    break;
                }
                if (number > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            if (flag) {
                System.out.println('1');
            } else {
                System.out.println('0');
            }

        }

    }

}