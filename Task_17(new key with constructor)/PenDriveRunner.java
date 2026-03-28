class PenDriveRunner {

    public static void main(String[] args) {

        PenDrive penDrive1 = new PenDrive();

        penDrive1.brand = "SanDisk";
        penDrive1.model = "Ultra";
        penDrive1.storageCapacity = 64;
        penDrive1.price = 699;
        penDrive1.weight = "10g";
        penDrive1.usb3Supported = true;
        penDrive1.material = "Plastic";
        penDrive1.warrantyYears = 5;
        penDrive1.countryOfOrigin = "India";
        penDrive1.readSpeed = 150;
        penDrive1.writeSpeed = 60;
        penDrive1.waterProof = false;
        penDrive1.shockProof = true;
        penDrive1.dustProof = true;
        penDrive1.connectorType = "USB-A";
        penDrive1.manufacturingDate = "01-2025";
        penDrive1.serialNumber = "SN12345";
        penDrive1.encrypted = true;

        penDrive1.supportedDevices = new String[]{"Laptop", "Desktop", "Smart TV"};
        penDrive1.availableColors = new String[]{"Black", "Red", "Blue"};
        penDrive1.securityFeatures = new String[]{"Password Protection", "Encryption"};

        System.out.println("Brand: " + penDrive1.brand);
        System.out.println("Model: " + penDrive1.model);
        System.out.println("Storage: " + penDrive1.storageCapacity + "GB");
        System.out.println("Price: " + penDrive1.price);
        System.out.println("Weight: " + penDrive1.weight);
        System.out.println("USB 3 Supported: " + penDrive1.usb3Supported);
        System.out.println("Material: " + penDrive1.material);
        System.out.println("Warranty Years: " + penDrive1.warrantyYears);
        System.out.println("Country Of Origin: " + penDrive1.countryOfOrigin);
        System.out.println("Read Speed: " + penDrive1.readSpeed + " MB/s");
        System.out.println("Write Speed: " + penDrive1.writeSpeed + " MB/s");
        System.out.println("Waterproof: " + penDrive1.waterProof);
        System.out.println("Shockproof: " + penDrive1.shockProof);
        System.out.println("Dustproof: " + penDrive1.dustProof);
        System.out.println("Connector Type: " + penDrive1.connectorType);
        System.out.println("Serial Number: " + penDrive1.serialNumber);
        System.out.println("Encrypted: " + penDrive1.encrypted);

        System.out.println("Supported Devices:");
        for (int i = 0; i < penDrive1.supportedDevices.length; i++) {
            System.out.println(penDrive1.supportedDevices[i]);
        }

        System.out.println("Available Colors:");
        for (int i = 0; i < penDrive1.availableColors.length; i++) {
            System.out.println(penDrive1.availableColors[i]);
        }

        System.out.println("Security Features:");
        for (int i = 0; i < penDrive1.securityFeatures.length; i++) {
            System.out.println(penDrive1.securityFeatures[i]);
        }
		
		
		


        PenDrive penDrive2 = new PenDrive();

        penDrive2.brand = "HP";
        penDrive2.model = "X795W";
        penDrive2.storageCapacity = 128;
        penDrive2.price = 1299;
        penDrive2.weight = "12g";
        penDrive2.usb3Supported = true;
        penDrive2.material = "Metal";
        penDrive2.warrantyYears = 3;
        penDrive2.countryOfOrigin = "China";

        penDrive2.readSpeed = 200;
        penDrive2.writeSpeed = 100;
        penDrive2.waterProof = true;
        penDrive2.shockProof = true;
        penDrive2.dustProof = true;
        penDrive2.connectorType = "USB-A";
        penDrive2.compatibility = "Windows, Mac, Linux";
        penDrive2.manufacturingDate = "06-2025";

        penDrive2.serialNumber = "HP128SN789";
        penDrive2.encrypted = true;

        penDrive2.supportedDevices = new String[]{"Laptop", "Desktop", "Smart TV", "Car Audio"};
        penDrive2.availableColors = new String[]{"Silver", "Grey"};
        penDrive2.securityFeatures = new String[]{"Password Protection", "Hardware Encryption"};

        // Printing Details
        System.out.println("Brand: " + penDrive2.brand);
        System.out.println("Model: " + penDrive2.model);
        System.out.println("Storage: " + penDrive2.storageCapacity + "GB");
        System.out.println("Price: ₹" + penDrive2.price);
        System.out.println("Weight: " + penDrive2.weight);
        System.out.println("USB 3 Supported: " + penDrive2.usb3Supported);
        System.out.println("Material: " + penDrive2.material);
        System.out.println("Warranty Years: " + penDrive2.warrantyYears);
        System.out.println("Country Of Origin: " + penDrive2.countryOfOrigin);
        System.out.println("Read Speed: " + penDrive2.readSpeed + " MB/s");
        System.out.println("Write Speed: " + penDrive2.writeSpeed + " MB/s");
        System.out.println("Waterproof: " + penDrive2.waterProof);
        System.out.println("Shockproof: " + penDrive2.shockProof);
        System.out.println("Dustproof: " + penDrive2.dustProof);
        System.out.println("Connector Type: " + penDrive2.connectorType);
        System.out.println("Compatibility: " + penDrive2.compatibility);
        System.out.println("Manufacturing Date: " + penDrive2.manufacturingDate);
        System.out.println("Serial Number: " + penDrive2.serialNumber);
        System.out.println("Encrypted: " + penDrive2.encrypted);

        System.out.println("Supported Devices:");
        for(int i = 0; i < penDrive2.supportedDevices.length; i++){
            System.out.println(penDrive2.supportedDevices[i]);
        }

        System.out.println("Available Colors:");
        for(int i = 0; i < penDrive2.availableColors.length; i++){
            System.out.println(penDrive2.availableColors[i]);
        }

        System.out.println("Security Features:");
        for(int i = 0; i < penDrive2.securityFeatures.length; i++){
            System.out.println(penDrive2.securityFeatures[i]);
		}


    }
}