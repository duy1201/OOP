public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * this is constructor.
     * @param brand String
     * @param model String
     * @param registrationNumber String
     * @param owner Person
     * @param hasSidecar boolean
     */
    public MotorBike(String brand, String model, String registrationNumber,
                     Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String getInfo() {
        return "Motor Bike:" + '\n'
                + "\t" + "Brand: " + this.getBrand() + '\n'
                + "\t" + "Model: " + this.getModel() + '\n'
                + "\t" + "Registration Number: " + this.getRegistrationNumber() + '\n'
                + "\t" + "Has Side Car: " + this.hasSidecar + '\n'
                + "\t" + "Belongs to " + this.getOwner().getName() + " - "
                + this.getOwner().getAddress() + '\n';
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
