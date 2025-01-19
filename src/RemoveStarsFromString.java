public class RemoveStarsFromString {
    public String removeStars(String s) {
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray())
            if (c == '*')
                res.setLength(res.length() - 1);
            else
                res.append(c);
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(new RemoveStarsFromString().removeStars("erase*****"));
    }
}
