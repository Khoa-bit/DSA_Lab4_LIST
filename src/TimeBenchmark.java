import java.util.*;

public class TimeBenchmark {
    public static void main(String[] args) {
        List[] lists = {
                new ArrayList<Integer>(),
                new LinkedList<Integer>(),
                new Vector<Integer>()
        };
        List<Double> timeGet = new LinkedList<>();
        List<Double> timeAdd = new LinkedList<>();

        TimeBenchmark benchmark = new TimeBenchmark();

        System.out.println("=====================LOG=====================");
//        Benchmark Get
//        10000 items and 1000 times
        benchmark.generateAll(lists, 1000000);
        for (List<Integer> list: lists) {
            timeGet.add(benchmark.benchmarkGet(list, 1000));
        }
        benchmark.clearAll(lists);

//        Benchmark Add
//        50000 items and 1000 times
        for (List<Integer> list: lists) {
            timeAdd.add(benchmark.benchmarkAdd(list, 50000, 10));
        }
        System.out.println("=====================LOG=====================\n");

        System.out.println("==================BENCHMARK==================\n");
        System.out.printf("%-15s | %15s | %25s\n", "Implementation", "get(int index)", "add(int index, E element)");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < lists.length; i++) {
            System.out.printf("%-15s | %15f | %25f\n", String.valueOf(lists[i].getClass()).substring(16), timeGet.get(i), timeAdd.get(i));
        }
    }

    private void clearAll(List<Integer>[] lists) {
        for (List<Integer> list: lists) {
            list.clear();
        }
    }

    private void generateAll(List<Integer>[] lists, int nElementMax) {
        for (List<Integer> list: lists) {
            generateListElements(list, nElementMax);
        }
    }

    private void generateListElements(List<Integer> list, int nElementMax) {
        for (int i = 0; i < nElementMax; i++) {
            list.add((int) ((Math.random() * 2 - 1) * nElementMax));
        }
    }

    private double benchmarkGet(List<Integer> list, int nExec) {
        double timeElapsed = 0;
        for (int time = 0; time < nExec; time++) {
            System.out.printf("GET - %-4d - %s\n", time, list.getClass());
            long startTime = System.nanoTime();
            list.get((int) (Math.random() * (list.size() - 1)));
            long endTime = System.nanoTime();
            timeElapsed += (double) (endTime - startTime);
        }
        return timeElapsed / (nExec * 1000000);
    }

    private double benchmarkAdd(List<Integer> list, int nElementMax, int nExec) {
        double timeElapsed = 0;
        for (int time = 0; time < nExec; time++) {
            long startTime = System.nanoTime();

            System.out.printf("ADD - %-4d - %s\n", time, list.getClass());
            for (int i = 0; i < nElementMax; i++) {
                list.add(0, (int) ((Math.random() * 2 - 1) * nElementMax));
            }
            list.clear();

            long endTime = System.nanoTime();
            timeElapsed += (double) (endTime - startTime);
        }
        return timeElapsed / (nExec * 1000000);
    }
}
