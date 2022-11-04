//Program to check the vowels and Consonant in given string
public class No_Vowels_Consonant {
    public static void main(String[] args){
        String str1 = new String("Java is Fun");
        boolean isLowerConsonant, isUpperConsonant, isLowerVowel, isUpperVowel;
        int vowelCount=0, consonantCount=0;
        for(int i=0;i<str1.length();i++) {
            char ch = str1.charAt(i);
            isLowerVowel = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
            isUpperVowel = (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
            isLowerConsonant = ch >= 'a' && ch <= 'z';
            isUpperConsonant = ch > 'A' && ch <= 'Z';
            if (isLowerVowel || isUpperVowel) {
                vowelCount++;
            } else if (isLowerConsonant || isUpperConsonant) {
                consonantCount++;
            }
        }
            System.out.println("Vowel Count : "+vowelCount);
            System.out.println("Consonant Count : "+consonantCount);
    }
}
