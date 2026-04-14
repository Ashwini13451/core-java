class Airport{
	int airportId;
	String airportName;
	Terminal terminal;
	
	Airport(int airportId,String airportName){
	this.airportId=airportId;
    this.airportName=airportName;
    this.terminal=terminal;	
			
	}
	
	public void getAirportDetails(){
		System.out.println("Inside getAirportDetails");
		System.out.println("the airportId is "+airportId);
		System.out.println(" The airportName is "+airportName);
		
  terminal.getTerminalDetails();
  System.out.println("ended getTerminalDetails");
  
  
		public boolean createTerminal(Terminal terminal){
		System.out.println("Invoked Create method");
		this.terminal= Terminal;
		return true;
		}
	}
	
	
}