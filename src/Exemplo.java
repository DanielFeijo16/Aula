public class Exemplo {
    private static void sayhellomanytimes(int times) {
        for (int i = 0; i < times; i++) {
            sayHello();
        }
    }
    private static void sayHello() {
        System.out.println("OLá mundo");
    }

    static void main(String[] args) {
        sayhellomanytimes(5);
    }
}