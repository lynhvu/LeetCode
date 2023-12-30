class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int skip = 0;
        int i = 0; 
        int j = 0;
        while (i < word.length() && j < abbr.length()) {
            if (Character.isDigit(abbr.charAt(j))) {
                skip = skip * 10 + abbr.charAt(j) - '0';
                if (skip == 0) return false;
                j++;
            } else {
                i += skip;
                if (i >= word.length() 
                    || word.charAt(i) != abbr.charAt(j)) {
                    return false;
                }
                skip = 0;
                i++;
                j++;
            }
        }
        i += skip;
        return i == word.length() && j == abbr.length();
    }
}