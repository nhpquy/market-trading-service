package com.tlc.group.seven.marketdataservice.log.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@Data
public class LogData {
    private String title;
    private String event;
    private String description;
    private String service;
    private Date timestamp;
}