package com.gla;

import java.sql.*;

public class EmployeeManager {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");

        Statement st = con.createStatement();
        st.executeUpdate("create table if not exists employee(id int, name varchar(50), salary double)");

        st.executeUpdate("insert into employee values(1,'Rahul',40000)");

        ResultSet rs = st.executeQuery("select * from employee where salary>30000");
        while(rs.next())
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));

        st.executeUpdate("update employee set salary=salary*1.1 where id=1");

        st.executeUpdate("delete from employee where salary<15000");

        con.close();
    }
}