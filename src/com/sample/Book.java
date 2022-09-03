package com.sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Book implements Comparable {

	@Override
	public int compareTo(Object o) {
        Book thisBook = this;
        Book otherBook = (Book) o;
        if (otherBook.authorSurname.equals(thisBook.authorSurname)) {
        	return thisBook.authorFirstName.compareTo(otherBook.authorFirstName);
        } else {
	        return thisBook.authorSurname.compareTo(otherBook.authorSurname);
        }
	}

	public static void printBooks(Book[] books) {
		if (books == null) throw new RuntimeException("Input array should not be null");
        if (books.length == 0) throw new IllegalStateException("Bad array size");
		List<Book> list = Arrays.asList(books);
		Collections.sort(list);
		for (Book book: books) {
			System.out.println(book);
		}
	}

	////DO NOT MODIFY ANYTHING BELOW THIS LINE

	String title;
	String authorFirstName;
	String authorSurname;

	public Book(String title, String authorFirstName, String authorSurname) {
		this.title = title;
		this.authorFirstName = authorFirstName;
		this.authorSurname = authorSurname;
	}

	@Override
	public String toString () {
		// TODO Auto-generated method stub
		return this.title;
	}
}
