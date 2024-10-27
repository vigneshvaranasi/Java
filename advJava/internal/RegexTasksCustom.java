import java.util.*;
import java.util.regex.*;

public class RegexTasksCustom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String inputText = in.nextLine();
        in.close();

        // Task 1: Find words that start with 'h' and are 2 characters long
        Pattern patternH = Pattern.compile("\\bh\\w{1}\\b");
        Matcher matcherH = patternH.matcher(inputText);
        
        List<String> hWords = new ArrayList<>();
        while (matcherH.find()) {
            hWords.add(matcherH.group());
        }
        System.out.println("Words that start with 'h' and have length 2: " + hWords);

        // Task 2: Replace first word that starts with 'a' with 'lab'
        Pattern patternA = Pattern.compile("\\ba\\w*");
        Matcher matcherA = patternA.matcher(inputText);

        String modifiedText = matcherA.replaceFirst("lab");
        System.out.println("Modified text after replacing first word starting with 'a': " + modifiedText);
    }
}