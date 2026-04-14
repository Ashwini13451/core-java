class SareeRunner{

public static void main(String[]a){

Saree sareeOne = new Saree();

sareeOne.sareeId=1;
sareeOne.sareeColour="Pink";
sareeOne.sareeType="Cotton Saree";
sareeOne.price=2000;

Saree sareeTwo = new Saree();

sareeTwo.sareeId=2;
sareeTwo.sareeColour="Pink";
sareeTwo.sareeType="Cotton Saree";
sareeTwo.price=2000;

Saree sareeThree = new Saree();

sareeThree.sareeId=3;
sareeThree.sareeColour="Pink";
sareeThree.sareeType="Cotton Saree";
sareeThree.price=2000;

Saree sareeFour = new Saree();

sareeFour.sareeId=4;
sareeFour.sareeColour="Pink";
sareeFour.sareeType="Cotton Saree";
sareeFour.price=2000;

Saree sareeFive = new Saree();

sareeFive.sareeId=5;
sareeFive.sareeColour="Pink";
sareeFive.sareeType="Cotton Saree";
sareeFive.price=2000;



Saree[] sarees = new Saree[5];

sarees[0]=sareeOne;
sarees[1]=sareeTwo;
sarees[2]=sareeThree;
sarees[3]=sareeFour;
sarees[4]=sareeFive;

for(Saree s:sarees){
	System.out.println(s.sareeId);
    System.out.println(s.sareeColour);
	System.out.println(s.sareeType);
    System.out.println(s.price);

}

}




}