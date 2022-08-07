class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder res = new StringBuilder();
        
        while (i >= 0 || j >= 0) {
            int iVal = i >= 0 ? num1.charAt(i) - '0' : 0;
            int jVal = j >= 0 ? num2.charAt(j) - '0' : 0;
            int val = (iVal + jVal + carry) % 10;
            carry = (iVal + jVal + carry) / 10;
            res.append(val);
            i--;
            j--;
        }
        
        if (carry != 0) {
            res.append(carry);
        }
        
        return res.reverse().toString();
    }
}