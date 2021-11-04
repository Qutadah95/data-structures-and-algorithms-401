public class brackets {

    public static boolean validateBrackets(String string) {

        Stack<Character> bracket = new Stack<Character>();

        char[] chars = string.toCharArray();

        for (Character char2 : chars) {

            if (char2.equals('(') || char2.equals('[') || char2.equals('{')) {

                bracket.push(char2);

            } else if (char2.equals(')') || char2.equals(']') || char2.equals('}')) {

                char checkChar = bracket.pop();

                if (char2.equals(')') && checkChar != '(') {
                    return false;
                } else if (char2.equals(']') && checkChar != '[') {
                    return false;
                } else if (char2.equals('}') && checkChar != '{') {
                    return false;
                }

            }

        }

        return bracket.isEmpty();
    }
}
