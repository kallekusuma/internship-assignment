import java.util.Scanner;

public class ReplaceCharacterAtIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String originalString = scanner.nextLine();

        System.out.print("Enter the index to replace: ");
        int indexToReplace = scanner.nextInt();

        System.out.print("Enter the character for replacement: ");
        char replacementChar = scanner.next().charAt(0);

        String modifiedString = replaceCharAtIndex(originalString, indexToReplace, replacementChar);
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);

        scanner.close();
    }

    public static String replaceCharAtIndex(String str, int index, char replacement) {
        if (index < 0 || index >= str.length()) {
            return str;
        }

        char[] chars = str.toCharArray();
        chars[index] = replacement;
        return new String(chars);
    }
}