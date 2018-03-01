import java.util.Scanner;
/********************************************************************
 * Your job is to fix this program. There are lots of errors in it
 * It is supposed to read in a number from 1-100 and print out
 * how many of each type of coin is needed.
 * This is from a previous assignment so you should be familiar with it.
 * Good luck and I'll see you tomorrow!
 * 
 *
 */
public class Change {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int amount;
		int penny=0;
		int nickle=0;
		int dime=0;
		int quarter=0;
		System.out.println("Enter an amount from 1-100");
		amount=in.nextInt();
		if (amount<1){
			System.out.println("I said 1-100! Goodbye!");
		}else if (amount >100){
			System.out.println("I said 1-100! Goodbye!");
		}else{
			System.out.println(amount+" cents");
		}
		if (amount==100){
			quarter=4;
			amount-=100;
		} if (amount>=75){
			quarter=3;
			amount-=75;
		} if (amount>=50){
			quarter=2;
			amount-=50;
		} if (amount>=25){
			quarter=1;
			amount-=25;
		}if (amount>=20){
			dime=2;
			amount-=20;
		}if (amount>=10){
			dime=1;
			amount-=10;
		}
		if (amount>=5){
			nickle=1;
			amount-=5;
		}
		penny=amount;
		System.out.println("Quarters: "+quarter);
		System.out.println("Dimes: "+dime);
		System.out.println("Nickels: "+nickle);
		System.out.println("Pennies: "+penny);
	}
}