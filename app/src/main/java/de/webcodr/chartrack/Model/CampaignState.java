package de.webcodr.chartrack.Model;


public class CampaignState {
    private Boolean campaignState;

    public CampaignState(Boolean campaignState) {
        this.campaignState = campaignState;
    }

    @Override
    public String toString() {
        if (campaignState) {
            return "completed";
        }

        return "not completed";
    }
}
