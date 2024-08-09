import java.util.*;
import java.io.*;


public class Main {
    static int N;
    static StringBuilder sb = new StringBuilder();
    static PriorityQueue<Integer> pq = new PriorityQueue<>();
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());

            String op = st.nextToken();
            
            switch(op){
                case "size":
                    sb.append(pq.size()).append("\n");
                    break;
                case "empty":
                    sb.append(pq.isEmpty()?1:0).append("\n");
                    break;
                case "pop":
                    sb.append(pq.poll()).append("\n");
                    break;
                case "top":
                    sb.append(pq.peek()).append("\n");
                    break;
                case "push":
                    int n = Integer.parseInt(st.nextToken());
                    pq.add(n);
                    break;
            }

            
            
        }

        System.out.println(sb);
    }
}