
public class RatInMaze {

    static int N = 4;

    static boolean solveMaze(int[][] maze, int x, int y, int[][] sol) {

        if(x==N-1 && y==N-1){
            sol[x][y]=1;
            return true;
        }

        if(x>=0 && y>=0 && x<N && y<N && maze[x][y]==1){

            sol[x][y]=1;

            if(solveMaze(maze,x+1,y,sol)) return true;
            if(solveMaze(maze,x,y+1,sol)) return true;

            sol[x][y]=0;
        }

        return false;
    }

    public static void main(String[] args) {

        int maze[][] = {
            {1,0,0,0},
            {1,1,0,1},
            {0,1,0,0},
            {1,1,1,1}
        };

        int sol[][] = new int[N][N];

        if(solveMaze(maze,0,0,sol)){
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++)
                    System.out.print(sol[i][j]+" ");
                System.out.println();
            }
        } else {
            System.out.println("No solution");
        }
    }
}
