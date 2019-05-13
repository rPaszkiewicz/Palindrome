package JavaPoint;

public class PalindromeChecker {

    public boolean isNumberPalindrome(int number){
        String num = Integer.toString(number);
        String reversed = "";
        for (int i = num.length()-1; i >= 0; i--)
            reversed+=num.charAt(i);
        return num.equals(reversed);
    }
    public boolean isStringPalindrome(String word){
        String reversed = "";
        for (int i = word.length()-1; i >= 0; i--)
            reversed+=word.charAt(i);
        System.out.println(reversed);
        return reversed.equals(word);
    }
}
