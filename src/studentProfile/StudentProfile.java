package studentProfile;

import java.sql.SQLException;
import java.util.Scanner;

public class StudentProfile {
    private int id;
    private String name;
    private String domain;
    private String address;
    public StudentProfile(){

    }

    public StudentProfile (int id, String name, String domain, String address) {
        this.domain = domain;
        this.id = id;
        this.address = address;
        this.name = name;
    }
    public StudentProfile (String name, String domain, String address) {
        this.name = name;
        this.domain = domain;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentProfile{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", domain='" + domain + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

        public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
            System.out.println("***** The Student Profile Portal *****");
            AddAction aa = new AddAction();

            while (true) {

                System.out.println(
                                "\n Press 1 for Adding Profile \n" +
                                "\n Press 2 for Displaying Profiles \n" +
                                "\n Press 3 for Displaying Profile with ID \n" +
                                "\n Press 4 for Deleting Profile \n" +
                                "\n Press 5 for Updating Profile \n" +
                                "\n Press 6 for Exiting the portal \n"

                );
                int i = sc.nextInt();
                switch (i) {
                    case 1:
                        System.out.println("Add Profile");
                        System.out.println("Enter Name");
                        String name = sc.next();
                        System.out.println("Enter Domain");
                        String domain = sc.next();
                        System.out.println("Enter Address");
                        String address = sc.next();
                        StudentProfile sp = new StudentProfile(name, domain, address);
                        boolean valid = aa.add(sp);
                        if (valid) {
                            System.out.println("** Profile Added **");
                        } else {
                            System.out.println("** Problem Occured **");
                        }
                        break;
                    case 2:
                        System.out.println("Display");
                        aa.display();
                        break;
                    case 3:
                        System.out.println("Display by ID");
                        System.out.println("Enter ID ->");
                        int in = sc.nextInt();
                        boolean validID = aa.displaybyID(in);
                        if (!validID) {
                            System.out.println("****Profile with this ID not avaiable");
                        }
                        break;
                    case 4:
                        System.out.println("Delete");
                        System.out.println("Enter ID to delete ->");
                        int de = sc.nextInt();
                        boolean validDID = aa.delete(de);
                        if (validDID) {
                            System.out.println("****Deleted Successfully ****");
                        } else {
                            System.out.println("****Problem occured****");
                        }
                        break;
                    case 5:
                        System.out.println("Update");
                        System.out.println("Press 1 to update Domain \nPress 2 to update Address");
                        int se = sc.nextInt();
                        int idd;
                        String addr;
                        StudentProfile spp;
                        boolean up;
                        if (se == 1) {
                            System.out.println("Enter ID ");
                            idd = sc.nextInt();
                            System.out.println("Enter new Domain");
                            addr = sc.next();
                            spp = new StudentProfile();
                            spp.setDomain(addr);
                            up = aa.update(idd, addr, se, spp);
                            if (up) {
                                System.out.println("Domain updated successfully");
                            } else {
                                System.out.println("Error Occured");
                            }
                        } else if (se == 2) {
                            System.out.println("Enter ID ");
                            idd = sc.nextInt();
                            System.out.println("Enter new Address");
                            addr = sc.next();
                            spp = new StudentProfile();
                            spp.setDomain(addr);
                            up = aa.update(idd, addr, se, spp);
                            if (up) {
                                System.out.println("Address updated successfully");
                            } else {
                                System.out.println("Error Occured");
                            }
                        } else {
                            System.out.println("Invalid Choice *****");
                        }
                        break;
                    case 6:
                        System.out.println("Exit");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid");
                }


            }
        }

}
