package Q10815;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> ns = new HashMap<>();

        for (int i = 0; i < n; i++) {
            ns.put(st.nextToken(), 0);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            if (ns.get(st.nextToken()) != null) sb.append(1).append(' ');
            else sb.append(0).append(' ');
        }
        System.out.println(sb);
    }
}
