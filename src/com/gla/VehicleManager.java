package com.gla;

import java.sql.*;

public class VehicleManager {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        Statement st = con.createStatement();

        st.executeUpdate("create table if not exists vehicles(regNo varchar(20), owner varchar(50), status varchar(20))");
        st.executeUpdate("insert into vehicles values('UP16AB1234','Amit','Pending')");

        ResultSet rs = st.executeQuery("select * from vehicles where status='Pending'");
        while(rs.next())
            System.out.println(rs.getString(1));

        st.executeUpdate("update vehicles set status='Completed' where regNo='UP16AB1234'");
        st.executeUpdate("delete from vehicles where regNo='UP16AB1234'");

        con.close();
    }
}
