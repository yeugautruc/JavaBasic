package de.ostfalia.gdp.ss19.s9;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Log {
	private List<LogRow> logs = new ArrayList<>();
	private Level debugLevel;

	public Log() {
		this.debugLevel = Level.OFF;
	}

	public Level getDebugLevel() {
		return this.debugLevel;
	}

	public void setDebugLevel(Level debugLevel) {
		this.debugLevel = debugLevel;
	}

	public List<LogRow> getLogs() {
		return getLogs(this.debugLevel);
	}

	public List<LogRow> getLogs(Level level) {
		List<LogRow> out = new ArrayList<>();
		for (LogRow log : logs) {
			if (level.isEnabled(log.getLevel()))
				out.add(log);
		}
		return out;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("##### Debuglevel = ").append(this.debugLevel.name()).append(" #####\n");
		for (LogRow log : this.getLogs()) {
			builder.append(log.toString()).append("\n");
		}
		return builder.toString();
	}

	public static Log createLogFromFile(String fileName) throws IOException {
		Log out = new Log();
		FileReader fi = null;
		BufferedReader bi = null;
		String row = "";
		try {
			fi = new FileReader(fileName);
			bi = new BufferedReader(fi);
			while ((row = bi.readLine()) != null) {
				if (row.startsWith(Level.ERROR.toAdd())) {
					if (row.trim().length() > Level.ERROR.toAdd().length()) {
						out.logs.add(new LogRow(row.
								replace(Level.ERROR.toAdd(), "").trim(), Level.ERROR));
					}
				} else if (row.startsWith(Level.INFO.toAdd())) {
					if (row.trim().length() > Level.INFO.toAdd().length()) {
						out.logs.add(new LogRow(row.replace(Level.INFO.toAdd(), "").trim(), Level.INFO));
					}
				} else if (row.startsWith(Level.DEBUG.toAdd())) {
					if (row.trim().length() > Level.DEBUG.toAdd().length()) {
						out.logs.add(new LogRow(row.replace(Level.DEBUG.toAdd(), "").trim(), Level.DEBUG));
					}
				} else if (row.trim().length() > 0) {
					out.logs.add(new LogRow("Ungültiger Logeintrag", Level.ERROR));
				}
			}
		} catch (Exception e) {
			out.logs.add(new LogRow("Error while reading file", Level.ERROR));
		} finally {
			bi.close();
			fi.close();
		}
		return out;
	}

	public void debug(String message) {
		this.logs.add(new LogRow(message, Level.DEBUG));
	}

	public void info(String message) {
		this.logs.add(new LogRow(message, Level.INFO));
	}

	public void error(String message) {
		this.logs.add(new LogRow(message, Level.ERROR));
	}
}