class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] rank = new int[26];

        // Store the rank of each character
        for (int i = 0; i < order.length(); i++) {
            rank[order.charAt(i) - 'a'] = i;
        }

        // Compare adjacent words
        for (int i = 0; i < words.length - 1; i++) {

            String word1 = words[i];
            String word2 = words[i + 1];

            int j = 0;
            int minLength = Math.min(word1.length(), word2.length());

            while (j < minLength) {

                char c1 = word1.charAt(j);
                char c2 = word2.charAt(j);

                if (c1 != c2) {
                    if (rank[c1 - 'a'] > rank[c2 - 'a']) {
                        return false;
                    }

                    break;
                }

                j++;
            }

            // If word2 is a prefix of word1, order is invalid
            if (j == minLength && word1.length() > word2.length()) {
                return false;
            }
        }

        return true;
    }
}