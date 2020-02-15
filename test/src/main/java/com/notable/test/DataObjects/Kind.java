package com.notable.test.DataObjects;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

//@Setter
@Getter
@AllArgsConstructor
@ToString
@Slf4j
@NoArgsConstructor
//(New Patient or Follow-up)
public enum Kind {
    newPatient("newPatient"),
    followUp("followUp");

    private String k;
}



