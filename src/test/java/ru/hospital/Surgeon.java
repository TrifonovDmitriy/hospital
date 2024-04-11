package ru.hospital;

public class Surgeon extends Doctor{
    /**
     *  переопределяем метод лечения
     */
    @Override
    public void heal() {
        System.out.println("Хирург провёл операцию пациенту!");
    }
}
