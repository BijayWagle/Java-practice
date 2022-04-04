import java.util.Scanner;

//Write a Java program to reverse the element of an integer array.
public class ReverseArray {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array range");
		int num=sc.nextInt();
		
		System.out.println("Enter the number"+" "+num+" "+"of an array");
		int []sum=new int[num];
		for(int i=0;i<sum.length;i++) {
		System.out.println("Enter the number");
		sum[i]=sc.nextInt();
		}

		System.out.print("Reverse of the array store:");
		for (int j = sum.length - 1; j >= 0; j--) {
			System.out.print(sum[j] + " ");
		}
		sc.close();
	}
		}

