import java.util.Scanner;
public class RockPaperScissors {

	/**
	 * This is the main method that takes in the users input for rock, paper or scissors
	 * Randomly generates the computers Type
	 * Makes use of the parseType method
	 * Sees if user beats computer and vice versa
	 * Makes use of beats method
	 * @param args
	 */
	public static void main(String[] args){
		Type person = null;
		Type computer = null;
		String computerChoice;
		Scanner input = new Scanner(System.in);
		
		while (person == null){
			System.out.println("Please choose either: R for Rock, P for Paper, S for Scissors");
			String choice = input.next();
			choice = choice.toUpperCase();
			choice = choice.substring(0, 1);
			person = Type.parseType(choice);
			if (person == null){
				System.out.println("Invalid try again");
				
			}else{
				RandNumrGen number = new RandNumrGen();
				int computerNum = number.randInt(0,2);
				switch (computerNum){
				case 0 :computerChoice = "R";
				break;
				case 1 : computerChoice = "P";
				break;
				case 2 : computerChoice = "S";
				break;
				default :computerChoice = "R";
				break;
				}
				computer = Type.parseType(computerChoice);
				System.out.println("Computer chooses " + computer);
				
				if (person.equals(computer)){
					System.out.println("It's a tie");
				}else if(person.beats(computer)){
					System.out.println(person + " beats " + computer + " You win!!");
				}else if(computer.beats(person)){
					System.out.println(computer + " beats " + person + " You lose!!");
				}
				
			}
		}
		
		
	}
}
