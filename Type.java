public enum Type {

	ROCK{
		@Override
		public boolean beats(Type other){            
	        return other ==  SCISSORS;
		}
	}, PAPER{
		@Override
		public boolean beats(Type other){            
	        return other ==  ROCK;
		}
	}, SCISSORS{
		@Override
		public boolean beats(Type other){            
	        return other ==  PAPER;
		}
	};
	
	/**
	 * This method compares to see which value beats what.
	 * Each object then overrides the method
	 * @param other the value that will be beaten by the value in question
	 * @return boolean returns if it beats other or not
	 */
	public abstract boolean beats(Type other);

	/**
	 * This sees what value is given and returns what Type value it is 
	 * @param value this is the first letter of user input 
	 * Or randomly generated from computer
	 * @return Type this returns ROCK, PAPER, SCISSORS or null
	 */
	public static Type parseType(String value){
		Type type = null;
		
		switch (value){
		case "R": type = ROCK;
		break;
		
		case "P": type = PAPER;
		break;
		
		case "S": type = SCISSORS;
		break;
		
		default : type = null;
		break;
		}
		return type;
	}
	
}
