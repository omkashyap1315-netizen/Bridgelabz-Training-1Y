package com.gla;

import java.sql.*;

public class MenuManager {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        Statement st = con.createStatement();

        st.executeUpdate("create table if not exists menu(id int, itemName varchar(50), price double)");
        st.executeUpdate("insert into menu values(1,'Burger',150)");

        ResultSet rs = st.executeQuery("select * from menu where price<200");
        while(rs.next())
            System.out.println(rs.getString(2));

        st.executeUpdate("update menu set price=180 where id=1");
        st.executeUpdate("delete from menu where id=1");

        con.close();
    }
}
