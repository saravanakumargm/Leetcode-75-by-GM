public class MergeStringAlternatively {
    public String mergeAlternately(String s1, String s2) {
        if(s1.length()==1 && s2.length()==1){
            return s1+s2;
        }
        String res = "";
        int i=0,j=0;
        while(i<s1.length() && j<s2.length()){
            res+=s1.charAt(i++);
            res+=s2.charAt(j++);
        }
        if(i<s1.length()){
            for (int k = i; k < s1.length(); k++) {
                res+=s1.charAt(k);
            }
        } else if (j<s2.length()) {
            for (int k = j; k < s2.length(); k++) {
                res+=s2.charAt(k);
            }
        }
        return res;
    }
}
