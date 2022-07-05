package Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Leetcode535 {
    private Map<Integer, String> dataBase = new HashMap<Integer, String>();
    private Random random = new Random();

    public String encode(String longUrl) {
        int key;
        while (true) {
            key = random.nextInt();
            if (!dataBase.containsKey(key)) {
                break;
            }
        }
        dataBase.put(key, longUrl);
        return "http://tinyurl.com/" + key;
    }

    public String decode(String shortUrl) {
        int p = shortUrl.lastIndexOf('/') + 1;
        int key = Integer.parseInt(shortUrl.substring(p));
        return dataBase.get(key);
    }
}
