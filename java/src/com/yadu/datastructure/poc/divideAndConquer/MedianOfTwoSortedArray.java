package com.yadu.datastructure.poc.divideAndConquer;


/*
http://www.geeksforgeeks.org/median-of-two-sorted-arrays/
    Question:
    There are 2 sorted arrays A and B of size n each.
    Write an algorithm to find the median of the array obtained after merging
    the above 2 arrays(i.e. array of length 2n).
    The complexity should be O(log(n))
*/

public class MedianOfTwoSortedArray {

    public static void main(String[] args) {
        int[] arrayA = new int[]{4,5,6,7,8,9,10,11};
        int[] arrayB = new int[]{1,2,3,4,5,6,7,8};

        int median = findMedian(arrayA, arrayB, 0, arrayA.length, 0, arrayB.length);
        System.out.println(median);
    }



    private static int findMedian(int[] arrayA, int[] arrayB, int a, int b, int x, int y) {
        if(b-a == 2) {
            return (max(arrayA[a],arrayB[x]) + min(arrayA[b],arrayB[y]) )/2;
        }
        int midA = a + (b - a)/2;
        int midb = x + (y - x)/2;
        if(arrayA[midA]> arrayB[midb]) {
            return findMedian(arrayA, arrayB, a, midA, midb, y);
        }
        return findMedian(arrayA, arrayB, midA, b, x, midb);
    }

    private static int max(int a, int b){
        return a>b ? a:b;
    }

    private static int min(int a, int b){
        return a<b ? a:b;
    }
}
