package chapter_10_内部类;

public class Out {
    private int i = 0;
    private static int y = 0;
    
    static class Inner {
        private int is = 0;
        public void print() {
            System.out.println(y);
        }
        
        public static void ssss() {
            System.out.println("helo");
        }
        class inn{
            
        }
    }

    public static void main(String[] args) {
        Out.Inner inner = new Out.Inner();
    }
}










