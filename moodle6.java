import java.io.*;
// import java.io.FileOutputStream;
// import java.io.ObjectInputStream;
// import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
// import java.io.Serializable;


class Donor implements Serializable {
    String name;
    int age;
    String address;
    String contactNo;
    String bloodGroup;
    LocalDate donate_last;

    public Donor(String name, int age, String address, String contactNo, String bloodGroup,
                    LocalDate donate_last) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.contactNo = contactNo;
            this.bloodGroup = bloodGroup;
            this.donate_last = donate_last;
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

    public LocalDate getDonate_last() {
            return donate_last;
    }

    public void setDonate_last(LocalDate donate_last) {
            this.donate_last = donate_last;
    }

    // toString Method

    @Override
    public String toString() {
            return "Name: " + name + ", Age: " + age + ", Address: " + address + ", Contact No: " + contactNo
                            + ", BloodGroup: " + bloodGroup + ", date of last donation: " + donate_last;
    }

}

public class moodle6 {

        // Method to create donor objects and add to list
        private static void nDonorOb(ArrayList<Donor> list) {

                
                Donor donor1 = new Donor("Prakhar", 21, "Raipur", "9876", "A+ve",LocalDate.of(2020, Month.NOVEMBER, 1));
                Donor donor2 = new Donor("Ayush", 22, "Bhubaneshwar", "4566", "B+ve",LocalDate.of(2020, Month.MAY, 1));
                Donor donor3 = new Donor("Advaith", 23, "Delhi", "7689", "A-ve",LocalDate.of(2021, Month.JANUARY, 1));
                Donor donor4 = new Donor("Anushka", 24, "Ajmer", "9435", "B+ve",LocalDate.of(2022, Month.JULY, 1));
                Donor donor5 = new Donor("Rishi", 25, "Chennai", "2222", "B+ve",LocalDate.of(2021, Month.OCTOBER, 1));

                // adding donor objects to arraylist
                list.add(donor1);
                list.add(donor2);
                list.add(donor3);
                list.add(donor4);
                list.add(donor5);
        }

       
        private static void writing(String fileName, ArrayList<Donor> donorList) {
                try {

                        
                        FileOutputStream fout = new FileOutputStream(fileName);
                        
                        ObjectOutputStream objout = new ObjectOutputStream(fout);
                        
                        objout.writeObject(donorList);
                       
                        objout.close();
                        fout.close();
                        System.out.println("Objects written to file " + fileName);
                } catch (Exception ex) {
                        ex.printStackTrace();
                }
        }

        private static ArrayList<Donor> readingobj(String fileName) {
                try {

                        
                        FileInputStream finput = new FileInputStream(fileName);
                        
                        ObjectInputStream objectInputStream = new ObjectInputStream(finput);
                        
                        ArrayList<Donor> donorList = (ArrayList<Donor>) objectInputStream.readObject();

                        System.out.println("Objects read successfully from file " + fileName);
                        
                        objectInputStream.close();
                        finput.close();
                        return donorList;

                } catch (Exception ex) {
                        ex.printStackTrace();
                        return null;
                }
        }

        
        public static void main(String[] args) {

                
                ArrayList<Donor> donorLists = new ArrayList<>();
                
                String fileName = "donors.txt";

                nDonorOb(donorLists);

                
                System.out.println("Donor objects are: ");
                for (Donor donor : donorLists) {
                        System.out.println(donor);
                }
                System.out.println();

                
                writing(fileName, donorLists);

                
                ArrayList<Donor> fileobj = readingobj(fileName);

                

                System.out.println();
                System.out.println("Donors with B+ve blood group and not donated in last 6 months: ");
                
                for (Donor donor : fileobj) {
                       
                        Period period = Period.between(donor.getDonate_last(), LocalDate.now());
                                               if (donor.getBloodGroup().equals("B+ve") && period.toTotalMonths() < 6) {
                                                               System.out.println(donor);
                        }
                }
        }
}



