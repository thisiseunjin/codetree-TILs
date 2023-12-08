import java.util.*;
import java.io.*;
public class Main {
    //상하 좌우 인접한 곳
    //0은 갈 수 있다, 1은 이동 할 수 없다.
    static int[][] map;
    static int result;
    static ArrayList<int[]> list = new ArrayList<>();
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static int N;
    static boolean[][] isVisited;

    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());   //격자의 크기
        int K = Integer.parseInt(st.nextToken());   //나중에 나올 시작점의 개수

        map = new int[N][N];
        isVisited = new boolean[N][N];

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0;i<K;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            result = Math.max(result, bfs(x-1,y-1));
        }

        System.out.println(result);

        
    }
    
    static int bfs(int x, int y){
        int count=1;
        Queue<int[]> q = new ArrayDeque<>();
        boolean[][] thisVisited = new boolean[N][N];
        
        isVisited[x][y] = true; //방문 체크
        thisVisited[x][y] = true;
        q.add(new int[]{x,y});

        while(!q.isEmpty()){
            int[] point = q.poll();

            int curX = point[0];
            int curY = point[1];

            for(int i=0;i<4;i++){
                int nextX = curX+dx[i];
                int nextY = curY+dy[i];

                if(!inRange(nextX, nextY)) continue;
                if(thisVisited[nextX][nextY]) continue;
                if(map[nextX][nextY]==1) continue;
                thisVisited[nextX][nextY] = true;
                if(!isVisited[nextX][nextY]){
                    count+=1;
                    isVisited[nextX][nextY]= true;
                }
                q.add(new int[]{nextX,nextY});
            }
        }
        
        return count;
    }

    static boolean inRange(int x, int y){
        if(x<0||y<0||x>N-1||y>N-1) return false;
        return true;
    }
}