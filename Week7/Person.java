import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList = new ArrayList<>();

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * this is Remove Vehicle.
     *
     * @param registrationNumber String
     */
    public void removeVehicle(String registrationNumber) {
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getRegistrationNumber().equals(registrationNumber)) {
                vehicleList.remove(vehicle);
                break;
            }
        }
    }

    /**
     * this is get Vehicles info.
     *
     * @return vehicle info
     */
    public String getVehiclesInfo() {
        String answer;
        if (vehicleList.isEmpty()) {
            answer = name + " has no vehicle!";
        } else {
            answer = name + " has:" + "\n" + "\n";
            for (Vehicle vehicle : vehicleList) {
                answer += vehicle.getInfo();
            }
        }
        return answer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
