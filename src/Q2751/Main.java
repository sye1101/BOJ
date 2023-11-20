package Q2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(al);

        StringBuilder sb = new StringBuilder();

        for (int s : al) {
            sb.append(s).append('\n');
        }
        System.out.println(sb);
    }
}