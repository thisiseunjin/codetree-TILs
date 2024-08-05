import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static Map<String, Integer> map = new HashMap<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            String str = br.readLine();
            map.put(str, map.getOrDefault(map.get(str), 0)+1);
        }

        int result=0;
        for(String key : map.keySet()){
            result+=map.get(key);
        }

        System.out.println(result);
        
        
    }
}