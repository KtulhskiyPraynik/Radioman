package ru.netology.radio;

public class Radio {
    private int numberStation = 10;
    private int maxVolume = 100;
    private int currentStation;
    private int currentVolume;

    public Radio(int numberStation) {
        this.numberStation = numberStation;
    }

    public Radio() {
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > numberStation - 1) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setNextStation() {
        if (currentStation < numberStation - 1) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public int getNextStation() {
        return currentStation;
    }

    public void setPrevStation() {
        if (currentStation == 0) {
            currentStation = numberStation - 1;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public int getPrevStation() {
        return currentStation;
    }

    public void setIncreaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public int getIncreaseVolume() {
        return currentVolume;
    }

    public void setReduceVolume() {
        if (currentVolume == 0) {
            return;
        } else {
            currentVolume = currentVolume - 1;
        }
    }

    public int getReduceVolume() {
        return currentVolume;
    }
}
