import java.util.*;
import java.io.*;
public class Main {
    static int N;
    static Map<Integer, Integer> map = new HashMap<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            String op = st.nextToken();

            if(op.equals("add")){
                int key = Integer.parseInt(st.nextToken());
                int value = Integer.parseInt(st.nextToken());
                map.put(key, value);
                continue;
            }

            if(op.equals("find")){
                int key = Integer.parseInt(st.nextToken());
                // if(map.get(key)==null){
                //     sb.append("None\n");
                // }else{
                //     sb.append(map.get(key)).append("\n");
                // }
                sb.append(map.get(key)==null?"None":map.get(key));
                sb.append("\n");
                continue;
            }

            if(op.equals("remove")){
                int key = Integer.parseInt(st.nextToken());
                map.remove(key);
                continue;
            }
        }

        System.out.println(sb);
    }
}