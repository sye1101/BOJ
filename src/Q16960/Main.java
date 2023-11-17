package Q16960;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static int n, m;
    static int[] nums;
    static ArrayList<Integer>[] arrayLists;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        nums = new int[m+1]; // 램프 개수
        arrayLists = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            arrayLists[i] = new ArrayList<>();
        }

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken()); // 스위치에 연결된 램프 개수
            for (int j = 0; j < num; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                arrayLists[i].add(tmp);
                nums[tmp]++;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (check(i)) {
                System.out.println(1);
                return;
            }
        }
        System.out.println(0);
    }

    private static boolean check(int idx) {
        boolean flag = true;
        for (int num:arrayLists[idx]) {
            nums[num]--;
            if (nums[num] <= 0) flag = false;
        }

        for (int num:arrayLists[idx]) {
            nums[num]++;
        }
        return flag;
    }
}
