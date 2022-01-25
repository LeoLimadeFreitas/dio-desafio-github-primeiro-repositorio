package week3;
import java.util.Scanner ;

public class  Area {
	
public static void main(String[] args) {

	//	Declarando a variavel Scanner
	
Scanner llf =	new Scanner(System.in);
System.out.println ("Please enter the width of the square:");
String input = llf.nextLine();
int sqWidth = Integer.parseInt(input);

    // Converti String para Int
System.out.println ("Please enter width of the rectangle:");
input = llf.nextLine();

int recWidth = Integer.parseInt(input);
System.out.println ("Please enter height of the rectangle:");
input = llf.nextLine();
int recHeight = Integer.parseInt(input);

	// Calculando com numeros Inteiros

int sqArea = sqWidth * sqWidth;
int recArea = recHeight * recWidth;

System.out.println ("The area of a square with a width of " +  sqWidth + " is " + sqArea + ".");

System.out.println ("The area of a rectangle with a width of " + recWidth + " and a height of " + recHeight + " is " + recArea + "." );

		
		
		
		
		
		
		
	}

}
