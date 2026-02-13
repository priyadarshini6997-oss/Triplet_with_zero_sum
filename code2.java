package com.index;

import java.util.Arrays;

public class code2 {

    int findTriplets(int arr[], int n) {

        Arrays.sort(arr);

        for(int i = 0; i < n - 2; i++) {

            int j = i + 1;
            int k = n - 1;

            while(j < k) {

                int sum = arr[i] + arr[j] + arr[k];

                if(sum == 0)
                    return 1;
                else if(sum < 0)
                    j++;
                else
                    k--;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        code2 obj = new code2();

        int arr[] = {-1, 2, -3, 1, 5};
        int n = arr.length;

        int result = obj.findTriplets(arr, n);

        if(result == 1)
            System.out.println("Triplet exists");
        else
            System.out.println("No triplet found");
    }
}
