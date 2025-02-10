class Solution {
    public String clearDigits(String s) {
        StringBuilder str = new StringBuilder(s);
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i) >='0' && str.charAt(i) <='9'){
                str.deleteCharAt(i);
                str.deleteCharAt(i-1);
                i-=2;
            }
        }
        return str.toString();
    }
}