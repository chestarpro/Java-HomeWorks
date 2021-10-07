package TaskB;

import java.util.Arrays;
import java.util.Random;

public class ArrayClass {

    private static int[] array;

    public static int createSizeArray() {
        return new Random().nextInt(10 + 1 - 1) + 1;
    }

    public static int [] createArray() {
        Random random = new Random();
        array = new int[createSizeArray()];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100 + 1 - 1) + 1;
        }
        System.out.println("Ваш массив = " + Arrays.toString(array));

        return array;
    }

    public static double[] getAverages() {
        int count1 = 0, count2 = 0, count3 = 0;
        int sum1_30 = 0, sum31_60 = 0, sum61_100 = 0;

        for (int j : array) {
            if (j >= 1 && j <= 30) {
                sum1_30 += j;
                count1++;
            } else if (j >= 31 && j <= 60) {
                sum31_60 += j;
                count2++;
            } else {
                sum61_100 += j;
                count3++;
            }
        }

        double average1 = (double) sum1_30 / count1;
        double average2 = (double) sum31_60 / count2;
        double average3 = (double) sum61_100 / count3;

        System.out.println("от 1 до 30 => " + average1 + " количество " + count1);
        System.out.println("от 31 до 60 => " + average2 + " количество " + count2);
        System.out.println("от 61 до 100 => " + average3 + " количество " + count3);

        return new double[]{average1, count1, average2, count2, average3, count3};
    }
}
