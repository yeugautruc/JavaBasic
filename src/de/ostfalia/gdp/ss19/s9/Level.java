package de.ostfalia.gdp.ss19.s9;

public enum Level {
	OFF, ERROR, INFO, DEBUG;
	public boolean isEnabled(Level required) {
		return this.ordinal() >= required.ordinal(); //Returns the ordinal of this enumeration constant 
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		return builder.append(this.name()).toString();
	}
	public String toAdd() {
		StringBuilder builder = new StringBuilder();
		return builder.append("["+this.name()+"]").toString();
	}
}
