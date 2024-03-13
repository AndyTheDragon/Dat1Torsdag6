public class Task1 {
    public static void main(String[] args) {
        methodA("start");
        methodB("nu");
        methodC("på");
        methodD(3);
    }

    public static void methodA(String input) {
        System.out.println("J");
        if (!input.equals("start")) {
            System.out.println("b");
            methodB("start");
        } else {
            System.out.println("a");
            System.out.println(methodC(input));

        }
        System.out.println("r");
    }

    public static void methodB(String start) {
        System.out.println("s");
    }

    public static int methodC(String input) {
        System.out.println("v");
        methodD(input.length());
        return input.length() * 2;
    }

    public static void methodD(int number) {
        System.out.println("a");
        if (number > 5) {
            System.out.println("g");
        }
        System.out.println("e");

    }
}
