package ru.netology.domain;

public class Radio {
    private int radioStation;
    private int maxRadioStation = 10 - 1;
    private int radioVolume;

    public Radio() {
    }

      public Radio(int radioStation, int maxRadioStation, int radioVolume) {
        this.radioStation = radioStation;
        this.maxRadioStation = maxRadioStation;
        this.radioVolume = radioVolume;
    }

    public int getRadioStation() {
        return this.radioStation;
    }

    public Radio(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation - 1;
    }

    public int setRadioStation(int radioStation) {
        if (radioStation < 0) {
            radioStation = maxRadioStation;
        }
        if (radioStation > maxRadioStation) {
            radioStation = 0;
        }
        this.radioStation = radioStation;
        return radioStation;
    }

    public void setRadioStationNext() {
        setRadioStation(radioStation = radioStation + 1);
    }

    public void setRadioStationPrev() {  //
        setRadioStation(radioStation = radioStation - 1);
    }

    public int getRadioVolume() { //узнаем текущую громкость
        return this.radioVolume;
    }

    public void setRadioVolume(int radioVolume) {
        if (radioVolume < 0) {
            radioVolume = 0;
        }
        if (radioVolume > 100) {
            radioVolume = 100;
        }
        this.radioVolume = radioVolume;
    }

    public void volumePlus() {
        setRadioVolume(radioVolume = radioVolume + 1);
    }

    public void volumeMinus() {
        setRadioVolume(radioVolume = radioVolume - 1);
    }
}

















