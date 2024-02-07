package week02.array;

public class Arr05 {
    public static void main(String[] args) {
        // 문자(char, 1byte) / 문자열(String)
        // String = char[]

        // String 기능 예시
        String str = "ABCD";

        // (1) length
        int strLength = str.length();
        System.out.println(strLength);

        // (2) charAt(int index)
        char strChar = str.charAt(1);
        System.out.println(strChar);

        // (3) substring(int fromIDx, int toIdx)
        String strSub = str.substring(0, 3);
        System.out.println(strSub);

        // (4) equals(String str)
        String newStr = "ABCE";
        boolean strEqual = newStr.equals(str);
        System.out.println(strEqual);

        // (5) toCharArray() : String -> char
        char[] strCharArray = str.toCharArray();

        // (6) 반대로 char[] -> String -> char
        char[] charArray = {'A', 'B', 'C', 'D'};
        String charArrayString = new String(charArray);
        System.out.println(charArrayString);

    }
}
