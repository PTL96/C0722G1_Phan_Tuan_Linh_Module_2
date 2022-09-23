package Quan_Ly_Hoc_Sinh_MVC.Model;
    public class Student extends Person {
        private String nameClass;
        private double score;

        public Student(String code, String name, Boolean gender, String nameClass, double score) {
            super(code, name, gender);
            this.nameClass = nameClass;
            this.score = score;
        }

        public Student(String nameClass, double score) {
            this.nameClass = nameClass;
            this.score = score;
        }

        public Student() {
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
            return "Student: " + " Mã học sinh: "+getCode()+ ", Tên học sinh: "+getName()+", Lớp: "
                    +getNameClass()+", Điểm: "+getScore();

        }
    }
