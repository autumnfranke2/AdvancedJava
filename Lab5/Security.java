package Lab5;

public class Security {
	
	public String SecurityCheck(String str) {
		while(true) {
			if (str.endsWith(";")) {
				return ("unsafe");
			}
			if (str.contains("SELECT")) {
				return ("unsafe");
			}
			if (str.contains("WHERE")) {
				return ("unsafe");
			}
			if (str.contains("(") && !str.contains(")")) {
				return("unsafe");
			}
			if(!str.contains("''") ) {
				return("unsafe");
			}
			if(str.contains("0x")) {
				return("unsafe");
			}
			if(str.contains("0##")) {
				return("unsafe");
			}
		else {
			return ("safe");
		}
		}
		
			
		}

}