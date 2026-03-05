class Netflix {
	
static String kannadaSeries[] = {
"The Hunt for Veerappan","Crime Stories India Detectives","Beast of Bangalore Indian Predator",
"Kurukshetra Web Series","Salaar","Thunivu","Animal","Jawan","Leo","Guntur Kaaram","Hi Nanna",
"Kurup","Jana 2022","Kantara","KGF Chapter 1","777 Charlie","Vikrant Rona","Kabzaa","Kotigobba 3",
"Roberrt","Yuvarathnaa","Pogaru","James","Gandhada Gudi","Kantara A Legend","Charlie 777",
"Avane Srimannarayana","Lucky Man","Old Monk"};

 static String hindiSeries[] = {"Sacred Games","Delhi Crime","Jamtara","Kota Factory",
 "Rana Naidu","Selection Day","Khakee The Bihar Chapter","Taj Mahal 1989",
 "Yeh Kaali Kaali Ankhein","Aranyak","Leila","Ray","The Great Indian Kapil Show"
 ,"Guns and Gulaabs","Ghoul","Typewriter","Bard of Blood","She","Hasmukh","Betaal",
 "Masaba Masaba","Mismatched","Bhaag Beanie Bhaag","Bombay Begums","Feels Like Ishq",
 "Mai A Mothers Rage","Trial by Fire","Class","Scoop","Kohrra"};    

static String englishSeries[] = {"Stranger Things","The Crown",
"The Lincoln Lawyer","Mo","The Tourist","You","Narcos","Ozark",
"Unbelievable","Outlander","Peaky Blinders","The Queens Gambit",
"Bridgerton","Heartstopper","One Day","Queen Charlotte","Ransom Canyon",
"3 Body Problem","Alice in Borderland","Black Mirror","The Umbrella Academy",
"Elite","Forever","Gossip Girl","Outer Banks","Sex Education",
"XO Kitty","The Diplomat","Squid Game","Wednesday"}; 

static String malayalamSeries[] = {"Minnal Murali","Curry and Cyanide","Eko",
"Iratta","Forensic","The Teacher","Nayattu","Kappela","Irul","One","Kaapa",
"Jana Gana Mana","RDX","Vaashi","Padavettu","Kurup","Thallumaala","Thottapan",
"Kilometers and Kilometers","Ariyippu","Kuttavum Shikshayum","Kaaval","Dear Friend",
"Rekha","Pulimada","A Ranjith Cinema","Night Drive","Attention Please","Thundu",
"Oru Thekkan Thallu Case"};
        
static String teluguSeries[] = {"Super Subbu","Pitta Kathalu","Rana Naidu",
"Guns and Gulaabs","Kota Factory","Tooth Pari","Lupin","Stranger Things","Wednesday",
"Money Heist","One Piece","Aranyak","Squid Game","Sandman","Sex Education","The Witcher",
"Griselda","Dahmer","Dead Boy Detectives","Avatar The Last Airbender","Kaala Paani",
"Jamtara","Yeh Kaali Kaali Ankhein","Parasyte The Grey","RRR","Salaar","Guntur Kaaram",
"Hi Nanna","Waltair Veerayya","GodFather"};

static String tamilSeries[] = {"Navarasa","Paava Kadhaigal","The Game You Never Play Alone",
"Thalaivar Thambi Thalaimaiyil","Legacy","Aaryan","Revolver Rita","Beast","Leo",
"Jagame Thandhiram","Vaathi","Annaatthe","Tughlaq Durbar","Doctor","Etharkkum Thunindhavan",
"Don","DSP","Sinam","Raangi","Nitham Oru Vaanam","Maamannan","Oho Enthan Baby","Laabam",
"Japan","Visaranai","Aelay","Mandela","Kuiko","Asura Guru","Sarbath"};

       public static void main(String[] args) {
        getKannadaSeries();
		getHindiSeries();
		getEnglishSeries();
		getMalyalamSeries();
		getTelguSeries();
		getTamilSeries();

		   }
static void getKannadaSeries(){
        System.out.println("Kannada Series:\n");
        for(String s:kannadaSeries)
			System.out.println(s);
}
static void getHindiSeries(){
        System.out.println("\nHindi Series:\n");
        for(String s:hindiSeries) 
			System.out.println(s);
}
static void getEnglishSeries(){
        System.out.println("\nEnglish Series:\n");
        for(String s:englishSeries)
			System.out.println(s);
}
static void getMalyalamSeries(){
        System.out.println("\nMalayalam Series:\n");
        for(String s:malayalamSeries)
			System.out.println(s);
}
static void getTelguSeries(){
        System.out.println("\nTelugu Series:\n");
        for(String s:teluguSeries)
			System.out.println(s);
}
static void getTamilSeries(){
        System.out.println("\nTamil Series:\n");
        for(String s:tamilSeries)
			System.out.println(s);

}
}