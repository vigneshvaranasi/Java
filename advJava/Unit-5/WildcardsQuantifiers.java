import java.util.regex.*;

public class WildcardsQuantifiers {
    public static void main(String[] args) {
        String text = "abc aab aabc";
        
        // Using wildcard (.)
        String regex1 = "a.c";
        System.out.println("Matches for 'a.c':");
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(text);
        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }
        
        // Using quantifiers (*)
        String regex2 = "a*";
        System.out.println("Matches for 'a*':");
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(text);
        while (matcher2.find()) {
            System.out.println("'" + matcher2.group() + "'");
        }

        // Using quantifiers ({n,m})
        String regex3 = "a{2,3}";
        System.out.println("Matches for 'a{2,3}':");
        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(text);
        while (matcher3.find()) {
            System.out.println(matcher3.group());
        }
    }
}
