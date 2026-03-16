class Anilist{
void logIn(String userName, long phoneNumber){
System.out.println("The Anilist logIn with userName and phoneNumber");
System.out.println("userName is :"+userName );
System.out.println("phoneNumber is:"+phoneNumber );
}
void logIn(String password, String mail){
System.out.println("The Anilist logIn with password and mail");
System.out.println("password is :"+ password);
System.out.println("mail is :"+ mail);
}
public static void main(String[] args){
Anilist anilist = new Anilist();
anilist.logIn("Sinchana",836636382836L);
anilist.logIn("Sin#5ana","hjagsfg23@gmail.com");
}	
}

