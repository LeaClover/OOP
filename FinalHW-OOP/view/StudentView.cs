namespace FinalHWOOP {
    public class StudentView {
        public SmallService ss = new SmallService();
        public MiddleService ms = new MiddleService();
        public HighService hs = new HighService();
        
        public void sendOnConsole(List<Student> studentList) {
            foreach (Student student in studentList) {
                Type type = student.getType();
                switch(type) {
                    case Type.HIGH:
                        Console.WriteLine(student);
                        hs.study();
                        hs.smoke();
                        hs.prepareToExam();
                        hs.getLove();
                        break;
                    case Type.MIDDLE:
                        Console.WriteLine(student);
                        ms.study();
                        ms.smoke();
                        ms.leaveSchool();
                        break;
                    case Type.SMALL:
                        Console.WriteLine(student);
                        ss.study();
                        ss.cry();
                        break;
                }
            }
        }
    }
}
