package Quan_Ly_Hoc_Sinh_MVC.Model;

public class Teacher extends Person {
    private String specialize;

    public Teacher(String code, String name, Boolean gender) {
        super(code, name, gender);
    }

    public Teacher() {
    }

    public Teacher(String code, String name, Boolean gender, String specialize) {
        super(code, name, gender);
        this.specialize = specialize;
    }

    public Teacher(String specialize) {
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Teacher: " +"Mã giáo viên: "+getCode()+", Tên giáo viên: "+ getName()+", Giới tính: "
                +getGender()+", Chuyên ngành: "+getSpecialize();

    }
}
