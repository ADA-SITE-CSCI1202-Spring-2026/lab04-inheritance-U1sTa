public class Teacher extends Person {
    private String department;
    private String courses;

    public Teacher(String firstName, String lastName, String gender, String department, String courses) {
        super(firstName, lastName, gender); // Calls the Person constructor
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    public String getCourses() { return courses; }
    public void setCourses(String courses) { this.courses = courses; }

    @Override
    public String toString() {
        return super.toString() + " | Dept: " + department + " | Courses: " + courses;
    }

    public boolean equals(Teacher t) {
        if (t == null) return false;
        return super.equals(t) && 
               this.department.equals(t.department) && 
               this.courses.equals(t.courses);
    }

    public static void main(String[] args) {
        Teacher prof = new Teacher("Jane", "Smith", "Female", "Math", "Calculus");
        System.out.println("Teacher: " + prof.toString());
        
        System.out.println("Teacher's Last Name: " + prof.getLastName());
    }
}