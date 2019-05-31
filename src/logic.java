
public class logic {
	
	public static String[] computerChoice = new String[] {"ROCK", "PAPER", "SCISSORS"};
	public static double randomCreator;
	public static int computerWins;
	public static int userWins;
	public static int tie;
	public static double userWinsPercentage;
	public static double computerWinsPercentage;
	public static double tiePercentage;
	public static double gamecounter;
	public static double rockcounter;
	public static double scissorscounter;
	public static double papercounter;
	public static double totalmoves;
	public static double rockPercentage;
	public static double scissorsPercentage;
	public static double paperPercentage;
	public static void checkResult(String userChoice) {
		
		userChoice = userChoice.toUpperCase();
		randomCreator = Math.random();                                                                                                                                                                                                                                                                                                                                                                                                                                              
		randomCreator = 2* randomCreator;
		randomCreator = Math.round(randomCreator);
		int scanner = (int) Math.round(randomCreator);
		System.out.println("Computer\'s choice is "+ computerChoice[scanner]);
		
		if(userChoice.equals("PAPER") && computerChoice[scanner].contentEquals("ROCK")) {
			System.out.println("Paper covers rock. User wins!");
			System.out.println("");
			userWins = userWins +1;
			gamecounter+=1;
			rockcounter+=1;
			papercounter+=1;
			totalmoves = gamecounter*2;
		}
		
		if(userChoice.equals("ROCK") && computerChoice[scanner].contentEquals("PAPER")) {
			System.out.println("Paper covers rock. Computer wins!");
			System.out.println("");
		    computerWins = computerWins +1;
		    gamecounter+=1;
		    rockcounter+=1;
			papercounter+=1;
			totalmoves = gamecounter*2;
		} 
		
		if(userChoice.equals("SCISSORS" )&& computerChoice[scanner].contentEquals("PAPER")) {
			System.out.println("Scissors cuts paper. User wins!");
			System.out.println("");
			userWins = userWins +1;
			gamecounter+=1;
			papercounter+=1;
			scissorscounter+=1;
			totalmoves = gamecounter*2;
		}
		
		if(userChoice.equals("PAPER") && computerChoice[scanner].equals("SCISSORS")) {
			System.out.println("Scissors cuts paper. Computer wins!");
			System.out.println("");
			computerWins = computerWins +1;
			gamecounter+=1;
			papercounter+=1;
			scissorscounter+=1;
			totalmoves = gamecounter*2;
		}
		
		if(userChoice.equals("ROCK") && computerChoice[scanner].equals("SCISSORS")) {
			System.out.println("Rock smashes scissors. User wins!");
			System.out.println("");
			userWins = userWins +1;
			gamecounter+=1;
			scissorscounter+=1;
			rockcounter+=1;
			totalmoves = gamecounter*2;
		}
		
		if(userChoice.equals("SCISSORS") && computerChoice[scanner].equals("ROCK")) {
			System.out.println("Rock smashes scissors. Computer wins!");
			System.out.println("");
			computerWins = computerWins +1;
			gamecounter+=1;
			scissorscounter+=1;
			rockcounter+=1;
			totalmoves = gamecounter*2;
		}
		
		if(userChoice.equals(computerChoice[scanner])) {
			System.out.println("It is a tie!");
			System.out.println("");
			tie = tie +1;
			gamecounter+=1;
			totalmoves = gamecounter*2;
			if(userChoice.equals("PAPER")) {
				papercounter +=2;
			} 
			else if(userChoice.equals("ROCK")) {
				rockcounter +=2;
			} 
			else if(userChoice.equals("SCISSORS")) {
				scissorscounter+=2;
			}
		}
		
		if(!userChoice.equals("PAPER") && !userChoice.equals("ROCK")  && !userChoice.equals("SCISSORS") ) {
			System.out.println("wrong entry");
		}
		
		userWinsPercentage = (userWins/gamecounter)*100;
		computerWinsPercentage = (computerWins/gamecounter)*100;
		tiePercentage = (tie/gamecounter)*100;
		rockPercentage = (rockcounter/totalmoves)*100;
		scissorsPercentage = (scissorscounter/totalmoves)*100;
		paperPercentage = (papercounter/totalmoves)*100;
	}
}
