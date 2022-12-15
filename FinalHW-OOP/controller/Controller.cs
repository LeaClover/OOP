namespace FinalHWOOP {
    public class Controller {
        private StudentService ss = new StudentService();
        private StudentView sv = new StudentView();

        public void addStudent(Student student) {
            ss.addStudent(student);
        }

        public void getAllStudents() {
            sv.sendOnConsole(ss.getAllStudents());
        }
    }
}
