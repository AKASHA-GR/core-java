package com.xworkz.creater;

public class ToyInfo {
    Toy[] toy;
    int currentIndex = 0;

    public ToyInfo(Toy[] toy){
        this.toy = toy;
    }

    public void store(Toy toy){
        System.out.println("The store operation is executing in class ToyInfo.");

        if(this.toy!= null){
            int currentSize = this.toy.length -1;
            System.out.println("The current value is stored in index:"+this.currentIndex);
            if(currentIndex <= currentSize){
                this.toy[currentIndex] = toy;
                toy.displayInfo();
                currentIndex++;
                System.out.println("The next value is stored in index:"+this.currentIndex);
            }else{
                System.out.println("The array is full.");
            }
        }else{
            System.out.println("The toy array is null.");
        }
    }

    public void search(String type){
        System.out.println("The search operation is executing in class ToyInfo.");

        if(this.toy != null){
            for(Toy toy:this.toy){
                if(toy != null) {
                    if (toy.type == type) {
                        toy.displayInfo();
                    }
                }
            }
        }else{
            System.out.println("The toy array is null.");
        }

    }

    public boolean update(String name,double price){
        System.out.println("The update operation is executing in class ");
        boolean found = false;

        if(this.toy != null){
            for(Toy toy1:this.toy){
                if(toy1 != null) {
                    if (toy1.name == name) {
                        System.out.println("The old price:" + toy1.price);
                        toy1.price = price;
                        System.out.println("The new price:" + price);
                        found = true;
                        break;
                    } else {
                        System.out.println("The name is not exist.");
                    }
                }
            }
        }
        return found;
    }
}
