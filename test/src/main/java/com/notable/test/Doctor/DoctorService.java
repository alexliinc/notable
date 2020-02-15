package com.notable.test.Doctor;

import com.notable.test.DataObjects.Doctor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


import java.util.Arrays;
import java.util.List;

@Getter
@Slf4j
@Component
public class DoctorService {

    public List<Doctor> getAllDoctors() {

        Doctor doctor1 = new Doctor().setId(1).setFirstName("Tome").setLastName("Lie");
        List<Doctor> list = Arrays.asList(doctor1);

        return list;
    }
}
