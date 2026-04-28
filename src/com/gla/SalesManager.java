package com.gla;

import java.sql.*;

public class SalesManager {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        Statement st = con.createStatement();

        st.executeUpdate("create table if not exists sales(id int, bookName varchar(100), quantity int, price double)");
        st.executeUpdate("insert into sales values(1,'Java Book',2,500)");

        ResultSet rs = st.executeQuery("select * from sales where quantity>1");
        while(rs.next())
            System.out.println(rs.getString(2));

        st.executeUpdate("update sales set quantity=3 where id=1");
        st.executeUpdate("delete from sales where id=1");

        con.close();
    }
}
