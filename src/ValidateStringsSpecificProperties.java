public class ValidateStringsSpecificProperties {

    public static boolean isPasswordComplex(String s){
        return s.chars().anyMatch(Character::isLowerCase) &&
                s.chars().anyMatch(Character::isUpperCase) &&
                s.chars().anyMatch(Character::isDigit);
    }

    public static void main(String[] args) {
        System.out.println(isPasswordComplex("MyPassowrd"));
        System.out.println(isPasswordComplex("mypassword23"));
        System.out.println(isPasswordComplex("MyPassword2"));
        System.out.println(isPasswordComplex("MYPASSWORD2"));
    }
}
