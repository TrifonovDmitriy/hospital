package ru.hospital;

public class Hospital {
    public static void main(String[] args) {
        /**
         *  Создадим 3 клиентов клиники и назначим разные планы лечения для проверки вызова всех методов у докторов
         */
        Client ivan = new Client(1);
        Therapist.assignDoctor(ivan);
        ivan.getHeal();

        Client petya = new Client(2);
        Therapist.assignDoctor(petya);
        petya.getHeal();

        Client masha = new Client(5);
        Therapist.assignDoctor(masha);
        masha.getHeal();
    }
}
