import java.util.Scanner;

public class SUM
{

	public static void main(String... args)
	{

	Scanner input = new Scanner(System.in);
	int num1;
	int num2;
	int num3;
	int sum;
	int Ave;
	int Product;

System.out.print("Enter first number: ");
	num1 = input.nextInt();

System.out.print("Enter second number: ");
	num2 = input.nextInt();

System.out.print("Enter third number: ");
	num3 = input.nextInt();

	sum = num1 + num2 + num3;
	Ave = num1 + num2 + num3 / 3;
	Product = num1 * num2 * num3;
	int Sub = num1 - num2 - num3;

	System.out.printf("sum is %d%n", sum);
	System.out.printf("Ave is %d%n", Ave);
	System.out.printf("Product is %d%n", Product);
	System.out.printf("difference is %d%n", Sub);


     }
}
