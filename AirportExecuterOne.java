class AirportExecuterOne{


public static void main(String[]arg){
	
	
Terminal terminal = new Terminal();

Airport airport = new Airport(1,terminal);



airport.createTerminal(terminal);

airport.getAirportDetails();

}

}