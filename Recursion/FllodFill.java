package Recursion;

public class FllodFill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze= {{0,1,0,0,0,0,0},
					   {0,1,0,1,1,1,0},
					   {0,0,0,0,0,0,0},
					   {1,0,1,1,0,1,1},
					   {1,0,1,1,0,1,1},
					   {1,0,0,0,0,0,0}
				};
//		System.out.println(maze[0].length);
		int m=6,n=7;
		boolean[][] visited=new boolean[6][7];
		for(int i =0;i<maze.length;i++) {
			for(int j=0;j<maze[i].length;j++) {
				System.out.print(maze[i][j]+" ");
			}
			System.out.println();
		}
		printPath(0,0,maze,visited,"");
		

	}
	public static void printPath(int r,int c,int[][] maze,boolean[][]visited,String psf) {
		if(r<0||c<0||r==maze.length||c==maze[0].length||maze[r][c]==1||visited[r][c]==true) {
			return;
		}
		if(r==maze.length-1&&c==maze[r].length-1) {
			System.out.println(psf);
			return;
		}
		visited[r][c]=true;
		printPath(r-1,c,maze,visited,psf+"t");
		printPath(r,c-1,maze,visited,psf+"l");
		printPath(r,c+1,maze,visited,psf+"r");
		printPath(r+1,c,maze,visited,psf+"d");
		visited[r][c]=false;
		
	}

}
