package rollercoaster;
import java.util.Scanner;

//Reads rollercoaster places, minimum age, count of people on the queue and age for each person
//Prints "The rollercoaster departures" if all places are taken
//Prints "Waiting" in all other cases

	public class Rollercoaster {
	   public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	       int  places = Integer.parseInt(scanner.nextLine());
	       int minimumAge = Integer.parseInt(scanner.nextLine());
	       int count = Integer.parseInt(scanner.nextLine());
	       int nr = 0; 
	       for(int i = 0 ; i < count; i ++){
	           int age = Integer.parseInt(scanner.nextLine());
	           if(age >= minimumAge){
	               nr++;
	           }
	       }
	       if(places <= nr){
	       System.out.println("The rollercoaster departures");
	       }else {
	           System.out.println("Waiting");
	       }
	     
	    }
	}
