package ru.hospital;

public class Client {
    private Doctor doctor; //доктор
    private int planHeal;  //план лечения

    /**
     * Конструктор с передаваемым параметром "план лечения"
     */
    public Client(int planHeal) {
        this.planHeal = planHeal;
    }

    /**
     *  Возвращает "План лечения"
     */
    public int getPlanHeal() {
        return planHeal;
    }
    /**
     *  Устанавливает поле доктора пациенту
     */
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    /**
     *  Получить лечение
     */
    public void getHeal() {
        doctor.heal();
    }
}
