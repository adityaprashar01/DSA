public class StringMethods {
    // 1. charAt(int index)
// Example: Get the character at index 4 in the string "Hello, World!"
    String str = "Hello, World!";
    char c = str.charAt(4);
// Result: c = 'o'

    // 2. length()
// Example: Get the length of the string "Hello, World!"
    int len = str.length();
// Result: len = 13

    // 3. substring(int beginIndex)
// Example: Get a substring starting from index 7 to the end in "Hello, World!"
    String sub = str.substring(7);
// Result: sub = "World!"

    // 4. substring(int beginIndex, int endIndex)
// Example: Get a substring from index 0 to 5 (exclusive) in "Hello, World!"
    String sub2 = str.substring(0, 5);
// Result: sub2 = "Hello"

    // 5. indexOf(String str)
// Example: Find the index of the first occurrence of "World" in "Hello, World!"
    int index = str.indexOf("World");
// Result: index = 7

    // 6. indexOf(char ch)
// Example: Find the index of the first occurrence of 'o' in "Hello, World!"
    int index2 = str.indexOf('o');
// Result: index2 = 4

    // 7. lastIndexOf(String str)
// Example: Find the index of the last occurrence of "l" in "Hello, World!"
    int lastIndex = str.lastIndexOf("l");
// Result: lastIndex = 10

    // 8. lastIndexOf(char ch)
// Example: Find the index of the last occurrence of 'o' in "Hello, World!"
    int lastIndex2 = str.lastIndexOf('o');
// Result: lastIndex2 = 8

    // 9. contains(CharSequence s)
// Example: Check if "Hello, World!" contains "World"
    boolean contains = str.contains("World");
// Result: contains = true

    // 10. equals(Object anObject)
// Example: Check if "Hello, World!" equals "Hello, World!"
    boolean isEqual = str.equals("Hello, World!");
// Result: isEqual = true

    // 11. equalsIgnoreCase(String anotherString)
// Example: Check if "Hello, World!" equals "hello, world!" ignoring case
    boolean isEqualIgnoreCase = str.equalsIgnoreCase("hello, world!");
// Result: isEqualIgnoreCase = true

    // 12. toLowerCase()
// Example: Convert "Hello, World!" to all lowercase
    String lower = str.toLowerCase();
// Result: lower = "hello, world!"

    // 13. toUpperCase()
// Example: Convert "Hello, World!" to all uppercase
    String upper = str.toUpperCase();
// Result: upper = "HELLO, WORLD!"

    // 14. trim()
// Example: Trim whitespace from the start and end of "   Hello, World!   "
    String strWithSpaces = "   Hello, World!   ";
    String trimmed = strWithSpaces.trim();
// Result: trimmed = "Hello, World!"

    // 15. replace(char oldChar, char newChar)
// Example: Replace all occurrences of 'o' with 'a' in "Hello, World!"
    String replaced = str.replace('o', 'a');
// Result: replaced = "Hella, Warld!"

    // 16. replace(CharSequence target, CharSequence replacement)
// Example: Replace "World" with "Java" in "Hello, World!"
    String replaced2 = str.replace("World", "Java");
// Result: replaced2 = "Hello, Java!"

    // 17. split(String regex)
// Example: Split "Hello, World!" by comma and space
    String[] parts = str.split(", ");
// Result: parts = ["Hello", "World!"]

    // 18. startsWith(String prefix)
// Example: Check if "Hello, World!" starts with "Hello"
    boolean starts = str.startsWith("Hello");
// Result: starts = true

    // 19. endsWith(String suffix)
// Example: Check if "Hello, World!" ends with "!"
    boolean ends = str.endsWith("!");
// Result: ends = true

    // 20. toCharArray()
// Example: Convert "Hello, World!" to a character array
    char[] charArray = str.toCharArray();
// Result: charArray = ['H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd', '!']

    // 21. valueOf(Object obj)
// Example: Convert the integer 123 to a string
    String strValue = String.valueOf(123);
// Result: strValue = "123"

    // 22. isEmpty()
// Example: Check if the string "" is empty
    String emptyStr = "";
    boolean isEmpty = emptyStr.isEmpty();
// Result: isEmpty = true

    // 23. matches(String regex)
// Example: Check if "12345" matches the regex pattern "\\d+" (one or more digits)
    String numStr = "12345";
    boolean matches = numStr.matches("\\d+");
// Result: matches = true

    // 24. compareTo(String anotherString)
// Example: Compare "Hello" with "World" lexicographically
    String str1 = "Hello";
    String str2 = "World";
    int cmp = str1.compareTo(str2);
// Result: cmp < 0 (because "Hello" is lexicographically less than "World")

    // 25. compareToIgnoreCase(String str)
// Example: Compare "hello" with "HELLO" lexicographically, ignoring case
    int cmpIgnoreCase = str1.compareToIgnoreCase("HELLO");
// Result: cmpIgnoreCase = 0 (because "hello" is equal to "HELLO" ignoring case)
}