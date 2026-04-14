class AirportExecuter{
public static void main(String[]args){
	System.out.println("Main started");
	
   Airport airport=new Airport();
	airport.airportId=2;
	airport.airportName="Kempegouda Airport";
	
	
	Terminal terminal=new Terminal();
	terminal.terminalId=3;
	terminal.terminalName="B";
	
	airport.terminal=terminal;
	airport.getAirportDetails();
	
	System.out.println("Main ended");
	
	



}





}