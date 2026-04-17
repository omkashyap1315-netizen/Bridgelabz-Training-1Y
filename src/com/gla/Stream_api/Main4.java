package com.gla.Stream_api;

import java.util.*;
import java.time.*;

class Member {
    String name;
    LocalDate expiry;

    Member(String name, LocalDate expiry) {
        this.name = name;
        this.expiry = expiry;
    }

    public LocalDate getExpiry() { return expiry; }
    public String toString() { return name; }
}

public class Main4 {
    public static void main(String[] args) {
        List<Member> members = Arrays.asList(
                new Member("A", LocalDate.now().plusDays(10)),
                new Member("B", LocalDate.now().plusDays(40)),
                new Member("C", LocalDate.now().plusDays(20))
        );

        members.stream()
                .filter(m -> m.getExpiry().isBefore(LocalDate.now().plusDays(30)))
                .forEach(System.out::println);
    }
}
