/*Write a statement that declares a string array initialized with the following strings:
"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday".
b) Write a loop that displays the contents of each element in the array that you declared.
Show the answer.
 */
public class Content {
public static void main (String []args) {
	String [] weekDays= {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
	
	for(int i=0;i<=weekDays.length-1;i++) {
		System.out.println("Index:"+ i +" Day:" +weekDays[i]);
	}
}
}
