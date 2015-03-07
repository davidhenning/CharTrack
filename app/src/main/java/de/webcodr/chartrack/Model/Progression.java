package de.webcodr.chartrack.Model;

import com.google.gson.annotations.Expose;

public class Progression {

    @Expose
    private Boolean act1;
    @Expose
    private Boolean act2;
    @Expose
    private Boolean act3;
    @Expose
    private Boolean act4;
    @Expose
    private Boolean act5;

    public Boolean getAct1() {
        return act1;
    }

    public void setAct1(Boolean act1) {
        this.act1 = act1;
    }

    public Boolean getAct2() {
        return act2;
    }

    public void setAct2(Boolean act2) {
        this.act2 = act2;
    }

    public Boolean getAct3() {
        return act3;
    }

    public void setAct3(Boolean act3) {
        this.act3 = act3;
    }

    public Boolean getAct4() {
        return act4;
    }

    public void setAct4(Boolean act4) {
        this.act4 = act4;
    }

    public Boolean getAct5() {
        return act5;
    }

    public void setAct5(Boolean act5) {
        this.act5 = act5;
    }

    public Boolean hasCompletedMainCampaign() {
        return getAct1() && getAct2() && getAct3() && getAct4();
    }

    public Boolean hasCompletedAddonCampaign() {
        return getAct5();
    }
}
