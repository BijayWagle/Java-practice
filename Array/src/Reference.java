/*The variable list1 and list2 are reference arrays that each have 5 elements.
 *  Write code that copies the values in list1 to list2. Values in list1 are input by user.
Show the answer
 */
import java.util.Scanner;
public class Reference {
public static void main(String []args) {
//	int[] list2= {5,6,7,8,9};
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the array range");
	int num=input.nextInt();
	int []list2=new int[num];
	System.out.println("Enter the number"+" "+num+"of an array");
	int []list1=new int[num];
	
	for(int i=0;i<list1.length;i++) {
	System.out.println("Enter the number");
	list1[i]=input.nextInt();
}
list2 = list1;
input.close();
for(int i = 0; i < num; i++) {
	System.out.println("index Value:" +i + " list1 value at that index:" + list1[i]+ " list2 value at that index:" + list2[i]);
}
}
}