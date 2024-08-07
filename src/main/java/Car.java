public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Запуск електрики");
    }

    private void startCommand() {
        System.out.println("Запуск команди");
    }

    private void startFuelSystem() {
        System.out.println("Запуск паливної системи");
    }
}