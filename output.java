
public class output {
    public static void main(String[] args) {
        // Create instances of Manufacture
        Manufacture Corolla = new Manufacture("Corolla", "Japan","Black");
        Manufacture tesla = new Manufacture("Tesla", "Germany","Red");

        // Create instances of Engines
        CombustionEngine com = new CombustionEngine();
        ElectricEngine elec = new ElectricEngine();
        HybridEngine hyb = new HybridEngine();

        // Create instances of Vehicles
       ICEV icev = new ICEV(Corolla, com);
        BEV bev = new BEV(tesla, elec);
       HybridV hybridV = new HybridV(Corolla, hyb);

        // Create an array of Vehicles
      Vehicle[] vehicles = {icev,bev,hybridV };
        for (Vehicle vehicle : vehicles) {
            vehicle.ShowCharacteristics();
            System.out.println();
            
        }
    }
}

