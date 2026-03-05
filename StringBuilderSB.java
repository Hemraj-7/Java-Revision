public class StringBuilderSB {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Hemsa");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0, 'P');
        // sb.setCharAt(0, 'Pc'); // two chars are not allowed
        System.out.println(sb);

        // insert char
        sb.insert(0, 'S');
        // sb.insert(0, 'Sc'); // two chars are not allowed
        sb.insert(4, 'n');
        System.out.println(sb);

        // delete
        sb.delete(1, 2);
        System.out.println(sb);

        // append
        StringBuilder newSb = new StringBuilder("h");
        System.out.println(newSb);
        newSb.append('e'); // str = str + "e"
        System.out.println(newSb);
        newSb.append('l'); // str = str + "l"
        System.out.println(newSb);
        newSb.append('l');
        System.out.println(newSb);
        newSb.append('o');
        System.out.println(newSb);
        newSb.append('!');
        System.out.println(newSb);

        // length
        System.out.println(newSb.length());

        // Q. reverse an String?
        // solution by myself
        System.out.println("String Before: " + newSb);

        int length = newSb.length();
        for (int i = newSb.length() - 1; i >= 0; i--) {
            newSb.append(newSb.charAt(i));
        }
        newSb.delete(0, length);

        System.out.println("String After: " + newSb);

        // solution by yt video ->
        System.out.println("String Before: " + sb);

        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i; // 6 - 1 - 0 = 5

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println("String After: " + sb);
    }
}
