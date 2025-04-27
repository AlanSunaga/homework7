import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Задача 1
        //Объявите три массива:
        //
        //Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова
        //new
        //.
        //Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.

        //Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.

        System.out.println("Задача 1");

        int[] arrI = new int[]{1, 2, 3};

        double[] arrD = {1.57, 7.654, 9.986};

        String[] arrS = {"Желаю","хорошего","дня"};
        System.out.println();

        //Задача 2
        //Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце строки запятую ставить не надо.

        System.out.println("Задача 2");

        System.out.println(Arrays.toString(arrI));
        System.out.println(Arrays.toString(arrD));
        System.out.println(Arrays.toString(arrS));

        System.out.println();

        //Задача 3
        //Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую. В конце строки запятую ставить не надо.
        //
        //Если в задаче 2 в консоль у вас вывелся результат:
        //
        //1, 2, 3
        //1.57, 7.654, 9.986
        //// Произвольные элементы третьего массива
        //
        //то в этой задаче результат должен быть таким:
        //
        //3, 2, 1
        //9.986, 7.654, 1.57
        //// Произвольные элементы третьего массива в обратном порядке

        System.out.println("Задача 3");

        for (int i = arrI.length - 1; i >= 0; i--) {
            if (i == 0){
                System.out.print(arrI[i]);
                System.out.println();
                break;
            }
            System.out.print(arrI[i] + ", ");
        }
        for (int i = arrD.length - 1; i >= 0; i--) {
            if (i == 0){
                System.out.print(arrD[i]);
                System.out.println();
                break;
            }
            System.out.print(arrD[i] + ", ");
        }
        for (int i = arrS.length - 1; i >= 0; i--) {
            if (i == 0){
                System.out.print(arrS[i]);
                System.out.println();
                break;
            }
            System.out.print(arrS[i] + ", ");
        }
        System.out.println();

        //Задача 4
        //Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        //
        //Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
        //
        //Распечатайте результат преобразования в консоль.

        System.out.println("Задача 4");

        for (int i = 0; i <= arrI.length - 1; i++) {
            if (arrI[i] % 2 != 0) arrI[i]++;
            if (i == arrI.length - 1){
                System.out.print(arrI[i]);
                System.out.println();
                break;
            }
            System.out.print(arrI[i] + ", ");
        }



    }
}