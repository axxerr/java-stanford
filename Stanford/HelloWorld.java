import acm.graphics.*;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;


public class HelloWorld extends ConsoleProgram{

	public void run(){
		println("this add two  numbers:");
		int n1=readInt("enter number 1:");
		int n2=readInt("enter number 2:");
		int total=n1+n2;
		println("the total is "+total+".");
	}

}
