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

            string op = st.nextToken();
            
            switch(op){
                case "add":
                    int key = Integer.parseInt(st.nextToken());
                    int value = Integer.parseInt(st.nextToken);

                    map.put(key, value);
                    break;
                case "remove":
                    int key = Integer.parseInt(st.nextToken());
                    map.remove(key);
                    break;

                case "find" : 
                    int key = Integer.parseInt(st.nextToken());
                    sb.append(map.getOrDefault(key, "Null"));
                    break;
                case "print_list":

                    break;
            }
        }

    }
}