import java.util.Scanner;
public class AIChartbot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput;
        

        System.out.println("Hello! I am your AI chatbot.");
        System.out.println("How can I assist you today?");
        System.out.println("Type 'exit' to end the conversation.");

    while (true) {
        System.out.print("\nYou: ");
        userInput = sc.nextLine().toLowerCase();
        
        if( userInput.equals("hello") || userInput.equals("hi")){
            System.out.println("AI: Hello! How can I help you?");
        } else if (userInput.equals("how are you")) {
            System.out.println("AI: I'm just a program, but I'm functioning as expected!");
        } else if (userInput.equals("what is your name?")) {
            System.out.println("AI: I am java AIChartbot, your virtual assistant.");
        }else if(userInput.equals("java")){
            System.out.println("AI: Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.");
        }else if (userInput.equals("exit")) {
            System.out.println("AI: Goodbye! Have a great day!");
            break;
        } 
        else{
            System.out.println("AI: I'm sorry, I don't understand that. Can you please rephrase?");
        }
        }
        // close scanner after loop
        sc.close();
    }
}
