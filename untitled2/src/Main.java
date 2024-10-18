import static java.lang.System.out;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main methods = new Main();
        Random random = new Random();

        //Вывод з1№2
        out.print("Задание 1 №2 \nСумма двух последних цифр числа\nВведите целое число: ");
        int x = scanner.nextInt();
        out.println(methods.sumLastNumbs(x) + "\n");

        //Вывод з1№4
        out.print("Задание 1 №4 \nПоложительное число или нет\nВведите целое число: ");
        x = scanner.nextInt();
        out.println(methods.isPositive(x) + "\n");

        //Вывод з1№6
        out.print("Задание 1 №6 \nОпределение заглавной буквы\nВведите любую букву: ");
        char character = scanner.next().charAt(0);
        out.println(methods.isUpperCase(character) + "\n");

        //Вывод з1№8
        out.print("Задание 1 №8 \nОпределение целочисленного деления\nВведите целое делимое: ");
        int a = scanner.nextInt();
        out.print("Введите целый делитель: ");
        int b = scanner.nextInt();
        out.println(methods.isDivisor(a, b) + "\n");

        //Вывод з1№10
        out.print("Задание 1 №10 \nСумма цифр разрядов единиц пяти целых чисел\nВведите первое число: ");
        a = scanner.nextInt();
        out.print("Введите второе число: ");
        b = scanner.nextInt();
        a = methods.lastNumbSum(a, b);
        out.println( "Сумма разряда единиц первого числа + второго = " + a + "\n");

        out.print("Введите третье число: ");
        b = scanner.nextInt();
        a = methods.lastNumbSum(a, b);
        out.println( "Получившаяся сумма разряда единиц + разряд единиц третьего = " + a + "\n");

        out.print("Введите четвертое число: ");
        b = scanner.nextInt();
        a = methods.lastNumbSum(a, b);
        out.println( "Получившаяся сумма разряда единиц + разряд единиц четвертого = " + a + "\n");

        out.print("Введите пятое число: ");
        b = scanner.nextInt();
        a = methods.lastNumbSum(a, b);
        out.println( "Получившаяся сумма разряда единиц + разряд единиц пятого = " + a + "\n");

        //Вывод з2№2
        out.print("Задание 2 №2 \nБезопасное деление, исключающее деление на 0 \nВведите целое делимое: ");
        x = scanner.nextInt();
        out.print("Введите целый делитель: ");
        int y = scanner.nextInt();
        out.println(methods.safeDiv(x, y) + "\n");

        //Вывод з2№4
        out.print("Задание 2 №4 \nСравнение двух целых чисел\n Введите первое число: ");
        x = scanner.nextInt();
        out.print("Введите второе число: ");
        y = scanner.nextInt();
        out.println("Результат сравнения двух чисел: " + methods.makeDecision(x, y) + "\n");

        //Вывод з2№6
        out.print("Задание 2 №6 \n Результат сложения двух целых чисел - третье число\nВведите первое число: ");
        x = scanner.nextInt();
        out.print("Введите второе число: ");
        y = scanner.nextInt();
        out.print("Введите третье число: ");
        int z = scanner.nextInt();
        out.println(methods.sum3(x, y, z) + "\n");

        //Вывод з2№8
        out.print("Задание 2 №8 \nОпределение возраста по годам/летам \nВведите количество лет: ");
        x = scanner.nextInt();
        out.println(methods.age(x) + "\n");

        //Вывод з2№10
        out.print("Задание 2 №10 \nВывод последующих дней недели\nВведите день недели: ");
        methods.printDays();

        //Вывод з3№2
        out.print("Задание 3 №2 \nВывод чисел от самого большого до нуля\nВведите целое число: ");
        x = scanner.nextInt();
        out.println(methods.reverseListNumbs(x) + "\n");

        //Вывод з3№4
        out.print("Задание 3 №4 \nВозведение в степень целого числа\nВведите число, которое надо возвести в степень: ");
        x = scanner.nextInt();
        out.print("Введите степень: ");
        y = scanner.nextInt();
        out.println("Результат возведения в степень равно: " + methods.pow(x, y) + "\n");

        //Вывод з3№6
        out.print("Задание 3 №6 \nПроверка всех цифр числа на одинаковость\nВведите целое число: ");
        x = scanner.nextInt();
        out.println("Цифры одинаковы " + methods.equalNum(x) + "\n");

        //Вывод з3№8
        out.print("Задание 3 №8 \nВывод треугольника из символов '*', имеющего х символов в высоту \nВведите целое число: ");
        x = scanner.nextInt();
        methods.leftTriangle(x);

        //Вывод з3№10
        out.print("\nЗадание 3 №10 \nУгадай число от 0 до 9\n");
        methods.guessGame();

        //Вывод з4№2
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }
        out.println("Массив рандомных чисел " + Arrays.toString(array) + "\n");
        out.print("Задание 4 №2 \n Поиск последнего вхождения заданного значения\n");
        out.print("Введите проверяемое значение: ");
        x = scanner.nextInt();
        int index = methods.findLast(array, x);
        out.println("Индекс последнего вхождения " + x + " в массив: " + index + "\n");

        //Вывод з4№4
        out.print("Задание 4 №4 \nДобавление элемента в массив\n");
        out.print("Введите целое число, которое хотите добавить в массив: ");
        x = scanner.nextInt();
        out.print("Введите номер позиции от 0 до 10, куда вставить ваше число: ");
        int pos = scanner.nextInt();
        int[] newArr = methods.add(array, x, pos);
        out.println("Новый массив: " + Arrays.toString(newArr) + "\n");

        //Вывод з4№6
        out.print("Задание 4 №6 \nЗапись массива справа налево\n");
        methods.reverse(array);
        out.println("Массив справа налево: " + Arrays.toString(array));

        //Вывод з4№8
        out.print("Задание 4 №8 \nОбъединение двух массивов\n");
        int[] array1 = new int[3];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(10);
        }
        int[] array2 = new int[3];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(10);
        }
        out.println("Массив 1: " + Arrays.toString(array1) + "\nМассив 2: " + Arrays.toString(array2));

        int[] result = methods.concat(array1, array2);
        out.println("Объединенный массив: " + Arrays.toString(result) + "\n");

        //Вывод з4№10
        out.print("Задание 4 №10 \nУдаление отрицательных значений в массиве\n");
        array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(19) - 9;
        }

        out.println("Массив с отрицательными значениями: " + Arrays.toString(array));
        result = methods.deleteNegative(array);
        out.println("Массив без отрицательных значений: " + Arrays.toString(result));
    }

    //Задание 1 Методы
    //№2
    public int sumLastNumbs(int x) {
        int last = x % 10;
        int second = (x / 10) % 10;
        return Math.abs(last + second);
    }

    //№4
    public boolean isPositive(int x) {
        return x >= 0;
    }

    //№6
    public boolean isUpperCase(char x) {
        return Character.isUpperCase(x);
    }

    //№8
    public boolean isDivisor(int a, int b) {
        return a % b == 0;
    }

    //№10
    public int lastNumbSum(int a, int b) {
        return Math.abs(a % 10 + b % 10);
    }

    //Задание 2 Условия
    //№2
    public double safeDiv(int x, int y) {
        if (y == 0) {
            return 0;
        }
        return (double) x / y;
    }

    //№4
    public String makeDecision(int x, int y) {
        if (x > y) {
            return x + " > " + y;
        } else if (x < y) {
            return x + " < " + y;
        } else {
            return x + " == " + y;
        }
    }

    //№6
    public boolean sum3(int x, int y, int z) {
        return (x + y == z) || (x + z == y) || (y + z == x);
    }

    //№8
    public String age(int x) {
        int lastNumb = x % 10;
        int lastTwoNumb = x % 100;

        if (lastNumb == 1 && lastTwoNumb != 11) {
            return x + " год";
        } else if ((lastNumb == 2 || lastNumb == 3 || lastNumb == 4) && (lastTwoNumb < 12 || lastTwoNumb > 14)) {
            return x + " года";
        } else {
            return x + " лет";
        }
    }

    //№10
    public void printDays() {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        x = x.toLowerCase();
        switch (x) {
            case "понедельник":
                out.println("понедельник");
            case "вторник":
                out.println("вторник");
            case "среда":
                out.println("среда");
            case "четверг":
                out.println("четверг");
            case "пятница":
                out.println("пятница");
            case "суббота":
                out.println("суббота");
            case "воскресенье":
                out.println("воскресенье");
                break;
            default:
                out.println("Это не день недели");
                break;
        }
    }

    //Задание 3
    //№2
    public String reverseListNumbs(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = x; i >= 0; i--) {
            result.append(i).append(" ");
        }
        return result.toString().trim();
    }

    //№4
    public int pow(int x, int y) {
        if (y == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= y; i++) {
            result *= x;
        }
        return result;
    }

    //№6
    public boolean equalNum(int x) {
        int lastNumb = x % 10;

        while (x > 0) {
            if (x % 10 != lastNumb) {
                return false;
            }
            x /= 10;
        }
        return true;
    }

    //№8
    public void leftTriangle (int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //№10
    public void guessGame() {
        Random random = new Random();
        int NumberRandom = random.nextInt(10);

        int tries = 0;
        Scanner scanner = new Scanner(System.in);
        int userNumb = -1;
        while (userNumb != NumberRandom) {
            System.out.print("Введите число от 0 до 9: ");
            userNumb = scanner.nextInt();
            tries++;

            if (userNumb == NumberRandom) {
                out.println("Вы угадали число");
            } else {
                out.println("Вы не угадали число, попробуйте снова");
            }
        }
        out.println("Число было угадано за " + tries + " попытки(ок)");
    }

    //Задание 4
    //№2
    public int findLast(int [] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    //№4
    public int[] add(int [] arr, int x, int pos) {
        int [] newArr = new int[arr.length + 1];

        for (int i=0; i < pos; i++) {
            newArr[i] = arr [i];
        }
        newArr[pos] = x;
        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr [i];
        }
        return newArr;
    }

    //№6
    public void reverse(int [] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    //№8
    public int [] concat(int [] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        return result;
    }

    //10
    public int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num >= 0) {
                count++;
            }
        }
        int[] newArr = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num >= 0) {
                newArr[index++] = num;
            }
        }
        return newArr;
    }
}