package at.fhtw.bic.uptimecalculatorbic.controller;

import jdk.jshell.spi.ExecutionControl;

import java.security.InvalidParameterException;

public class DowntimeController {
    public double calculateDowntimeMinutes(double relative) {
        if (relative<0.0 || relative > 100.0)
            throw new InvalidParameterException();
        double minutesOfMonth = 60*24*30;
        double definedUptimeInPercent = relative / 100;
        return minutesOfMonth * definedUptimeInPercent; // uptime in minutes
    }
}
