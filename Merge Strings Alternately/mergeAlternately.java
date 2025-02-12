import java.util.Stack;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        Stack<String> words = new Stack<>();
        int minLen  = Math.min(word1.length(),word2.length());
        for(int i = 0; i < minLen;i++){
            words.push(String.valueOf(word1.charAt(i)));
            words.push(String.valueOf(word2.charAt(i)));
        }
        String result = String.join("", words);
        if(word1.length()<word2.length())
            result += word2.substring(minLen,word2.length());
        else if(word1.length()>word2.length())
            result += word1.substring(minLen,word1.length());
        return result;
    }
}