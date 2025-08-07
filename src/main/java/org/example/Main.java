package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        String greeting = "Hello, Cadets!";
        int length = greeting.length(); /* prediction is 14 since counting the length of the array does not
        include index 0. */
        System.out.println("The length of the string is: " + length);

        String message = "Keep learning!";
        char character = message.charAt(5); /* prediction is 'L' since the index starts at 0 and the 5th index
        is the letter 'L'. */
        System.out.println("The character at index 5 is: " + character);

        String statement = "Java is Powerful!";
        String part = statement.substring(5,7); /* prediction is "is" since the substring method
        extracts characters from index 5 to index 7 (exclusive). */
        System.out.println("The extracted substring is: " + part);

        String mixedCase = "This Is A Test";
        String upper =mixedCase.toUpperCase(); /* prediction is "THIS IS A TEST" since the toUpperCase method
        converts all characters in the string to uppercase. */
        String lower = mixedCase.toLowerCase(); /* prediction is "this is a test" since the toLowerCase method
        converts all characters in the string to lowercase. */
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);

        String sentence = "The quick brown fox jumps over the lazy dog.";
        int indexOfFox = sentence.indexOf("fox"); /* prediction is 16 since the indexOf method returns the
        index of the first occurrence of the specified substring, which is "fox" in this case. */
        int indexOfZ = sentence.indexOf("z"); /* prediction is 43 since the indexOf method returns the
        index of the first occurrence of the specified character, which is 'z' in this case. */
        int indexOfCat =  sentence.indexOf("cat"); /* prediction is -1 since the indexOf method returns -1
        when the specified substring is not found in the string. */
        System.out.println("Index of 'fox': " + indexOfFox);
        System.out.println("Index of 'z': " + indexOfZ);
        System.out.println("Index of 'cat': " + indexOfCat);

        String str1 = "Java";
        String str2 = "java";
        String str3 = "Java";

        boolean isEqual1 = str1.equals(str2); /* prediction is true since the equals method checks
        if the two strings are equal in terms of content. */
        boolean isEqual2 = str1.equals(str3); /* prediction is true since the equals method checks
        if the two strings are equal in terms of content. */
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2); /* prediction is false since the equals method is case-sensitive
        and "java" is not equal to "Java". */
        System.out.println("\"Java\".equals(\"java\"): " + isEqual1);
        System.out.println("\"Java\".equals(\"Java\"): " + isEqual2);
        System.out.println("\"Java\".equalsIgnoreCase(\"java\"): " + isEqualIgnoreCase);

        String original = "I like cats. Cats are cute.";
        String replaced = original.replace("cats", "dogs"); /* prediction is "I like dogs. Dogs are cute."
        since the replace method replaces all occurrences of the specified substring with the new substring. */
        System.out.println("Original: " + original);
        System.out.println("Replaced: " + replaced);

        String padded = "      Lots of Spaces        "; /* prediction is "      Lots of Spaces        "
        since the trim method removes leading and trailing whitespace from the string. */
        String trimmed = padded.trim(); /* prediction is "Lots of Spaces" since the trim method
        removes leading and trailing whitespace from the string. */
        System.out.println("Padded string length: " + padded.length());
        System.out.println("Trimmed string: '" + trimmed + "'");
        System.out.println("Trimmed string length: " + trimmed.length());





    }
}