class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
    // Ensure a is the smaller array
    if (a.length > b.length) return findMedianSortedArrays(b, a);

    int m = a.length;
    int n = b.length;
    int low = 0, high = m;

    while (low < high) {
        int mid = (low + high) / 2;
        int j = (m + n + 1) / 2 - mid;

        // Handle boundaries
        int Aleft  = (mid == 0) ? Integer.MIN_VALUE : a[mid - 1];
        int Aright = (mid == m) ? Integer.MAX_VALUE : a[mid];
        int Bleft  = (j == 0) ? Integer.MIN_VALUE : b[j - 1];
        int Bright = (j == n) ? Integer.MAX_VALUE : b[j];

        // Check if partition is correct
        if (Aleft <= Bright && Bleft <= Aright) {
            // Found correct partition
            if ((m + n) % 2 == 1) {
                return Math.max(Aleft, Bleft); // odd total length
            } else {
                return (Math.max(Aleft, Bleft) + Math.min(Aright, Bright)) / 2.0; // even total length
            }
        } else if (Aleft > Bright) {
            high = mid; // move left
        } else {
            low = mid + 1; // move right
        }
    }

    // After loop, low == high → recompute partition
    int mid = low;
    int j = (m + n + 1) / 2 - mid;

    int Aleft  = (mid == 0) ? Integer.MIN_VALUE : a[mid - 1];
    int Aright = (mid == m) ? Integer.MAX_VALUE : a[mid];
    int Bleft  = (j == 0) ? Integer.MIN_VALUE : b[j - 1];
    int Bright = (j == n) ? Integer.MAX_VALUE : b[j];

    if ((m + n) % 2 == 1) {
        return Math.max(Aleft, Bleft);
    } else {
        return (Math.max(Aleft, Bleft) + Math.min(Aright, Bright)) / 2.0;
    }
}

}
