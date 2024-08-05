import java.io.*;
import java.util.*;

public class Main {
    static int[][][] shapes = new int[][][]{
        {{1, 1, 0},
        {1, 0, 0},
        {0, 0, 0}},
    
        {{1, 1, 0},
        {0, 1, 0},
        {0, 0, 0}},
    
        {{1, 0, 0},
        {1, 1, 0},
        {0, 0, 0}},
    
        {{0, 1, 0},
        {1, 1, 0},
        {0, 0, 0}},
    
        {{1, 1, 1},
        {0, 0, 0},
        {0, 0, 0}},
    
        {{1, 0, 0},
        {1, 0, 0},
        {1, 0, 0}},
    };
    static int N;
    static int M;
    static int[][] map;
    static int result = -(int)1e9;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        map = new int[N][M];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                calc(i,j);
            }
        }

        System.out.println(result);

    }

    public static void calc(int x, int y){
        //해당 지점으로 시작하는 친구들의 합을 구해준다.
        for(int i=0;i<6;i++){
            boolean isPossible = true;
            int sum=0;
            for(int dx =0; dx<3;dx++){
                for(int dy=0;dy<3;dy++){
                    if(shapes[i][dx][dy]==0) continue;
                    if(!inRange(x+dx, y+dy)) isPossible = false;
                    else sum+=map[x+dx][y+dy];
                }
            }

            if(isPossible){
                result = Math.max(result, sum);
            }
            
        }
    }

    public static boolean inRange(int x, int y){
        if(x<0 || y<0 || x>N-1 || y>M-1) return false;
        return true;
    }
}