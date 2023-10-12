
class ICEV extends Vehicle {
    public ICEV(Manufacture manufacture, CombustionEngine engine) {
        super(manufacture, engine);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("Internal Combustion Engine Vehicle Characteristics:");
        System.out.println("Manufacture: " + getManufacture().getName() + ", Country: " + getManufacture().getCountry()+ ", Color: " + getManufacture().getColor());
        System.out.println("Engine Type: " + getEngine().getType());
    }
}
class BEV extends Vehicle {
    public BEV(Manufacture manufacture, ElectricEngine engine) {
        super(manufacture, engine);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("Battery Electric Vehicle Characteristics:");
        System.out.println("Manufacture: " + getManufacture().getName() + ", Country: " + getManufacture().getCountry()+ ", Color: " + getManufacture().getColor());
        System.out.println("Engine Type: " + getEngine().getType());
    }
}
class HybridV extends Vehicle {
    public HybridV(Manufacture manufacture, HybridEngine engine) {
        super(manufacture, engine);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("Hybrid Vehicle Characteristics:");
        System.out.println("Manufacture: " + getManufacture().getName() + ", Country: " + getManufacture().getCountry()+ ", Color: " + getManufacture().getColor());
        System.out.println("Engine Type: " + getEngine().getType());
    }
}
