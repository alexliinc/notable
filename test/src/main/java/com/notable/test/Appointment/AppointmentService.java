package com.notable.test.Appointment;

import ch.qos.logback.core.util.TimeUtil;
import com.notable.test.DataObjects.Appointment;
import com.notable.test.DataObjects.Doctor;
import com.notable.test.DataObjects.Kind;
import com.notable.test.DataObjects.Opening;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.stereotype.Component;

import java.sql.Time;
import java.util.Arrays;
import java.util.List;

@Getter
@Slf4j
@Component
public class AppointmentService {

    public List<Appointment> getApptForDocAndDay(final Integer doctorId, final Integer dayOfWeek) {

        Doctor doctor1 = new Doctor().setId(1).setFirstName("Tome").setLastName("Lie");

        Opening opening1 = new Opening().setDayOfWeek(1).setTime(Time.valueOf("11:00:00"));

        Appointment appointment1 = new Appointment().setId(1)
                                                    .setFirstName("joe")
                                                    .setLastName("laster")
                                                    .setKind(Kind.followUp)
                                                    .setOpening(opening1)
                                                    .setDoctorId(1);


        //call DB sql statment where doc id is = to param and dayofweek is = to param
        if (appointment1.getDoctorId().equals(doctorId) && appointment1.getOpening().getDayOfWeek().equals(dayOfWeek)) {
            List<Appointment> list = Arrays.asList(appointment1);
            return list;
        } else {
            return null;
        }
    }

    public Boolean deleteAppint(final Integer appointmentId) {

        Opening opening1 = new Opening().setDayOfWeek(1).setTime(Time.valueOf("11:00:00"));

        Appointment appointment1 = new Appointment().setId(1)
                                                    .setFirstName("joe")
                                                    .setLastName("laster")
                                                    .setKind(Kind.followUp)
                                                    .setOpening(opening1)
                                                    .setDoctorId(1);


        //call DB sql statment where appoint id is = to param then delete record
        if (appointment1.getId() == appointmentId) {
            return true;
        } else {
            return false;
        }
    }


    public Appointment createAppointment(final Integer doctorId, final Integer dayOfWeek, final Time time, final Appointment appointment) {

        Opening opening1 = new Opening().setDayOfWeek(1).setTime(Time.valueOf("11:00:00"));
        Appointment appointment1 = new Appointment().setId(1)
                                                    .setFirstName("joe")
                                                    .setLastName("laster")
                                                    .setKind(Kind.followUp)
                                                    .setOpening(opening1)
                                                    .setDoctorId(1);

        List<Appointment> list = Arrays.asList(appointment1);


        //time.getMinutes() some reason get minutes is Deprecated
        //Check if it is 15 min
        if (is15Minutes(time)) {
            //Check if doctor already has 3 appoints in sql at said time
            //SELECT COUNT(*) from appointment where appointment.doctorId == param > 3
            if (list.size() <= 3) {
                list.add(appointment);
            } else {
                throw new IllegalStateException("Doctors can not have more than 3 appoints");
            }
        } else {
            throw new IllegalArgumentException("time must be in 15 min");
        }
            return null;
    }

    public static boolean is15Minutes(Time time){
        time.toString().charAt(3);
        System.out.println(time.toString().charAt(3));
        System.out.println(time.toString().charAt(4));

        val minutes = String.valueOf(time.toString().charAt(3)) + String.valueOf(time.toString().charAt(4));
        System.out.println(minutes);

        return Integer.valueOf(minutes) % 15 == 0;
    }
}
