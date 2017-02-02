import java.io.*;
import java.lang.*;
import java.util.*;
import java.text.DateFormat;

public class StudentPickUp{
	public StudentPickUp(String name){
		System.out.println("Pick Up details of: "+name);
	}
	void getArrivalDate(String date){
		System.out.println("Arrival Date: "+date);
	}
	/*void getArrivalTime(String time){
		
	}*/
	void portOfEntry(String city){
		System.out.println("The new student is from: "+city);
	}
}

class readUser{
	Scanner input = new Scanner(System.in);
	String setArrivalDate(){
		System.out.println("Enter your arrival Date: ");
		return input.next();
	}
	/*void setArrivalTime(){
		
	}*/
	String candidateName(){
		System.out.println("Enter your name: ");
		return input.next();
	}
}