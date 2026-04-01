class Event{

String eventType;
String title;
String startDate ;
String endDate;
String userName;
boolean isAllDayEvent;
boolean repeatEveryYear;


 public void getEventDetails(){
	 System.out.println("The eventType is"+eventType);
	 System.out.println("The title is"+title);
	 System.out.println("The startDate"+startDate);
	 System.out.println("The endDate"+endDate);
	 System.out.println("The userName"+userName);
	 System.out.println("The isAllDayEvent"+isAllDayEvent);
	 System.out.println("The repeatEveryYear"+repeatEveryYear);
		 
 }

}