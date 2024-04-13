import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int q;
    static int[] nums;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        q = Integer.parseInt(st.nextToken());

        nums = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<q;i++){
            int result=0;
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            for(int j=0;j<n;j++){
                if(nums[j]<start) continue;
                if(nums[j]>end) break;
                result++;
            }

            sb.append(result+"\n");
        }

        System.out.println(sb);

    }
}