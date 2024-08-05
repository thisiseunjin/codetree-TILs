import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int key = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());

            map.put(key, map.get(key)==null? value:Math.min(map.get(key), value));
        }

        int result=0;
        for(int key : map.keySet()){
            result+=map.get(key);
        }

        System.out.println(result);
        
    }
}