/**
 * 选择排序
 * 时间复杂度
 * (n-1) + (n-2) + … + 1 = n*(n-1) / 2 = O(n^2)
 * 空间复杂度
 * 最多的情况是 call swap() 的时候，然后 call stack 上每一层就用了几个有限的变量，所以是 O(1)
 * 不稳定
 * 交换的过程破坏了原有的相对顺序
 *
 * @author : Along
 * @date : 2020/11/12
 */
class SelectionSort {
    public static void sort(int[] input) {
        if (input == null || input.length <= 1) {
            return;
        }
        for (int i = 0; i < input.length - 1; i++) {
            int minValueIndex = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[minValueIndex]) {
                    minValueIndex = j;
                }
            }
            swap(input, minValueIndex, i);
        }
    }

    private static void swap(int[] input, int x, int y) {
        int tmp = input[x];
        input[x] = input[y];
        input[y] = tmp;
    }
}