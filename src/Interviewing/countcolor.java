package Interviewing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class countcolor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cols = new int[n + 1];
        List<List<Integer>> colss = new ArrayList<List<Integer>>();
        colss.add(new ArrayList<Integer>());
        for (int i = 1; i <= n; i++) {
            cols[i] = sc.nextInt();
            List<Integer> begin = new ArrayList<Integer>();
            begin.add(cols[i]);
            colss.add(begin);
        }
        for (int i = 1; i <= n; i++)
            for (int j = 2; j <= n / i; j++)
                colss.get(i * j).add(cols[i]);
        for (int i = 1; i <= n; i++) {
            Collections.sort(colss.get(i));
            int ans = 1;
            for (int j = 1; j < colss.get(i).size(); j++)
                if (colss.get(i).get(j) != colss.get(i).get(j - 1)) ans++;
            System.out.print(ans + " ");
        }
    }
}
