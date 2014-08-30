package de.webcodr.chartrack.Model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Hero {

    @Expose
    private Integer paragonLevel;
    @Expose
    private Boolean seasonal;
    @Expose
    private String name;
    @Expose
    private Integer id;
    @Expose
    private Integer level;
    @Expose
    private Boolean hardcore;
    @Expose
    private Integer gender;
    @Expose
    private Boolean dead;
    @SerializedName("class")
    @Expose
    private String _class;
    @SerializedName("last-updated")
    @Expose
    private Integer lastUpdated;

    public Integer getParagonLevel() {
        return paragonLevel;
    }

    public void setParagonLevel(Integer paragonLevel) {
        this.paragonLevel = paragonLevel;
    }

    public Boolean getSeasonal() {
        return seasonal;
    }

    public void setSeasonal(Boolean seasonal) {
        this.seasonal = seasonal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Boolean getHardcore() {
        return hardcore;
    }

    public void setHardcore(Boolean hardcore) {
        this.hardcore = hardcore;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Boolean getDead() {
        return dead;
    }

    public void setDead(Boolean dead) {
        this.dead = dead;
    }

    public String getClass_() {
        return _class;
    }

    public void setClass_(String _class) {
        this._class = _class;
    }

    public Integer getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Integer lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

}
