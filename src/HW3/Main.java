package HW3;

public class Main {
    public static void main(String[] args) {

        String str = "Hello World!";
        System.out.println(reverseString(str));

        MyDeque<Integer> myDeque = new MyDeque<>();
        myDeque.insertLeft(1);
        myDeque.insertRight(2);
        myDeque.insertLeft(3);
        myDeque.insertRight(4);
        myDeque.insertLeft(5);
        myDeque.insertRight(6);
        myDeque.insertLeft(7);
        myDeque.insertRight(8);

        System.out.println(myDeque);

        System.out.println(myDeque.removeLeft());
        System.out.println(myDeque.removeRight());
        System.out.println(myDeque.removeLeft());
        System.out.println(myDeque.removeRight());
        System.out.println(myDeque);

    }

    public static String reverseString(String str) {
        MyStack<Character> stack = new MyStack<>(str.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
