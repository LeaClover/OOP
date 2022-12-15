namespace FinalHWOOP {
    public class MiddleService : ISmoke, IStudy {
        public void smoke() {
            Console.WriteLine("Я начинаю курить");
        }

        public void study() {
            Console.WriteLine("Ненавижу учиться");
        }

        public void leaveSchool() {
            Console.WriteLine("Я прогуливаю уроки");
        }
    }
}
