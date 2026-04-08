package com.xworkz.creater;

public class GroceryInfo {
    Grocery[] grocery;
    int currentIndex =0;

    public GroceryInfo(Grocery[] grocery){
        this.grocery = grocery;
    }

    public void store(Grocery grocery){
        System.out.println("The store operation is executing in class GroceryInfo.");
        if(this.grocery != null){
            int currentSize = this.grocery.length -1;

            if(currentIndex <= currentSize){
                System.out.println("the current value is store in index:"+this.currentIndex);
                this.grocery[currentIndex] = grocery;
                grocery.displayInfo();
                currentIndex++;
                System.out.println("the next value is store in index:"+this.currentIndex);
            }else {
                System.out.println("The array is full.");
            }
        }else {
            System.out.println("The grocery array is not there...");
        }
    }


    public void search(String location){
        System.out.println("The search operation is executing in class grocery Info");

        if(this.grocery != null){
            for(Grocery grocery1:this.grocery){
                if(grocery1 != null){
                    if(grocery1.location == location){
                        grocery1.displayInfo();
                    }
                }
            }
        }else{
            System.out.println("The grocery array is null.");
        }

    }


    public boolean update(String name,int workers){
        System.out.println("The update operation is executing on class groceryInfo. ");
        boolean found = false;

        if(this.grocery != null){
            for (Grocery grocery2:this.grocery){
                if(grocery2 != null) {
                    System.out.println("The oid workers:"+grocery2.numberOfWorkers);
                    grocery2.numberOfWorkers = workers;
                    System.out.println("The new workers:"+workers);
                    found = true;
                    break;
                }
            }
        }else{
            System.out.println("The grocery array is null.");
        }

        return found;

    }
}
