import java.util.Arrays;
import java.util.Random;

/**
 * @author : Along
 * @date : 2020/11/12
 */
public class SortMain {
    public static void main(String[] args) throws InterruptedException {
        int[] numbers = new int[100];
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int j = random.nextInt(1000);
            numbers[i] = j;
        }
        System.out.println("生成随机数组：" + Arrays.toString(numbers));
        System.out.println("开始排序");
        long beginTime = System.currentTimeMillis();
        InsertionSort.sort(numbers);
        SelectionSort.sort(numbers);
//        Thread.sleep(500);
        long endTime = System.currentTimeMillis();
        System.out.println("排序后数组：" + Arrays.toString(numbers));
        System.out.println("用时：" +(endTime - beginTime ) + "ms");

    }

}
