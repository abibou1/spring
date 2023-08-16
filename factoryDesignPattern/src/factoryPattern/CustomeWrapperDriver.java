package factoryPattern;

public class CustomeWrapperDriver {
	
	private boolean isNumber(String value) {
		
		for(int i=0; i<value.length();i++) {
    		if(!Character.isDigit(value.charAt(i)) && value.charAt(i)!='.'){
    			return false;
    		}
    	}
		
		return true;
	}
	
	public MyWrapper getMyWrapperInstance(String value) {
        if(value == null) {
        	return null;
        }
        else if(value.equals("true") || value.equals("false")) {
        	return new MyBoolean();
        }
        else if(value.length()==1) {
        	return new MyCharacter();
        }
        else {
        	
        	if(!isNumber(value)) {
        		throw new IllegalArgumentException("Value format not recognized");
        	}
        	
        	if(value.contains(".")) {
        		return new MyDouble();
        	}
        	else {
        		return new MyInteger();
        	}
        }
    }

}
