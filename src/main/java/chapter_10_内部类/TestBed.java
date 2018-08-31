package chapter_10_内部类;

public class TestBed {
    public void f() {
        System.out.println("f()");
    }
    public static class Tester {
        public static void main(String[] args) {
            TestBed t = new TestBed();
            t.f();
        }
    }

}
