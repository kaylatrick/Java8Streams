package com.technologyconversations.java8exercises.streams;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

import java.util.Collection;

public class Joining {

    private Joining() {
    }

    public static String namesToString7(List<Person> people) {
        String label = "Names: ";
        StringBuilder sb = new StringBuilder(label);
        for (Person person : people) {
            if (sb.length() > label.length()) {
                sb.append(", ");
            }
            sb.append(person.getName());
        }
        sb.append(".");
        return sb.toString();
    }

    public static String namesToString(List<Person> people) {
        String x = people.stream()
        		.map(i -> i.getName())
        		.collect(Collectors.joining(", ", "Names: ", "."));
    	System.out.println(x);
    	return x;
    }

}
