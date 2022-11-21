package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        if (first > second) {
            System.out.println(first);
        } else if (first < second) {
            System.out.println(second);
        } else if (first == second) {
            System.out.println(first);
        }
    }

    public static void main(String[] args) {
        GreatestNumberPrinter greatestNumberPrinter = new GreatestNumberPrinter();
        greatestNumberPrinter.printGreatest(10, 5);
    }
}
