import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        char firstNonRepeatingChar = getFirstNonRepeatingCharacter(inputString);
        System.out.println("First non-repeating character: " + firstNonRepeatingChar);
        
        scanner.close();
    }
    
    public static char getFirstNonRepeatingCharacter(final String inputString) {
        int count[] = new int[256];
        char inputChar[] = inputString.toCharArray();
        for (char c : inputChar) {
            count[(int) c]++;
        }

        for (char c : inputChar) {
            if (count[(int) c] == 1) {
                return c;
            }
        }
        return ' ';
    }
}

