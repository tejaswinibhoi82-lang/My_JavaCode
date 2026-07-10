public class Alphabets {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("HELLO");
        int h = 0, d = 0;
        boolean onlyAlphabets = true;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                System.out.println("Upper Alphabet");
                h++;
            } else if (Character.isLowerCase(ch)) {
                System.out.println("Lower Alphabet");
                d++; 
            } else if (Character.isDigit(ch)) {
                System.out.println("Digit");
                d++;
            }
            else{
            	System.out.println("it is not alphabets");
            	}
            break;
        }
    }
}
