import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int option =in.nextInt();
      switch(option)
      {
        case 1:
          if(option==1)
            System.out.println("One");
        case 2:
          if(option==2)
            System.out.println("Two");
            case 3:
          if(option==3)
            System.out.println("Three");
        case 4:
          if(option==4)
            System.out.println("Four");
        case 5:
          if(option==5)
            System.out.println("Five");
        default:
          if(option>5)
            System.out.println("Invalid");
      }
	}
}