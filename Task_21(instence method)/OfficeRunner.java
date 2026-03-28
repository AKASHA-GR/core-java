class OfficeRunner {
    public static void main(String[] args) {

        Office office1 = new Office("Tech Park Office","Corporate","Bangalore","Infosys","India","Ravi Kumar","IT","Commercial","9AM-6PM","info@infosys.com",2000,5000,10,12,300,20000,50000,1000,2000000,150000);
        office1.display();
        System.out.println("");

        Office office2 = new Office("Finance Hub","Corporate","Mumbai","TCS","India","Anita Sharma","Finance","Commercial","8AM-5PM","finance@tcs.com",1995,3000,8,10,200,15000,40000,800,1500000,120000);
        office2.display();
        System.out.println("");

        Office office3 = new Office("Startup Space","Private","Hyderabad","StartupX","India","Kiran Rao","Development","IT Park","10AM-7PM","contact@startupx.com",2018,200,5,5,50,5000,10000,500,300000,40000);
        office3.display();
        System.out.println("");

        Office office4 = new Office("Regional Branch","Corporate","Delhi","Wipro","India","Suresh Babu","HR","Commercial","9AM-6PM","hr@wipro.com",2005,1500,6,8,120,10000,25000,600,800000,60000);
        office4.display();
        System.out.println("");

        Office office5 = new Office("Headquarters","Corporate","Chennai","HCL","India","Lakshmi Devi","Operations","Corporate Tower","9AM-6PM","hq@hcl.com",1990,7000,12,15,400,30000,70000,1200,3000000,200000);
        office5.display();
        System.out.println("");

        Office office6 = new Office("Sales Office","Private","Pune","Zoho","India","Manoj Singh","Sales","Commercial","9AM-5PM","sales@zoho.com",2010,800,4,6,90,7000,15000,700,600000,50000);
        office6.display();
        System.out.println("");

        Office office7 = new Office("Marketing Unit","Corporate","Kolkata","Amazon","USA","Neha Gupta","Marketing","Business Center","9AM-6PM","marketing@amazon.com",2012,1200,7,9,150,9000,20000,900,1000000,75000);
        office7.display();
        System.out.println("");

        Office office8 = new Office("Development Center","Corporate","Noida","Microsoft","USA","Rahul Mehta","Software","Tech Park","9AM-6PM","dev@microsoft.com",2008,4000,9,14,350,25000,60000,1500,2500000,180000);
        office8.display();
        System.out.println("");

        Office office9 = new Office("Support Center","Private","Ahmedabad","IBM","USA","Priya Patel","Support","Commercial","24x7","support@ibm.com",2003,1800,6,7,100,11000,30000,850,900000,70000);
        office9.display();
        System.out.println("");

        Office office10 = new Office("Research Lab","Corporate","Bangalore","Google","USA","Arjun Verma","R&D","Tech Campus","9AM-6PM","research@google.com",2015,2500,8,11,220,18000,45000,2000,2200000,160000);
        office10.display();
        System.out.println("");
    }
}