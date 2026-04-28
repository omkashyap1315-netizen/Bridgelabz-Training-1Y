package com.gla;

import java.sql.*;

public class CustomerDirectory {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        Statement st = con.createStatement();

        st.executeUpdate("create table if not exists customers(id int, name varchar(50), phone varchar(15))");
        st.executeUpdate("insert into customers values(1,'Aman','9999999999')");

        ResultSet rs = st.executeQuery("select * from customers where name like '%Aman%'");
        while(rs.next())
            System.out.println(rs.getString(2));

        st.executeUpdate("update customers set phone='8888888888' where id=1");
        st.executeUpdate("delete from customers where id=1");

        con.close();
    }
}
