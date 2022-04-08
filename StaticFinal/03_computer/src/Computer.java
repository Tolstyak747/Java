public class Computer {
    private final String vendor;
    private final String name;
    private  CPU cpu;
    private  RAM ram;
    private  StorageDevice storageDevice;
    private  Screen screen;
    private  Keyboard keyboard;

    public Computer(String vendor, String name, CPU cpu, RAM ram, StorageDevice storageDevice, Screen screen, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.storageDevice = storageDevice;
        this.screen = screen;
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public StorageDevice getStorageDevice() {
        return storageDevice;
    }

    public void setStorageDevice(StorageDevice storageDevice) {
        this.storageDevice = storageDevice;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public int totalWeight(){
        return  cpu.getWeight() + ram.getWeight() + storageDevice.getWeight() + screen.getWeight() + keyboard.getWeight();
    }

    @Override
    public String toString() {
        return "Computer\n" +
                "vendor='" + vendor + '\n' +
                "name='" + name + '\n' +
                "Процессор: " + "Частота " + cpu.getFrequency() + " Кол-во ядер: " + cpu.getNumberOfCores() + " Производитель: " + cpu.getManufacturer() + " Вес: " + cpu.getWeight() + "\n" +
                "Оперативная память: " + ram.getType() + " Объём: " + ram.getVolume() + " Вес: " + ram.getWeight() + "\n" +
                "Накопитель: " + storageDevice.getType() + " Память: " + storageDevice.getMemory() + " Вес: " + storageDevice.getWeight() + "\n" +
                "Диагональ: " + screen.getDiagonal() + " Тип матрицы: " + screen.getType() + " Вес: " + screen.getWeight() +  "\n" +
                "Тип клавиатуры: " + keyboard.getType() + " Подсветка: " + keyboard.isBacklight() + " Вес: " + keyboard.getWeight() + "\n" +
                "Общий вес: " + totalWeight() + " gramm";
    }
}
