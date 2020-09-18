import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<=n-1;i++){
        arr[i]=in.nextInt();
    }
  int value= in.nextInt();
  perfect_couple(n,arr,value);
    }
public static void perfect_couple(int n,int arr[],int value)
{
  for(int i=0;i<=n-1;i++)
  {
    for(int j=i+1;j<=n-1;j++)
    {
      int sum= arr[i]+arr[j];
      if(sum==value)
      {
        System.out.println(arr[i]+","+" "+arr[j]);
      }
    }
  }
}

}