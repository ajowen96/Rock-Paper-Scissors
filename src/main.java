
import java.util.*;

public class main {

	public static void main(String[] args) {
		
	   Scanner user_input = new Scanner(System.in);
	   
	   while(true){
		   System.out.println("Please input Rock, Paper or Scissors");
		   String s = user_input.nextLine();
		   System.out.println("User\'s choice is " + s);
		   logic.checkResult(s);
		  System.out.println("Do you want to continue? type any input to continue or n to stop");  
		  String resume = user_input.nextLine();
		  if(resume.equals("n")) {
			  break;
		  }
	   }
	   System.out.println("The number of user wins is " + logic.userWins + " and the user win percentage is: " + logic.userWinsPercentage + "%" );
	   System.out.println("The number of computer wins is " + logic.computerWins + " and the computer win percentage is: " + logic.computerWinsPercentage + "%" );
	   System.out.println("The number of ties is "+ logic.tie + " and the tie win percentage is: " + logic.tiePercentage + "%" );
	   System.out.println("The total rock moves is " + logic.rockcounter + "(" + logic.rockPercentage + "%)" + ", the total scissors move is " + logic.scissorscounter +"(" + logic.scissorsPercentage + "%)" + " and the total paper moves is " + logic.papercounter +"(" + logic.paperPercentage + "%)" );
	}
}
