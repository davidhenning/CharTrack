package de.webcodr.chartrack.Model;


import com.google.gson.annotations.Expose;


public class MysticSeason {

    @Expose
    private String slug;
    @Expose
    private Integer level;
    @Expose
    private Integer stepCurrent;
    @Expose
    private Integer stepMax;

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getStepCurrent() {
        return stepCurrent;
    }

    public void setStepCurrent(Integer stepCurrent) {
        this.stepCurrent = stepCurrent;
    }

    public Integer getStepMax() {
        return stepMax;
    }

    public void setStepMax(Integer stepMax) {
        this.stepMax = stepMax;
    }

}
