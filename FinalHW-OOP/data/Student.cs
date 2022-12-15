namespace FinalHWOOP {

    public class Student {
        public string firstName;
        public string secondName;
        public string phone;
        public string dateOfBirth;
        public Type type;

        public Student(string firstName, string secondName, string phone, string dateOfBirth, Type type) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.phone = phone;
            this.dateOfBirth = dateOfBirth;
            this.type = type;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public void setSecondName(String secondName) {
            this.secondName = secondName;
        }

        public String getSecondName() {
            return this.secondName;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getPhone() {
            return this.phone;
        }

        public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public String getdateOfBirth() {
            return this.dateOfBirth;
        }

        public void setType(Type type) {
            this.type = type;
        }

        public Type getType() {
            return this.type;
        }

        public override string ToString() {
            return "Student - " + this.firstName + " " + this.secondName + ", phone: " + this.phone
                + ", birth: " + this.dateOfBirth + ", type=[" + this.type + "];";
        }
    }
}
