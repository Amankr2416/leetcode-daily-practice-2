class Solution {
    public String reverseByType(String s) {
        StringBuilder letters = new StringBuilder();
        StringBuilder specials = new StringBuilder();

        // Separate
        for (char ch : s.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                letters.append(ch);
            } else {
                specials.append(ch);
            }
        }

        // Reverse both
        letters.reverse();
        specials.reverse();

        // Rebuild
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                result.append(letters.charAt(i++));
            } else {
                result.append(specials.charAt(j++));
            }
        }

        return result.toString();
    }
}