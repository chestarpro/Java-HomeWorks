package org.example.model;

import lombok.*;
import java.util.Date;

@Getter
public class CurrentTimeModel {
    private final String currentTime = new Date().getHours() + ":" + new Date().getMinutes();
}
