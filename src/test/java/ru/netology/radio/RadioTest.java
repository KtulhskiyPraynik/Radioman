package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    void currentStation() {
        Radio cond = new Radio();

        cond.setCurrentStation(1);

        int actual = cond.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void currentStationNegative() {
        Radio cond = new Radio();

        cond.setCurrentStation(-1);

        int actual = cond.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void currentStationOverLimit() {
        Radio cond = new Radio();

        cond.setCurrentStation(10);

        int actual = cond.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void nextStation() {
        Radio cond = new Radio();

        cond.setCurrentStation(1);
        cond.setNextStation();

        int actual = cond.getNextStation();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void nextStationOverLimit() {
        Radio cond = new Radio();

        cond.setCurrentStation(9);
        cond.setNextStation();

        int actual = cond.getNextStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void prevStation() {
        Radio cond = new Radio();

        cond.setCurrentStation(2);
        cond.setPrevStation();

        int actual = cond.getPrevStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void prevStationNegative() {
        Radio cond = new Radio();

        cond.setCurrentStation(0);
        cond.setPrevStation();

        int actual = cond.getPrevStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void prevStationLimit() {
        Radio cond = new Radio();

        cond.setCurrentStation(9);
        cond.setPrevStation();

        int actual = cond.getPrevStation();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void currentVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(1);

        int actual = cond.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void currentVolumeNegative() {
        Radio cond = new Radio();

        cond.setCurrentVolume(-1);

        int actual = cond.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void currentVolumeOverLimit() {
        Radio cond = new Radio();

        cond.setCurrentVolume(101);

        int actual = cond.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(99);
        cond.setIncreaseVolume();

        int actual = cond.getIncreaseVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeOverLimit() {
        Radio cond = new Radio();

        cond.setCurrentVolume(100);
        cond.setIncreaseVolume();

        int actual = cond.getIncreaseVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    void reduceVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(1);
        cond.setReduceVolume();

        int actual = cond.getReduceVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void reduceVolumeNegative() {
        Radio cond = new Radio();

        cond.setCurrentVolume(-1);
        cond.setReduceVolume();

        int actual = cond.getReduceVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void reduceVolumeLimit() {
        Radio cond = new Radio();

        cond.setCurrentVolume(100);
        cond.setReduceVolume();

        int actual = cond.getReduceVolume();
        int expected = 99;
        assertEquals(expected, actual);
    }

    @Test
    void reduceVolumeOverLimit() {
        Radio cond = new Radio();

        cond.setCurrentVolume(101);
        cond.setReduceVolume();

        int actual = cond.getReduceVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
}
