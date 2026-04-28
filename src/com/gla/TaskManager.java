package com.gla;

import java.sql.*;

public class TaskManager {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        Statement st = con.createStatement();

        st.executeUpdate("create table if not exists tasks(id int, title varchar(100), status varchar(20))");
        st.executeUpdate("insert into tasks values(1,'Study JDBC','Pending')");

        ResultSet rs = st.executeQuery("select * from tasks where status='Pending'");
        while(rs.next())
            System.out.println(rs.getString(2));

        st.executeUpdate("update tasks set status='Completed' where id=1");
        st.executeUpdate("delete from tasks where status='Completed'");

        con.close();
    }
}
