package message;

import java.util.Scanner;

import javax.swing.text.Utilities;

public class Test {
	public static void main(String[] args) {
		Scanner cs=new Scanner(System.in);
	System.out.println("please enter");
	String name=cs.nextLine();
	Utilities cls=new Utilities();
	Message msg=cls.getMessageObject("name");
	msg.sendMessage();
		
	}

}
