public class Solution {
    static int in = 0;

    public static void main(String[] args) {
    }

    public static String stringUnpack(StringBuilder str) {
        StringBuilder sb = new StringBuilder();
        int num = 0;
        while (in < str.length() && str.charAt(in) != ']') {
            char ch = str.charAt(in);
            if (ch == '[') {
                in++;
                String res = stringUnpack(str);
                for (int i = 0; i < num; i++) {
                    sb.append(res);
                }
                num = 0;
            } else if (Character.isDigit(ch)) {
                num = Character.getNumericValue(ch);
            } else {
                sb.append(ch);
            }
            in++;
        }
        return sb.toString();
    }
}
