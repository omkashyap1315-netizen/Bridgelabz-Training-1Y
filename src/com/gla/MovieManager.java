package com.gla;

import java.sql.*;

public class MovieManager {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        Statement st = con.createStatement();

        st.executeUpdate("create table if not exists movies(id int, name varchar(50), seats int)");
        st.executeUpdate("insert into movies values(1,'Avengers',50)");

        ResultSet rs = st.executeQuery("select * from movies where seats>0");
        while(rs.next())
            System.out.println(rs.getString(2));

        st.executeUpdate("update movies set seats=seats-1 where id=1");
        st.executeUpdate("delete from movies where id=1");

        con.close();
    }
}
