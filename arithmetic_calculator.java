package Module1;
import java.util.Scanner;
class arithmetic_calculator {
   public static void main(String[]args) {
    double number1,number2;
    double r;
    char operator;
    Scanner S= new Scanner(System.in);
    System.out.println("Enter the first number");
    number1= S.nextDouble();
    System.out.println("Enter the Second number");
    number2= S.nextDouble();
    System.out.println("Choose an operator +,-,*,/ ");
    operator = S.next().charAt(0);
   switch(operator){
	   case '+':
		   r=number1 + number2;
		   System.out.println("the sum is " +r);
		   break;
	   case '-':
		   r=number1 - number2;
		   System.out.println("the sum is " +r);
		   break;
	   case '*':
		   r=number1 * number2;
		   System.out.println("the sum is " +r);
		   break;
	   case '/':
		   r=number1 / number2;
		   System.out.println("the sum is " +r);
		   break;   
   }  
   }
}
