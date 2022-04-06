package Tasks;

public class Variables2 {
    public static void main(String[] args) {
    /* Task 6
        Объявите целочисленные переменные a = 12, b = 27, c = 44, d = 15, e = 9.
    Вычислите выражение a * (b + (c - d * e)) и присвойте его результат переменной result.
    Инвертируйте результат (значение в переменной result), преобразовав его в вариант с противоположным значением (отрицательное -> положительное, положительное -> отрицательное).
    Выведите (напечатайте) результат в консоль.
    */

        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        System.out.println("Результат = " + result);
        System.out.println("Инвертация результата = " + result * (-1));

    /* Task 7
        Объявите целочисленные переменные a = 5 и b = 7.
    С помощью математических манипуляций добейтесь того, чтобы a = 7 и b = 5.
    Использовать дополнительные переменные или числа запрещено.
     */
        int a1 = 12;
        int b1 = 15;
        a1 = b1 - a1;
        b1 -= a1;
        a1 += b1;

    /*
    Task 8
        Объявите переменную a и инициализируйте ее любым трехзначным числом.
    Объявите переменную b и, путем математических операций над a получите и присвойте переменной b цифру, которая находится
    в центре значения из переменной a. Например, если a = 256, то необходимо с помощью математических действий достать
    цифру 5 из центра и присвоить переменной b. Если a = 789, то b должна быть инициализирована числом 8, так как эта цифра
    является вторым из трех (центральным) символом в значении a. Следует учесть, что алгоритм должен быть универсальным
    и корректно срабатывать на любых трехзначных числах из a без изменений. Это значит, что рассчитать в голове сумму,
    которую необходимо вычесть или прибавить к a для корректного значения в b нельзя, так как при каждом изменении значения в a её нужно пересчитывать.
    */
        int a2 = 123;
        int b2 = a2 / 10 % 10;
        System.out.println(b2);
    }
}
