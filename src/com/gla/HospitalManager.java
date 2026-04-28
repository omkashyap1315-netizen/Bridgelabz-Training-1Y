package com.gla;

import java.sql.*;

public class HospitalManager {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        Statement st = con.createStatement();

        st.executeUpdate("create table if not exists patients(id int, name varchar(50), disease varchar(50))");
        st.executeUpdate("insert into patients values(1,'Raj','Fever')");

        ResultSet rs = st.executeQuery("select * from patients where disease='Fever'");
        while(rs.next())
            System.out.println(rs.getString(2));

        st.executeUpdate("update patients set disease='Cold' where id=1");
        st.executeUpdate("delete from patients where id=1");

        con.close();
    }
}
