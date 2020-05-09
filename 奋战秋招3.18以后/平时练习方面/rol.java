public class rol {
    public String LeftRotateString(String str,int n) {
        if (null == str || str.trim().length() == 0 || n == 0 || n == str.length())
            return str;

        // abcXYZdef n=3 XYZdefabc
        if (n > str.length())
            n = n % str.length();

        String part1 = str.substring(0, n);
        String part2 = str.substring(n);
        return part2 + part1;
    }
}