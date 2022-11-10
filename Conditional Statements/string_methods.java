import java.util.Locale;

public class string_methods {
    public static void main(String[] args) {
        String name = "Amardeep";
      /*  //System.out.println(name);
        int value = name.length();
        System.out.println(value);

        String lowerstring = name.toLowerCase();
        System.out.println(lowerstring);

        String upperstring = name.toUpperCase();
        System.out.println(upperstring);

        String nonTrimmedString = "       Amardeep      ";
        System.out.println(nonTrimmedString);

        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);*/

        // System.out.println(name.substring(1));
        // System.out.println(name.substring(1,6));

        //  System.out.println(name.replace('a','i'));
        //  System.out.println(name.replace("deep","dip"));

        // System.out.println(name.startsWith("am"));
        // System.out.println(name.endsWith("deep"));

        System.out.println(name.charAt(5));
        System.out.println(name.indexOf("a"));
        System.out.println(name.lastIndexOf("ep"));
        System.out.println(name.lastIndexOf("ep",6));

        System.out.println(name.equals("Amardeep"));
        System.out.println(name.equalsIgnoreCase("amarDeEP"));




    }
}
