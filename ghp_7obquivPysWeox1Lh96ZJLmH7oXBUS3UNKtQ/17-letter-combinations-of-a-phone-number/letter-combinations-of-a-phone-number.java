import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) return result;

        String[] map = {
            "", "", "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"
        };

        backtrack(result, new StringBuilder(), digits, map, 0);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder curr,
                           String digits, String[] map, int index) {

        if (index == digits.length()) {
            result.add(curr.toString());
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (char c : letters.toCharArray()) {
            curr.append(c);
            backtrack(result, curr, digits, map, index + 1);
            curr.deleteCharAt(curr.length() - 1); // backtrack
        }
    }
}