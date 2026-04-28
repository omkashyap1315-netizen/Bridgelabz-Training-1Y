package com.gla.stack;
import java.util.*;
public class stack {
    static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Home");
        st.push("City");
        st.push("State");
        st.push("Country");

        System.out.println(st);

        System.out.println("Top Value : "+st.peek());
        System.out.println("Removed value : "+st.pop());
        System.out.println(st);
        System.out.println("Top Value : "+st.peek());

    }
}
