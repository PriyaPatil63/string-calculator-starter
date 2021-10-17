package calculator;

class StringCalculator {

	 public int add(String input) {
	    	if(input.equals("")){
				return 0;
			}
			else{
				String delimiter = ",";
				if(input.matches("//(.*)\n(.*)")){
					delimiter = Character.toString(input.charAt(2));
					input = input.substring(4);
				}
				
				String numList[] = splitNumbers(input, delimiter + "|\n");
				return sum(numList);
			}
		}
    
    private boolean isEmpty(String input) {
		return input.isEmpty() ;
    	
    }
    
    private static int stringtoInt(String input) {
    	return Integer.parseInt(input);
    	
    }
    
    private static String[] splitNumbers(String numbers, String divider){
		//System.out.println(divider);
	    return numbers.split(divider);
	}
    
    
    
    private static int sum(String[] numbers){
 	    int total = 0;
 	    String negString = "";

        for(String number : numbers){
        	if(stringtoInt(number) < 0){
        		if(negString.equals(""))
        			negString = number;
        		else
        			negString += ("," + number);
        	}
        	if(stringtoInt(number) < 1000)
		    	total += stringtoInt(number);
		}
        if(!negString.equals("")){
			throw new IllegalArgumentException("Negatives not allowed: " + negString);
		}

		return total;
    }
    
    

}