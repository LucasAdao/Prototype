package com.lucas.models;

public class IdGenerator {
    private static Integer currentId = 0;

    public static synchronized Integer getNextId() {
        currentId = currentId + 1;
        return currentId;
    }
}
