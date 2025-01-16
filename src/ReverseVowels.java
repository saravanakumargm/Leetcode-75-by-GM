public class ReverseVowels {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length()-1;
        char[] str = s.toCharArray();
        String vowels = "aeiouAEIOU";
        while (left<right){
            while(left<right && vowels.indexOf(str[left]) == -1){
                left++;
            }
            while(left<right && vowels.indexOf(str[right])==-1){
                right--;
            }
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
        String res = new String(str);
        return res;
    }
}
