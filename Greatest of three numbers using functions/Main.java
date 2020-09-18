import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in =new Scanner(System.in);
      int n1= in.nextInt();
      int n2= in.nextInt();
      int n3= in.nextInt();
      int res= greatest_no(n1,n2);
      System.out.println(greatest_no(res,n3));
    
	}
  public static int greatest_no(int num1,int num2)
  {
    int max_no=0;
    if(num1>num2)
    {
      max_no=num1;
    }
    else{
      max_no=num2;
    }
    return max_no;
  }
  
}
