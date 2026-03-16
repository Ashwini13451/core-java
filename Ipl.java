class Ipl{
public static void main(String[] args){
	
	
	String mumbaiIndians    = "Mumbai Indians";
	String chennaiSuperKings  = "Chennai Super Kings";
	String  kolkataKnightRiders    = "Kolkata Knight Riders";
	String  royalChallengersBengaluru     =  "Royal Challengers Bengaluru";
    String delhiCapitals     = " Delhi Capitals";
   String  rajasthanRoyals= " Rajasthan Royals";
   String   sunrisersHyderabad  ="Sunrisers Hyderabad";
   String  punjabKings    = "Punjab Kings";
   String   gujaratTitans    ="Gujarat Titans";
   String lucknowSuperGiants    = "Lucknow Super Giants";
String teamNames[]={mumbaiIndians, chennaiSuperKings, kolkataKnightRiders, royalChallengersBengaluru,
 delhiCapitals,rajasthanRoyals, sunrisersHyderabad, 
punjabKings, gujaratTitans, lucknowSuperGiants};
System.out.println("The IPL Team names are:");
/*System.out.println(teamNames[0]+"\n"+
teamNames[1]+"\n"+
teamNames[2]+"\n"+
teamNames[3]+"\n"+
teamNames[4]+"\n"+
teamNames[5]+"\n"+
teamNames[6]+"\n"+
teamNames[7]+"\n"+
teamNames[8]+"\n"+
teamNames[9]+"\n"
);*/
for(String teamName:teamNames){
System.out.println(teamName);}
}
}

 
