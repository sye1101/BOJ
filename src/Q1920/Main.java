package Q1920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static HashSet<Integer> nSet;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        nSet = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            nSet.add(tmp);
        }

        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            if (nSet.contains(tmp)) System.out.println(1);
            else System.out.println(0);
        }
    }
}
