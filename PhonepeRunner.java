class PhonepeRunner{
public static void main(String[] args){
  double premium=Phonepe.searchInsurencePremium("HDFC Ergo");{
System.out.println("Premium is "+premium );
  }
  
   double premium1=Phonepe.searchInsurencePremium("star");{
System.out.println("Premium1 is "+premium1 );
  }
  
   double premium2=Phonepe.searchInsurencePremium("Icici Lobard");{
System.out.println("Premium2 is "+premium2 );
  }
  
  double premium3=Phonepe.searchInsurencePremium("InsuranceName not found");{
System.out.println("Premium3 is "+premium3 );
  }
  }
}