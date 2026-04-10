class Ibacco{
            String iceCreams[] = new  String[10];
			int index;
			
			// create operation
			public boolean addIceCream(String iceCream){
			boolean isIceCreamAdded=false;
			if(index < iceCreams.length){
			
			if(iceCream!=null && !iceCream.isEmpty()){
				iceCreams[index++]=iceCream;
				isIceCreamAdded=true;
				
				}else System.out.println(iceCream +"not added");
			}
			else System.out.println("IceCream is full already");
				return isIceCreamAdded;
				
	
			}

public void getIceCreams(){
System.out.println("The available iceCreams are:");
for(String iceCream:iceCreams)
System.out.println(iceCream);	
	
}


}