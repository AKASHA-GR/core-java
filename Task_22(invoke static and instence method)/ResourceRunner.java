class ResourceRunner {
    public static void main(String[] args) {

        Resource resource = new Resource();

        resource.allocate();
        resource.release();
        resource.utilize();
        resource.maintain();
        resource.monitor();
        resource.upgrade();
        resource.downgrade();
        resource.checkAvailability();
        resource.calculateUsage();
        resource.displayDetails();
        resource.reserve();
        resource.unreserve();
        resource.optimize();
        resource.track();
        resource.updateStatus();

        Resource.addResource();
        Resource.removeResource();
        Resource.expandCapacity();
        Resource.reduceCapacity();
        Resource.emergencyShutdown();

        System.out.println("");

        Resource resource1 = new Resource();

        resource1.allocate();
        resource1.release();
        resource1.utilize();
        resource1.maintain();
        resource1.monitor();
        resource1.upgrade();
        resource1.downgrade();
        resource1.checkAvailability();
        resource1.calculateUsage();
        resource1.displayDetails();
        resource1.reserve();
        resource1.unreserve();
        resource1.optimize();
        resource1.track();
        resource1.updateStatus();

        Resource.addResource();
        Resource.removeResource();
        Resource.expandCapacity();
        Resource.reduceCapacity();
        Resource.emergencyShutdown();
    }
}