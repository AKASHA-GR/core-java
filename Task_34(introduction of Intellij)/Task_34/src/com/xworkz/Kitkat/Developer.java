package com.xworkz.Kitkat;

public class Developer {
    String name;
    int experience;
    String[] skills;

    public Developer(String name, int experience, String[] skills) {
        this.name = name;
        this.experience = experience;
        this.skills = skills;
    }

    public void devInfo(){
        System.out.println("The Developer name:"+this.name);
        System.out.println("The Developer experience:"+this.experience);
        if(this.skills != null){
            System.out.println("The developer Skills:");
            for(String skill:this.skills){
                System.out.println(skill);
            }
        }
    }
}
