package chapter_10_内部类;

public class Student {
    private Integer id;
    private String name;
    private String gender;
    private Double score;
    private String remark;
    public Student(Integer id, String name, String gender, Double score, String remark) {
        super();
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.score = score;
        this.remark = remark;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Double getScore() {
        return score;
    }
    public void setScore(Double score) {
        this.score = score;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    @Override
    public String toString() {
        return "{id : " + id + ", name : " + name + ", gender : " + gender + ", score : " + score + ", remark : "
                + remark + "}";
    }
    
}
