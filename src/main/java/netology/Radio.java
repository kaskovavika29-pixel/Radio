package ru.netology;

public class Radio {
    private int stationsCount = 10;
    private int currentStation, currentVolume;

    public Radio() {
    }

    public Radio(int stationsCount) {
        if (stationsCount > 0) this.stationsCount = stationsCount;
    }

    public int getStationsCount() {
        return stationsCount;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int station) {
        if (station >= 0 && station < stationsCount) currentStation = station;
    }

    public void setCurrentVolume(int volume) {
        if (volume >= 0 && volume <= 100) currentVolume = volume;
    }

    public void next() {
        currentStation = (currentStation == stationsCount - 1) ? 0 : currentStation + 1;
    }

    public void prev() {
        currentStation = (currentStation == 0) ? stationsCount - 1 : currentStation - 1;
    }

    public void increaseVolume() {
        if (currentVolume < 100) currentVolume++;
    }

    public void decreaseVolume() {
        if (currentVolume > 0) currentVolume--;
    }
}
