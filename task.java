// Задание

// Пусть дан произвольный список целых чисел.

// 1) Найти максимальное значение
// 2) Найти минимальное значение
// 3) Найти среднее значение
// 4) Нужно удалить из него чётные числа

import java.rmi.Remote;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class task {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt((100 - 1) + 1) + 1);
        }
        int indexOfMax = 0,
                indexOfMin = 0,
                maxNum = list.get(0),
                minNum = list.get(0),
                count = 0,
                indexOfRemove = 0;
        double sumOfNumbers = 0;
        for (int o : list) {
            count += 1;
            sumOfNumbers += o;
            if (o > maxNum) {
                maxNum = o;
                indexOfMax = list.indexOf(o);
            }
            if (minNum > o) {
                minNum = o;
                indexOfMin = list.indexOf(o);
            }
        }
        sumOfNumbers /= count;
        System.out.println("Исходный список: ");
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println("Максимальное число: " + maxNum + " , его индекс: " + indexOfMax + " , Минимальное число: "
                + minNum + ", его индекс: " + indexOfMin + ". Среднее арифметическое: " + sumOfNumbers);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("Список после удаления четных чисел: ");
        System.out.println(Arrays.toString(list.toArray()));
    }
}
