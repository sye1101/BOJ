package Q1966;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 250324
// 프린터 큐
public class Main {
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine()); // 테스트케이스 수
        StringTokenizer st;

        while (t --> 0) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken()); // 문서의 개수
            M = Integer.parseInt(st.nextToken()); // 궁금한 문서 현재 위치

            LinkedList<int[]> q = new LinkedList<>(); // Queue 연결리스트
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < N; i++) {
                q.offer(new int[]{i, Integer.parseInt(st.nextToken())});
            }

            int cnt = 0; // 출력 횟수;

            while (!q.isEmpty()) {
                int[] front = q.poll();
                boolean isMax = true;

                for (int i = 0; i < q.size(); i++) {
                    if (front[1] < q.get(i)[1]) {
                        q.offer(front);
                        // 뒤로 보내기
                        for (int j = 0; j < i; j++) {
                            q.offer(q.poll());
                        }

                        isMax = false;
                        break;
                    }
                }

                if (!isMax) continue;

                cnt++;
                if (front[0] == M) break;
            }

            sb.append(cnt).append('\n');
        }
        System.out.println(sb);
    }
}
