package Q1260;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int[][] arr;
    static boolean[] ch;
    static int n, m, v;

    public static void DFS(int v) {
        ch[v] = true;
        System.out.print(v + " ");

        if (v == arr.length) return;
        for (int i = 0; i < arr.length; i++) {
            if(arr[v][i] == 1 && !ch[i]) DFS(i);
        }
    }

    public static void BFS(int v) {
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(v);
        ch[v] = true;
        System.out.print(v + " ");

        while (!Q.isEmpty()) {
            int tmp = Q.poll();
            for (int i = 1; i <= n; i++) {
                if(arr[tmp][i] == 1 && !ch[i]) {
                    Q.offer(i);
                    ch[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        v = sc.nextInt();

        arr = new int[n+1][n+1]; //정점 번호는 1번부터 N번까지

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            //양방향
            arr[x][y] = 1;
            arr[y][x] = 1;
        }

        ch = new boolean[n+1]; //정점 번호는 1번부터 N번까지
        DFS(v);
        System.out.println();

        ch = new boolean[n+1]; //정점 번호는 1번부터 N번까지
        BFS(v);

    }

}
