package org.java.bestoftheyear;

public class Movie {
	private int id;
	private String name;
	public Movie(int id, String name) {
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
		return "L'id di questo film e': " + getId() + "\nIl titolo del film e': " + getName();
	}
}
