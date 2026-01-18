package FactoryPattern.VehicleFactory;

import FactoryPattern.VehicleTypes.FourWheeler;
import FactoryPattern.VehicleTypes.Vehicle;

public class FourWheelerFactory extends VehicleFactory{
    public Vehicle createVehicle(){
        return new FourWheeler();
    }
}
