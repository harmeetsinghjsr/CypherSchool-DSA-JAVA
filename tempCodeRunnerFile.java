public class AnagramString {
    public static void main(String[] args) {
        String str1 = "LISTEN";
        String str2 = "SILENT";
        System.out.println(isAnagram(str1, str2));

        str1 = "TRIANGLE";
        str2 = "INTEGRAL";
        System.out.println(isAnagram(str1, str2));

        str1 = "ELEVEN PLUS TWO";
        str2 = "TWELVE PLUS ONE";
        System.out.println(isAnagram(str1, str2));
    }

    static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        str1 = str1.toLowerCase();
        str2 = str2.toUpperCase();

        int n = str1.length();

        int freqArr1[] = new int[26];
        int freqArr2[] = new int[26];

        for (int i = 0; i < n; i++) {
            int index1 = str1.charAt(i) - 'a';
            freqArr1[index1]++;

            int index2 = str2.charAt(i) - 'a';
            freqArr2[index2]++;
        }

        for (int i = 0; i < 26; i++) {
            if (freqArr1[i] != freqArr2[i]) {
                return false;
            }
        }
        return true;
    }
}