package model.entity;

import model.enums.Schedule_Enums;

import java.time.LocalTime;

public class Schedule_Entity {

    private int idSchedule;
    private Schedule_Enums day;
    private LocalTime startTime;
    private LocalTime endTime;
    private Veterinary_Entity veterinary;

    public Schedule_Entity(Schedule_Enums day, LocalTime startTime, LocalTime endTime, Veterinary_Entity veterinary) {
        setDay(day);
        setStartTime(startTime);
        setEndTime(endTime);
        setVeterinary(veterinary);
    }

    public int getIdSchedule() {
        return idSchedule;
    }

    public Schedule_Enums getDay() {
        return day;
    }

    public void setDay(Schedule_Enums day) {
        this.day = day;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public Veterinary_Entity getVeterinary() {
        return veterinary;
    }

    public void setVeterinary(Veterinary_Entity veterinary) {
        this.veterinary = veterinary;
    }
}
