class Student implements Comparable<Student> {
    private String name;
    private int age;
    private int studentNumber;

    public Student(String name, int age, int studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public int getStudentNumber() {
        return this.studentNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    @Override
    public String toString() {
        return "N: " + this.name + " A: " + this.age + " SN: " + this.studentNumber;
    }
    @Override
    public int compareTo(Student student) {
        return this.studentNumber - student.studentNumber;
    }
}