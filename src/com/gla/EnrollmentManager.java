package com.gla;

import java.sql.*;

public class EnrollmentManager {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        Statement st = con.createStatement();

        st.executeUpdate("create table if not exists enrollments(id int, student varchar(50), course varchar(50))");
        st.executeUpdate("insert into enrollments values(1,'Rohit','Java')");

        ResultSet rs = st.executeQuery("select * from enrollments where course='Java'");
        while(rs.next())
            System.out.println(rs.getString(2));

        st.executeUpdate("update enrollments set course='Python' where id=1");
        st.executeUpdate("delete from enrollments where id=1");

        con.close();
    }
}
