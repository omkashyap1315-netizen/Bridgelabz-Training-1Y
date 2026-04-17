package com.gla.Stream_api.ForEach_Method;

import java.util.*;
import java.time.*;

public class Main5 {
    public static void main(String[] args) {
        List<String> transactionIds = Arrays.asList("T1", "T2", "T3");

        transactionIds.forEach(id ->
                System.out.println(LocalDateTime.now() + " - Transaction: " + id)
        );
    }
}
