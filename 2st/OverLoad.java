public class OverLoad {
    void test() {
        System.out.println(1);
    }
    void test(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }
    void test(int a, String b) {
        System.out.println(a);
        System.out.println(b);
    }
}