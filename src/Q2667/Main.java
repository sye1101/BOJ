package Q2667;

import java.util.*;

public class Main {

    //방향키
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int tmp; //단지내 집의 수

    public static void DFS(int x, int y, int n, int[][] board){
        board[x][y] = 0;
        tmp++;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                DFS(nx, ny, n, board);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //지도의 크기

        int[][] board = new int[n][n]; //지도
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                if(s.charAt(j) == '1') board[i][j] = 1;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 1) {
                    tmp = 0;
                    DFS(i, j, n, board);
                    al.add(tmp);
                }
            }
        }
        int size = al.size(); //아파트 단지수
        Collections.sort(al); //오름차순 정렬

        System.out.println(size);
        for (int j : al) {
            System.out.println(j);
        }
    }
}