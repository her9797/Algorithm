
import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        
        // Scanner보다, BufferedReader와 BufferedWriter를 사용하여 입력 출력 빠르게 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine()); // 명령의 개수

        for (int i = 0; i < n; i++) {
            String command = br.readLine();

            if (command.startsWith("1")) {
                // 1 X: 정수 X를 스택에 넣음
                int value = Integer.parseInt(command.split(" ")[1]);
                stack.push(value);
            } else if (command.equals("2")) {
                // 2: 스택의 맨 위 정수를 빼고 출력
                if (stack.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(stack.pop() + "\n");
                }
            } else if (command.equals("3")) {
                // 3: 스택에 들어있는 정수의 개수를 출력
                bw.write(stack.size() + "\n");
            } else if (command.equals("4")) {
                // 4: 스택이 비어있으면 1, 아니면 0을 출력
                bw.write(stack.isEmpty() ? "1\n" : "0\n");
            } else if (command.equals("5")) {
                // 5: 스택의 맨 위 정수를 출력
                if (stack.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(stack.peek() + "\n");
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}