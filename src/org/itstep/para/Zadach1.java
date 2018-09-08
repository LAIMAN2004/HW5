package org.itstep.para;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Zadach1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mas;
        int i = 0;
        System.out.println("____________________Задача 1 Выполнена___________________");
        System.out.println("____________________Задача 2 ___________________");
        System.out.println("Введите 10 значений для заполнеиия массива");
        mas = new int[10];
        for (i = 0; i < mas.length; i++) {
            mas[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(mas));
        int sum = IntStream.of(mas).sum();
        System.out.println("Среднее арифметическая число введенного массива = " + (sum / i));
        System.out.println("____________________Задача 3 ___________________");
        System.out.println("Массив ДО замены крайних символов - " + Arrays.toString(mas));
        int y = mas[0];
        mas[0] = mas[9];
        mas[9] = y;
        System.out.println("Массив ПОСЛЕ замены крайних символов - " + Arrays.toString(mas));
        System.out.println("____________________Задача 4 ___________________");
        System.out.println("Ищем в массиве значение (число) Х=0");
        int x = 0;
        for (i = 0; i < 10; i++) {
            if (mas[i] == x) {
                System.out.println(x + " является " + (i + 1) + " по счету в массиве");
            }
        }

    }

}