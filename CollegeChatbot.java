package pro;

import java.util.Scanner;

public class CollegeChatbot {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.println("Hello! I'm your College Assistant Chatbot.");
        System.out.println("You can ask about 'timetable', 'admission', or 'facilities'.");
        System.out.println("Type 'exit' to end the chat.");

        while (true) {
            System.out.print("\nYou: ");
            userInput = scanner.nextLine().toLowerCase();

            if (userInput.contains("exit")) {
                System.out.println("Chatbot: Thank you! Have a great day!");
                break;
            } else if (userInput.contains("timetable")) {
                System.out.println("Chatbot: You can view the timetable on the college portal under the 'Academics' section.");
            } else if (userInput.contains("admission")) {
                System.out.println("Chatbot: Admissions are open from May to July. Visit the admissions page on our website for more details.");
            } else if (userInput.contains("facilities")) {
                System.out.println("Chatbot: Our campus includes a library, sports complex, cafeteria, and Wi-Fi enabled hostels.");
            } else {
                System.out.println("Chatbot: I'm sorry, I can only help with questions about timetable, admission, or facilities.");
            }
        }

        scanner.close();
    }
}

