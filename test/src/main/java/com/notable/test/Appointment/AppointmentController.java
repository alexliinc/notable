package com.notable.test.Appointment;

import com.notable.test.DataObjects.Appointment;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/appointment")
public class AppointmentController {

    //● Get a list of all appointments for a particular doctor and particular day
    @GetMapping(path = "/all",
            produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAllApptForDocAndDay(
            @RequestParam final Integer doctorId,
            @RequestParam final Integer dayOfWeek
    ) {
        return ResponseEntity.ok(mAppointmentService.getApptForDocAndDay(doctorId, dayOfWeek));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Object> deleteAppt(
            @PathVariable Integer id
    ) {
        if (mAppointmentService.deleteAppint(id)){
            return ResponseEntity.ok("Deleted Successful");
        } else {
            return ResponseEntity.ok("UNSUCCESSFUL");
        }
    }

    @PostMapping(path = "/create",
            produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> createAppt(
            @RequestParam final Integer doctorId,
            @RequestParam final Integer dayOfWeek,
            @RequestParam final Time time,
            @RequestBody final Appointment appointment
    ) {
        return ResponseEntity.ok(mAppointmentService.createAppointment(doctorId, dayOfWeek, time, appointment));
    }

    // Privates
    private final AppointmentService mAppointmentService;
}
