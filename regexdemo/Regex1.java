package regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
   private String string;
   
   
   public String getString() {
	return string;
     }


  public void setString(String string) {
	this.string = string;
    }


	public Regex1(String string) {
		this.string = string;
	}

    // To validate [A-z] 3 characters followed by 4 digits number
	
	public boolean validateString() {
		Pattern p = Pattern.compile("[A-Z]{3}[0-9]{4}");
    	Matcher m = p.matcher(string);
    	if(m.find() && m.group().equals(string))
    		return true;
    	return false;
	}

	
	
	
	
}
