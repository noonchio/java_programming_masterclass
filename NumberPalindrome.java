public class NumberPalindrome {
    public static boolean isPalindrome(int num){
        int reversednum = 0;
        int originalNum = num;
        while (num != 0) {
            int reminder = num % 10;
            reversednum = reversednum * 10 + reminder;
            num /= 10;
        }
        if (originalNum == reversednum){
            return true;
        }else{
            return false;
        }
    }
}
