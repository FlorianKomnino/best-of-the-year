package org.java.bestoftheyear;

public class Song {
	private int id;
	private String name;
	public Song(int id, String name) {
		setId(id);
		setName(name);
	}
	
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "L'id di questa canzone e': " + getId() + "\nIl titolo della canzone e': " + getName();
	}
}
