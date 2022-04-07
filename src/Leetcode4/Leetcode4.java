package Leetcode4;

import java.awt.desktop.SystemSleepEvent;
import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1Length = nums1.length;
        int nums2Length = nums2.length;
        nums1 = Arrays.copyOf(nums1,nums1Length+nums2Length);//数组扩容
        System.arraycopy(nums2,0,nums1,nums1Length,nums2Length);
        for(int i=0;i<nums1.length-1;i++) {
            for(int j=0;j<nums1.length-1-i;j++)
            {
                if(nums1[j]>nums1[j+1])
                {
                    int temp=nums1[j];
                    nums1[j]=nums1[j+1];
                    nums1[j+1]=temp;
                }
            }
        }
        double result = 0;
        if (nums1.length%2==0){
            result = (nums1[nums1.length/2]+nums1[nums1.length/2-1])/2.0;
            return result;
        }
        else {
            result = nums1[(nums1.length-1)/2];
            return result;
        }
    }

    public static void main(String[] args) {
        int[] num1 = {1,2};
        int[] num2 = {3,4};
        System.out.println(Leetcode4.findMedianSortedArrays(num1,num2));
        System.out.println(5/2);
    }
}
