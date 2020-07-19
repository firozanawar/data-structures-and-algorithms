package leetcode;

public class ImplementStrStr28 {

    public static void main(String[] args) {
        System.out.println(strStr("aaaaa","bba"));
    }

    public static int strStr(String haystack, String needle) {

        if(!haystack.isEmpty() && haystack.contains(needle)){
            return haystack.indexOf(needle);
        }else{
            return -1;
        }
    }
}
