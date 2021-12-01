package com.webtech.task12.comparators;

import com.webtech.task12.Book;

import java.util.Comparator;

class TitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
