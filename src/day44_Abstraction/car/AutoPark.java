package day44_Abstraction.car;

public interface AutoPark {
    boolean hasAutoPark = true;
    void autoPark();
}

interface AutoPilot extends AutoPark{
    boolean hasAutoPilot = true;
    void selfDrive();
}
