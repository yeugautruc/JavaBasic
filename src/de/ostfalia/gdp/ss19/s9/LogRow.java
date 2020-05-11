package de.ostfalia.gdp.ss19.s9;

public class LogRow {
	private String message;
	private Level level;
	public LogRow(String message, Level level) {
		this.message = message;
		this.level = level;
	}
	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message=message;
	}
	public Level getLevel() {
		return this.level;
	}
	public void setLevel(Level level) {
		this.level=level;
	}
	public String toString(){
		return level.toString()+"-->"+message;
	}
}
