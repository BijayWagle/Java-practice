import java.util.Scanner;

//program that prints largest and smallest number from array
public class LargestAndSmallest {
int num;
//constructor
public LargestAndSmallest(int num) {
	super();
	this.num = num;
}
//method to print largest number
	public static int largestNumber(int[] num) {
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] < num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		return num[0];
	}
	public static int smallestNumber(int[] num) {
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		return num[0];
	}
	@Override
	public String toString() {
		return "LargestAndSmallest [num=" + num + "]";
	}
	public static void main(String[] args) {

		// array that store 5 integer variable
		//int[] newArray = { 11, 18, 3, 4, 15 };
//prints the length of the array
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array range");
		int num=sc.nextInt();
		
		System.out.println("Enter the number"+" "+num+" "+"of an array");
		int []sum=new int[num];
		for(int i=0;i<sum.length;i++) {
		System.out.println("Enter the number");
		sum[i]=sc.nextInt();
		}
		System.out.println("The elements in the array is:");
		for(int i=0;i<=sum.length-1;i++) {
		System.out.println (sum[i]);
		}		
		//Prints the largest number
		System.out.println("Largest number in array is");
		System.out.println(LargestAndSmallest.largestNumber(sum));
		
		//Prints the smallest number 
		System.out.println("Smallest number in array is");
		System.out.println(LargestAndSmallest.smallestNumber(sum));
sc.close();
	}
	
	
}
