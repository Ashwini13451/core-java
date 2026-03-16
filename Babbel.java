class Babbel{
void logIn(String userName, long phoneNumber){
System.out.println("The Babbel logIn with userName and phoneNumber");
System.out.println("userName is :"+ userName);
System.out.println("phoneNumber is :"+ phoneNumber);
}
void logIn(String password, String mail){
System.out.println("The Babbel logIn with password and mail");
System.out.println("password is :"+ password);
System.out.println("mail is :"+ mail);
}
public static void main(String[] args){
Babbel ajio = new Babbel();
ajio.logIn("Sinchana",836636382836L);
ajio.logIn("Sin#5ana","hjagsfg23@gmail.com");
}	
	
}