import java.util.*;

/*Instructions: - 
->Enter your name in the first line.
->Enter the command in the second line.
(Hi, Hello, Calculate, Date & Time)
-> Hit the enter button.

WIP: 
1.) Create a loop to ask questions(done)
2.) Break loop through "q" command

*/

public class DigitalAssitant
{
	private static Scanner sc = new Scanner(System.in);
	private static String name;
	private static String command = "";
	private static AssistantHelper java_assistant;
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to Java Assist! Please enter your name: ");
		name = sc.nextLine();
		java_assistant = new AssistantHelper(name);
		System.out.println(name);
		
		//AssistantHelper java_assistant = new AssistantHelper(name);
		
		while(command != "q") {
			getCommandInput();
		}
		
			System.out.println("Thank you for using Java Assist. Goodbye!");
		
	}
	public static void getCommandInput() {
		System.out.println("What can I do for you?");
		command = sc.nextLine();
		java_assistant.doTask(command);
	}
	
}


class AssistantHelper
{
	String userName;
	boolean c_command = false;
	
	public AssistantHelper(String name)
	{
		this.userName = name;
		System.out.println("Assistant setup completed...");
		System.out.println("Welcome to the Java Assistant, " + userName);
	}

	public void doTask(String command)
	{
		String c = command.toLowerCase();
		if((c.indexOf("hello") != -1)||(c.indexOf("hi")!= -1))
		{
			greet();
			this.c_command = true;
		}
		if((c.indexOf("date") != -1)||(c.indexOf("time") != -1))
		{
			get_Date_and_Time();
			this.c_command = true;
		}
		if((c.indexOf("calculate") != -1))
		{
			calculate();
			this.c_command = true;
		}
		if((c.indexOf("q") != -1))
		{
			command = "q";
		}
		if(!(this.c_command))
		{
			System.out.println("Invalid Command");
		}
	}

	public void greet()
	{
		int random_choice = (int)(100*Math.random());
		if(random_choice <= 40)
		{
			System.out.println("Hi " + userName);
		}
		else if(random_choice>40 && random_choice <=80)
		{
			System.out.println("Hello " + userName);
		}
		else if(random_choice > 80)
		{
			System.out.println("Greetings!");
		}
	}
	
	public void calculate()
	{
		System.out.println("WIP...");
		System.out.println("Sorry from Java Assistant's developer");
	}

	public void get_Date_and_Time()
	{
		Calendar calender = Calendar.getInstance();
		Date date = calender.getTime();
		System.out.println("Current date and time is: -");
		System.out.println(date.toLocaleString());
	}
}