
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TaskOneStarter {
    public static void main(String[] args) throws Exception {
        List<Integer> integers = getIntegers();
        printTaskOneResult(integers);
    }

    public static void printTaskOneResult(List<Integer> integers) {
        System.out.println(TaskOneSolver.findDistinct(integers)
                .stream().map(String::valueOf).collect(Collectors.joining(" ")));
        System.out.println("count: " + TaskOneSolver.count(integers));
        System.out.println("distinct: " + TaskOneSolver.findDistinct(integers).size());
        System.out.println("min: " + TaskOneSolver.findMinValue(integers));
        System.out.println("max: " + TaskOneSolver.findMaxValue(integers));
    }

    public static List<Integer> getIntegers() throws Exception {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        List<Integer> collect;
        try {
            collect = Arrays.stream(inputString.split(" "))
                    .map(Integer::valueOf)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            throw new Exception("Please play with the rules");
        }
        return collect;
    }
}
