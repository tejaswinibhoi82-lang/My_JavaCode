public class Duplicate_count{
    public static void main(String[] args) {
        String str = "Programming";
        int[] count = new int[256];

        for (char c : str.toLowerCase().toCharArray()) {
            count[c]++;
        }

        System.out.println("Duplicate characters:");
        for (int i = 0; i < 256; i++) {
            if (count[i] > 1) {
                System.out.println((char)i + ": " + count[i]);
            }
        }
    }
}
