import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        IsEven<Integer> isEven = new IsEven<>();
        System.out.println(isEven.isGood(4));

        IsPositive<Integer> isPositive = new IsPositive<>();
        System.out.println(isPositive.isGood(9));

        BeginsWitha<String, Character> beginsWitha = new BeginsWitha<String, Character>('А');
        System.out.println(beginsWitha.isGood("Арт"));

        BeginsWith<String> beginsWith = new BeginsWith<>("Арис");
        System.out.println(beginsWith.isGood("Аристократ"));

        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(4);
        list.add(0);
        list.add(-8);
        list.add(10);
        list.add(3);
        list.add(-2);
        list.add(7);

        Filter<Integer> filter = new Filter<>();
        System.out.println(filter.filter(list));

    }

}