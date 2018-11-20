import java.util.Arrays;

public class Utils {
    static void task1(){
        /**
         * 1) Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
         *  отделяя один элемент от другого пробелом, а затем в столбик
         *  (отделяя один элемент от другого началом новой строки).
         *  Перед созданием массива подумайте, какого он будет размера. 2 4 6 … 18 20
         *                                                              2
         *                                                              4
         *                                                              6
         *                                                              …
         *                                                              20
         */
        System.out.println("task1");
        int array[] = new int[10];
        for (int i=0; i<1; i++){
            for (int j=2; j<=20; j+=2){
                array[i]=j;
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
                                                                                                                                     System.out.print(Arrays.toString(array));
    }
}
