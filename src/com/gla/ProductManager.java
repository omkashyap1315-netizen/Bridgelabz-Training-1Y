package com.gla;

import java.sql.*;

public class ProductManager {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        Statement st = con.createStatement();

        st.executeUpdate("create table if not exists product(pid int, pname varchar(50), qty int)");
        st.executeUpdate("insert into product values(1,'Pen',5),(2,'Book',20),(3,'Pencil',8)");

        ResultSet rs = st.executeQuery("select * from product where qty<10");
        while(rs.next())
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));

        st.executeUpdate("update product set qty=qty+10 where pid=1");
        st.executeUpdate("delete from product where pid=3");

        con.close();
    }
}
