package com.notable.test.Doctor;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/doctor")
public class DoctorController {

    @GetMapping(path = "/all",
            produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAllDoctors(
    ) {
        return ResponseEntity.ok(mDoctorService.getAllDoctors());
    }

    // Privates
    private final DoctorService mDoctorService;
}
