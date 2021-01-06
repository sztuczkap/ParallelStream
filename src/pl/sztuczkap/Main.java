package pl.sztuczkap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // strumienie równoległe pozwalają na wykonywanie operacji przy użyciu wielu wątków

/*        List<Integer> list = List.of(1, 2, 5, 10);
        list.parallelStream();

        Stream.of(1,2,4,6).parallel();*/

        // przed czym należy się wystrzegać podczas korzystania ze strumieni równloegłych
        // utworzymy strumien z liczbami od 0-100 a nastepnie liste kazda pazysta wartoscia ze struienia
/*        List<Integer> list = new ArrayList<>();
        IntStream.range(0, 100).filter(v -> v % 2 == 0).forEach(list::add);
//        IntStream.range(0, 100).parallel().filter(v -> v % 2 == 0).forEach(list::add); // INNA SUMA! BLEDNA!
        // zliczymy sume tych liczb i wypiszemy ja na konsoli
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum); // 2450*/

/*        // prawidłowa wersja
        List<Integer> list = new ArrayList<>();
        int sum = IntStream.range(0, 100).parallel().filter(v -> v % 2 == 0).sum();
        System.out.println(sum);*/

        // przyspieszamy metode rezygnujac z porzadkowania metoda unordered()
        IntStream.range(0, 100).parallel().unordered().limit(50);

        // należy korzystać tylko na dużych zbiorach danych!!!




    }
}
