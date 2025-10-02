abstract class HouseholdAppliance {
    protected String brand;
    protected String model;
    protected double power;
    protected boolean isOn;
    

    protected static int applianceCount = 0;
    
    public HouseholdAppliance() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.power = 0.0;
        this.isOn = false;
        applianceCount++;
    }
    
    public HouseholdAppliance(String brand, String model, double power, boolean isOn) {
        this.brand = brand;
        this.model = model;
        this.power = power;
        this.isOn = isOn;
        applianceCount++;
    }

    public abstract void performMainFunction();
    public abstract void displayFeatures();
    

    public void turnOn() {
        this.isOn = true;
        System.out.println(brand + " " + model + " is on");
    }
    
    public void turnOff() {
        this.isOn = false;
        System.out.println(brand + " " + model + " is off");
    }
    
    public void info() {
        System.out.println("Brand is: " + brand);
        System.out.println("Model is: " + model);
        System.out.println("Power is: " + power + " kWt");
        System.out.println("Object: " + (isOn ? "is on" : "is off"));
    }
    
    public String getBrand() { 
        return brand; 
    }
    public void setBrand(String brand) { 
        this.brand = brand; 
    }
    
    public String getModel() { 
        return model; 
    }
    public void setModel(String model) { 
        this.model = model; 
    }
    
    public double getPower() { 
        return power; 
    }
    public void setPower(double power) { 
        this.power = power; 
    }
    
    public boolean isOn() { 
        return isOn; 
    }
    
    public static int getApplianceCount() {
        return applianceCount;
    }
}


class Refrigerator extends HouseholdAppliance {
    private double volume;          
    private int temperature;       
    private boolean hasFreezer;    
    

    public Refrigerator() {
        this.volume = 0.0;
        this.temperature = 4;
        this.hasFreezer = false;
    }
    
    public Refrigerator(String brand, String model, double power, boolean isOn,
                       double volume, int temperature, boolean hasFreezer) {
        super(brand, model, power, isOn);
        this.volume = volume;
        this.temperature = temperature;
        this.hasFreezer = hasFreezer;
    }
    
    @Override
    public void performMainFunction() {
        System.out.println("freeze food to a temperature " + temperature + "°C");
    }
    
    @Override
    public void displayFeatures() {
        System.out.println("Refrigerator Features:");
        System.out.println(" - Volume:" + volume + " l");
        System.out.println("  - Freezer: " + (hasFreezer ? "available" : "not available"));
        System.out.println("  - Current temperature: " + temperature + "°C");
    }
    
    public double getVolume() { 
        return volume; 
    }
    public void setVolume(double volume) { 
        this.volume = volume; 
    }
    
    public int getTemperature() { 
        return temperature; 
    }

    public void setTemperature(int temp) {
        this.temperature = temp;
    }

    public boolean hasFreezer() { 
        return hasFreezer; 
    }
    public void setHasFreezer(boolean hasFreezer) { 
        this.hasFreezer = hasFreezer; 
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println("Type: Refrigerator");
        System.out.println("Volume: " + volume + " l");
        System.out.println("Current temperature: " + temperature + "°C");
        System.out.println("Freezer: " + (hasFreezer ? "available" : "not available"));
    }
}


class Dishwasher extends HouseholdAppliance {
    private int countOfShelves;         
    private int waterConsumption;   
    private String program;  
    
    public Dishwasher() {
        super();
        this.countOfShelves = 0;
        this.waterConsumption = 0;
        this.program = "default";
    }
    
    public Dishwasher(String brand, String model, double power, boolean isOn,
                     int countOfShelves, int waterConsumption, String program) {
        super(brand, model, power, isOn);
        this.countOfShelves = countOfShelves;
        this.waterConsumption = waterConsumption;
        this.program = program;
    }
    
    @Override
    public void performMainFunction() {
        System.out.println("Wash dishes according to the program: " + program);
    }
    
    @Override
    public void displayFeatures() {
        System.out.println("Features of dishwasher:");
        System.out.println("  - Capacity: " + countOfShelves);
        System.out.println("  - Water consumption: " + waterConsumption + " l/cycle");
        System.out.println("  - Сurrent program: " + program);
    }
    
    public void setProgram(String program) {
        this.program = program;
        System.out.println("Choose program" + program);
    }
    
    
    public int getcountOfShelves() { 
        return countOfShelves; 
    }
    public void setcountOfShelves(int countOfShelves) { 
        this.countOfShelves = countOfShelves; 
    }
    
    public int getWaterConsumption() { 
        return waterConsumption; 
    }
    public void setWaterConsumption(int waterConsumption) { 
        this.waterConsumption = waterConsumption; 
    }
    
    public String getProgram() { 
        return program; 
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println("type: Dishwasher");
        System.out.println("Capacity: " + countOfShelves);
        System.out.println("Water consumption: " + waterConsumption + " l/cycle");
        System.out.println("Current program: " + program);
    }
}

class SmartRefrigerator extends Refrigerator {
    private boolean isWifi;
    private double screenSize;

    public SmartRefrigerator() {
        this.isWifi = false;
        this.screenSize = 0.0;
    }

    public SmartRefrigerator(String brand, String model, double power, boolean isOn,
                       double volume, int temperature, boolean hasFreezer, boolean isWifi, double screenSize) {
        super(brand, model, power, isOn, volume, temperature, hasFreezer);
        this.isWifi = isWifi;
        this.screenSize = screenSize;
    }

