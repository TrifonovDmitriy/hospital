package ru.hospital;

public class Therapist extends Doctor {
    /**
     * переопределяем метод лечения
     */
    @Override
    public void heal() {
        System.out.println("Терапевт провёл осмотр пациента!");
    }
    /**
     * Статический метод, так как нет необходимости создавать объект (терапевт). Метод назначает клиенту доктора в зависимости от плана лечения
     */
    public static void assignDoctor(Client client) {
        if (client.getPlanHeal() == 1) {
            client.setDoctor(new Surgeon());
        } else if (client.getPlanHeal() == 2) {
            client.setDoctor(new Dentist());
        } else client.setDoctor(new Therapist());
    }
}
