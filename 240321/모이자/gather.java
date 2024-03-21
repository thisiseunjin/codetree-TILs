import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int[] count;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        count = new int[N+1];
    
        st = new StringTokenizer(br.readLine());
        for(int i=1;i<N+1;i++){
            count[i] = Integer.parseInt(st.nextToken());
        }

        //i번째 집에 모인다는 가정 하에 거리 계산
        for(int i=1;i<N+1;i++){
            int sum=0;
            for(int j=1;j<N+1;j++){
            //나랑 i번째 집이랑 거리 차이가 몇?
                int diff = Math.abs(i-j);
                //그럼 그 거리를 걸어야 하는 사람은?ㅇ
                int total = diff * count[j];
                sum += total;
            }
            min = Math.min(min, sum);
        }

        System.out.println(min);

        
    }
}