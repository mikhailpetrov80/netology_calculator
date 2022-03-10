public class Main {

    public static void main(String[] ards) {

        Calculator calc = Calculator.instance.get();

        try {
            int a = calc.plus.apply(1, 2);  // a == 3;
            int b = calc.minus.apply(1, 1); // b == 0;
            int c = calc.devide.apply(a, b);      // c == 3/0 деление на 0;
            calc.println.accept(c);
        } catch (ArithmeticException ae) {        // обрабатываем ошибку деления на ноль
            System.out.println(ae.getMessage());  // выводим текст ошибки
        }

    }
}
