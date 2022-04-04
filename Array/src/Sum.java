/*Write a program that creates an array of 10 elements. Your program 
 * should prompt the user to input numbers in array and then display the sum of all array elements.
 */
import java.util.Scanner;
public class Sum {
public static void main (String []args) {
	int add=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the array range");
	int num=sc.nextInt();
	
	System.out.println("Enter the number"+" "+num+"of an array");
	int []sum=new int[num];
	for(int i=0;i<sum.length;i++) {
	System.out.println("Enter the number");
	sum[i]=sc.nextInt();
	 add = add+sum[i];
	
	}
	sc.close();
	System.out.println("Sum of the total array is:"+add);
}
}

