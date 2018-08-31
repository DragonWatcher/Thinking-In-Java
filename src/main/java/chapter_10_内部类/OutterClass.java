package chapter_10_内部类;

public class OutterClass {

    public School getSchool(String name, String master) {
        
        return new School() {
            private String schoolName = name;
            private String headmaster = master;
            
            public String toString() {
                return schoolName +"," + headmaster;
            }
        };
    }
    
    public static void main(String[] args) {
        OutterClass oc = new OutterClass();
        String qinghua = new String("清华");
        String qiuyong = new String("邱勇");
        System.out.println(oc.getSchool(qinghua,qiuyong).toString());
    }
    
}

class School {
    private String schoolName;
    private String headmaster;
    
    public School() {
//        this.schoolName = schoolName;
//        this.headmaster = headmaster;
    }
    
    @Override
    public String toString() {
        return "{schoolName : " + schoolName + ", headmaster : " + headmaster + "}";
    }
}
