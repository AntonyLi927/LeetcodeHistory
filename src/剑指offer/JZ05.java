package 剑指offer;

public class JZ05 {
    public static String replaceSpace(String s) {
        if (s.length()==0) return "";
        String result = "";
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)!=' ') result = result + s.charAt(i);
            else result = result + "%20";
        }
        return result;
    }

    /**
     * 没考虑字符串的最前端和最后端有空格的情况
     * @param s
     * @return
     */
    public static String replaceSpace1(String s) {
        String res = "";
        String[] strings = s.split(" ");
        if (strings.length==0){
            for (int i=0;i<s.length();i++){
                res = res + "%20";
            }
            return res;
        }
        else {
            for (int i=0;i<strings.length-1;i++){
                res = res + strings[i] + "%20";
            }
            res = res + strings[strings.length-1];
            return res;
        }
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace("ab cde   "));
    }
}
