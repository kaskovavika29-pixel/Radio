public class Radio {
    private int currentStation;
    private int currentVolume;

    // --- Геттеры и сеттеры (как в Conditioner) ---

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    // --- Методы управления, использующие сеттеры ---

    public void next() {
        if (currentStation == 9) {
            setCurrentStation(0); // Используем сеттер для сброса на 0
        } else {
            setCurrentStation(currentStation + 1); // Передаем в сеттер следующую
        }
    }

    public void prev() {
        if (currentStation == 0) {
            setCurrentStation(9); // Используем сеттер для перехода на 9
        } else {
            setCurrentStation(currentStation - 1); // Передаем в сеттер предыдущую
        }
    }

    public void increaseVolume() {
        // Просто передаем в сеттер текущую громкость + 1
        // Если станет 101, сеттер сам её проигнорирует благодаря проверке "if (newCurrentVolume > 100)"
        setCurrentVolume(currentVolume + 1);
    }

    public void decreaseVolume() {
        // Передаем текущую громкость - 1
        // Если станет -1, сеттер сам её проигнорирует
        setCurrentVolume(currentVolume - 1);
    }
}
