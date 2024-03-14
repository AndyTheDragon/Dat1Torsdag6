public class Task1 {
    public static void main(String[] args) {
        methodA("kom");
        methodB("nu");
        methodC("start");
        methodD(1);
        methodD(8);
    }

    public static void methodA(String input) {
        System.out.println("J");
        methodB("start");
        methodD(3);


    }

    public static void methodB(String start) {
        System.out.println("a");
    }

    public static int methodC(String input) {
        System.out.println("e");
        methodD(input.length());
        return input.length() * 2;
    }

    public static void methodD(int number) {
        switch(number) {
            case 1:
                System.out.println("j");
            case 7:
                System.out.println("o");
            case 3:
                System.out.println("v");
                break;
            case 5:
                System.out.println("r");
            case 6:
                System.out.println("s");
                break;
            case 8:
            default:
                System.out.println("t");
                break;

        }


    }
}
