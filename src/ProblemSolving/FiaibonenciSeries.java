package ProblemSolving;

public class FiaibonenciSeries {

    public static void main(String[] args) {
        int prev = 0;
        int next = 1;
        for (int i = 0; i < 15; i++) {
            System.out.println(prev);
            prev = prev + next;
            next = next - prev;

        }
    }
}
