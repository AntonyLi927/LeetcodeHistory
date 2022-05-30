package Leetcode;

public class Leetcode468 {
    public String validIPAddress(String queryIP) {
        String[] split;
        if (queryIP.split("\\.").length != 4 && queryIP.split(":").length != 8) return "Neither";
        if (queryIP.split("\\.").length == 4) {
            split = queryIP.split("\\.");
        } else {
            split = queryIP.split(":");
        }

        if (split.length == 4) {
            if (queryIP.endsWith(".")) return "Neither";
            for (int i = 0; i < 4; i++) {
                String s = split[i];
                try {
                    int temp = Integer.parseInt(s);
                    if (temp < 0 || temp > 255) {
                        return "Neither";
                    } else {
                        if (temp == 0 && s.length() > 1) return "Neither";
                        if (temp > 0 && s.charAt(0) == '0') {
                            return "Neither";
                        }
                    }
                } catch (Exception e) {
                    return "Neither";
                }
            }
            return "IPv4";
        } else {
            if (queryIP.endsWith(":")) return "Neither";
            for (int i = 0; i < 8; i++) {
                String s = split[i];
                if (s.length() > 4 || s.length() == 0) return "Neither";
                for (int j = 0; j < s.length(); j++) {
                    char temp = s.charAt(j);
                    if (!((temp >= '0' && temp <= '9') || (temp >= 'a' && temp <= 'f') || (temp >= 'A' && temp <= 'F'))) {
                        return "Neither";
                    }
                }
            }
            return "IPv6";
        }
    }

    public static void main(String[] args) {
        new Leetcode468().validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334");
    }
}
