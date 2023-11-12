package com.naresh.consept;

import java.util.List;

public record Person1(String name, List<Integer> grades) {
    public Person1 {
        // Defensive copy of the map
        grades = List.copyOf(grades);
    }

    // Getter method returns a copy of the map
    public List<Integer> getGrades() {
        return List.copyOf(grades);
    }
}
