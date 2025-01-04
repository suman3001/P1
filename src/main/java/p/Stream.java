package p;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        String name = "suman mitra";
        //Duplicate Character
        List<Map.Entry<String, Long>> collect = Arrays.stream(name.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() > 1).collect(Collectors.toList());
        System.out.println(collect);

        //Find unique character
        List<Map.Entry<String, Long>> unique = Arrays.stream(name.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 1).collect(Collectors.toList());
        System.out.println(unique);

        //Find NonRepeating
        Map.Entry<String, Long> nonR = Arrays.stream(name.split("")).filter(c -> !c.isBlank())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get();
        System.out.println(nonR);

    }
}