package com.notable.test.DataObjects;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Slf4j
//Appointments should have a unique ID, patient first name, patient last name, date & time, and kind (New Patient or Follow-up)
public class Appointment {
    private Integer mId;
    private String mFirstName;
    private String mLastName;
    private Opening mOpening;
    private Kind mKind;
    private Integer mDoctorId;
}
