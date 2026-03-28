class ProductRunner{
	public static void main(String[] arge){
		Product[] products = new Product[130];
		ProductStore productstore = new ProductStore(products);
		
		Product product1 = new Product("Mysorsandle","Bengaluru","01-25-2026",Type.SOAP,38,"Akasha GR",WarrentYears.FOUR,false,1,"India");
		productstore.save(product1);
		System.out.println("");
		
		Product product2 = new Product("Medimix","Chennai","02-03-2026",Type.SOAP,42,"Nagaprajwal",WarrentYears.THREE,false,2,"India");
		productstore.save(product2);
		System.out.println("");
		
		Product product3 = new Product("Santoor","Tumkur","02-16-2026",Type.SOAP,39,"Rahul",WarrentYears.ONE,false,3,"India");
		productstore.save(product3);
		System.out.println("");
		
		Product product4 = new Product("Lifebuoy","Haridwar","03-03-2026",Type.SOAP,40,"shanker",WarrentYears.TWO,false,4,"India");
		productstore.save(product4);
		System.out.println("");
		
		Product product5 = new Product("Gram flour","Chitradurga","03-21-2026",Type.SOAP,35,"Ravi",WarrentYears.TWO,false,5,"India");
		productstore.save(product5);
		System.out.println("");
		
		Product product6 = new Product("Dove","Gujarat","12-21-2025",Type.SOAP,45,"Prabu",WarrentYears.ONE,false,6,"India");
		productstore.save(product6);
		System.out.println("");
		
		Product product7 = new Product("Dettol","Himachal Pradesh","11-06-2025",Type.SOAP,41,"Chandra",WarrentYears.SIX,false,7,"India");
		productstore.save(product7);
		System.out.println("");
		
		Product product8 = new Product("Lux","Texsos","01-30-2026",Type.SOAP,41,"Baratha",WarrentYears.FIVE,false,8,"America");
		productstore.save(product8);
		System.out.println("");
		
		Product product9 = new Product("Himalaya Neem","Bengaluru","03-06-2026",Type.SOAP,36,"Guru",WarrentYears.THREE,false,9,"India");
		productstore.save(product9);
		System.out.println("");
		
		Product product10 = new Product("Hamam","Mumbai","02-18-2026",Type.SOAP,42,"Dronna",WarrentYears.THREE,false,10,"India");
		productstore.save(product10);
		System.out.println("");
		
		Product product11 = new Product("clinic plus","Bengaluru","03-19-2026",Type.SHAMPU,1,"Guru raj",WarrentYears.ONE,false,11,"India");
		productstore.save(product11);
		System.out.println("");
		
		Product product12 = new Product("AllClear","Mangaluru","01-10-2026",Type.SHAMPU,2,"Kumar",WarrentYears.TWO,false,12,"India");
		productstore.save(product12);
		System.out.println("");
		
		Product product13 = new Product("Motorola g60","Bengaluru","09-10-2025",Type.PHONE,25000,"mahesh",WarrentYears.TWO,false,13,"India");
		productstore.save(product13);
		System.out.println("");
		
		Product product14 = new Product("Motorola g60","Bengaluru","04-13-2025",Type.PHONE,25000,"mahesh",WarrentYears.TWO,false,14,"India");
		productstore.save(product14);
		System.out.println("");
		
		Product product15 = new Product("Apple","WashingTonDC","03-10-2024",Type.PHONE,80000,"Jon",WarrentYears.THREE,false,15,"America");
		productstore.save(product15);
		System.out.println("");
		
		Product product16 = new Product("Google Pixel","WashingTonDC","09-23-2025",Type.PHONE,60000,"Max",WarrentYears.SIX,false,16,"America");
		productstore.save(product16);
		System.out.println("");
		
		Product product17 = new Product("Samsung","korean","02-28-2025",Type.PHONE,74000,"Xin",WarrentYears.FOUR,false,17,"Korean");
		productstore.save(product17);
		System.out.println("");
		
		Product product18 = new Product("Redmi A4","Bejing","07-24-2025",Type.PHONE,12000,"xiu",WarrentYears.TWO,false,18,"China");
		productstore.save(product18);
		System.out.println("");
		
		Product product19 = new Product("Poco X8 Pro","karnataka","04-04-2025",Type.PHONE,18000,"Charan",WarrentYears.THREE,false,19,"INDIA");
		productstore.save(product19);
		System.out.println("");
		
		Product product20 = new Product("Oppo NARZO90","Chanai","03-08-2025",Type.PHONE,21000,"narayana",WarrentYears.FOUR,false,20,"INDIA");
		productstore.save(product20);
		System.out.println("");
		
		Product product21 = new Product("Dell 55150","Chanai","08-29-2025",Type.LAPTOP,78000,"Prasad",WarrentYears.ONE,false,21,"INDIA");
		productstore.save(product21);
		System.out.println("");
		
		Product product22 = new Product("HP","Dehli","01-07-2026",Type.LAPTOP,50000,"Harsha",WarrentYears.ONE,false,22,"INDIA");
		productstore.save(product22);
		System.out.println("");
		
		Product product23 = new Product("Lenovo thinkpad","pune","01-17-2026",Type.LAPTOP,73000,"ganesh",WarrentYears.TWO,false,23,"INDIA");
		productstore.save(product23);
		System.out.println("");
		
		Product product24 = new Product("Apple Mac","uttar pradesh","01-22-2026",Type.LAPTOP,150000,"verash",WarrentYears.FOUR,false,24,"INDIA");
		productstore.save(product24);
		System.out.println("");
		
		Product product25 = new Product("ASUS Vivobook","Andra pradesh","02-22-2026",Type.LAPTOP,80000,"Manogna",WarrentYears.FIVE,false,25,"INDIA");
		productstore.save(product25);
		System.out.println("");
		
		Product product26 = new Product("MSI Thin 15","Madya pradesh","02-05-2026",Type.LAPTOP,46000,"Arfath",WarrentYears.ONE,false,26,"INDIA");
		productstore.save(product26);
		System.out.println("");
		
		Product product27 = new Product("HP 15-fd","Maharastra","02-25-2026",Type.LAPTOP,66000,"Ramash",WarrentYears.THREE,false,27,"INDIA");
		productstore.save(product27);
		System.out.println("");
		
		Product product28 = new Product("Acer i5","Maharastra","02-11-2026",Type.LAPTOP,55000,"Sagar",WarrentYears.THREE,false,28,"INDIA");
		productstore.save(product28);
		System.out.println("");
		
		Product product29 = new Product("Samsung GalaxyBook","Chanai","02-11-2026",Type.LAPTOP,96000,"brabu",WarrentYears.FOUR,false,29,"INDIA");
		productstore.save(product29);
		System.out.println("");
		
		Product product30 = new Product("Dell XPS13","Mumbai","02-18-2026",Type.LAPTOP,72000,"ram",WarrentYears.THREE,false,30,"INDIA");
		productstore.save(product30);
		System.out.println("");
		
		Product product31 = new Product("Maruti Suzuki Alto K10","Hariyana","02-12-2025",Type.CAR,500000,"Gopal",WarrentYears.THREE,false,31,"INDIA");
		System.out.println("");
		
		Product product32 = new Product("Maruti Suzuki Wagon R","Hariyana","08-23-2025",Type.CAR,600000,"Gopal",WarrentYears.THREE,false,32,"INDIA");
		productstore.save(product32);
		System.out.println("");
		
		Product product33 = new Product("Tata Tiago","Gujarath","09-01-2025",Type.CAR,700000,"Sanjay",WarrentYears.THREE,false,33,"INDIA");
		productstore.save(product33);
		System.out.println("");
		
		Product product34 = new Product("Tata Punch","Gujarath","09-10-2025",Type.CAR,1000000,"Sanjay",WarrentYears.THREE,false,34,"INDIA");
		productstore.save(product34);
		System.out.println("");
		
		Product product35 = new Product("Renault Kiger","Chanai","10-22-2025",Type.CAR,900000,"pavan",WarrentYears.FOUR,false,35,"INDIA");
		productstore.save(product35);
		System.out.println("");
		
		Product product36 = new Product("Renault Kiger","Chanai","10-22-2025",Type.CAR,900000,"pavan",WarrentYears.FOUR,false,36,"INDIA");
		productstore.save(product36);
		System.out.println("");
		
		Product product37 = new Product("Maruti Suzuki Swift","Hariyana","04-29-2025",Type.CAR,800000,"pavan",WarrentYears.THREE,false,37,"INDIA");
		productstore.save(product37);
		System.out.println("");
		
		Product product38 = new Product("Hyundai Exter","Tamil Nadu","07-03-2025",Type.CAR,900000,"Ganaraj",WarrentYears.ONE,false,38,"INDIA");
		productstore.save(product38);
		System.out.println("");
		
		Product product39 = new Product("Maruti Suzuki Baleno","Gujarat","07-28-2025",Type.CAR,700000,"Hemanth",WarrentYears.ONE,false,39,"INDIA");
		productstore.save(product39);
		System.out.println("");
		
		Product product40 = new Product("Tata Nexon","Pune","04-16-2025",Type.CAR,1400000,"Hemanth",WarrentYears.THREE,false,40,"INDIA");
		productstore.save(product40);
		System.out.println("");
		
		Product product41 = new Product("Mahindra Bolero","Maharastra","04-25-2025",Type.CAR,700000,"suraj",WarrentYears.THREE,false,41,"INDIA");
		productstore.save(product41);
		System.out.println("");
		
		Product product42 = new Product("Maruti Suzuki Brezza","Haryana","11-26-2025",Type.CAR,1300000,"surya",WarrentYears.FOUR,false,42,"INDIA");
		productstore.save(product42);
		System.out.println("");
		
		Product product43 = new Product("Mahindra Thar","Maharastra","12-02-2025",Type.CAR,1700000,"varada",WarrentYears.FOUR,false,43,"INDIA");
		productstore.save(product43);
		System.out.println("");
		
		Product product44 = new Product("Renault Duster","Gujarath","12-27-2025",Type.CAR,1800000,"veerash",WarrentYears.FOUR,false,44,"INDIA");
		productstore.save(product44);
		System.out.println("");
		
		Product product45 = new Product("Hyundai Creta","Tamil nadu","12-03-2025",Type.CAR,2000000,"maya",WarrentYears.SIX,false,45,"INDIA");
		productstore.save(product45);
		System.out.println("");
		
		Product product46 = new Product("Kia Seltos","Andhra Pradesh","12-17-2025",Type.CAR,2100000,"sam",WarrentYears.SIX,false,46,"INDIA");
		productstore.save(product46);
		System.out.println("");
		
		Product product47 = new Product("Toyota Urban"," Karnataka","01-17-2025",Type.CAR,1900000,"Praveen",WarrentYears.THREE,false,47,"INDIA");
		productstore.save(product47);
		System.out.println("");
		
		Product product48 = new Product("Skoda Kushaq"," Maharastra","05-23-2025",Type.CAR,1800000,"Ramu",WarrentYears.ONE,false,48,"INDIA");
		productstore.save(product48);
		System.out.println("");
		
		Product product49 = new Product("Mahindra Scorpio N"," Maharastra","04-14-2025",Type.CAR,1300000,"Praveen",WarrentYears.THREE,false,49,"INDIA");
		productstore.save(product49);
		System.out.println("");
		
		Product product50 = new Product("Mahindra XUV700"," Karnataka","06-15-2025",Type.CAR,1300000,"Praveen",WarrentYears.THREE,false,50,"INDIA");
		productstore.save(product50);
		
		//next 51
		System.out.println("");
		
		Product product51 = new Product("Hero Splendor Plus"," Karnataka","06-19-2025",Type.BIKE,73000,"Praveen",WarrentYears.ONE,false,51,"INDIA");
		productstore.save(product51);
		System.out.println("");
		
		Product product52 = new Product("TVS Raider 125"," Karnataka","04-21-2025",Type.BIKE,85000,"Kiran",WarrentYears.TWO,false,52,"INDIA");
		productstore.save(product52);
		System.out.println("");
		
		Product product53 = new Product("Honda SP 125"," Karnataka","03-03-2025",Type.BIKE,80000,"manog",WarrentYears.THREE,false,53,"INDIA");
		productstore.save(product53);
		System.out.println("");
		
		Product product54 = new Product("Hero Xtreme 125R"," Karnataka","07-30-2025",Type.BIKE,130000,"malapa",WarrentYears.TWO,false,54,"INDIA");
		productstore.save(product54);
		System.out.println("");
		
		Product product55 = new Product("Bajaj Pulsar N160"," Karnataka","09-12-2025",Type.BIKE,160000,"virapa",WarrentYears.THREE,false,55,"INDIA");
		productstore.save(product55);
		System.out.println("");
		
		Product product56 = new Product("TVS Apache RTR"," Karnataka","11-15-2025",Type.BIKE,1300000,"Rangapa",WarrentYears.THREE,false,56,"INDIA");
		productstore.save(product56);
		System.out.println("");
		
		Product product57 = new Product("Mahindra XUV700"," Karnataka","11-27-2025",Type.BIKE,116000,"varun",WarrentYears.ONE,false,57,"INDIA");
		productstore.save(product57);
		System.out.println("");
		
		Product product58 = new Product("Yamaha MT 15 V2"," Karnataka","06-15-2025",Type.BIKE,155000,"Sohil",WarrentYears.THREE,false,58,"INDIA");
		productstore.save(product58);
		System.out.println("");
		
		Product product59 = new Product("Royal Enfield Classic"," Karnataka","06-15-2025",Type.BIKE,180000,"prabakara",WarrentYears.THREE,false,59,"INDIA");
		productstore.save(product59);
		System.out.println("");
		
		Product product60 = new Product("Bajaj Pulsar NS400Z"," Karnataka","06-15-2025",Type.BIKE,190000,"Salman",WarrentYears.THREE,false,60,"INDIA");
		productstore.save(product60);
		System.out.println("");
		
		Product product61 = new Product("Royal Enfield Guerrilla"," Karnataka","08-08-2025",Type.BIKE,250000,"sameer",WarrentYears.THREE,false,61,"INDIA");
		productstore.save(product61);
		System.out.println("");
		
		Product product62 = new Product("KTM Duke 390"," Karnataka","07-11-2025",Type.BIKE,290000,"Keshav",WarrentYears.THREE,false,62,"INDIA");
		productstore.save(product62);
		System.out.println("");
		
		Product product63 = new Product("Kawasaki Ninja"," Karnataka","12-25-2025",Type.BIKE,200000,"Sharath",WarrentYears.FIVE,false,63,"India");
		productstore.save(product63);
		System.out.println("");
		
		Product product64 = new Product("Dell KM3322W"," Karnataka","12-30-2025",Type.KEYBOARD,700,"Sanjana",WarrentYears.ONE,false,64,"India");
		productstore.save(product64);
		System.out.println("");
		
		Product product65 = new Product("Rapoo E9050G"," Karnataka","01-03-2025",Type.KEYBOARD,2500,"naga",WarrentYears.ONE,false,65,"India");
		productstore.save(product65);
		System.out.println("");
		
		Product product66 = new Product("TVS Gold Mechanical"," Karnataka","06-28-2025",Type.KEYBOARD,2400,"Prabu",WarrentYears.ONE,false,66,"India");
		productstore.save(product66);
		System.out.println("");
		
		Product product67 = new Product("HP Keyboard Mouse"," Karnataka","03-22-2025",Type.KEYBOARD,1200,"Raghu",WarrentYears.ONE,false,67,"India");
		productstore.save(product67);
		System.out.println("");
		
		Product product68 = new Product("Logitech Desktop"," Karnataka","04-29-2025",Type.KEYBOARD,1300,"Navin",WarrentYears.ONE,false,68,"India");
		productstore.save(product68);
		System.out.println("");
		
		Product product69 = new Product("Zebronics Zeb"," Karnataka","09-03-2025",Type.KEYBOARD,400,"redy",WarrentYears.ONE,false,69,"India");
		productstore.save(product69);
		System.out.println("");
		
		Product product70 = new Product("Fingers Mini"," Karnataka","02-08-2025",Type.KEYBOARD,650,"Sharana",WarrentYears.ONE,false,70,"India");
		productstore.save(product70);
		System.out.println("");
		
		Product product71 = new Product("ProDot USB Keyboard"," Karnataka","05-17-2025",Type.KEYBOARD,1220,"Hanuman",WarrentYears.ONE,false,71,"India");
		productstore.save(product71);
		System.out.println("");
		
		Product product72 = new Product("Acer Slim Wireless Kbd"," Karnataka","06-19-2025",Type.KEYBOARD,2000,"Uaday",WarrentYears.ONE,false,72,"India");
		productstore.save(product72);
		System.out.println("");
		
		Product product73 = new Product("Enter Easyclick USB Kbd"," Karnataka","06-23-2025",Type.KEYBOARD,110,"Banti",WarrentYears.ONE,false,73,"India");
		productstore.save(product73);
		System.out.println("");
		
		Product product74 = new Product("Logitech M90"," Karnataka","07-09-2025",Type.MOUSE,300,"Surya",WarrentYears.ONE,false,74,"India");
		productstore.save(product74);
		System.out.println("");
		
		Product product75 = new Product("HP X1000"," Karnataka","07-30-2025",Type.MOUSE,350,"Surya",WarrentYears.ONE,false,75,"India");
		productstore.save(product75);
		System.out.println("");
		
		Product product76 = new Product("Dell MS116"," Karnataka","04-09-2025",Type.MOUSE,590,"Surya",WarrentYears.ONE,false,76,"India");
		productstore.save(product76);
		System.out.println("");
		
		Product product77 = new Product("Zebronics Zeb"," Karnataka","07-13-2025",Type.MOUSE,450,"Surya",WarrentYears.ONE,false,77,"India");
		productstore.save(product77);
		System.out.println("");
		
		Product product78 = new Product("Logitech M171"," Karnataka","09-09-2025",Type.MOUSE,380,"Surya",WarrentYears.ONE,false,78,"India");
		productstore.save(product78);
		System.out.println("");
		
		Product product79 = new Product("Portronics Toad 27"," Karnataka","09-24-2025",Type.MOUSE,500,"Surya",WarrentYears.ONE,false,79,"India");
		productstore.save(product79);
		System.out.println("");
		
		Product product80 = new Product("Fingers RGB"," Karnataka","07-21-2025",Type.MOUSE,600,"Surya",WarrentYears.ONE,false,80,"India");
		productstore.save(product80);
		System.out.println("");
		
		Product product81 = new Product("Alphonso Mango"," Karnataka","01-23-2026",Type.FRUITS,180,"Manikanta",WarrentYears.ONE,false,81,"India");
		productstore.save(product81);
		System.out.println("");
		
		Product product82 = new Product("Avocado"," Karnataka","02-26-2026",Type.FRUITS,159,"Manikanta",WarrentYears.ONE,false,82,"India");
		productstore.save(product82);
		System.out.println("");
		
		Product product83 = new Product("Red Dragon Fruit"," Karnataka","01-08-2026",Type.FRUITS,250,"Manikanta",WarrentYears.ONE,false,83,"India");
		productstore.save(product83);
		System.out.println("");
		
		Product product84 = new Product("Pomegranate"," Karnataka","01-07-2026",Type.FRUITS,200,"Manikanta",WarrentYears.ONE,false,84,"India");
		productstore.save(product84);
		System.out.println("");
		
		Product product85 = new Product("Himachali Apple"," Karnataka","01-02-2026",Type.FRUITS,155,"Manikanta",WarrentYears.ONE,false,85,"India");
		productstore.save(product85);
		System.out.println("");
		
		Product product86 = new Product("Kesar Mango"," Karnataka","01-29-2026",Type.FRUITS,180,"Manikanta",WarrentYears.ONE,false,86,"India");
		productstore.save(product86);
		System.out.println("");
		
		Product product87 = new Product("Cavendish Banana"," Karnataka","01-27-2026",Type.FRUITS,60,"Manikanta",WarrentYears.ONE,false,87,"India");
		productstore.save(product80);
		System.out.println("");
		
		Product product88 = new Product("Taiwan Pink Guava"," Karnataka","01-17-2026",Type.FRUITS,50,"Manikanta",WarrentYears.ONE,false,88,"India");
		productstore.save(product88);
		System.out.println("");
		
		Product product89 = new Product("Papaya"," Karnataka","01-26-2026",Type.FRUITS,25,"Manikanta",WarrentYears.ONE,false,89,"India");
		productstore.save(product89);
		System.out.println("");
		
		Product product90 = new Product("Soursop"," Karnataka","02-21-2026",Type.FRUITS,350,"Manikanta",WarrentYears.ONE,false,90,"India");
		productstore.save(product90);
		System.out.println("");
		
		Product product91 = new Product("Pineapple"," Karnataka","01-23-2026",Type.FRUITS,30,"Manikanta",WarrentYears.ONE,false,91,"India");
		productstore.save(product91);
		System.out.println("");
		
		Product product92 = new Product("Fresh Passion Fruit"," Karnataka","03-21-2026",Type.FRUITS,80,"Manikanta",WarrentYears.ONE,false,92,"India");
		productstore.save(product92);
		System.out.println("");
		
		Product product93 = new Product("Tomato"," Karnataka","01-13-2026",Type.VEGETABLES,40,"Shanbu",WarrentYears.ONE,false,93,"India");
		productstore.save(product93);
		System.out.println("");
		
		Product product94 = new Product("Onion"," Karnataka","03-02-2026",Type.VEGETABLES,20,"Shanbu",WarrentYears.ONE,false,94,"India");
		productstore.save(product94);
		System.out.println("");
		
		Product product95 = new Product("Potato"," Karnataka","01-02-2026",Type.VEGETABLES,50,"Shanbu",WarrentYears.ONE,false,95,"India");
		productstore.save(product95);
		System.out.println("");
		
		Product product96 = new Product("Broccoli "," Karnataka","02-09-2026",Type.VEGETABLES,60,"Shanbu",WarrentYears.ONE,false,96,"India");
		productstore.save(product96);
		System.out.println("");
		
		Product product97 = new Product("Ginger"," Karnataka","02-10-2026",Type.VEGETABLES,70,"Shanbu",WarrentYears.ONE,false,97,"India");
		productstore.save(product97);
		System.out.println("");
		
		Product product98 = new Product("Chilli"," Karnataka","03-11-2026",Type.VEGETABLES,80,"Shanbu",WarrentYears.ONE,false,98,"India");
		productstore.save(product98);
		System.out.println("");
		
		Product product99 = new Product("Corn"," Karnataka","02-22-2026",Type.VEGETABLES,50,"Shanbu",WarrentYears.ONE,false,99,"India");
		productstore.save(product99);
		System.out.println("");
		
		Product product100 = new Product("Capsicum"," Karnataka","01-29-2026",Type.VEGETABLES,40,"Shanbu",WarrentYears.ONE,false,100,"India");
		productstore.save(product100);
		System.out.println("");
		
		Product product101 = new Product("Garlic "," Karnataka","03-26-2026",Type.VEGETABLES,80,"Shanbu",WarrentYears.ONE,false,101,"India");
		productstore.save(product101);
		System.out.println("");
		
		Product product102 = new Product("Carrot "," Karnataka","03-01-2026",Type.VEGETABLES,60,"Shanbu",WarrentYears.ONE,false,102,"India");
		productstore.save(product102);
		System.out.println("");
		
		Product product103 = new Product("Drumstick"," Karnataka","03-22-2026",Type.VEGETABLES,120,"Shanbu",WarrentYears.ONE,false,103,"India");
		productstore.save(product103);
		System.out.println("");
		
		Product product104 = new Product("Bitter Gourd"," Karnataka","01-03-2026",Type.VEGETABLES,70,"Shanbu",WarrentYears.ONE,false,104,"India");
		productstore.save(product104);
		System.out.println("");
		
		Product product105 = new Product("Kale "," Karnataka","01-25-2026",Type.VEGETABLES,150,"Shanbu",WarrentYears.ONE,false,105,"India");
		productstore.save(product105);
		System.out.println("");
		
		Product product106 = new Product("Leeks"," Karnataka","02-29-2026",Type.VEGETABLES,30,"Shanbu",WarrentYears.ONE,false,106,"India");
		productstore.save(product106);
		System.out.println("");
		
		Product product107 = new Product("Mushrooms "," Karnataka","02-27-2026",Type.VEGETABLES,200,"Shanbu",WarrentYears.ONE,false,107,"India");
		productstore.save(product107);
		System.out.println("");
		
		Product product108 = new Product("Amla"," Karnataka","01-27-2026",Type.VEGETABLES,114,"Shanbu",WarrentYears.ONE,false,108,"India");
		productstore.save(product108);
		System.out.println("");
		
		Product product109 = new Product("Ash gourd"," Karnataka","02-29-2026",Type.VEGETABLES,28,"Shanbu",WarrentYears.ONE,false,109,"India");
		productstore.save(product109);
		System.out.println("");
		
		Product product110 = new Product("Baby Corn"," Karnataka","01-12-2026",Type.VEGETABLES,35,"Shanbu",WarrentYears.ONE,false,110,"India");
		productstore.save(product110);
		System.out.println("");
		
		Product product111 = new Product("Canon EOS 1500D"," Karnataka","01-12-2026",Type.CAMERA,35000,"Kiran",WarrentYears.ONE,false,111,"India");
		productstore.save(product111);
		System.out.println("");
		
		Product product112 = new Product("Canon EOS 90D"," Karnataka","01-12-2026",Type.CAMERA,120000,"Kiran",WarrentYears.ONE,false,112,"India");
		productstore.save(product112);
		System.out.println("");
		
		Product product113 = new Product("Nikon D3500"," Karnataka","01-12-2026",Type.CAMERA,40000,"Kiran",WarrentYears.ONE,false,113,"India");
		productstore.save(product113);
		System.out.println("");
		
		Product product114 = new Product("Nikon D5600"," Karnataka","01-12-2026",Type.CAMERA,60000,"Kiran",WarrentYears.ONE,false,114,"India");
		productstore.save(product114);
		System.out.println("");
		
		Product product115 = new Product("Nikon D7500"," Karnataka","01-12-2026",Type.CAMERA,95000,"Kiran",WarrentYears.ONE,false,115,"India");
		productstore.save(product115);
		System.out.println("");
		
		Product product116 = new Product("Sony Alpha A6000"," Karnataka","01-12-2026",Type.CAMERA,60000,"Kiran",WarrentYears.ONE,false,116,"India");
		productstore.save(product116);
		System.out.println("");
		
		Product product117 = new Product("Sony Alpha A6400"," Karnataka","01-12-2026",Type.CAMERA,85000,"Kiran",WarrentYears.ONE,false,117,"India");
		productstore.save(product117);
		System.out.println("");
		
		Product product118 = new Product("Sony Alpha A7 III"," Karnataka","01-12-2026",Type.CAMERA,160000,"Kiran",WarrentYears.ONE,false,118,"India");
		productstore.save(product118);
		System.out.println("");
		
		Product product119 = new Product("Sony Alpha A7 IV"," Karnataka","01-12-2026",Type.CAMERA,220000,"Kiran",WarrentYears.ONE,false,119,"India");
		productstore.save(product119);
		System.out.println("");
		
		Product product120 = new Product("Fujifilm X-T200"," Karnataka","01-12-2026",Type.CAMERA,65000,"Kiran",WarrentYears.ONE,false,120,"India");
		productstore.save(product120);
		System.out.println("");
		
		Product product121 = new Product("Fujifilm X-T4"," Karnataka","01-12-2026",Type.CAMERA,170000,"Kiran",WarrentYears.ONE,false,121,"India");
		productstore.save(product121);
		System.out.println("");
		
		Product product122 = new Product("Fujifilm X-S10"," Karnataka","01-12-2026",Type.CAMERA,100000,"Kiran",WarrentYears.ONE,false,122,"India");
		productstore.save(product122);
		System.out.println("");
		
		Product product123 = new Product("Panasonic Lumix G7"," Karnataka","01-12-2026",Type.CAMERA,50000,"Kiran",WarrentYears.ONE,false,123,"India");
		productstore.save(product123);
		System.out.println("");
		
		Product product124 = new Product("Canon EOS R50"," Karnataka","01-12-2026",Type.CAMERA,75000,"Kiran",WarrentYears.ONE,false,124,"India");
		productstore.save(product124);
		System.out.println("");
		
		Product product125 = new Product("Olympus OM-D E-M10"," Karnataka","01-12-2026",Type.CAMERA,70000,"Kiran",WarrentYears.ONE,false,125,"India");
		productstore.save(product125);
		System.out.println("");
		
		Product product126 = new Product("Nikon Z50"," Karnataka","01-12-2026",Type.CAMERA,80000,"Kiran",WarrentYears.ONE,false,126,"India");
		productstore.save(product126);
		System.out.println("");
		
		Product product127 = new Product("Sony ZV-1"," Karnataka","01-12-2026",Type.CAMERA,65000,"Kiran",WarrentYears.ONE,false,127,"India");
		productstore.save(product127);
		System.out.println("");
		
		Product product128 = new Product("Leica Q2"," Karnataka","01-12-2026",Type.CAMERA,5000000,"Kiran",WarrentYears.ONE,false,128,"India");
		productstore.save(product128);
		
		
		

		
		
		
		
		System.out.println("======================================================================================");
		System.out.println("");
		
		
		
		//store at time 10 array
		
		
		Product[] products1 = new Product[10];
		products1[0] = new Product("T-shirt","Mumbai","02-18-2026",Type.CLOTH,250,"Dronna Guru",WarrentYears.THREE,false,11,"India");
		products1[1] = new Product("Jaket","Bengaluru","03-06-2026",Type.CLOTH,1200,"Bhargava",WarrentYears.FOUR,false,12,"India");
		products1[2] = new Product("shirts","Tumkur","14-06-2025",Type.CLOTH,430,"Ramya",WarrentYears.SIX,false,13,"India");
		products1[3] = new Product("jeans","Mumbai","19-12-2025",Type.CLOTH,750,"Raghu",WarrentYears.TWO,false,14,"India");
		products1[4] = new Product("blazer","Bengaluru","24-02-2026",Type.CLOTH,1500,"Pavithra",WarrentYears.TWO,false,15,"India");
		products1[5] = new Product("Pants","Mysor","17-12-2025",Type.CLOTH,900,"Ganga",WarrentYears.THREE,false,16,"India");
		products1[6] = new Product("Sarees","Molkalmuru","25-03-2026",Type.CLOTH,10000,"Rajanna",WarrentYears.SIX,false,17,"India");
		products1[7] = new Product("formals","Bengaluru","02-03-2026",Type.CLOTH,1100,"Navin",WarrentYears.FOUR,false,18,"India");
		products1[8] = new Product("Kurtas","Dharvada","01-27-2026",Type.CLOTH,1800,"Govinda",WarrentYears.ONE,false,19,"India");
		products1[9] = new Product("shorts","Chitradurga","09-12-2025",Type.CLOTH,200,"Harish",WarrentYears.THREE,false,20,"India");
		ProductStore productstore1 = new ProductStore(products1);
		productstore1.save(products1[0]);
		productstore1.save(products1[1]);
		productstore1.save(products1[2]);
		productstore1.save(products1[3]);
		productstore1.save(products1[4]);
		productstore1.save(products1[5]);
		productstore1.save(products1[6]);
		productstore1.save(products1[7]);
		productstore1.save(products1[8]);
		productstore1.save(products1[9]);
       //productstore1.save(products1[0],products1[1],products1[2],products1[3],products1[4],products1[5],products1[6],products1[7],products1[8],products1[9]);
		System.out.println("======================================================================================");
		System.out.println("");
		
		//search oparation using id
		
		boolean ref = productstore.search(8);
		System.out.println("The item is found:"+ref);
		System.out.println("");
		
		//search oparation is done using id and name
		
		boolean ref1 = productstore.search("Gram flour",5);
		System.out.println("The item is found:"+ref1);
		System.out.println("");
		
		//search oparation is done using id and name and originofCountry
		
		boolean ref2 = productstore.search("Lux",8,"America");
		System.out.println("The item is found:"+ref2);
		System.out.println("");
		System.out.println("======================================================================================");
		
		
		
		
		//display method using 
		
		productstore.display();
		System.out.println("======================================================================================");
		
		
		//get all info by country
		
		productstore.getAllOriginCountry("America");
		System.out.println("======================================================================================");
		
		
		//get all info by warrantyYears
		
		productstore.getAllByWarrantyYears(WarrentYears.TWO);
		System.out.println("======================================================================================");
		
		
		// get all info by type
		
		productstore.getAllByType(Type.SHAMPU);
		System.out.println("======================================================================================");
		
		
		// check WarrantyExpired By UniqueId
		
		boolean ref3 = productstore.checkWarrantyExpiredByUniqueId(120);
		System.out.println("The WarrantyExpired:"+ref3);
		
		
	}
}