import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[] height;
    static int[] selected = new int[3];
    static int result=0;
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        height = new int[N+1];
        for(int i=1;i<N;i++){
            height[i] = Integer.parseInt(st.nextToken());
        }

        combination(1, 0);
        System.out.println(result);
    }

    public static void combination(int start, int cnt){
        if(cnt==3){
            //다 선택 했음.
            if(isPossible()) result++;
            // System.out.println(Arrays.toString(selected) + "["+selected[0]+", "+selected[1]+" "+selected[2]+" ]");
            return;
        }

        for(int i=start;i<N+1;i++){
            selected[cnt] = height[i];
            combination(i+1, cnt+1);
        }
    }


    public static boolean isPossible(){
        int pre = selected[0];
        for(int i=1;i<3;i++){
            int now = selected[i];
            if(pre>now) return false;
            pre = now;
        }

        return true;
    }
}