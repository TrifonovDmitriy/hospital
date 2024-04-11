package ru.hospital;

public class Dentist extends Doctor{
    /**
     *  переопределяем метод лечения
     */
    @Override
    public void heal() {
        System.out.println("Дантист вылечил зубы пациенту!");
    }
}
