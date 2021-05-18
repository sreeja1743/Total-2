package regexdemo;

import java.util.regex.*;

public class Validate {
	private String string;
	
	public Validate(String string) {
		this.string = string;
	}
	
     public String getString() {
		return string;
	 }

	public void setString(String string) {
		this.string = string;
	}
	
	//To validate [A_Z][1-4]-[6 character long numeric value][A-Z][1-4]{6}
		public boolean validateString() {
        	Pattern p = Pattern.compile("[A-Z][1-4]{6}");
        	Matcher m = p.matcher(string);
        	if(m.find() && m.group().equals(string))
        		return true;
        	return false;
        }
}	
