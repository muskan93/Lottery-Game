import java.util.Scanner ;
public class Lottery {
	public static void main(String[] args) {
		int lottery = (int) (Math.random() * 100) ;
		Scanner input = new Scanner (System.in) ;
		System.out.print(" Enter a Two digit Lottery Number : ");
		int guess = input.nextInt();
		int lot1 = lottery / 10 ;
		int lot2 = lottery % 10 ;
		int guess1 = guess / 10 ;
		int guess2 = guess % 10 ;
		
		System.out.println(" The Lottery number is : " + lottery );
		if (guess == lottery ) 
		System.out.println(" Congrts !!! " + " you have won Rs.1000 ");
		
		else if (guess2 == lot1 && guess1 == lot2) 
			System.out.println(" You have won Rs.500 ");
		
		else if (guess1 == lot1 || guess1 == lot2 || guess2 == lot1 || guess2 == lot2) 
			System.out.println(" you have won Rs.100 ");
		else 
			System.out.println(" Sorry !!! Try Next Time .... ");
		
		
	}

}
