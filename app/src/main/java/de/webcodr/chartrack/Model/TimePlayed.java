package de.webcodr.chartrack.Model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class TimePlayed {

    @Expose
    private Double barbarian;
    @Expose
    private Double crusader;
    @SerializedName("demon-hunter")
    @Expose
    private Double demonHunter;
    @Expose
    private Double monk;
    @SerializedName("witch-doctor")
    @Expose
    private Double witchDoctor;
    @Expose
    private Double wizard;

    public Double getBarbarian() {
        return barbarian;
    }

    public void setBarbarian(Double barbarian) {
        this.barbarian = barbarian;
    }

    public Double getCrusader() {
        return crusader;
    }

    public void setCrusader(Double crusader) {
        this.crusader = crusader;
    }

    public Double getDemonHunter() {
        return demonHunter;
    }

    public void setDemonHunter(Double demonHunter) {
        this.demonHunter = demonHunter;
    }

    public Double getMonk() {
        return monk;
    }

    public void setMonk(Double monk) {
        this.monk = monk;
    }

    public Double getWitchDoctor() {
        return witchDoctor;
    }

    public void setWitchDoctor(Double witchDoctor) {
        this.witchDoctor = witchDoctor;
    }

    public Double getWizard() {
        return wizard;
    }

    public void setWizard(Double wizard) {
        this.wizard = wizard;
    }

}
