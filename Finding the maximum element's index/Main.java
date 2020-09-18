import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int list[]= new int[n];
    int max_i;
    for(int i=0;i<n;i++)
    {
      list[i]=in.nextInt();
    }
    if(list[0]>list[1])
    {
      max_i=0;
    }
    else{
      max_i=1;
    }
    for(int i=2;i<=n-1;i++)
    {
      if(list[max_i]<list[i])
      {
        max_i=i;
      }
    }
    System.out.println(max_i);
  }
  }
