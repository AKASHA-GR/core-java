//Write a class Univercity, declare method to getCoursesByCollegeName , check all govt and private colleges in karnataka: 60 min

class Univercity{
	public static String[] getCoursesByCollegeName(String name){
		System.out.println("The name of the College:"+name);
		
		if(name == null){
			System.out.println("The college name is not defined.");
			return null;
		}
		
		if(name == "Government Engineering College,Challakere"){
			String[] clk1 = {"Computer Science Engineering","Artificial Inteligence","Automobile"};
			return clk1;
		}
		
		if(name == "Dr.Ambedkar Institute of Technology"){
			String[] clk2 = {"CSE","ECE","EEE","ISE","CE"};
			return clk2;
		}
		
		if(name == "Government Engineering College,Haveri"){
			String[] clk3 = {"civil Engineering","Computer Science and Engineering","Electronics and Communication Engineering","Mechanical Engineering"};
			return clk3;
		}
		
		if(name == "University Visvervaraya College of Engineering,Bengalure"){
			String[] clk4 = {"Civil Engineering", "Mechanical Engineering", "Computer Science and Engineering", "Information Science and Engineering","Electronics Engineering","Electronic and Communication Engineering","AI Engineering"};
			return clk4;
		}
		
		if(name == "Government Engineering College,Karwar"){
			String[] clk5 = {"Civil Engineering", "Computer Science and Engineering","Electronics and Communication Engineering","Mechanical Engineering"};
			return clk5;
		}
		
		if(name == "Government Engineering College,Hassan"){
			String[] clk6 = {"Civil", "Computer science and Engineering","Electronic and Communication","Machanical Engineering","AI&ML"};
			return clk6;
		}
		
		if(name == "Government Engineering College, Kushalnagar"){
			String[] clk7 = {"Civil","CSE","EEE","ECE","Mechanical"};
			return clk7;
		}
		
		if(name == "Government Engineering College,Mosale Hosahalli"){
			String[] clk8 = {"Civil", "CSE","EEE","ECE","Mechanical"};
			return clk8;
		}
		
		if(name == "Government engineering College,Raichur"){
			String[] clk9 = {"Civil", "CSE","EEE","ECE","Mechanical"};
			return clk9;
		}
		
		if(name == "Government engineering College,Ramangera"){
			String[] clk10 = {"Civil", "CSE", "ECE","Mechanical"};
			return clk10;
		}
		
		//10
		
		if(name == "Government Engineering College,Talakal"){
			String[] clk11 ={"Civil", "CSE","EEE","ECE","Mechanical"};
			return clk11;
		}
		
		if(name == "Government Engineering College,Gangavathi"){
			String[] clk12 ={"CIvil","CSE","EEE","ECE","Mechanical"};
			return clk12;
		}
		
		if(name == "Government Engineering College,Huvinahadagali"){
			String[] clk13 ={"Civil","CSE","ECE","Mechanical"};
			return clk13;
		}
		
		if(name == "Government Engineering COllege,Chamarajanagar"){
			String[] clk14 ={"Civil","CSE","ECE","EEE","Mechanical"};
			return clk14;
		}
		
		if(name == "Government Engineering College, Mandya"){
			String[] clk15 ={"Civil","Machanical","CSE"};
			return clk15;
		}
		
		if(name == "Government Engineering College-Bidar"){
			String[] clk16 ={"Civil","CSE","EEE","Machanical"};
			return clk16;
		}
		
		if(name == "Sri Krishnarajendra Silver Jubilee Technological Institute-Bengalur"){
			String[] clk17 ={"civil","CSE","EEE","ECE","Information Science"};
			return clk17;
		}
		
		if(name == "NIT Surathkal,Mangalure"){
			String[] clk18 ={"CSE","AI","ECE","Mechanical","MIning","Civil"};
			return clk18;
		}
		
		if(name == "IISc Bangalore"){
			String[] clk19 ={"B.Thech in Mathematics", "Computing"};
			return clk19;
		}
		
		if(name == "IIIT Bangalore"){
			String[] clk20 ={"CSE","ECE","DSE"};
			return clk20;
		}
		
		//20
		
		if(name == "Manipal Institute of tech"){
			String[] clk21 ={"CSE","AL&ML","Data Science","Aeronautical","ECE"};
			return clk21;
		}
		
		if(name == "RV College of Engineering,Bengalure"){
			String[] clk22 ={"CSE","Aerospace","CyberSecurity","ISE","AIML"};
			return clk22;
		}
		
		if(name == "M.S.Ramaiah Institure of Tech,Bengalure"){
			String[] clk23 ={"CSE","Biotecnology","Mechanical","ECE"};
			return clk23;
		}
		
		if(name == "BMS college of Engineering,Bengalur"){
			String[] clk24 ={"CSE","Electronics","ISE","Chemical"};
			return clk24;
		}
		
		if(name == "PES university,Bengalure"){
			String[] clk25 ={"CSE","AL","Electronics","ISE"};
			return clk25;
		}
		
		if(name == "Univercity  Visvasvaraya College of Engineering"){
			String[] clk26 ={"CSE","EEE","Mechanical","Civil"};
			return clk26;
		}
		
		if(name == "Dayananda Sagar College of Technology"){
			String[] clk27 ={"CSE","ISE","ECE","Mechanic Electronics"};
			return clk27;
		}
		
		if(name == "Siddaganga Institute of Technology"){
			String[] clk28 ={"CSE","Chemical","Nano Tech"};
			return clk28;
		}
		
		if(name == "Bangalore institute of Technology"){
			String[] clk29 ={"CSE","Civil","ECE"};
			return clk29;
		}
		
		if(name == "National institute of Technology"){
			String[] clk30 ={"civil","CSE","EEE","Mechanical"};
			return clk30;
		}
		
		//30
		
		if(name == "Nitte Meenakshi Institute of Technology"){
			String[] clk31 ={"CSE","ISE","ECE"};
			return clk31;
		}
		
		if(name == "New Horizon College of Engineering"){
			String[] clk32 ={"CSE","Machanical","AIML","Automobile"};
			return clk32;
		}
		
		if(name == "KLE Technological University"){
			String[] clk33 ={"CSE","Robotics","Ciivil","ECE"};
			return clk33;
		}
		
		if(name == "Jss Science and Technology University"){
			String[] clk34 ={"CSE","ECE","ISE","Polymer Science"};
			return clk34;
		}
		
		if(name == "CMR institute of Technology"){
			String[] clk35 ={"CSE","ECE","AIML","Data Science"};
			return clk35;
		}
		
		if(name == "Sir M. Vivvesvaraya Institute of Tech"){
			String[] clk36 ={"CSE","Boitechnology","ECE","Mechanical"};
			return clk36;
		}
		
		if(name == "RNS Institute of Technology"){
			String[] clk37 ={"CSE","ISE","AL&ML","ECE"};
			return clk37;
		}
		
		if(name == "SDM College of Engineering"){
			String[] clk38 ={"CSE","ECE","Machanical","ISE"};
			return clk38;
		}
		
		if(name == "NMAM Institue of Technology"){
			String[] clk39 ={"Robotics","ECE","CSE","Biotecnology"};
			return clk39;
		}
		
		if(name == "BNM Institute of Technology"){
			String[] clk40 ={"CSE","Machanical","ISE","EEE"};
			return clk40;
		}
		
		//40
		
		if(name == "Reva University"){
			String[] clk41 ={"CSE","Electronics","Bio-Electronic"};
			return clk41;
		}
		
		if(name == "Jain University"){
			String[] clk42 ={"ECE","CSE","AIML"};
			return clk42;
		}
		
		if(name == "Vidyavardaka College of Engineeering"){
			String[] clk43 ={"CSE","ISE","Mechanical"};
			return clk43;
		}
		
		if(name == "The oxford College of Engineering"){
			String[] clk44 ={"CSE","ISE","Mechanical"};
			return clk44;
		}
		
		if(name == "MVJ college of Engineering"){
			String[] clk45 ={"CSE","Aronautical","Chemical"};
			return clk45;
		}
		
		if(name == "Global Academy of Engineering"){
			String[] clk46 ={"civil" ,"AIML","Data Science","CSE"};
			return clk46;
		}
		
		if(name == "KLS gogte institute of Technology"){
			String[] clk47 ={"ECE","CSE","Aeronautical"};
			return clk47;
		}
		
		if(name == "Acharya Institue of Technology"){
			String[] clk48 ={"CSE","Mechanical","Mining"};
			return clk48;
		}
		
		if(name == "Christ University "){
			String[] clk49 ={"CSE","ECE","Robotics"};
			return clk49;
		}
		
		if(name == "Alliance University"){
			String[] clk50 ={"CSE", "Aerospace", "ECE", "Mechanical"};
			return clk50;
		}
		
		//50
		
		if(name == "Presidency university"){
			String[] clk51 ={"CSE","Petroleum","ECE","Civil"};
			return clk51;
		}
		
		if(name == "Dayananda sagar Academy of Tech"){
			String[] clk52 ={"CSE","ISE","ECE"};
			return clk52;
		}
		
		if(name == "Cambridge institute of Technology"){
			String[] clk53 ={"CSE","ISE","ECE"};
			return clk53;
		}
		
		if(name == "DOn Bosco institute of Technology"){
			String[] clk54 ={"CSE","Mechanical","ECE"};
			return clk54;
		}
		
		if(name == "East point College of Technology"){
			String[] clk55 ={"CSE","Mechanical","Civil"};
			return clk55;
		}
		
		if(name == "SJC institute of Technology"){
			String[] clk56 ={"CSE","Aeronautical","ECE"};
			return clk56;
		}
		
		if(name == "Malanad College of Enginering"){
			String[] clk57 ={"CSE","EEE","Mechanical"};
			return clk57;
		}
		
		if(name == "HKE PDA college of Enginering"){
			String[] clk58 ={"CSE","EEE","Civil"};
			return clk58;
		}
		
		if(name == "Saptagiri College of Enginering"){
			String[] clk59 ={"ECE","CSE","Biotecnology"};
			return clk59;
		}
		
		if(name == "AMC Enginering college"){
			String[] clk60 ={"CSE","AIML","Machanical"};
			return clk60;
		}
		
		//60
		
		if(name == "Jawaharlal Nehru New College"){
			String[] clk61 ={"CSE","EEE","ISE"};
			return clk61;
		}
		
		if(name == "Basaveshwar Enginering College"){
			String[] clk62 ={"CSE","EEE"};
			return clk62;
		}
		
		if(name == "T.jahn institute of Technology"){
			String[] clk63 ={"CSE","ECE"};
			return clk63;
		}
		
		if(name == "Atria institute of college"){
			String[] clk64 ={"CSE","AIML","Civil"};
			return clk64;
		}
		
		if(name == "City COllege of Enginering"){
			String[] clk65 ={"CSE","ISE","ECE"};
			return clk65;
		}
		
		if(name == "GSSS institute of college"){
			String[] clk66 ={"CSE","ECE","iT"};
			return clk66;
		}
		
		if(name == "Bapuji institute of Enginering"){
			String[] clk67 ={"CSE","Chemical"};
			return clk67;
		}
		
		if(name == "KLE dr.m.s.SHeshgiri College"){
			String[] clk68 ={"CSE","ECE"};
			return clk68;
		}
		
		if(name == "Alva's institute of Enginering"){
			String[] clk69 ={"CSE","AI","Mechanical"};
			return clk69;
		}
		
		if(name == "Srinivas institute of Enginering"){
			String[] clk70 ={"CSE","ECE","Data Science"};
			return clk70;
		}
		
		//70
		
		if(name == "Canara Enginering of College"){
			String[] clk71 ={"CSE","ECE","ISE"};
			return clk71;
		}
		
		if(name == "St.Joseph Enginering COllege"){
			String[] clk72 ={"CSE","ECE","Mechanical"};
			return clk72;
		}
		
		if(name == "Sahyadri College of Enginering"){
			String[] clk73 ={"CSE","ECE","Data Science"};
			return clk73;
		}
		
		if(name == "Ballari institute of Technology"){
			String[] clk74 ={"CSE","ECE","AIML"};
			return clk74;
		}
		
		if(name == "Sambhram institute of College"){
			String[] clk75 ={"CSE","ECE","Civil"};
			return clk75;
		}
		
		if(name == "EastWest institute of College"){
			String[] clk76 ={"CSE","ISE","Mechanical"};
			return clk76;
		}
		
		if(name == "R.L. Jalappa institute of Technology"){
			String[] clk77 ={"CSE","ECE"};
			return clk77;
		}
		
		if(name == "HKBK College of Enginering"){
			String[] clk78 ={"CSE","ECE","ISE"};
			return clk78;
		}
		
		if(name == "Alpha college of Technology"){
			String[] clk79 ={"CSE","ISE","ECE"};
			return clk79;
		}
		
		if(name == "SJME institute of Technology"){
			String[] clk80 ={"CSE","Mechanical","Civil"};
			return clk80;
		}
		
		//80
		
		if(name == "Adichunchanagiri Institute of Tech"){
			String[] clk81 ={"CSE","ECE"};
			return clk81;
		}
		
		if(name == "Vivekananda Institute of Technology"){
			String[] clk82 ={"CSE","ISE","ECE"};
			return clk82;
		}
		
		if(name == "Vemana Institute of Technology"){
			String[] clk83 ={"CSE", "ECE", "Mechanical"};
			return clk83;
		}
		
		if(name == "BTL Institute of Technology"){
			String[] clk84 ={"CSE","ISE","ECE"};
			return clk84;
		}
		
		if(name == "RR Institute of Technology"){
			String[] clk85 ={"CSE","Machanical","civil"};
			return clk85;
		}
		
		if(name == "Sapthagiri institute of College"){
			String[] clk86 ={"CSE","Machanical","Civil"};
			return clk86;
		}
		
		if(name == "B.N.M Institute of Technology"){
			String[] clk87 ={"CSE","ISE","ECE"};
			return clk87;
		}
		
		if(name == "P.E.S. Institute of Technology"){
			String[] clk88 ={"CSE","ECE"};
			return clk88;
		}
		
		if(name == "S.T.J. Institute of Technology"){
			String[] clk89 ={"CSE","EEE"};
			return clk89;
		}
		
		if(name == "Jawaharlal Nehru College"){
			String[] clk90 ={"CSE","ECE","Mechanical"};
			return clk90;
		}
		
		//90
		
		if(name == "S.D.M. Institute of Tech"){
			String[] clk91 ={"CSE","ISE","ECE"};
			return clk91;
		}
		
		if(name == "Yenepoya Institute of Tech"){
			String[] clk92 ={"CSE","EEE","ECE"};
			return clk92;
		}
		
		if(name == "Angadi Institute of Technology"){
			String[] clk93 ={"CSE","Civil","ECE"};
			return clk93;
		}
		
		if(name == "Sha-Shib College of Engineering"){
			String[] clk94 ={"CSE","Aeronautical"};
			return clk94;
		}
		
		if(name == "M.S. Engineering College"){
			String[] clk95 ={"CSE", "ECE", "Mechanical"};
			return clk95;
		}
		
		if(name == "Impact College of Engineering"){
			String[] clk96 ={"CSE","Civil","ECE"};
			return clk96;
		}
		
		if(name == "SCT Institute of Technology"){
			String[] clk97 ={"CSE","Civil","ECE"};
			return clk97;
		}
		
		if(name == "Brindavan College of Engineering"){
			String[] clk98 ={"CSE","Civil","ISE"};
			return clk98;
		}
		
		if(name == "Gopalan College of Engineering"){
			String[] clk99 ={"CSE","Aeronautical","ECE"};
			return clk99;
		}
		
		if(name == "Jyothy Institute of Technology"){
			String[] clk100 ={"CSE","Civil","ECE"};
			return clk100;
		}
		
		//100
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return null;
	}
}