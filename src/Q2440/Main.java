package Q2440;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int tmp = n;
        for (int i = 0; i < n; i++) {
            for (int j = tmp; j > 0; j--) {
                System.out.print("*");
            }
            tmp--;
            System.out.println();
        }
    }
}
