package base;

import java.util.Arrays;
import java.util.List;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/24 8:43 上午
 */
public class ArrayListTest {
    public static void main(String[] args) {
        int[] myArray = { 1, 2, 3 };
        List myList = Arrays.asList(myArray);
        System.out.println(myList.size());//1
        System.out.println(myList.get(0));//数组地址值
        System.out.println(myList.get(1));//报错：ArrayIndexOutOfBoundsException
        int [] array=(int[]) myList.get(0);
        System.out.println(array[0]);
    }
}
