import java .util.Random;
import java .util.Scanner;
public class Stone {
	//private static final Object Rock = null;
	//private static final String Scissor = null;
	//private static final Random Object = null;
	public static String generatechoice(Random random)
	{
		int num;
		String choice = null;
		num = random.nextInt(3) + 1;
	    if(num==1) {
	    	choice="Rock";
	    	
	    }else if(num==2)
	    {
	    	choice="Scissors";
	    }else if(num==3) {
	    	choice="paper";
	    }
	    System.out.println("the computer made his choice:");
	    return choice;
	    
	}
	 public static void show()
	 {
		 System.out.println(" options to chose from: \n 1.Rock \n 2.Paper \n 3.Scissor\n");
	 }
	 public static String userchoice(Scanner scanner)
	 
	 {   String userchoice; 
		 System.out.println(" user made your choice: ");
		  userchoice = scanner.nextLine();
		  return userchoice;
		 
	 }
	 public static String choosewinner(String generatechoice, String userchoice ) {
		 String winner = " No winner";
		 String customMessage = "";
		 String finalMessage;
		 
		 
		 String rockCustomMessage = " rock smashes the scissor";
		 String scissorCustomMessage = " scissor cuts paper";
		 String paperCustomMessage = " paper catch rock";
		 
		if(generatechoice.equals("rock") && userchoice.equalsIgnoreCase ("scissor"))
		{
			winner ="generatechoice";
			 customMessage = rockCustomMessage;
			 } else if(userchoice.equalsIgnoreCase("rock") && generatechoice.equals ("scissor"))
		{
			winner = "userchoice";
			customMessage = rockCustomMessage;
			return winner;
		}
		if(generatechoice.equals("scissor") && userchoice.equalsIgnoreCase ("paper"))
		{
			winner ="generatechoice";
			 customMessage = scissorCustomMessage;
			 } else if(userchoice.equalsIgnoreCase("scissor") && generatechoice.equals ("paper"))
		{
			winner = "userchoice";
			customMessage = scissorCustomMessage;
			return winner;
		}
		if(generatechoice.equals("paper") && userchoice.equalsIgnoreCase ("rock"))
		{
			winner ="generatechoice";
			 customMessage = paperCustomMessage;
			 } else if(userchoice.equalsIgnoreCase("paper") && generatechoice.equals ("rock"))
		{
			winner = "yourchoice";
			customMessage = paperCustomMessage;
			return winner;
		}
		
		finalMessage =  winner + " won  " + customMessage   ;  
		return finalMessage;
		 
	 }
	    public static void main( String args[] ) {
	    	Random random = new Random();
	    	Scanner scanner = new Scanner(System.in);
	    	show();
	    	String userchoice = "";
	    	String generatechoice = "" ;
	    	String winner;
	    	winner = choosewinner(generatechoice ,userchoice);
	    		
	    	userchoice = userchoice(scanner);
	    	generatechoice = generatechoice(random);
	    	System.out.println(" you chose  " + userchoice +  " \n  generate chose  " + generatechoice);
	    
			System.out.println(choosewinner(generatechoice , userchoice));
			System.out.println(winner);
	    	
	    
	    	
	}
	
		}
	



 