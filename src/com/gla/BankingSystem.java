package com.gla;

import java.sql.*;

public class BankingSystem {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        Statement st = con.createStatement();

        st.executeUpdate("create table if not exists accounts(accNo int, name varchar(50), balance double)");
        st.executeUpdate("insert into accounts values(1,'Ravi',15000)");

        ResultSet rs = st.executeQuery("select * from accounts where balance>10000");
        while(rs.next())
            System.out.println(rs.getString(2));

        st.executeUpdate("update accounts set balance=balance+5000 where accNo=1");
        st.executeUpdate("delete from accounts where accNo=1");

        con.close();
    }
}
