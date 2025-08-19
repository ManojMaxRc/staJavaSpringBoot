package com.inher.quest4;

import java.util.Arrays;
import java.util.Scanner;

public class CommMain {

	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		MailCommunication mailCommunication = new MailCommunication();
		PhoneCommunication phoneCommunication = new PhoneCommunication();
		SMSCommunication smsCommunication = new SMSCommunication();
		WhatsappCommunication whatsappCommunication = new WhatsappCommunication();
		
		System.out.println("1. Mail Communication");
		System.out.println("2. Phone Communication");
		System.out.println("3. SMS Communication");
		System.out.println("4. Whatsapp Communication");
		System.out.println("Input the communication method : ");
		
		int communicationMethod = inputScanner.nextInt();
		
		switch (communicationMethod) {
		case 1:
			mailCommunication.sendMessage();
			System.out.println(Arrays.toString(mailCommunication.showTypes()));
			break;

		case 2 :
			phoneCommunication.sendMessage();
			phoneCommunication.callService();
			break;
			
		case 3 :
			smsCommunication.sendMessage();
			smsCommunication.messageLength();
			break;
			
		case 4 :
			whatsappCommunication.sendMessage();
			whatsappCommunication.otherFeatures();
			break;
			
		default:
			System.out.println("Invalid communication method input");
			break;
		}
	}
}