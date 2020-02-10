package converter;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

        char [] english = { ' ','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                ',', '.', '?' };

        String[] morse = { "  ",".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--.." };

        String textToChange = " ";
        String  newText = " ";
        System.out.println("Enter text you want to convert to Morse Code");

        textToChange = input.nextLine();
        textToChange = textToChange.toLowerCase();

        for(int i=0; i< textToChange.length(); i++){
            for(short j=0; j<40; j++){
                if(textToChange.charAt(i)==english[j])
                {
                    newText += morse[j];
                    newText += "   ";

                    break;
                }
            }
        }
        System.out.println("Text in Morse Code: ");
        System.out.println(newText);
        }
    }
