import java.lang.*;
import java.io.*;
import java.util.*;
import java.text.DateFormat;

public class StudentMain{
	public StudentMain(String pick_name, String stud_name){
		
			System.out.println("Dear "+stud_name+", "+pick_name+" is going to pick you up from the airport! Happy Journey :)");
		
	}
	public static void main(String[] args){
		readUser ru = new readUser();
		StudentPickUp spu = new StudentPickUp(ru.candidateName());
		spu.getArrivalDate(ru.setArrivalDate());
		spu.portOfEntry("Chicago");
		pickPerson pp = new pickPerson();
		StudentMain obj = new StudentMain(pp.personName(),ru.candidateName());
	}
}

class pickPerson{
Scanner input = new Scanner(System.in);
		String personName(){	
			System.out.println("Enter the name of the person who is interested in picking up the passenger: ");
			return input.next();
		}	
}