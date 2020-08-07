package HW6;

public class Main {
    public static void main(String[] args) {
        MyTreeMap<Integer, String> map = new MyTreeMap<>();

        map.put(5,"five");
        map.put(1,"one");
        map.put(3,"three");
        map.put(2,"two");

        System.out.println(map);
        System.out.println(map.get(2));
        map.put(2,"ttt");
        System.out.println(map);

        map.deleteMin();
        System.out.println(map);

    }
}
