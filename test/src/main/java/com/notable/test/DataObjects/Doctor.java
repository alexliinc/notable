package com.notable.test.DataObjects;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@AllArgsConstructor
@ToString
@Slf4j
@NoArgsConstructor
public class Doctor {
    private Integer mId;
    private String mFirstName;
    private String mLastName;
}
