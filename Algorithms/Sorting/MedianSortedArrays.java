// LC4: Median of Two Sorted Arrays (Binary Search)
import java.lang.Math;

class MedianSortedArrays {    
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        /* If nums2 is shorter, swap it to run a binary search on it first */
        if (nums2.length < nums1.length) return findMedianSortedArrays(nums2, nums1);
        
        int m = nums1.length;
        int n = nums2.length;

        /* Implement binary search */
        int left = 0;
        int right = m;
        int mid = (m + n + 1) / 2; // added 1 to handle both odd and even cases
        while (left <= right) {
            // Get the middle index to halve nums1 for its partition
            int i = (left + right) / 2;
            // Derive nums2's partition from nums1 for balanced overall partitions
            int j = mid - i;
            // CASE #1: The elements on the left of j is larger than i
            if (i < right && nums2[j-1] > nums1[i]) {
                // i is too small; move the left pointer to in front of i
                left = i + 1;
            }
            // CASE 2: The elements on the left of i is larger than j
            else if (i > left && nums1[i-1] > nums2[j]) {
                // i is too large; move the right pointer to behind of i
                right = i - 1;
            }
            else {
                int leftHalfMax;
                if (i == 0) leftHalfMax = nums2[j-1]; // CASE #3.1
                else if (j == 0) leftHalfMax = nums1[i-1]; // CASE #3.2
                // CASE #3.3: If neither is null, but valid i value is impossible to find as:
                //     3.3.1: m<n, all elements of nums1 are greater than nums2
                //     3.3.2: m<n, all elements of nums2 are greater than nums1
                else leftHalfMax = Math.max(nums1[i-1], nums2[j-1]);
                
                // If the length of the large array is odd, the median is the maximum value of the left half of the array
                if ((m+n) % 2 == 1) return leftHalfMax;

                int rightHalfMin;
                if (i == m) rightHalfMin = nums2[j]; // CASE #3.4
                else if (j == n) rightHalfMin = nums1[i]; // CASE #3.5
                else rightHalfMin = Math.min(nums1[i], nums2[j]); // CASE #3.6

                // If the length of the large array is even, the median is the average of the leftHalfMax and rightHalfMin
                if ((m+n) % 2 == 0) return (leftHalfMax + rightHalfMin) / 2.0;
            }
        }

        return 0.0;
    }
    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2};
        int[] nums2 = new int[] {3,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}