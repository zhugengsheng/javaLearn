package Leetcode;

public class test5 {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int length = strs.length;
        for (int i = 0; i < strs[0].length(); i++) {
            char value = strs[0].charAt(i);
            for (int j = 0; j < length; j++) {
                if (strs[j].length() ==i || strs[j].charAt(i) != value ){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}
