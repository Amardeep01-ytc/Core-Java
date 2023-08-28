package interviewQuestions;

import java.util.Arrays;

public class Question1_RearrangeWords {
    public static void main(String[] args) {
        String str = "i2s Test4 3a Th1is";
//        output = This is a Tests
        String output = rearrange(str);
        System.out.println(output);
    }

    static String rearrange(String str) {
        String ans = "";
        String[] words = str.split(" ");
        String[] output = new String[words.length];
//        System.out.println(Arrays.toString(words));
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int index = 0;
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                if (ch >= '1' && ch <= '9') index = ch - '0';
            }
            output[index - 1] = word;
//            System.out.println(index);
        }
//        System.out.println(Arrays.toString(output));
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < output[i].length(); j++) {
                if (output[i].charAt(j) >= '1' && output[i].charAt(j) <= '9') continue;
                else ans = ans + output[i].charAt(j);
            }
            ans = ans + " ";
        }
        return ans;
    }
}
