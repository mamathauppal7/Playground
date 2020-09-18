import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in =new Scanner(System.in);
        int n= in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<=n-1;i++)
      {
        arr[i]= in.nextInt();
      }
      subset_of_size(n,arr);
      
    }
  public static void subset_of_size(int n,int arr[])
  {
    for(int i=0;i<=n-2;i++)
    {
      for(int j=i+1;j<=n-1;j++)
      {
        for(int k= j+1;k<=n-1;k++)
        {
          System.out.print("("+arr[i]+","+" "+arr[j]+","+ " "+arr[k]+")"+" ");
        }
      }
      System.out.print("\n");
    }
    
  }
}

