public class IsSubsequence {
    public boolean isSubsequence(String s1, String s2) {
        int s = 0;
        int e = 0;
        while(s<s1.length() && e<s2.length()){
            if(s1.charAt(s)==s2.charAt(e)){
                s++;
            }
            e++;
        }
        return s==s1.length();
    }
}
