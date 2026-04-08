package com.xworkz.creater;

public class MedicalInfo {
    Medical[] medicals;
    int currentIndex =0;

    public MedicalInfo(Medical[] medicals){
        this.medicals = medicals;
    }

    public void store(Medical medical){
        System.out.println("The medical method is executing in class PanCard.");

        if(this.medicals != null){
            int currentSize = this.medicals.length -1;
            System.out.println("The current value is stored in index:"+this.currentIndex);
            if(currentIndex <= currentSize){
                this.medicals[currentIndex]=medical;
                currentIndex++;
                System.out.println("The next value is stored in index:"+this.currentIndex);
            }else{
                System.out.println("The array is full.");
            }

        }else{
            System.out.println("The medical array is null");
        }
    }

    public void search(String college){
        System.out.println("The search operation is executing in class medical.");

        if(this.medicals != null){
            for(Medical medical1:this.medicals){
                if(medical1 != null){
                    if(medical1.collegeName == college){
                        medical1.displayInfo();
                    }
                }
            }
        }else{
            System.out.println("The medical array is not there..");
        }
    }


    public boolean update(String collegeName,int totleSeats){
        System.out.println("The update operation is executing in class medical.");
        boolean found = false;

        for (Medical medical2:this.medicals){
            if(medical2 != null){
                System.out.println("The old moblie nunber:"+medical2.totleSeats);
                if(medical2.collegeName == collegeName){
                    medical2.totleSeats = totleSeats;
                    System.out.println("The new moblie nunber:"+totleSeats);
                    found = true;
                    break;
                }
            }
        }
        return found;
    }
}
