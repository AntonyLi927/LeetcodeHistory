package Leetcode;

public class Leetcode6055 {
    public int convertTime(String current, String correct) {
        String[] currents = current.split(":");
        int curMin = Integer.parseInt(currents[0]) * 60 + Integer.parseInt(currents[1]);


        String[] corrects = correct.split(":");
        int corMin = Integer.parseInt(corrects[0]) * 60 + Integer.parseInt(corrects[1]);

        int res = 0;

        while (curMin <= corMin) {
            if (curMin == corMin) {
                break;
            }
            if (curMin + 60 <= corMin) {
                curMin += 60;
                res++;
            } else if (curMin + 15 <= corMin) {
                curMin += 15;
                res++;
            } else if (curMin + 5 <= corMin) {
                curMin += 5;
                res++;
            } else if (curMin + 1 <= corMin) {
                curMin += 1;
                res++;
            }
        }
        return res;

    }
}
