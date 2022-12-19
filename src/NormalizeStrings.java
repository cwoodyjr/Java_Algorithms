public class NormalizeStrings {

    public static String normalizeString(String s){
        return s.toLowerCase().trim().replace(",","");
    }

    public static void main(String[] args) {
        String newString = "   hellostring Are You, ok?      ";

        System.out.println(normalizeString(newString));
        System.out.println(normalizeString("Hello, There BUDDY"));
    }
}
