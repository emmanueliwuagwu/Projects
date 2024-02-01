package studentProfile;

import Connectivity.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class AddAction {

    public AddAction() {
    }

    public boolean add(StudentProfile sp) {
        boolean check = false;

        try {
            Connection con = DB.getCon();
            String query = "insert into profile(name,domain,address) value(?,?,?)";
            PreparedStatement p = con.prepareStatement(query);
            p.setString(1, sp.getName());
            p.setString(2, sp.getDomain());
            p.setString(3, sp.getAddress());
            p.executeUpdate();
            check = true;
        } catch (Exception e) {
            System.out.println(e);
        }

        return check;
    }

    public void display() throws SQLException {
        try {
            Connection con = DB.getCon();
            String query = "select * from profile";
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(query);

            while(rs.next()) {
                System.out.println("ID      ->  " + rs.getInt(1) + "\nName    ->  " + rs.getString(2) + "\nDomain  ->  " + rs.getString(3) + "\nAddress ->  " + rs.getString(4));
                System.out.println("**********************");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public boolean displaybyID(int id) {
        boolean check = false;

        try {
            Connection con = DB.getCon();
            String query = "select * from profile where id=" + id;
            Statement s = con.createStatement();

            for(ResultSet rs = s.executeQuery(query); rs.next(); check = true) {
                System.out.println("ID      ->  " + rs.getInt(1) + "\nName    ->  " + rs.getString(2) + "\nDomain  ->  " + rs.getString(3) + "\nAddress ->  " + rs.getString(4));
                System.out.println("**********************");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return check;
    }

    public boolean delete(int de) {
        boolean check = false;

        try {
            Connection con = DB.getCon();
            String query = "delete from profile where id=" + de;
            PreparedStatement p = con.prepareStatement(query);
            p.executeUpdate();
            check = true;
        } catch (Exception e) {
            System.out.println(e);
        }

        return check;
    }

    public boolean update(int id, String newstring, int se, StudentProfile sp) {
        boolean check = false;

        try {
            Connection con;
            String query;
            PreparedStatement p;
            if (se == 1) {
                con = DB.getCon();
                query = "update profile set domain=? where id=?";
                p = con.prepareStatement(query);
                p.setString(1, newstring);
                p.setInt(2, id);
                p.executeUpdate();
                check = true;
            } else if (se == 2) {
                con = DB.getCon();
                query = "update profile set address=? where id=?";
                p = con.prepareStatement(query);
                p.setString(1, newstring);
                p.setInt(2, id);
                p.executeUpdate();
                check = true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return check;
    }
}


