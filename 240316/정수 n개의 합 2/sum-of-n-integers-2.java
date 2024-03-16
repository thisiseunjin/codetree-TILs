import java.io.*;
import java.util.*;
public class Main {
    static int N;
    static int K;
    static int[] num;
    static int[] sum;

    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        num = new int[N];
        sum = new int[N];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            num[i] = Integer.parseInt(st.nextToken());
            sum[i] = num[i];
            if(i==0) continue;

            sum[i]+=sum[i-1];
            
        }

        // System.out.println(Arrays.toString(sum));

        //그래서 연속하는 숫자 K개씩 끊어서 뭐가 제일 큼??
        int result = -(int)1e9;

        for(int i=0;i<N-K;i++){
            int tmp= sum[i+K-1];
            if(i>0){
                tmp-=sum[i-1];
            }            
            result = Math.max(result, tmp);
            // System.out.println(tmp);
        }

        System.out.println(result);
    }
}