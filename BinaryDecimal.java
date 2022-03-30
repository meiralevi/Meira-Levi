import java.util.Scanner;

// Meira Levi

public class BinaryDecimal 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("We are going to convert binary numbers to decimal!\n");
		System.out.print("Enter a binary number: ");
		Integer binaryNum = Integer.parseInt(input.next());
		Integer num = binaryNum;
		boolean binary = true;  //variable if it's binary
		int digitPlace = 0, decimalNum = 0, digit = 0;  //setting up the variables
		while (num > 0)  //I'll be moving through the number, knocking off one digit at a time
		{
			if (num%10 == 1 || num%10 == 0)  //checking if it's binary
			{
				digit = num%10;  //getting the remainder of the last digit
				decimalNum += digit*Math.pow(2, digitPlace);  //raising it to the 2nd power
				num=num/10;  //knocking off that digit
				digitPlace++;  //moving up one digit, so it increases 2 exponentially
			}
			else
			{
				binary = false;  //if it's not binary ... break out
				break;
			}
		}
		if (binary)  //prints out decimal if it's binary
		{
			System.out.println(""+binaryNum+" in decimal is "+decimalNum);
		}
		else
		{
			System.out.println("Your number was not a binary number.");
		}
	}	
}
