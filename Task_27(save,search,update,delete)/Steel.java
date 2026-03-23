class Steel {
    String[] steelNames;
    int currentIndex;

    Steel(String[] steelNames) {
        this.steelNames = steelNames;
    }

    void save(String name) {
        System.out.println("Save method executing in Steel class");
        System.out.println("Steel Name: " + name);

        if (this.steelNames != null) {
            if (currentIndex < this.steelNames.length) {
                this.steelNames[currentIndex] = name;
                currentIndex++;
            } else {
                System.out.println("Array is full");
            }
        } else {
            System.out.println("Steel array is null");
        }
    }

    boolean search(String name) {
        System.out.println("Search method executing");
		System.out.println("The name:"+name);

        if (name != null && this.steelNames != null) {
			System.out.println("The name and steelNames array is not null.");
            for (String temp : this.steelNames) {
                if (name.equals(temp)) {
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

        if (this.steelNames == null || name == null) {
            System.out.println("name or steelNames array is null.");
            return;
        }

        if (index >= 0 && index < this.steelNames.length) {
            this.steelNames[index] = name;
            System.out.println("Updated successfully");
        } else {
            System.out.println("Invalid index");
        }
    }

    boolean update(String oldName, String newName) {
        System.out.println("Update using oldName and newName");
		System.out.println("The oldName:"+oldName);
		System.out.println("The newName:"+newName);

        if (this.steelNames == null || oldName == null || newName == null) {
			System.old.println("The oldName or newName or steelNames is null.");
            return false;
        }

        for (int i = 0; i < steelNames.length; i++) {
            if (oldName.equals(steelNames[i])) {
                steelNames[i] = newName;
                return true;
            }
        }
        return false;
    }

    boolean delete(int index) {
        System.out.println("Delete using index");
		System.out.println("The index:"+index);

        if (this.steelNames == null) {
			System.out.println("The steelNames array is null.");
            return false;
        }

        if (index >= 0 && index < this.steelNames.length) {
            this.steelNames[index] = null;
            return true;
        }
        return false;
    }

    boolean delete(String name) {
        System.out.println("Delete using name");

        if (this.steelNames == null || name == null) {
            return false;
        }

        for (int i = 0; i < steelNames.length; i++) {
            if (name.equals(steelNames[i])) {
                steelNames[i] = null;
                return true;
            }
        }
        return false;
    }
}