class Supermarket {

   public static String[] searchBrandByProduct(String productName) {

      if(productName.equals("Rice")){
         String brands[]={
         "IndiaGate","Daawat","Kohinoor","Aashirvaad","Fortune",
         "Tilda","LalQilla","SriLalitha","24Mantra","OrganicTattva",
         "PatanjaliRice","ShaktiBhog","BBRoyal","RoyalBasmati",
         "KaveriRice","NagaRice","SonaMasuri","BPT","IR64",
         "PonnyRice","BrownRice","WhiteRice","PremiumBasmati",
         "ClassicRice","Rozana","Dubraj","JeeraRice","KolamRice",
         "SurtiKolam","HMT","IdliRice","SteamRice","RawRice",
         "GoldenRice","HealthyRice","DiamondRice","SuperRice"
         };
         return brands;
      }

      if(productName.equals("Oil")){
         String brands[]={
         "Fortune","Saffola","Gemini","Freedom","Sunpure",
         "Dhara","GoldWinner","NatureFresh","Engine",
         "PatanjaliOil","Sundrop","Emami","Oleev",
         "Figaro","Borges","24MantraOil","OrganicIndia",
         "CoconutOil","MustardOil","GroundnutOil",
         "SunflowerOil","RiceBranOil","SoyabeanOil",
         "PalmOil","TilOil","OliveOil","CanolaOil",
         "CornOil","HerbalOil","PremiumOil","HealthyOil",
         "RefinedOil","FilteredOil","PureOil",
         "LiteOil","HeartOil","SmartOil"
         };
         return brands;
      }

      if(productName.equals("Milk")){
         String brands[]={
         "Amul","Nandini","Heritage","MotherDairy",
         "Arokya","Dodla","Vijaya","MilkyMist",
         "Jersey","NestleMilk","Hatsun",
         "PatanjaliMilk","CountryDelight",
         "Akshayakalpa","Gokul","Sanchi",
         "Parag","Ananda","Namdhari",
         "FreshMilk","TonedMilk","FullCreamMilk",
         "SkimmedMilk","OrganicMilk","CowMilk",
         "BuffaloMilk","UHTMilk","PremiumMilk",
         "HealthyMilk","DailyMilk","SmartMilk",
         "PureMilk","GoldMilk","FarmMilk",
         "NaturalMilk","LiteMilk","SuperMilk"
         };
         return brands;
      }

      if(productName.equals("Tea")){
         String brands[]={
         "TataTea","RedLabel","BrookeBond","WaghBakri","SocietyTea",
         "3Roses","AVTTea","TajMahal","Tetley","Girnar",
         "OrganicIndiaTea","Lipton","Typhoo","Goodricke",
         "AssamTea","DarjeelingTea","NilgiriTea",
         "GreenTea","BlackTea","HerbalTea","MasalaTea",
         "LemonTea","TulsiTea","GingerTea","ElaichiTea",
         "PremiumTea","GoldTea","RoyalTea","NaturalTea",
         "FreshTea","HealthyTea","ClassicTea",
         "StrongTea","LiteTea","DailyTea",
         "SmartTea","SuperTea"
         };
         return brands;
      }

      if(productName.equals("Salt")){
         String brands[]={
         "TataSalt","AashirvaadSalt","Catch","CaptainCook","Annapurna",
         "PatanjaliSalt","SendhaSalt","BlackSalt","RockSalt",
         "IodizedSalt","SeaSalt","HimalayanSalt","OrganicSalt",
         "PureSalt","PremiumSalt","LiteSalt","SmartSalt",
         "HealthySalt","CrystalSalt","RefinedSalt","NaturalSalt",
         "FarmSalt","DesiSalt","TableSalt","FineSalt",
         "CoarseSalt","PinkSalt","LowSodiumSalt",
         "DoubleRefined","DailySalt","SuperSalt",
         "GoldSalt","DiamondSalt","FreshSalt",
         "StrongSalt","ClassicSalt","RoyalSalt"
         };
         return brands;
      }

      if(productName.equals("Sugar")){
         String brands[]={
         "Madhur","TrustSugar","Dhampure","ParrySugar","Balrampur",
         "PatanjaliSugar","OrganicSugar","BrownSugar","WhiteSugar",
         "RawSugar","RefinedSugar","SulphurlessSugar","DesiKhand",
         "PremiumSugar","HealthySugar","LiteSugar","SmartSugar",
         "NaturalSugar","FarmSugar","CrystalSugar","FineSugar",
         "CoarseSugar","GoldSugar","DiamondSugar","DailySugar",
         "SuperSugar","ClassicSugar","RoyalSugar","PureSugar",
         "SweetSugar","CaneSugar","LowCalSugar","OrganicKhand",
         "JaggeryPowder","BrownCrystal","SugarPlus","FreshSugar"
         };
         return brands;
      }

      

      if(productName.equals("Soap")){
         String brands[]={
         "Lux","Dove","Pears","Lifebuoy","Dettol",
         "Cinthol","Santoor","Hamam","Medimix",
         "MysoreSandal","GodrejNo1","Fiama",
         "PatanjaliSoap","Khadi","Chandrika",
         "Liril","Rexona","NeemSoap",
         "HerbalSoap","OrganicSoap","AloeSoap",
         "RoseSoap","LemonSoap","MintSoap",
         "PremiumSoap","ClassicSoap","GoldSoap",
         "SilverSoap","FreshSoap","HealthySoap",
         "PureSoap","DailySoap","SmartSoap",
         "StrongSoap","FamilySoap","BeautySoap",
         "CareSoap"
         };
         return brands;
      }

      if(productName.equals("Toothpaste")){
         String brands[]={
         "Colgate","Pepsodent","CloseUp","Sensodyne","DaburRed",
         "Meswak","Babool","Vicco","HimalayaToothpaste",
         "PatanjaliDantKanti","OralB","Anchor",
         "Promise","Ajanta","Cibaca",
         "PremiumToothpaste","ClassicToothpaste","GoldToothpaste",
         "SilverToothpaste","FreshToothpaste","HealthyToothpaste",
         "StrongTeeth","DailyCare","SmartCare",
         "NaturalToothpaste","OrganicToothpaste","HerbalToothpaste",
         "MintToothpaste","CloveToothpaste","SaltToothpaste",
         "CharcoalToothpaste","GelToothpaste","WhiteTeeth",
         "FamilyPack","KidsToothpaste","TotalCare",
         "CompleteCare"
         };
         return brands;
      }

      if(productName.equals("Biscuits")){
         String brands[]={
         "ParleG","GoodDay","MarieGold","HideAndSeek","Oreo",
         "Bourbon","Tiger","Krackjack","MilkBikis",
         "Sunfeast","MomMagic","Treat",
         "DarkFantasy","LittleHearts","Monaco",
         "PremiumBiscuits","ClassicBiscuits","GoldBiscuits",
         "CreamBiscuits","ChocolateBiscuits","ButterBiscuits",
         "JeeraBiscuits","SaltBiscuits","HealthyBiscuits",
         "OatsBiscuits","DigestiveBiscuits","SugarFreeBiscuits",
         "FamilyPack","KidsBiscuits","MiniBiscuits",
         "BigPack","DailyBiscuits","SmartBiscuits",
         "FreshBiscuits","LiteBiscuits","StrongBiscuits",
         "SuperBiscuits"
         };
         return brands;
      }

      if(productName.equals("Chocolate")){
         String brands[]={
         "DairyMilk","FiveStar","KitKat","Perk","Munch",
         "Snickers","Mars","Bounty","Galaxy",
         "FerreroRocher","Toblerone","Milkybar",
         "Hersheys","AmulChocolate","Lindt",
         "PremiumChocolate","ClassicChocolate","GoldChocolate",
         "DarkChocolate","MilkChocolate","WhiteChocolate",
         "FruitAndNut","AlmondChocolate","HazelnutChocolate",
         "CaramelChocolate","CrispyChocolate","WaferChocolate",
         "FamilyPack","MiniChocolate","BigChocolate",
         "KidsChocolate","HealthyChocolate","OrganicChocolate",
         "FreshChocolate","LiteChocolate","SmartChocolate",
         "SuperChocolate"
         };
         return brands;
      }

      if(productName.equals("Wheat")){
         String brands[]={
         "AashirvaadAtta","PillsburyAtta","FortuneAtta","AnnapurnaAtta","24MantraAtta",
         "OrganicTattvaAtta","PatanjaliAtta","NatureFreshAtta","BBRoyalAtta","ShaktiBhogAtta",
         "GoldenHarvest","HealthyWheat","FarmFreshAtta","ClassicAtta","PremiumAtta",
         "DesiAtta","ChakkiFresh","WholeWheat","MultigrainAtta","PureAtta",
         "NaturalAtta","DailyAtta","SmartAtta","LiteAtta","GoldAtta",
         "DiamondAtta","SuperAtta","FreshAtta","StrongAtta","RoyalAtta",
         "SelectAtta","FineAtta","QualityAtta","BestAtta","TopAtta",
         "SpecialAtta","HealthyGrain"
         };
         return brands;
      }

      if(productName.equals("Coffee")){
         String brands[]={
         "Bru","Nescafe","Continental","Sunrise","TataCoffee",
         "Levista","RageCoffee","CountryBean","SleepyOwl","BlueTokai",
         "Davidoff","Lavazza","StarbucksCoffee","FilterCoffee","InstantCoffee",
         "PremiumCoffee","ClassicCoffee","GoldCoffee","DarkRoast","MediumRoast",
         "LightRoast","StrongCoffee","LiteCoffee","DailyCoffee","SmartCoffee",
         "FreshCoffee","OrganicCoffee","ArabicaCoffee","RobustaCoffee","BlendCoffee",
         "ColdCoffee","HotCoffee","Cappuccino","Espresso","Mocha",
         "Latte","SuperCoffee"
         };
         return brands;
      }

      if(productName.equals("FaceCream")){
         String brands[]={
         "Ponds","Nivea","Lakme","Olay","Garnier",
         "HimalayaCream","LotusCream","Mamaearth","Biotique","ViccoCream",
         "FairAndLovely","GlowCream","HerbalCream","OrganicCream","AloeCream",
         "RoseCream","VitaminECream","NightCream","DayCream","SunCream",
         "MoistureCream","HydraCream","FreshCream","HealthyCream","GoldCream",
         "PremiumCream","ClassicCream","LiteCream","SmartCream","BeautyCream",
         "CareCream","NaturalCream","SoftCream","BrightCream","YouthCream",
         "SuperCream","RoyalCream"
         };
         return brands;
      }

      if(productName.equals("ToorDal")){
         String brands[]={
         "TataSampann","24MantraDal","OrganicTattvaDal","BBRoyalDal","AashirvaadDal",
         "FortuneDal","PatanjaliDal","NatureLand","PremiumDal","ClassicDal",
         "DesiDal","HealthyDal","FreshDal","SmartDal","LiteDal",
         "GoldDal","DiamondDal","RoyalDal","NaturalDal","FarmDal",
         "WholeDal","CleanDal","QualityDal","BestDal","TopDal",
         "SpecialDal","DailyDal","StrongDal","PureDal","SelectDal",
         "FineDal","SuperDal","OrganicDal","HomeDal","VillageDal",
         "GreenDal","YellowDal"
         };
         return brands;
      }
	  if(productName.equals("Shampoo")){
   String brands[]={
   "ClinicPlus","Sunsilk","DoveShampoo","Pantene","HeadAndShoulders",
   "Tresemme","Loreal","GarnierShampoo","HerbalEssence","HimalayaShampoo",
   "MamaearthShampoo","PatanjaliShampoo","BiotiqueShampoo","Indulekha","Meera",
   "PremiumShampoo","ClassicShampoo","GoldShampoo","SilverShampoo","FreshShampoo",
   "HealthyShampoo","StrongShampoo","LiteShampoo","DailyShampoo","SmartShampoo",
   "NaturalShampoo","OrganicShampoo","HerbalShampoo","AloeShampoo","OnionShampoo",
   "KeratinShampoo","ProteinShampoo","FamilyPackShampoo","KidsShampoo","CareShampoo",
   "SoftShampoo","SuperShampoo"
   };
   return brands;
}

if(productName.equals("Soap")){
   String brands[]={
   "Lux","Dove","Pears","Lifebuoy","Dettol",
   "Cinthol","Santoor","Hamam","Medimix","MysoreSandal",
   "GodrejNo1","Fiama","PatanjaliSoap","Khadi","Chandrika",
   "Liril","Rexona","NeemSoap","HerbalSoap","OrganicSoap",
   "AloeSoap","RoseSoap","LemonSoap","MintSoap","PremiumSoap",
   "ClassicSoap","GoldSoap","SilverSoap","FreshSoap","HealthySoap",
   "PureSoap","DailySoap","SmartSoap","StrongSoap","FamilySoap",
   "BeautySoap","CareSoap"
   };
   return brands;
}

if(productName.equals("Detergent")){
   String brands[]={
   "SurfExcel","Ariel","Tide","Rin","Wheel",
   "Ghadi","Nirma","Henko","Fena","MrWhite",
   "PremiumDetergent","ClassicDetergent","GoldDetergent","FreshDetergent","HealthyWash",
   "StrongWash","PowerWash","SmartWash","DailyWash","QuickWash",
   "ActiveWash","UltraWash","CleanWash","BrightWash","CareWash",
   "SoftWash","LiteWash","FamilyPackDetergent","SuperWash","RoyalWash",
   "SparkleWash","MagicWash","PerfectWash","BestWash","TopWash",
   "QualityWash","AdvanceWash"
   };
   return brands;
}

if(productName.equals("FaceWash")){
   String brands[]={
   "HimalayaFaceWash","GarnierFaceWash","PondsFaceWash","NiveaFaceWash","MamaearthFaceWash",
   "LotusFaceWash","BiotiqueFaceWash","LakmeFaceWash","OlayFaceWash","CleanAndClear",
   "PremiumFaceWash","ClassicFaceWash","GoldFaceWash","FreshFaceWash","HealthyFaceWash",
   "HerbalFaceWash","OrganicFaceWash","AloeFaceWash","NeemFaceWash","CharcoalFaceWash",
   "MintFaceWash","RoseFaceWash","LemonFaceWash","DailyFaceWash","SmartFaceWash",
   "LiteFaceWash","StrongFaceWash","BrightFaceWash","GlowFaceWash","SoftFaceWash",
   "CareFaceWash","BeautyFaceWash","NaturalFaceWash","SuperFaceWash","RoyalFaceWash",
   "FamilyFaceWash","KidsFaceWash"
   };
   return brands;
}

if(productName.equals("IceCream")){
   String brands[]={
   "AmulIceCream","KwalityWalls","ArunIceCream","Vadilal","MotherDairyIceCream",
   "CreamBell","Havmor","Naturals","BaskinRobbins","TopNtown",
   "PremiumIceCream","ClassicIceCream","GoldIceCream","ChocolateIceCream","VanillaIceCream",
   "StrawberryIceCream","MangoIceCream","ButterscotchIceCream","Kulfi","ConeIceCream",
   "CupIceCream","FamilyPackIceCream","MiniIceCream","BigIceCream","HealthyIceCream",
   "LiteIceCream","SmartIceCream","FreshIceCream","SuperIceCream","RoyalIceCream",
   "NutIceCream","FruitIceCream","CaramelIceCream","CrunchyIceCream","KidsIceCream",
   "DailyIceCream","SpecialIceCream"
   };
   return brands;
}

if(productName.equals("Bread")){
   String brands[]={
   "BritanniaBread","HarvestGold","ModernBread","EnglishOven","FreshoBread",
   "PremiumBread","ClassicBread","BrownBread","WhiteBread","MultigrainBread",
   "WholeWheatBread","SandwichBread","MilkBread","GarlicBread","FruitBread",
   "HealthyBread","LiteBread","SmartBread","DailyBread","FreshBread",
   "SoftBread","FamilyBread","MiniBread","BigBread","GoldBread",
   "RoyalBread","SuperBread","NaturalBread","OrganicBread","SweetBread",
   "SaltBread","ButterBread","CheeseBread","ToastBread","TopBread",
   "QualityBread","BestBread"
   };
   return brands;
}

if(productName.equals("Jam")){
   String brands[]={
   "KissanJam","MaproJam","MalaJam","BhuiraJam","UrbanPlatterJam",
   "PremiumJam","ClassicJam","MixedFruitJam","MangoJam","StrawberryJam",
   "PineappleJam","AppleJam","BlueberryJam","OrangeJam","GrapeJam",
   "HealthyJam","LiteJam","SmartJam","FreshJam","NaturalJam",
   "OrganicJam","SweetJam","FamilyJam","MiniJam","BigJam",
   "GoldJam","RoyalJam","SuperJam","DailyJam","TopJam",
   "QualityJam","BestJam","SpecialJam","KidsJam","CareJam",
   "SoftJam","FruitMixJam"
   };
   return brands;
}

if(productName.equals("Ketchup")){
   String brands[]={
   "KissanKetchup","MaggiKetchup","HeinzKetchup","DelMonte","Veeba",
   "PremiumKetchup","ClassicKetchup","TomatoKetchup","ChilliKetchup","GarlicKetchup",
   "HealthyKetchup","LiteKetchup","SmartKetchup","FreshKetchup","OrganicKetchup",
   "NaturalKetchup","SweetKetchup","SpicyKetchup","FamilyKetchup","MiniKetchup",
   "BigKetchup","GoldKetchup","RoyalKetchup","SuperKetchup","DailyKetchup",
   "QualityKetchup","BestKetchup","SpecialKetchup","CareKetchup","SoftKetchup",
   "KidsKetchup","TopKetchup","StrongKetchup","PureKetchup","RedKetchup",
   "HotKetchup","YummyKetchup"
   };
   return brands;
}

if(productName.equals("Pickle")){
   String brands[]={
   "PriyaPickle","AachiPickle","MotherRecipe","PatanjaliPickle","MTRPickle",
   "PremiumPickle","ClassicPickle","MangoPickle","LemonPickle","MixedPickle",
   "GarlicPickle","ChilliPickle","AmlaPickle","GingerPickle","CarrotPickle",
   "HealthyPickle","LitePickle","SmartPickle","FreshPickle","OrganicPickle",
   "NaturalPickle","SweetPickle","SpicyPickle","FamilyPickle","MiniPickle",
   "BigPickle","GoldPickle","RoyalPickle","SuperPickle","DailyPickle",
   "QualityPickle","BestPickle","SpecialPickle","CarePickle","HomePickle",
   "VillagePickle","TraditionalPickle"
   };
   return brands;
}

if(productName.equals("Honey")){
   String brands[]={
   "DaburHoney","PatanjaliHoney","SaffolaHoney","LionHoney","HimalayaHoney",
   "OrganicIndiaHoney","ZanduHoney","NatureNectar","PremiumHoney","ClassicHoney",
   "RawHoney","ForestHoney","WildHoney","PureHoney","NaturalHoney",
   "HealthyHoney","LiteHoney","SmartHoney","FreshHoney","OrganicHoney",
   "GoldHoney","RoyalHoney","SuperHoney","DailyHoney","QualityHoney",
   "BestHoney","SpecialHoney","CareHoney","SweetHoney","FarmHoney",
   "HillHoney","DesiHoney","StrongHoney","TopHoney","FineHoney",
   "ClearHoney","GoldenHoney"
   };
   return brands;
}

      
      return null;
   }
}
