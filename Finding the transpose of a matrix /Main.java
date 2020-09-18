import java.util.Scanner;
class Main{
  public static void main(String args[]){
	 Scanner in= new Scanner(System.in);
	 int r=in.nextInt();
	 int c=in.nextInt();
	 int mat[][]=new int[r][c];
	 int trans[][]=new int[c][r];
	 for(int i=0;i<=r-1;i++){
		 for(int j=0;j<=c-1;j++){
			 mat[i][j]=in.nextInt();
		 }
	 }
	 for(int i=0;i<=r-1;i++){
		 for(int j=0;j<=c-1;j++){
			trans[j][i]=mat[i][j];
		 }
	 }
	 
	 for(int i=0;i<=c-1;i++){
		 for(int j=0;j<=r-1;j++){
			System.out.print(trans[i][j]+" ");
		 }
		 System.out.println();
	 }
 }
}
