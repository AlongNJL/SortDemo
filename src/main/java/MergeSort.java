/**
 * 归并排序
 * ********
 * 时间复杂度
 * 「分」的过程，每次的时间取决于有多少个小问题，可以看出来是 1，2，4，8...这样递增的，
 * 那么加起来就是O(n).
 *
 * 「合」的过程，每次都要用两个指针走完全程，每一层的 call stack 加起来用时是 O(n)，
 * 总共有 logn 层，所以是 O(nlogn).
 *
 * 那么总的时间，就是 O(nlogn).
 * ********
 * 空间复杂度
 * O(n)
 *
 * @author : Along
 * @date : 2020/11/12
 */
public class MergeSort {
    public void mergeSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int[] newArray = new int[array.length];
        mergeSort(array, 0, array.length - 1, newArray);
    }

    private void mergeSort(int[] array, int left, int right, int[] newArray) {
        // base case
        if (left >= right) {
            return;
        }

        // 「分」
        int mid = left + (right - left) / 2;

        // 「治」
        mergeSort(array, left, mid, newArray);
        mergeSort(array, mid + 1, right, newArray);

        // 辅助的 array
        for (int i = left; i <= right; i++) {
            newArray[i] = array[i];
        }

        // 「合」
        int i = left;
        int j = mid + 1;
        int k = left;
        while (i <= mid && j <= right) {
            if (newArray[i] <= newArray[j]) { // 等号会影响算法的稳定性
                array[k++] = newArray[i++];
            } else {
                array[k++] = newArray[j++];
            }
        }
        if (i <= mid) {
            array[k++] = newArray[i++];
        }
    }
}