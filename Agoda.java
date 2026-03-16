class Agoda{
void logIn(String userName, long phoneNumber){
System.out.println("The Agoda logIn with userName and phoneNumber");
System.out.println("userName is :"+ userName);
System.out.println("phoneNumber is :"+ phoneNumber);
}
void logIn(String password, String mail){
System.out.println("The Agoda logIn with password and mail");
System.out.println("password is :"+ password);
System.out.println("mail is :"+ mail);
}
public static void main(String[] args){
	Agoda agoda= new Agoda();
agoda.logIn("Ashwini",9019922510L);
agoda.logIn("ashu*232","ap8247274@gmail.com");	
	
}
}
