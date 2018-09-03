import java.util.Scanner;

public class Madlib{
	public static void main(String[] args){
	String name, adj, school, college, place, hobby, color, rolemodel, achievement, ambition;
	int age;
	float percentage;
	
	Scanner input = new Scanner(System.in);
	//Reading inputs(12)
	System.out.println("Enter your name: ");
	name = input.nextLine();
	System.out.println("Enter your  age: ");
	age = input.nextInt();
	System.out.println("Enter your strength: ");
	adj = input.nextLine();
	System.out.println("Enter your High School Name: ");
	school = input.nextLine();
	System.out.println("Enter your College name: ");
	college = input.nextLine();
	System.out.println("Enter your native place: ");
	place = input.nextLine();
	System.out.println("Enter your favourite hobby: ");
	hobby = input.nextLine();
	System.out.println("Enter your favourite color: ");
	color = input.nextLine();
	System.out.println("Enter your rolemodel's name: ");
	rolemodel = input.nextLine();
	System.out.println("Enter your graduation percentage: ");
	percentage = input.nextFloat();
	System.out.println("Enter your greatest single achievement: ");
	achievement = input.nextLine();
	System.out.println("Enter your ambition: ");
	ambition = input.nextLine();
	//output
	
	System.out.println("I am " + name + ". Coming from " + place + ". My age is " + age +
	" years. I did my schooling in " + school + ". And I did my graduation in " + college +
	" . My graduation percentage is "); 
	System.out.println("%.2f", percentage);
	System.out.println("MORE ABOUT ME");
	System.out.println("My favourite hobby is " + hobby + ". My favourite color is " + color +
	" . My greatest achievement is " + achievement + " . My rolemodel is " + rolemodel + ". My ambition is to become a " +
	ambition + ". ");
	
	
	
	}
	
}