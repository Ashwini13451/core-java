class ChatGpt{
 void logIn(String userName,String password){
 System.out.println("The ChatGpt logIn with the userName and password");
 System.out.println("userName is :"+userName);
 System.out.println("password is :"+ password);
 }
 

 void logIn(long phoneNumber,int otp)
 {
 System.out.println("The ChatGpt logIn with phoneNumber and otp");
 System.out.println("phoneNumber is:"+phoneNumber);
 System.out.println("otp is:"+ otp);

 }
public static void main(String[] ags){
	ChatGpt chatgpt = new ChatGpt();
	chatgpt.logIn("Ashwini","ashq@3hai");
	chatgpt.logIn(23152415L,1326);
	
}

}