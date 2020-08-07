package HW6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int MAX_HEIGHT = 6;
        final int MAPS_NUMBER = 20;
        List<MyTreeMap<Integer, Integer>> list = new ArrayList<>();

        for (int i = 0; i < MAPS_NUMBER; i++) {
            MyTreeMap<Integer, Integer> map = new MyTreeMap<>();
            Random random = new Random();
            do {
                int key = random.nextInt(MAPS_NUMBER);
                int value = random.ints(-100,(100+1)).findFirst().getAsInt();
                map.put(key, value);
            } while (map.height() < MAX_HEIGHT);
            list.add(map);
        }

        for (MyTreeMap<Integer, Integer> map : list) {
            System.out.println(map);
            System.out.printf("Map is balanced: %b%n%n",  map.isBalanced());
        }
        System.out.println("Unbalanced maps: " + unbalancedPercent(list) + "%");
    }

    public static double unbalancedPercent(List<MyTreeMap<Integer, Integer>> list) {
        double unbalanced = 0;
        for (MyTreeMap<Integer, Integer> map : list) {
            if (!map.isBalanced()) {
                unbalanced++;
            }
        }
        return (unbalanced / list.size()) * 100;
    }
}
