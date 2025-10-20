import java.util.Scanner;
public class calculator {
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter first number");
        double num1 = sc.nextDouble();
        System.out.println("enter second number");
        double num2 = sc.nextDouble();
        System.out.println("chosose an operator: = + , -,*,/");
        char operator = sc.next().charAt(0);
        double result;
        switch(operator)
        {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + "+" + num2 + "=" + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + "-" + num2 + "=" + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + "*" + num2 + "=" + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(num1 + "/" + num2 + "=" + result);
                
                if( num2 != 0)
                {
                    result = num1/ num2;
                }
                else{
                    System.out.println("error!dividing by zero is not possible");
                }
                break;

            default:
                System.out.println("invalid operator");
                return;
        }
        System.out.println("Result :" + result);

    }
}
