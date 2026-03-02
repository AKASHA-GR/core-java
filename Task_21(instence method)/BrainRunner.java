class BrainRunner {

    public static void main(String[] args) {

        Brain brain1 = new Brain("Cerebrum","Thinking","Left","Frontal",
                "Spinal Cord","Arteries","Skull","Stroke","Short-term","Conscious",
                860000000,25,200,120,500,
                1.4,20.0,25.0,2.5,37.0);
        brain1.display();
        System.out.println("");

        Brain brain2 = new Brain("Cerebellum","Balance","Right","Occipital",
                "Nerves","Capillaries","Skull","Tumor","Long-term","Conscious",
                500000000,30,180,110,450,
                1.3,18.0,22.0,2.2,36.8);
        brain2.display();
        System.out.println("");

        Brain brain3 = new Brain("Medulla","Breathing","Center","Brainstem","Spinal Cord","Veins","Skull","Injury","Reflex","Semi-conscious",300000000,40,220,100,300,1.2,19.0,21.0,2.0,37.2);
        brain3.display();
        System.out.println("");

        Brain brain4 = new Brain("Frontal Lobe","Decision Making","Left","Frontal","Nerves","Arteries","Skull","Depression","Working","Conscious",700000000,28,210,130,520,1.5,21.0,26.0,2.8,36.9);
        brain4.display();
        System.out.println("");

        Brain brain5 = new Brain("Temporal Lobe","Hearing","Right","Temporal","Nerves","Capillaries","Skull","Epilepsy","Long-term","Conscious",650000000,35,195,115,480,1.35,20.5,24.0,2.4,37.1);
        brain5.display();
        System.out.println("");

        Brain brain6 = new Brain("Parietal Lobe","Sensation","Left","Parietal","Spinal Cord","Veins","Skull","Stroke","Short-term","Conscious",600000000,32,205,118,470,1.38,19.8,23.5,2.3,36.7);
        brain6.display();
        System.out.println("");

        Brain brain7 = new Brain("Occipital Lobe","Vision","Right","Occipital","Nerves","Arteries","Skull","Blindness","Visual","Conscious",550000000,27,190,112,460,1.32,18.9,22.8,2.1,37.0);
        brain7.display();
        System.out.println("");

        Brain brain8 = new Brain("Hypothalamus","Hormone Control","Center","Diencephalon","Nerves","Capillaries","Skull","Hormonal Disorder","Memory","Semi-conscious",400000000,45,215,105,350,1.25,19.5,23.0,2.0,37.3);
        brain8.display();
        System.out.println("");

        Brain brain9 = new Brain("Thalamus","Signal Relay","Center","Diencephalon","Spinal Cord","Veins","Skull","Injury","Short-term","Conscious",420000000,38,208,108,360,1.28,20.2,24.1,2.2,36.8);
        brain9.display();
        System.out.println("");

        Brain brain10 = new Brain("Amygdala","Emotion","Right","Temporal","Nerves","Arteries","Skull","Anxiety","Emotional","Conscious",300000000,29,198,122,390,1.3,19.7,23.2,2.3,37.0);
        brain10.display();
        System.out.println("");
    }
}