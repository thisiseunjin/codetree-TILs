import java.util.*;
import java.io.*;
public class Main {
    static int n,m;
    static Map<Integer, Integer> map = new HashMap<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int key = Integer.parseInt(st.nextToken());
            map.put(key, map.getOrDefault(key,0)+1);
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            int k = Integer.parseInt(st.nextToken());
            sb.append(map.get(k)==null?0:map.get(k));
            sb.append(" ");
        }

        System.out.println(sb);
               
    }
}