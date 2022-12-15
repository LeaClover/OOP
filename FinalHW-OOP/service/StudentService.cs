namespace FinalHWOOP {
    public class StudentService : IStudentService {
        public List<Student> studentList;

        public StudentService() {
            this.studentList = new List<Student>{};
        }

        public void addStudent(Student student) {
            this.studentList.Add(student);
        }

        public List<Student> getAllStudents() {
            return this.studentList;
        }
    }
}
