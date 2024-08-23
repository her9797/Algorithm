
import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();
        int K = Integer.parseInt(br.readLine()); // 정수 K 읽기

        for (int i = 0; i < K; i++) {
            int number = Integer.parseInt(br.readLine());

            if (number == 0) {
                // 스택에서 가장 최근의 수를 제거
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // 스택에 수를 추가
                stack.push(number);
            }
        }

        // 스택에 남아있는 모든 수의 합을 계산
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        // 결과를 출력
        bw.write(sum + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}