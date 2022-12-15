namespace FinalHWOOP {
    public class Program {
        public static void Main(string[] args) {
            Controller cc = new Controller();
            cc.addStudent(new Student("Lea", "Clover", "9991233445", "24.02.2003", Type.HIGH));
            cc.addStudent(new Student("Alex", "Aleksandrov", "9859190358", "28.02.2010", Type.MIDDLE));
            cc.addStudent(new Student("Vlad", "Fox", "9852234455", "11.07.2015", Type.SMALL));
            cc.getAllStudents();
        }
    }
}
