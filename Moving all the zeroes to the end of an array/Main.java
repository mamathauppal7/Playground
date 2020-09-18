import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[]= new int[n];
      for(int i=0;i<=n-1;i++)
      {
        arr[i]=in.nextInt();
      }
      zeroes_of_the_end(n,arr);
      for(int i=0;i<=n-1;i++)
      {
        System.out.print(arr[i]+" ");
      }
    }
  public static void zeroes_of_the_end(int n,int arr[])
  {
    int count=0;
    for(int i=0;i<=n-1;i++)
    {
      if(arr[i]!=0)
      {
        int temp=arr[i];
        arr[i]= arr[count];
        arr[count]=temp;
        count++;
      }
    }
  }
    }