    @Override
    public void performMainFunction() {
        System.out.println("smartfreeze food to a temperature " + getTemperature() + "°C with AI");
    }

    @Override
    public void displayFeatures() {
        System.out.println("Features of SmartRefrigerator:");
        System.out.println(" - Screen is : " + screenSize + " inch");
        System.out.println("Wi-Fi is " + (isWifi ? "available" : "not available"));
    }

    public void createShoppingList() {
        System.out.println("Analyze the contents and create a shopping list");
    }

    public boolean isWifiEnabled() {
        return isWifi;
    }
    
    public void setWifiEnabled(boolean isWifi) {
        this.isWifi = isWifi;
        System.out.println("Wi-Fi is " + (isWifi ? "available" : "not available"));
    }    
}


// Demonstration class
public class HouseholdAppliancesDemo {
    public static void main(String[] args) {

        System.out.println("1. OBJECT CREATION:");
        System.out.println("========================================");

        Refrigerator fridge = new Refrigerator("LG", "GC-L247", 0.85, false, 350, 4, false);
        Dishwasher dishwasher = new Dishwasher("Bosch", "SMS6ZCI00E", 1.1, false, 2, 9, "Auto");
        
        SmartRefrigerator smartFridge = new SmartRefrigerator("Samsung", "Family Hub", 1.2, false, 
                                                             600, 3, true, false, 10.5);
        
        System.out.println("Created objects:");
        System.out.println("- Regular refrigerator: " + fridge.getBrand() + " " + fridge.getModel());
        System.out.println("- Dishwasher: " + dishwasher.getBrand() + " " + dishwasher.getModel());
        System.out.println("- Smart refrigerator: " + smartFridge.getBrand() + " " + smartFridge.getModel());
        System.out.println();
        
        // 2. OOP PRINCIPLES DEMONSTRATION
        System.out.println("2. OOP PRINCIPLES DEMONSTRATION:");
        System.out.println("================================");
        
        // 2.1 ENCAPSULATION
        System.out.println("2.1");
        System.out.println("Initial refrigerator temperature: " + fridge.getTemperature() + "°C");
        fridge.setTemperature(-5); 
        System.out.println("New refrigerator temperature: " + fridge.getTemperature() + "°C");
        
        System.out.println("\nInitial dishwasher program: " + dishwasher.getProgram());
        dishwasher.setProgram("Intensive");
        System.out.println("New dishwasher program: " + dishwasher.getProgram());
        
        System.out.println("\nSmart refrigerator Wi-Fi: " + smartFridge.isWifiEnabled());
        smartFridge.setWifiEnabled(true);
        System.out.println();
        
        // 2.2 INHERITANCE
        System.out.println("2.2");
        System.out.println("- Volume: " + smartFridge.getVolume() + " L");
        System.out.println("- Freezer: " + (smartFridge.hasFreezer() ? "yes" : "no"));
        System.out.println("- Power consumption: " + smartFridge.getPower() + " kW");
        System.out.println();
        
        // 2.3 POLYMORPHISM
        System.out.println("2.3");
        HouseholdAppliance[] appliances = {fridge, dishwasher, smartFridge};
        
        for (HouseholdAppliance appliance : appliances) {
            System.out.println("\n--- " + appliance.getBrand() + " " + appliance.getModel() + " ---");
            appliance.turnOn();
            appliance.performMainFunction(); 
            appliance.displayFeatures();     
            appliance.turnOff();
        }
        System.out.println();
        
        // 2.4 ABSTRACTION
        System.out.println("2.4");
        System.out.println("All appliances implement abstract methods:");
        fridge.performMainFunction();
        dishwasher.performMainFunction();
        smartFridge.performMainFunction();
        System.out.println();
        
        // 3. CONSTRUCTORS DEMONSTRATION
        System.out.println("3. CONSTRUCTORS:");
        System.out.println("================");
        
        // Default constructors
        Refrigerator defaultFridge = new Refrigerator();
        Dishwasher defaultDishwasher = new Dishwasher();
        SmartRefrigerator defaultSmartFridge = new SmartRefrigerator();
        
        System.out.println("Objects created with default constructors:");
        defaultFridge.info();
        System.out.println();
        defaultDishwasher.info();
        System.out.println();
        defaultSmartFridge.info();
        System.out.println();
        
        // 4. OBJECT INFORMATION
        System.out.println("4. INPUT/OUTPUT OF OBJECT INFORMATION:");
        System.out.println("======================================");
        
        System.out.println("Complete information about created objects:");
        System.out.println("\n--- Refrigerator ---");
        fridge.info();
        
        System.out.println("\n--- Dishwasher ---");
        dishwasher.info();
        
        System.out.println("\n--- Smart Refrigerator ---");
        smartFridge.info();
        System.out.println();
        
        
        
        // 5. STATIC VARIABLE - OBJECT COUNTER
        System.out.println("5. STATIC VARIABLE - OBJECT COUNTER:");
        System.out.println("====================================");
        
        System.out.println("Total household appliances created: " + HouseholdAppliance.getApplianceCount());
        
        // Create more objects for demonstration
        Refrigerator extraFridge = new Refrigerator("Indesit", "TIA 40", 0.32, false, 280, 5, false);
        Dishwasher extraDishwasher = new Dishwasher("Electrolux", "ESF9452LOX", 0.9, false, 3, 11, "Eco");
        
        System.out.println("After creating additional objects: " + HouseholdAppliance.getApplianceCount());
        System.out.println();
    }

}