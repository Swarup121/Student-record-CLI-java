public class StudentEntity {

    private int student_rollno;
    private String student_name;
    private String student_std;
    private String gender;

    public StudentEntity(int student_rollno, String student_name, String student_std, String gender) {
        this.student_rollno = student_rollno;
        this.student_name = student_name;
        this.student_std = student_std;
        this.gender = gender;
    }

    public StudentEntity() {

    }

    public int getStudent_rollno() {
        return student_rollno;
    }

    public void setStudent_rollno(int student_rollno) {
        this.student_rollno = student_rollno;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_std() {
        return student_std;
    }

    public void setStudent_std(String student_std) {
        this.student_std = student_std;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "student_rollno=" + student_rollno +
                ", student_name='" + student_name + '\'' +
                ", student_std='" + student_std + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
