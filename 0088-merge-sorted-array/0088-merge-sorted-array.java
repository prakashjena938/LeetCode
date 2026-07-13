class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int arr[] = new int[nums1.length];

        // Copy elements
        for (int i = 0; i < arr.length; i++) {
            if (i < m) {
                arr[i] = nums1[i];
            } else {
                arr[i] = nums2[i - m];
            }
        }

        // Bubble Sort
        for (int j = 0; j < arr.length - 1; j++) {
            for (int k = 0; k < arr.length - 1 - j; k++) {

                if (arr[k] > arr[k + 1]) {
                    int temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                }

            }
        }

        // Copy back to nums1
        for (int l = 0; l < arr.length; l++) {
            nums1[l] = arr[l];
        }
    }
}