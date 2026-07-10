public class Anagrams{
    public static void main(String[] args) {
        String str1 = "LISTEN";
        String str2 = "SILENT";
        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        if (java.util.Arrays.equals(arr1, arr2)) {
            System.out.println(str1 + " and " + str2 + " are Anagrams");
        } else {
            System.out.println(str1 + " and " + str2 + " are Not Anagrams");
        }
    }
}
