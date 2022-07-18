package Module1;
import java.util.Scanner;
class arithmetic_calculator {
   public static void main(String[]args) {
    double number1,number2;
    double r;
    char op;
    Scanner S= new Scanner(System.in);
    System.out.println("Enter the first number");
    number1= S.nextDouble();
    System.out.println("Enter the Second number");
    number2= S.nextDouble();
    System.out.println("Choose the operation you want +,-,*,/: ");
    op = S.next().charAt(0);
   switch(op){
	   case '+':
		   r=number1 + number2;
		   System.out.println("The Addition is " +r);
		   break;
	   case '-':
		   r=number1 - number2;
		   System.out.println("The Subtraction is " +r);
		   break;
	   case '*':
		   r=number1 * number2;
		   System.out.println("The Multplication is " +r);
		   break;
	   case '/':
		   r=number1 / number2;
		   System.out.println("The Division is " +r);
		   break;
	   default :
			 System.out.println("Kindly choose one of the above options" );	   
   }  
   }
}
