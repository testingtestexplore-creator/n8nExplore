package Java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class numberStartsWith1
{
    public static void main(String[] args)
    {

        List<Integer> myList = Arrays.asList(10,15,199,8,49,25,98,32,-101);

        List<String> opList = myList.stream()
            .map(s->s+"")
            .filter(s->(s.startsWith("1")||s.startsWith("-1")))
            .collect(Collectors.toList());
           // .forEach(System.out::println);

           System.out.println(opList);
                   System.out.println("Hello");


    }



}
