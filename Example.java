public class Example {
    public static void main(String[] args) {
        // Creating a String using the new keyword
        String str1 = new String("Hello World");

        // Creating a String using string literals
        String str2 = "Hello World";
        // Comparing the two String objects
        boolean areEqual = str1.equals(str2);
        System.out.println("Are the strings equal? " + areEqual);
    }
}
