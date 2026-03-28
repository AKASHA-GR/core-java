class OrganRunner {
    public static void main(String[] args) {

        Organ organ1 = new Organ("Heart","Circulatory","Chest","Cone","Pumps Blood","Red","Muscular","Heart Attack","Coronary Artery","Vagus Nerve",300,12,8,4,1,8.5,0.1,7.4,37.0,5.0);
        organ1.display();
        System.out.println("");

        Organ organ2 = new Organ("Brain","Nervous","Head","Oval","Controls Body","Pink","Soft","Stroke","Carotid Artery","Cranial Nerves",1400,15,14,10,1,20.0,0.05,7.3,37.0,0.75);
        organ2.display();
        System.out.println("");

        Organ organ3 = new Organ("Liver","Digestive","Abdomen","Triangular","Detoxification","Brown","Soft","Cirrhosis","Hepatic Artery","Vagus Nerve",1500,20,15,8,2,10.0,0.8,7.4,37.0,1.5);
        organ3.display();
        System.out.println("");

        Organ organ4 = new Organ("Lungs","Respiratory","Chest","Spongy","Breathing","Pink","Spongy","Asthma","Pulmonary Artery","Phrenic Nerve",1000,25,18,6,2,15.0,0.2,7.4,37.0,4.5);
        organ4.display();
        System.out.println("");

        Organ organ5 = new Organ("Kidney","Excretory","Lower Back","Bean","Filters Blood","Red","Firm","Kidney Stones","Renal Artery","Renal Nerve",150,11,6,5,3,7.0,0.3,7.4,37.0,1.2);
        organ5.display();
        System.out.println("");

        Organ organ6 = new Organ("Stomach","Digestive","Abdomen","J-shaped","Digestion","Pink","Muscular","Ulcer","Gastric Artery","Vagus Nerve",500,25,10,4,3,6.5,0.2,2.0,37.0,1.0);
        organ6.display();
        System.out.println("");

        Organ organ7 = new Organ("Pancreas","Digestive","Abdomen","Leaf-like","Produces Insulin","Yellow","Soft","Diabetes","Splenic Artery","Vagus Nerve",100,15,5,6,3,5.0,0.1,7.4,37.0,0.8);
        organ7.display();
        System.out.println("");

        Organ organ8 = new Organ("Spleen","Lymphatic","Left Abdomen","Oval","Filters Blood","Purple","Soft","Splenomegaly","Splenic Artery","Splenic Nerve",200,12,7,4,4,4.0,0.2,7.4,37.0,0.5);
        organ8.display();
        System.out.println("");

        Organ organ9 = new Organ("Skin","Integumentary","Whole Body","Layered","Protection","Brown","Flexible","Eczema","Dermal Arteries","Sensory Nerves",5000,200,150,12,1,3.0,0.5,5.5,36.5,2.0);
        organ9.display();
        System.out.println("");

        Organ organ10 = new Organ("Eye","Sensory","Face","Round","Vision","White","Soft","Cataract","Ophthalmic Artery","Optic Nerve",7,2,2,6,2,2.0,0.1,7.0,37.0,0.3);
        organ10.display();
        System.out.println("");
    }
}