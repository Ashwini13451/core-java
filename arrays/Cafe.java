class Cafe{


String teaNames[]= { "amarut" , "masala" ,"ginger","black", "green" ,"lemon" };
	 
public static void main(String[] arg){

// datatype  refName =ref 
   /* String cafeName = "Cring Caffe";
	 String amarut ="Amarut chaha";
	 String masala ="Masala chaha";
	 String ginger ="inger chaha";
	 String black ="Black chaha";
	 String green ="Green chaha";
	 String lemon ="Lemon chaha";*/
	 String teaNames[]= { "amarut" , "masala" ,"ginger","black", "green" ,"lemon" };
	
	 getTeaNames();
	 getCoffeNames();
	 
	 String cappuccino="Cappuccino Coffe";
	  String espresso="Espresso Coffe";
	  String americano="Americano";
	 String  macchiato="Macchiato";
	 String cortado="Cortado";
	 String coldBrew="ColdBrew";
	 String latte="Latte";
	 String coffeNames[]={cappuccino,espresso,americano,macchiato,cortado,coldBrew,latte};
	 
	 
	String protein="Protein";
    String fiber="Fiber";
	String bread="Bread";
	String fruitwithnutbutter="Fruit with nut butter";
	String cottagecheesewithfruit="Cottage cheese with fruit";
	String edamame="Edamame";
	String homemade="Homemade";
	
	 String snacksNames[]={ protein, fiber, bread , fruitwithnutbutter, cottagecheesewithfruit, edamame, homemade};

System.out.println("The coffe name is"+ cafeName);
System.out.println("The no of tea names are:"+teaNames.length );

System.out.println("List of different tea names are:");	 
/*System.out.println(teaNames[0] +"\n"+ 
                   teaNames[1] +"\n"+
                   teaNames[2] +"\n"+
                   teaNames[3] +"\n"+ 
                   teaNames[4] +"\n"+
                   teaNames[5] +"\n"
				   );*/
				   
for(String teaName:teaNames){
System.out.println(teaName);}


				   
				  
System.out.println("List of different cafeNames names are:");	 
/*System.out.println(coffeNames[0] +"\n"+ 
                   coffeNames[1] +"\n"+
                   coffeNames[2] +"\n"+
                   coffeNames[3] +"\n"+ 
                   coffeNames[4] +"\n"+
                   coffeNames[5] +"\n"+
				   coffeNames[6] +"\n"
				    );*/
for(String coffeName:coffeNames){
System.out.println(coffeName);
}

System.out.println("List of different SnacksNames are:");	 
/*System.out.println(snacksNames[0] +"\n"+ 
                   snacksNames[1] +"\n"+
                   snacksNames[2] +"\n"+
                   snacksNames[3] +"\n"+ 
                   snacksNames[4] +"\n"+
				   snacksNames[5] +"\n"+
	               snacksNames[6] +"\n"
				   );*/
for(String snacksName:snacksNames){
System.out.println(snacksName);}



//purpose/behavioue,characteristics
   static  void getTeaNames(){
	   System.out.println("The available tea Names are :");
for(String teaName:teaNames){
System.out.println(teaNmaes);}
	}
	
	
}
}