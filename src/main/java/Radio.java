public class Radio {
    private int numberOfStations;
    private int currentStation;
    private int volume;

    public Radio() {
        this.numberOfStations = 10; // по умолчанию 10 станций
        this.currentStation = 0; // начинаем с первой станции
        this.volume = 0; // начальная громкость 0
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
        this.currentStation = 0;
        this.volume = 0;
    }

    public int getNumberOfStations() {
        return numberOfStations;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int station) {
        if (station >= 0 && station < numberOfStations) {
            currentStation = station;
        }
    }

    public void nextStation() {
        if (currentStation == numberOfStations - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void previousStation() {
        if (currentStation == 0) {
            currentStation = numberOfStations - 1;
        } else {
            currentStation--;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }
}