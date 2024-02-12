package com.tutorial.responsibillity.design.pattern;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActivityModel {
    private Long preId;
    private Long id;
    private Long nextId;
    private Integer reasonCode;
    private Date startDate;
    private Date endDate;
    private Integer statusCode;
    private String statusText;
}
