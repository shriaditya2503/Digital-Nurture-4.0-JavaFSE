package com.aditya;

import java.util.Arrays;
import java.util.Comparator;

public class SearchUtils {
    // Linear Search by title
    public static Book linearSearch(Book[] books, String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Binary Search by title
    public static Book binarySearch(Book[] books, String title) {
        Arrays.sort(books, Comparator.comparing(Book::getTitle));

        int left = 0, right = books.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = title.compareToIgnoreCase(books[mid].getTitle());

            if (cmp == 0) return books[mid];
            else if (cmp < 0) right = mid - 1;
            else left = mid + 1;
        }
        return null;
    }
}
