import java.util.Scanner;

public class Product
{

	public static void main(String...args)
	{
	

	Scanner input = new Scanner(System.in);
	int x;
	int y;
	int z;
	int product;

	System.out.print("enter int x: ");
	x = input.nextInt();
	
	System.out.print("enter int y: ");
	y = input.nextInt();

	System.out.print("enter int z: ");
	z = input.nextInt();

	product = x * y * z;

	System.out.printf("Product is %d%n", product);
       }

}
