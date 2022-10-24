import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> deq = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());

        for(int i=1; i<=N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if(command.equals("push")) {
                deq.add(Integer.parseInt(st.nextToken()));
            }
            if(command.equals("pop")) {
                if(deq.isEmpty()) {
                    bw.write(-1 + "\n");
                } else {
                    bw.write(deq.pop() + "\n");
                }
            }
            if(command.equals("size")) {
                bw.write(deq.size() + "\n");
            }
            if(command.equals("empty")) {
                bw.write(((deq.isEmpty())?1:0) + "\n");
            } else {
                if(command.equals("front")) {
                    if(deq.isEmpty()) {
                        bw.write(-1+"\n");
                    } else {
                        bw.write(deq.getFirst() + "\n");
                    }
                } else {
                    if(command.equals("back")) {
                        if(deq.isEmpty()) {
                            bw.write(-1 + "\n");
                        } else {
                            bw.write(deq.getLast() + "\n");
                        }
                    }
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}