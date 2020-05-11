package de.ostfalia.gdp.ss19.s7.test;

import java.lang.String;

public class Aufgabe2Serie7 {
	public static class StringWrapper {
		private java.lang.String content = "";

		public StringWrapper(java.lang.String content) {
			this.content = content;
		}

		public int length() {
			int l = 0;
			char[] in = content.toCharArray();
			l = in.length;
			return l;
		}

		public StringWrapper charXNOR(StringWrapper other) {
			String newcontent = "";
			int l = length();
			String otherContent = other.toString();
			for (int i = 0; i <l; i++) {
				if (content.charAt(i) == otherContent.charAt(i))
					newcontent += content.charAt(i);
				else
					newcontent += " ";
			}
			StringWrapper out = new StringWrapper(newcontent);
			return out;
		}

		public java.lang.String toString() {
			return content;
		}

		public StringWrapper invert() {
			String newcontent = "";
			int l = length();
			for (int i = l-1; i > -1; i--) {
				newcontent += content.charAt(i);
			}
			StringWrapper out = new StringWrapper(newcontent);
			return out;
		}

		public StringWrapper replace(char oldChar, char newChar) {
			String newcontent = "";
			int l = length();
			for (int i = 0; i <l; i++) {
				if (content.charAt(i) == oldChar)
					newcontent += newChar;
				else
					newcontent += content.charAt(i);
			}
			StringWrapper out = new StringWrapper(newcontent);
			return out;
		}

		public StringWrapper merge(StringWrapper other) {
			String newcontent = ""+content;
			newcontent += other.toString();
			StringWrapper out = new StringWrapper(newcontent);
			return out;
		}
	}

	public static void main(String[] args) {
		StringWrapper in1=new StringWrapper("ThisIsString");
		StringWrapper in2=new StringWrapper("ThisNoString");
		System.out.println(in1.length());
		StringWrapper out1= in1.invert();
		System.out.println(out1.toString());
		StringWrapper in3 = in1;
		System.out.println(in3.toString());
		StringWrapper out2 = in3.charXNOR(in2);
		System.out.println(out2.toString());
		StringWrapper out3 = in1.replace('i', 'I');
		System.out.println(out3.toString());
		StringWrapper out4= in1.merge(in2);
		System.out.println(out4.toString());
	}
}
