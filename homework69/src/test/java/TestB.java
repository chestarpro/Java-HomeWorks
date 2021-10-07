import TaskB.ArrayClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestB {
    public static final int[] ARRAY = ArrayClass.createArray();
    public static final double[] AVERAGES = ArrayClass.getAverages();
    @Test
    public void testSizeArray() {
        int result = ArrayClass.createSizeArray();
        assertTrue(result > 0, "Не правильный размер массива");
    }

    @Test
    public void testValuesArray() {
        boolean result = true;
        for (int i : ARRAY) {
            if (i < 1 || i > 100) {
                result = false;
                break;
            }
        }
        assertTrue(result, "Не правильные значение в массиве");
    }

    @Test
    public void testAverage1() {
        double [] array = AVERAGES;
        boolean result = true;
        double avg1 = array[0];
        int count1 = (int) array[1];
        if(avg1 == 0 && count1 > 0 || count1 == 0 && avg1 > 0)
            result = false;
        assertTrue(result, "Ошибка! (среднее арифметическое от 1 до 30)");
    }

    @Test
    public void testAverage2() {
        double [] array = AVERAGES;
        boolean result = true;
        double avg2 = array[2];
        int count2 = (int) array[3];
        if(avg2 == 0 && count2 > 0 || count2 == 0 && avg2 > 0)
            result = false;
        assertTrue(result, "Ошибка! (среднее арифметическое от 1 до 30)");
    }

    @Test
    public void testAverage3() {
        double [] array = AVERAGES;
        boolean result = true;
        double avg3 = array[4];
        int count3 = (int) array[5];
        if(avg3 == 0 && count3 > 0 || count3 == 0 && avg3 > 0)
            result = false;
        assertTrue(result, "Ошибка! (среднее арифметическое от 1 до 30)");
    }
}