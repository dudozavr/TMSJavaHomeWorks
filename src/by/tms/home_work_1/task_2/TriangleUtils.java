package by.tms.home_work_1.task_2;

public final class TriangleUtils {

    private TriangleUtils() {
    }

    public static boolean triangleIsCorrect(int a, int b, int c) {
        return a + b > c || a + c > b || c + b > a;
    }
}
