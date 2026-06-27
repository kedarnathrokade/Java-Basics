package learn.strings.OccurenceOfCharater;

public class OccurrenceOfCharacterUsingArray {

    public static void main(String[] args) {
        String s = "Kedarnath";

        s = s.replaceAll("\\s+", ""); // Removing all the spaces

        int[] count = new int[256]; // Assuming ASCII characters

        for (char c : s.toCharArray()) {
           // c = Character.toLowerCase(c); // converting to lower case
            count[c]++; // Incrementing the count for the character
        }

        System.out.println("Count of characters:");
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println((char) i + ":" + count[i]); // Printing the occurrences of characters
            }
        }
    }

}
