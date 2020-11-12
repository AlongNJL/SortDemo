import java.util.Random;

/**ss
 * 归并排序
 * ********
 * 时间复杂度  【均分】O(nlogn) ~ 【最不均分】O(n^2)
 * 空间复杂度  【最不均分】O(n) ~ 【均分】O(logn)
 * @author : Along
 * @date : 2020/11/12
 */
class Solution {
    public void quickSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int left, int right) {
        // base case
        if (left >= right) {
            return;
        }

        // partition
        Random random = new Random(); // java.util 中的随机数生成器
        int pivotIndex = left + random.nextInt(right - left + 1);
        swap(array, pivotIndex, right);

        int i = left;
        int j = right - 1;
        while (i <= j) {
            if (array[i] <= array[right]) {
                i++;
            } else {
                swap(array, i, j);
                j--;
            }
        }
        swap(array, i, right);

        //「分」
        quickSort(array, left, i - 1);
        quickSort(array, i + 1, right);
    }

    private void swap(int[] array, int x, int y) {
        int tmp = array[x];
        array[x] = array[y];
        array[y] = tmp;
    }
}