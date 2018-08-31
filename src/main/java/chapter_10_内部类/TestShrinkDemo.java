package chapter_10_内部类;

public class TestShrinkDemo {
    
    public Student getStudent() {
        
        class SubStudent {
            private String name;
            
            public String getName() {
                return name;
            }
        }
        
        SubStudent subs = new SubStudent();
        
        return null;
    }

    public static void main(String[] args) {

    }

}
