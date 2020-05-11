package de.ostfalia.gdp.ss19.s8;

public class Autor {
	private int id;
	private String name;
	private String email;
	private boolean settedID = false;

	public Autor(String n, String e) {
		name = n;
		email = e;
	}

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int in) {
		if (!settedID) {
		this.id = in;
		settedID = true;}
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean equals(Autor in) {
		boolean out = false;
		if (name == in.name || email == in.email)
			out = true;
		else
			out = false;
		return out;
	}

	public String toString() {
		String out = "ID: " + id + ", Name: " + name + ", Email: " + email;
		return out;
	}

}
