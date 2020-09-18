import java.util.Scanner;
class Main{ 
  public static void main(String args[]){
 Scanner in = new Scanner(System.in);
 int row_size=in.nextInt();
 int col_size=in.nextInt();
 int mat1[][]=new int[row_size][col_size];
 int mat2[][]=new int[row_size][col_size];
 int sum[][]=new int[row_size][col_size];
 for(int i=0;i<=row_size-1;i++){
	 for(int j=0;j<=col_size-1;j++){
		 mat1[i][j]=in.nextInt();
	 }
 }
 for(int i=0;i<=row_size-1;i++){
	 for(int j=0;j<=col_size-1;j++){
		 mat2[i][j]=in.nextInt();
	 }
 }
 for(int i=0;i<=row_size-1;i++){
	 for(int j=0;j<=col_size-1;j++){
		sum[i][j]=mat1[i][j]-mat2[i][j];
	 }
 }
	 
 for(int i=0;i<=row_size-1;i++){
	 for(int j=0;j<=col_size-1;j++){
		System.out.print(sum[i][j]+" ");
	 }
	 System.out.println();
 }
 
}
}