/*Write Java statements that do the following:
a) Declare an array alpha of 15 elements of type int.
b) Output the value of the tenth element of the array alpha.
c) Set the value of the fifth element of the array alpha to 35.
d) Set the value of the ninth element of the array alpha to the sum of the sixth and thirteenth elements of the array alpha.
Show the answer.

 * 
 */
import java.util.Scanner;
public class ArrayAlpha{ 
public static void main(String args[]) {

Scanner sc=new Scanner(System.in);

System.out.println("Enter the number of array");
int num=sc.nextInt();

System.out.println("Enter the element:" +num+"of an array");
int[]alpha=new int[num];
for(int i=0;i<alpha.length;i++) {
	System.out.println("Enter the number");
	alpha[i]=sc.nextInt();
}
System.out.println( "Tenth element of your array list is:"+alpha[9]);
alpha[4]=35;
System.out.println("Fourth element of an array is:"+ alpha[4]);
System.out.println("Sixth element of an array is:"+ alpha[5]);
System.out.println("Thirteen element of array is:"+alpha[12]);
alpha[9] = alpha[12] + alpha[5];
System.out.println("Array Value:" + alpha[9]);
sc.close();
	}
}




