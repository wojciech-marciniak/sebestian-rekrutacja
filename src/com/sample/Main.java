package com.sample;

public class Main {

	public static void main(String[] args) {
		Book[] books = new Book[] {
				new Book("Book1", "Jan", "Kowalski"),
				new Book("Book2", "Grażyna", "Nowak"),
				new Book("Book3", "Anna", "Nowak"),
				new Book("Book4", "Józef", "Antonowicz")
		};
		Book.printBooks(books);
	}



}
