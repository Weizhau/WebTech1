package com.webtech.task12.comparators;

import com.webtech.task12.Book;

import java.util.Comparator;

class AuthorTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int authorComparison = o1.getAuthor().compareTo(o2.getAuthor());
        if (authorComparison == 0) {
            return o1.getTitle().compareTo(o2.getTitle());
        } else {
            return authorComparison;
        }
    }
}
