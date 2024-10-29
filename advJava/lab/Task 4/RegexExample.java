import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String text = "hi he hello apple ant happy";

        // i. Find words that start with 'h' and are 2 letters long
        Pattern pattern1 = Pattern.compile("\\bh\\w{1}\\b");
        Matcher matcher1 = pattern1.matcher(text);

        System.out.println("Words that start with 'h' and have length of 2:");
        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }

        // ii. Find the word that starts with 'a' and replace the first occurrence with "lab"
        Pattern pattern2 = Pattern.compile("\\ba\\w*\\b");
        Matcher matcher2 = pattern2.matcher(text);

        if (matcher2.find()) {
            text = matcher2.replaceFirst("lab");
        }

        System.out.println("Text after replacing the first word starting with 'a':");
        System.out.println(text);
    }
}
