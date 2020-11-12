/**插入排序
 *  时间复杂度
 *      如果数组是近乎倒序的，每次插入都要在数组的第一个位置插入，
 *      那么已排序区间内的所有的元素都要往后移动一位，这一步平均是 O(n)，那么重复 n 次就是 O(n^2).
 *  空间复杂度
 *      重点是一个峰值的概念，并不是累计使用的空间。
 *      这里是 O(1)
 *  稳定
 *      因为在我们插入新元素的时候是从后往前按顺序检查
 *
 * @author : Along
 * @date : 2020/11/12
 */
class InsertionSort {

    public static void sort(int[] input) {
        if(input == null || input.length <= 1) {
            return;
        }
        for(int i = 1; i < input.length; i++) {
            int tmp = input[i];
            int j = i - 1;
            while(j >= 0 && input[j] > tmp) {
                input[j+1] = input[j];
                j --;
            }
            input[j+1] = tmp;
        }
    }
}
