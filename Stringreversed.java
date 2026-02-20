public class Stringreversed {

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        // Example string
        String original = "Hello, World!";
        System.out.println("Original String: " + original);

        // Reversing the string
        String reversed = reverseString(original);
        System.out.println("Reversed String: " + reversed);

        // Using StringBuilder's reverse method
        StringBuilder sb = new StringBuilder(original);
        System.out.println("Reversed using StringBuilder: " + sb.reverse().toString());
    }
}