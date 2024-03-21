import java.util.*;
import java.io.*;

public class Main {
    static int K;
    static int N;
    static StringBuilder sb = new StringBuilder();
    static int[] nums;
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        nums = new int[N];

        function(0);

        System.out.println(sb);
        
    }

    public static void function( int cnt){
        if(cnt==N){
            for(int i=0;i<N;i++){
                sb.append(nums[i]+" ");
            }
            sb.append("\n");

            return;
        }

        for(int i=1;i<=K;i++){
            nums[cnt] = i;
            function(cnt+1);
        }   
        
    }
}