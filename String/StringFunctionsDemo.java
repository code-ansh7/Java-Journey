 public class StringFunctionsDemo {
    public static void main(String[] args) {

        String str = "Programming";
        String sentence = "I Love Java";

        // 1. length()
        System.out.println("Length = " + str.length());

        // 2. charAt()
        System.out.println("Character at index 3 = " + str.charAt(3));

        // 3. toUpperCase()
        System.out.println("Uppercase = " + str.toUpperCase());

        // 4. toLowerCase()
        System.out.println("Lowercase = " + str.toLowerCase());

        // 5. equals() = compare two strings
        String a = "Java";
        String b = "Java";
        System.out.println("Equals = " + a.equals(b));

        // 6. equalsIgnoreCase() = upper case aur lower case ignore krke compare krta hai.
        String x = "JAVA";
        String y = "java";
        System.out.println("Equals Ignore Case = " + x.equalsIgnoreCase(y));

        // 7. contains()
        System.out.println("Contains Java = " + sentence.contains("Java"));

        // 8. substring()
        System.out.println("Substring = " + str.substring(3, 7));

        // 9. indexOf()
        System.out.println("Index of g = " + str.indexOf('g'));

        // 10. split() = isme "" k andr vo dalte hai jha se string ko todna hota hai 
        String[] words = sentence.split(" ");// jha jha space aye vha string tod do 

        System.out.println("Words after split:");

        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }

        // 11. trim() // remove unnecessary spaces
        String name = "   Ansh   ";
        System.out.println("Trim = '" + name.trim() + "'");

        // 12. replace()
        System.out.println(sentence.replace("Java", "Python"));
    }
}
