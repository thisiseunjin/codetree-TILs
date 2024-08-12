import java.util.*;
import java.io.*;
public class Main {
    static PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            int num  = Integer.parseInt(br.readLine());
            if(num==0){
                if(pq.isEmpty()){
                    sb.append(0);
                }else{
                    sb.append(pq.poll());
                }

                sb.append("\n");
                continue;
            }


            pq.add(num);
        }

        System.out.println(sb);
    }
}