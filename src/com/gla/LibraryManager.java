package com.gla;

import java.sql.*;

public class LibraryManager {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        Statement st = con.createStatement();

        st.executeUpdate("create table if not exists books(id int, title varchar(100), author varchar(50), status varchar(10))");
        st.executeUpdate("insert into books values(1,'Java','James','Available')");

        ResultSet rs = st.executeQuery("select * from books where status='Available'");
        while(rs.next())
            System.out.println(rs.getString(2));

        st.executeUpdate("update books set status='Issued' where id=1");
        st.executeUpdate("delete from books where id=1");

        con.close();
    }
}
