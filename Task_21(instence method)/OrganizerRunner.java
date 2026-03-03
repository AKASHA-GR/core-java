class OrganizerRunner {
    public static void main(String[] args) {

        Organizer organizer1 = new Organizer("Global Events","Corporate","Tech Summit",
                "ABC Events","India","Bangalore","Ravi Kumar",
                "ravi@abcevents.com","9876543210","Infosys",
                2010,150,200,1,9,5000000,800000,1500,2000000,1000);
        organizer1.display();
        System.out.println("");

        Organizer organizer2 = new Organizer("Star Planners","Wedding","Royal Wedding",
                "Star Pvt Ltd","India","Mysore","Anjali Sharma",
                "anjali@star.com","9876501234","Tanishq",
                2015,80,120,2,8,3000000,500000,2000,1500000,800);
        organizer2.display();
        System.out.println("");

        Organizer organizer3 = new Organizer("Youth Sports Org","Sports","State Cricket",
                "Sports Assoc","India","Chennai","Arun Das",
                "arun@sports.com","9123456780","Nike",
                2008,200,300,1,9,7000000,1000000,1000,3000000,2000);
        organizer3.display();
        System.out.println("");

        Organizer organizer4 = new Organizer("Cultural Crew","Cultural","Dance Fest",
                "Culture Club","India","Mumbai","Sneha Rao",
                "sneha@culture.com","9988776655","Sony",
                2012,120,150,3,8,4000000,600000,1200,1800000,1200);
        organizer4.display();
        System.out.println("");

        Organizer organizer5 = new Organizer("Edu Manage","Academic","Science Fair",
                "Edu Trust","India","Delhi","Kiran Patel",
                "kiran@edu.com","9012345678","BYJU'S",
                2018,60,90,4,7,2000000,300000,500,900000,600);
        organizer5.display();
        System.out.println("");

        Organizer organizer6 = new Organizer("Music Masters","Music","Live Concert",
                "Music World","USA","New York","John Smith",
                "john@music.com","8899001122","Pepsi",
                2005,250,400,1,10,10000000,2000000,3000,5000000,5000);
        organizer6.display();
        System.out.println("");

        Organizer organizer7 = new Organizer("Art Expo Org","Art","Art Exhibition",
                "Art Group","India","Hyderabad","Meera Joshi",
                "meera@art.com","9345678901","Asian Paints",
                2011,95,130,3,8,3500000,450000,800,1200000,900);
        organizer7.display();
        System.out.println("");

        Organizer organizer8 = new Organizer("City Marathon Org","Sports","City Marathon",
                "City Sports","India","Pune","Vikram Singh",
                "vikram@sports.com","9765432109","Adidas",
                2009,180,220,2,9,6000000,900000,700,2500000,3000);
        organizer8.display();
        System.out.println("");

        Organizer organizer9 = new Organizer("Tech Innovators","Tech","Hackathon",
                "Tech Corp","USA","San Francisco","Emily Clark",
                "emily@tech.com","8877665544","Google",
                2016,110,170,1,9,8000000,1500000,2500,4000000,1500);
        organizer9.display();
        System.out.println("");

        Organizer organizer10 = new Organizer("Film Fiesta","Entertainment","Film Awards",
                "Film Org","India","Goa","Rahul Mehta",
                "rahul@film.com","9900112233","Star India",
                2003,300,500,1,10,12000000,3000000,5000,8000000,7000);
        organizer10.display();
        System.out.println("");
    }
}