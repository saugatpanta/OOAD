package FactoryPattern;

import FactoryPattern.VehicleFactory.FourWheelerFactory;
import FactoryPattern.VehicleFactory.TwoWheelerFactory;
import FactoryPattern.VehicleFactory.VehicleFactory;
import FactoryPattern.VehicleTypes.Vehicle;

public class Main {
  public static void main(String[] args) {
    VehicleFactory f = new TwoWheelerFactory();
    Vehicle bike = f.createVehicle();
    bike.printVehicle();

    f = new FourWheelerFactory();
    Vehicle car = f.createVehicle();
    car.printVehicle();;


  }
}
