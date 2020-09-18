import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int square = mul(n);
      System.out.println(square);
    }
  public static int mul(int m)
  {
    int result = m*m;
    return result;
  }
	} 
