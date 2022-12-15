namespace FinalHWOOP {
    public class HighService : ISmoke, IStudy {
        public void smoke() {
            Console.WriteLine("Я бросаю курить");
        }

        public void study() {
            Console.WriteLine("Мне надо учиться");
        }

        public void getLove() {
            Console.WriteLine("У меня есть отношения");
        } 

        public void prepareToExam() {
            Console.WriteLine("Я готовлюсь к экзаменам");
        }
    }
}
