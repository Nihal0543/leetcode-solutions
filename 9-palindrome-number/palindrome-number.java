class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) {
            return false;
        }
        if (x==0){
            return true;
        }
        String y = String.valueOf(x);
        for ( int i =0; i<y.length();i++) {
            if(y.charAt(i)!= y.charAt(y.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}