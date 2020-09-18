//import java.lang.*;
import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    Scanner in = new Scanner(System.in);
    int n= in.nextInt();
    int arr[]= new int[n];
    for(int i=0;i<=(n-1);i++)
    {
      arr[i]=in.nextInt();
    }
    int no_of_rot=in.nextInt();
    left_rot_even_elem(n,arr,no_of_rot);
    right_rot_odd_elem(n,arr,no_of_rot);
    for(int i=0;i<=(n-1);i++)
    {
      System.out.print(arr[i]+" ");
    }
  	}
  public static void left_rot_even_elem(int n,int arr[],int no_of_rot)
  {
    int first_eve_index=1;
    int last_eve_index;
    if(n%2==0)
    {
      last_eve_index=n-1;
    }
    else{
      last_eve_index=n-2;
    }
    for(int rot=1;rot<=no_of_rot;rot++)
    {
      int temp = arr[first_eve_index];
      for(int i=3;i<n;i=i+2)
      {
        arr[i-2]=arr[i];
      }
      arr[last_eve_index]=temp;
    }
  }
  public static void right_rot_odd_elem(int n,int arr[],int no_of_rot)
  {
    int first_odd_index=0;
    int last_odd_index;
    if(n%2==1)
    {
      last_odd_index=n-1;
    }
    else{
      last_odd_index=n-2;
    }
    for(int rot=1;rot<=no_of_rot;rot++)
    {
      int temp= arr[last_odd_index];
      for(int i=(last_odd_index-2);i>=0;i=i-2)
      {
        arr[i+2]=arr[i];
      }
      arr[first_odd_index]=temp;
    }
  }
  
}