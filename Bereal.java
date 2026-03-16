class Bereal{
void logIn(String userName , long phoneNumber){
System.out.println("The Bereal logIn with password and otp");
System.out.println("userName is :"+ userName);
System.out.println("phoneNumber is :"+ phoneNumber);
}

void logIn(String password, int otp){
System.out.println("The Bereal logIn with password and otp");
System.out.println("password is :"+ password);
System.out.println("otp is :"+ otp);
}
public static void main(String[] args){
Bereal badoo = new Bereal();
badoo.logIn("Sinchana",836636382836L);
badoo.logIn("Sin#5ana",4532);
}	
}