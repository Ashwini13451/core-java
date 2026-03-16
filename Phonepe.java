class Phonepe{
static double searchInsurencePremium(String insuranceName){
System.out.println("searchInsurencePremium invoked");
if(insuranceName.equals("HDFC Ergo")){
return 7489.89;

}
else if(insuranceName.equals("star")){
return 4357.89;
}

else if(insuranceName.equals("Icici Lobard")){
return 8765.89;
}
else 
{
System.out.println("insuranceName not found");
}
	
	
	return 0.00;
}





}

