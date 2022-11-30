package at.fhtw.bic.uptimecalculatorbic.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UptimeControllerTest {

    @Test
    void calculateUptimeMinutes() {
        // A - Arrange
        UptimeController controller = new UptimeController();

        // A - Act
        var result = controller.calculateUptimeMinutes(0.0);

        // A - Assert
        assertEquals(0.0, result);
    }

    @Test
    void calculateUptimeHours() {
    }
}