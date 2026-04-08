package com.xworkz.creater;

public class PanCardInfo {
    PanCard[] panCard;
    int currentIndex =0;

    public PanCardInfo(PanCard[] panCard){
        this.panCard = panCard;
    }


    public void store(PanCard panCard){
        System.out.println("The PanCard method is executing in class PanCard.");

        if(this.panCard != null){
            int currentSize = this.panCard.length -1;
            System.out.println("The current value is stored in index:"+this.currentIndex);
            if(currentIndex <= currentSize){
                this.panCard[currentIndex]=panCard;
                currentIndex++;
                System.out.println("The next value is stored in index:"+this.currentIndex);
            }else{
                System.out.println("The array is full.");
            }

        }else{
            System.out.println("The pan card array is null");
        }
    }

    public void search(String name){
        System.out.println("The search operation is executing in class PanCard.");

        if(this.panCard != null){
            for(PanCard panCard1:this.panCard){
                if(panCard1 != null){
                    if(panCard1.name == name){
                        panCard1.displayInfo();
                    }
                }
            }
        }else{
            System.out.println("The pancard array is not there..");
        }
    }


    public boolean update(String name,long mobileNo){
        System.out.println("The update operation is executing in class pancard.");
        boolean found = false;

        for (PanCard panCard2:this.panCard){
            if(panCard2 != null){
                System.out.println("The old moblie nunber:"+panCard2.mobileNo);
                if(panCard2.name == name){
                    panCard2.mobileNo = mobileNo;
                    System.out.println("The new moblie nunber:"+mobileNo);
                    found = true;
                    break;
                }
            }
        }
        return found;
    }


}
