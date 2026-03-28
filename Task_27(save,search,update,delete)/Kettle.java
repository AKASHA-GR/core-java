class Kettle {
    String[] kettleNames;
    int currentIndex;

    Kettle(String[] kettleNames) {
        this.kettleNames = kettleNames;
    }

    void save(String name) {
        System.out.println("Save method executing in Kettle class");
        System.out.println("Kettle Name: " + name);

        if (this.kettleNames != null) {
            int indexSize = this.kettleNames.length - 1;

            if (this.currentIndex <= indexSize) {
                this.kettleNames[currentIndex] = name;
                currentIndex++;
            } else {
                System.out.println("Array is full");
            }
        } else {
            System.out.println("kettleNames is null");
        }
    }

    boolean search(String name) {
        System.out.println("Search method executing in Kettle class");
		System.out.println("The name:"+name);

        if (name != null && this.kettleNames != null) {
			System.out.println("The name and kettleNames array is not null.");
            for (String temp : this.kettleNames) {
                System.out.println("Comparing with: " + temp);
                if (name == temp) { 
                    return true;
                }
            }
        }
        return false;
    }

    void update(int index, String name) {
        System.out.println("Update using index");
		System.out.println("The index:"+index);
		System.out.println("The name:"+name);

        if (this.kettleNames == null || name == null) {
            System.out.println("The name or kettleNames array is null.");
            return;
        }

        if (index >= 0 && index < this.kettleNames.length) { 
            this.kettleNames[index] = name;
            System.out.println("Updated at index: " + index);
        } else {
            System.out.println("Invalid index");
        }
    }

    boolean update(String oldName, String newName) {
        System.out.println("Update using oldName and newName");
		System.out.println("The oldName:"+oldName);
		System.out.println("The newName:"+newName);

        if (this.kettleNames == null || oldName == null || newName == null) {
			System.out.println("The oldName or newName or kettleNames array is null.");
            return false;
        }

        for (int i = 0; i < kettleNames.length; i++) {
            System.out.println("Comparing with: " + kettleNames[i]);
            if (oldName == kettleNames[i]) {   
                kettleNames[i] = newName;         
                return true;
            }
        }
        return false;
    }

    boolean delete(int index) {
        System.out.println("Delete using index");
		System.out.println("The index:"+index);

        if (this.kettleNames == null) {
			System.out.println("The kettleNames array is null.");
            return false;
        }

        if (index >= 0 && index < this.kettleNames.length) { 
            this.kettleNames[index] = null;
            return true;
        }
        return false;
    }

    boolean delete(String name) {
        System.out.println("Delete using name");
		System.out.println("The name:"+name);

        if (this.kettleNames == null || name == null) {
			System.out.println("The name or kettleNames array is null.");
            return false;
        }

        for (int i = 0; i < kettleNames.length; i++) {
            System.out.println("Comparing with: " + kettleNames[i]);
            if (name == kettleNames[i]) {   
                kettleNames[i] = null;
				System.out.println("The name is deleted.");
                return true;
            }
        }
        return false;
    }
}