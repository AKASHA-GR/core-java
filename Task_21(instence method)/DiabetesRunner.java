class DiabetesRunner {

    public static void main(String[] args) {

        Diabetes d1 = new Diabetes("Type 1","Genetic","Frequent urination","Insulin Therapy","Insulin",
                "Low Sugar Diet","Walking","High","Blood Test","Pancreas",
                25,5,180,15,4,
                120.5,200.3,7.5,65.0,23.5);

        Diabetes d2 = new Diabetes("Type 2","Obesity","Fatigue","Medication","Metformin",
                "Balanced Diet","Yoga","Medium","HbA1c Test","Pancreas",
                45,8,160,20,3,
                110.0,190.0,6.8,75.0,27.0);

        Diabetes d3 = new Diabetes("Gestational","Pregnancy","Increased thirst","Diet Control","Insulin",
                "Controlled Diet","Light Exercise","Medium","Glucose Test","Pancreas",
                30,1,150,18,2,
                105.0,170.0,6.5,70.0,25.0);

        Diabetes d4 = new Diabetes("Type 2","Lifestyle","Blurred vision","Medication","Glipizide",
                "Low Carb Diet","Gym","High","Blood Test","Pancreas",
                50,10,200,25,5,
                130.0,220.0,8.2,85.0,29.0);

        Diabetes d5 = new Diabetes("Type 1","Autoimmune","Weight loss","Insulin","Insulin",
                "High Protein Diet","Cycling","High","Blood Test","Pancreas",
                18,3,170,14,4,
                115.0,210.0,7.2,60.0,22.0);

        Diabetes d6 = new Diabetes("Type 2","Stress","Headache","Medication","Metformin",
                "Balanced Diet","Walking","Medium","HbA1c Test","Pancreas",
                40,6,155,19,3,
                108.0,180.0,6.9,72.0,26.0);

        Diabetes d7 = new Diabetes("Type 2","Genetic","Fatigue","Medication","Insulin",
                "Low Sugar Diet","Yoga","High","Blood Test","Pancreas",
                55,12,210,30,6,
                135.0,230.0,8.5,90.0,31.0);

        Diabetes d8 = new Diabetes("Type 1","Genetic","Nausea","Insulin Therapy","Insulin",
                "Controlled Diet","Walking","High","Blood Test","Pancreas",
                22,4,175,16,4,
                118.0,205.0,7.4,68.0,24.0);

        Diabetes d9 = new Diabetes("Type 2","Obesity","Fatigue","Medication","Metformin",
                "Balanced Diet","Gym","Medium","HbA1c Test","Pancreas",
                48,9,165,21,3,
                112.0,185.0,7.0,78.0,28.0);

        Diabetes d10 = new Diabetes("Gestational","Pregnancy","Increased thirst","Diet","Insulin",
                "Controlled Diet","Light Exercise","Medium","Glucose Test","Pancreas",
                29,1,145,17,2,
                100.0,165.0,6.3,69.0,24.5);

        d1.display(); System.out.println();
        d2.display(); System.out.println();
        d3.display(); System.out.println();
        d4.display(); System.out.println();
        d5.display(); System.out.println();
        d6.display(); System.out.println();
        d7.display(); System.out.println();
        d8.display(); System.out.println();
        d9.display(); System.out.println();
        d10.display();
    }
}