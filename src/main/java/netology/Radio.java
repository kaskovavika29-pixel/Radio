package ru.netology;

public class Radio {
    private int maxStationsCount = 10;
    private int currentStation, currentVolume;

    public Radio() {
    }

    public Radio(int maxStationsCount) {
        if (maxStationsCount > 0) this.maxStationsCount = maxStationsCount;
    }

    public int getMaxStationsCount() {
        return maxStationsCount;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int station) {
        if (station >= 0 && station < maxStationsCount) currentStation = station;
    }

    public void setCurrentVolume(int volume) {
        if (volume >= 0 && volume <= 100) currentVolume = volume;
    }

    public void next() {
        currentStation = (currentStation == maxStationsCount - 1) ? 0 : currentStation + 1;
    }

    public void prev() {
        currentStation = (currentStation == 0) ? maxStationsCount - 1 : currentStation - 1;
    }

    public void increaseVolume() {
        if (currentVolume < 100) currentVolume++;
    }

    public void decreaseVolume() {
        if (currentVolume > 0) currentVolume--;
    }
}