package com.gla;

import java.sql.*;

public class GymManager {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        Statement st = con.createStatement();

        st.executeUpdate("create table if not exists members(id int, name varchar(50), type varchar(20), months int)");
        st.executeUpdate("insert into members values(1,'Amit','Premium',6)");

        ResultSet rs = st.executeQuery("select * from members where type='Premium'");
        while(rs.next())
            System.out.println(rs.getString(2));

        st.executeUpdate("update members set months=months+3 where id=1");
        st.executeUpdate("delete from members where id=1");

        con.close();
    }
}
