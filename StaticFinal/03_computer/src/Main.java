public class Main {

    public static void main(String[] args) {
        CPU cpu = new CPU(2.4, 2, "China", 100);
        RAM ram = new RAM(RAM.Type.DDR2, 4, 50);
        StorageDevice storageDevice = new StorageDevice(StorageDevice.Type.HDD, 200, 350);
        Screen screen = new Screen(17, Screen.Type.IPS, 900);
        Keyboard keyboard = new Keyboard(Keyboard.Type.WIRELESS, true, 450);
        Computer computer = new Computer("China", "Intel", cpu, ram, storageDevice, screen, keyboard);
        System.out.println(computer);
    }
}
