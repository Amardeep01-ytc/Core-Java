public class practice_set2 {
    public static void main(String[] args) {
        //Problem 1: WAP to convert a string to lowercase
        // String name = "Amardeep Pawar";
        // name = name.toLowerCase();
        // System.out.println(name);

        //Problem 2: WAP to replace a spaces with underscore
        // String text = "to lower case";
        // text = text.replace(" ","_");
        // System.out.println(text);

        //problem 3:
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>","Amardeep");
        System.out.println(letter);

        //Problem 4:WAP to detect double and triple spaces in a string
        String myString = "This string contains      double and triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        /*Problem 5:WAP to format the following letter using escpae sequence charatceres:
           letter = "Dear Harry,This JAVA course is Nice.Thanks"
            */
        String myletter = "Dear Harry,\n\tThis java course is nice.\n\t\t    Thanks!";
        System.out.println(myletter);


    }
}
