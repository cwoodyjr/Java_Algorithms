public class validateStringsAllOrNothing {

    public static Boolean isUpperCase(String s) {
        return s.chars().allMatch(Character::isUpperCase);

    }

    public static Boolean isLowerCase(String s) {
        return s.chars().allMatch(Character::isLowerCase);
    }


    public static void main(String[] args) {
        System.out.println(isUpperCase("HELLO"));
        System.out.println(isUpperCase("HelLO"));
        System.out.println(isUpperCase("hello"));

        System.out.println(isLowerCase("HELLO"));
        System.out.println(isLowerCase("HeLlo"));
        System.out.println(isLowerCase("hello"));
        System.out.println("wankler");
    }
}
