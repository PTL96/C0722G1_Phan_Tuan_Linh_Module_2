package Quan_Ly_Hoc_Sinh_MVC.Model;
    public class Student extends Person {
        private String nameClass;
        private double score;

        public Student() {
        }

        public Student(String nameClass, double score) {
            this.nameClass = nameClass;
            this.score = score;
        }

        public Student(String code, String name, String gender, String nameClass, double score) {
            super(code, name, gender);
            this.nameClass = nameClass;
            this.score = score;
        }

        public String getNameClass() {
            return nameClass;
        }

        public void setNameClass(String nameClass) {
            this.nameClass = nameClass;
        }

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }

        @Override
        public String toString() {
            return "Học sinh: " +"Mã học sinh: "+getCode()+", Tên học sinh: "+ getName()+", Giới tính: "
                    +getGender()+", Tên lớp:"  + getNameClass() +", Điểm: "+getScore();

        }
    }
