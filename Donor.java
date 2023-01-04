import java.io.Serializable;
import java.time.LocalDate;

//Class Donor implementing Serializable interface
public class prac2 implements Serializable {

        // Attributes of class
        private String name;
        private int age;
        private String address;
        private String contactNo;
        private String bloodGroup;
        private LocalDate lastDonationDate;

        // Constructor
        public Donor(String name, int age, String address, String contactNo, String bloodGroup,
                        LocalDate lastDonationDate) {
                this.name = name;
                this.age = age;
                this.address = address;
                this.contactNo = contactNo;
                this.bloodGroup = bloodGroup;
                this.lastDonationDate = lastDonationDate;
        }

        // Getters and Setters

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public String getContactNo() {
                return contactNo;
        }

        public void setContactNo(String contactNo) {
                this.contactNo = contactNo;
        }

        public String getBloodGroup() {
                return bloodGroup;
        }

        public void setBloodGroup(String bloodGroup) {
                this.bloodGroup = bloodGroup;
        }

        public LocalDate getLastDonationDate() {
                return lastDonationDate;
        }

        public void setLastDonationDate(LocalDate lastDonationDate) {
                this.lastDonationDate = lastDonationDate;
        }

        // toString Method

        @Override
        public String toString() {
                return "Name: " + name + ", Age: " + age + ", Address: " + address + ", Contact No: " + contactNo
                                + ", BloodGroup: " + bloodGroup + ", Donation date: " + lastDonationDate;
        }

}