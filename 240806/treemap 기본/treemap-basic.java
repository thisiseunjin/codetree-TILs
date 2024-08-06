import java.util.*;
import java.io.*;


public class Main {
    static Map<Integer, Integer> map = new TreeMap<>();
    static int n;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());

            String op = st.nextToken();
            int key =0;
            int value =0;
            
            switch(op){
                case "add":
                    key = Integer.parseInt(st.nextToken());
                    value = Integer.parseInt(st.nextToken());

                    map.put(key, value);
                    break;
                case "remove":
                    key = Integer.parseInt(st.nextToken());
                    map.remove(key);
                    break;

                case "find" : 
                    key = Integer.parseInt(st.nextToken());
                    sb.append(map.get(key)==null?"None" : map.get(key));
                    sb.append("\n");
                    break;
                case "print_list":
                    if(map.isEmpty()){
                        sb.append("None");
                        continue;
                    }

                    else{
                        for(int k : map.keySet()){
                            sb.append(map.get(k));
                            sb.append(" ");
                        }
                    }

                    sb.append("\n");

                    


                    break;
            }
        }

        System.out.print(sb);

    }
}