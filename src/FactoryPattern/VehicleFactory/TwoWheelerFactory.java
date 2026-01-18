package FactoryPattern.VehicleFactory;

import FactoryPattern.VehicleTypes.TwoWheeler;
import FactoryPattern.VehicleTypes.Vehicle;

public class TwoWheelerFactory extends  VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}
