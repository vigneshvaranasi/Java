import java.util.Locale;

public class LocaleExample {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println("Default Locale: " + locale);

        Locale customLocale = new Locale("fr", "FR");
        System.out.println("Custom Locale: " + customLocale.getDisplayName());
        System.out.println("Language: " + customLocale.getLanguage());
        System.out.println("Country: " + customLocale.getCountry());
        System.out.println("Display Name: " + customLocale.getDisplayName());
        System.out.println("Display Language: " + customLocale.getDisplayLanguage());
    }
}
