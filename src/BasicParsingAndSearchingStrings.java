public class BasicParsingAndSearchingStrings {
    public static void parseContents(String s){
        System.out.println("option 1");
        s.toLowerCase();
        for (char c: s.toCharArray()) {
            System.out.println(c);
        }

    }

    public static void main(String[] args) {
        String s = "HeLLo";
        System.out.println(s.toUpperCase().contains("LL"));
        System.out.println(s.toLowerCase().trim().contains("ll"));
        System.out.println(s.toLowerCase().trim().contains("HeLLo") );
        System.out.println(s.contains("HeLLo"));
        parseContents(s);

    }
}
