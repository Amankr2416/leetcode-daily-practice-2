class Solution {
    public String makeGood(String s) {
        StringBuilder stack = new StringBuilder();

        for (char c : s.toCharArray()) {
            int len = stack.length();

            if (len > 0 && Math.abs(stack.charAt(len - 1) - c) == 32) {
                stack.deleteCharAt(len - 1); // remove bad pair
            } else {
                stack.append(c);
            }
        }

        return stack.toString();
    }
}