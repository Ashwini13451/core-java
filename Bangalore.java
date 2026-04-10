 class Bangalore{
	 
	 int pincodes[] = new  int[5];
			int index;
			
			// create operation
			public boolean addPincode(int pincode){
			boolean isPincodeAdded=false;
			
			if(pincode!=0 && pincode>0){
				pincodes[index++]=pincode;
				isPincodeAdded=true;
				
				}else System.out.println(pincode +"not added");
				return isPincodeAdded;
				
	
			}

public void getPinCodes(){
System.out.println("The available pincodes are:");
for(int pincode:pincodes)
System.out.println(pincode);	
	
}
 }