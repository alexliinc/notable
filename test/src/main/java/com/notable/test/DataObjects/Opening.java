package com.notable.test.DataObjects;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.sql.Time;

@Setter
@Getter
@AllArgsConstructor
@ToString
@Slf4j
@NoArgsConstructor
public class Opening {
    private Integer mDayOfWeek;
    //sunday is 0 monday is 1 and so on
    private Time mTime;
}
