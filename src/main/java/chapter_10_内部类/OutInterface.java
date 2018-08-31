package chapter_10_内部类;
/** 接口*/
public interface OutInterface {
    void method_1();
    void method_2();
    /** 嵌套类*/
    class Inner {
        public void print() {
            System.out.println("print something...");
        }
    }
}
