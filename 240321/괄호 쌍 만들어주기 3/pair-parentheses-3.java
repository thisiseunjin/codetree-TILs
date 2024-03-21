import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Integer> rList = new ArrayList<>();
    static ArrayList<Integer> lList = new ArrayList<>();
    static int result = 0;
    
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if(c=='(') lList.add(i);
            else rList.add(i);
        }

        Collections.reverse(rList);

        for(int i=0;i<lList.size();i++){
            int x = lList.get(i);
            
            for(int j=0;j<rList.size();j++){
                int y = rList.get(j);
                if(y<x) break;
                result++;
            }
        }

        System.out.println(result);

    }
}