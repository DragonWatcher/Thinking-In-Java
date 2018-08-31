package subinnerclass;

public class TryUsingAnonymousClass {
    // 外部类成员方法
    public MyInterface useMyInterface() {
        final int number = 201855;// jdk1.8后可以省略final
        final Object obj = new Object();// jdk1.8后可以省略final
        
        MyInterface myInterface = new MyInterface() {
            // 匿名内部类
            @Override
            public void doSomething() {
                System.out.println("匿名内部类中使用基本数据类型：" + number);
                System.out.println("匿名内部类中使用引用数据类型：" + obj);
            }
        };
        return myInterface;
    }
    
    public static void main(String[] args) {
        TryUsingAnonymousClass tc = new TryUsingAnonymousClass();
        MyInterface inter = tc.useMyInterface();
        inter.doSomething();
    }
}
