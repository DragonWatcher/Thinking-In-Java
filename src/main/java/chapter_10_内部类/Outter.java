package chapter_10_内部类;

public class Outter {
    /** 嵌套类*/
    public static class Inner {
        /** 静态变量*/
        private static int age;
        /** 非静态变量*/
        private String name;
        /** 静态方法*/
        public static void doSomething() {
            System.out.println("doSomething()");
        }
        /** 非静态方法*/
        public void doOtherthing() {
            System.out.println(name + age);
        }
        /** 静态嵌套类*/
        static class StaticInn {
            
        }
        /** 普通内部类*/
        class UnStaticInn {
            
        }
    }
}
