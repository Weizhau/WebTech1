package com.webtech.task12;

public class ProgrammerBook {
    private final String language;
    private final int level;

    public ProgrammerBook(String language, int level) {
        this.language = language;
        this.level = level;
    }

    public String getLanguage() {
        return language;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (getClass() != other.getClass()) return false;
        ProgrammerBook book = (ProgrammerBook) other;
        return level == book.level && language.equals(book.language);
    }

    @Override
    public int hashCode() {
        return 31 * (language.hashCode() + level + super.hashCode());
    }

    @Override
    public String toString() {
        return "ProgrammerBook{language='" + language + "', level=" + level + '}';
    }
}
