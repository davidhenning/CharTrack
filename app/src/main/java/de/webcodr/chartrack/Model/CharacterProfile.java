package de.webcodr.chartrack.Model;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;


public class CharacterProfile {

    @Expose
    private String battleTag;
    @Expose
    private Integer paragonLevel;
    @Expose
    private Integer paragonLevelHardcore;
    @Expose
    private Integer paragonLevelSeason;
    @Expose
    private Integer paragonLevelSeasonHardcore;
    @Expose
    private ArrayList<Hero> heroes = new ArrayList<Hero>();
    @Expose
    private Integer lastHeroPlayed;
    @Expose
    private Integer lastUpdated;
    @Expose
    private Kills kills;
    @Expose
    private Integer highestDifficulty;
    @Expose
    private Integer highestHardcoreLevel;
    @Expose
    private TimePlayed timePlayed;
    @Expose
    private Progression progression;
    @Expose
    private List<Object> fallenHeroes = new ArrayList<Object>();
    @Expose
    private Blacksmith blacksmith;
    @Expose
    private Jeweler jeweler;
    @Expose
    private Mystic mystic;
    @Expose
    private BlacksmithHardcore blacksmithHardcore;
    @Expose
    private JewelerHardcore jewelerHardcore;
    @Expose
    private MysticHardcore mysticHardcore;
    @Expose
    private BlacksmithSeason blacksmithSeason;
    @Expose
    private JewelerSeason jewelerSeason;
    @Expose
    private MysticSeason mysticSeason;
    @Expose
    private BlacksmithSeasonHardcore blacksmithSeasonHardcore;
    @Expose
    private JewelerSeasonHardcore jewelerSeasonHardcore;
    @Expose
    private MysticSeasonHardcore mysticSeasonHardcore;

    public String getBattleTag() {
        return battleTag;
    }

    public void setBattleTag(String battleTag) {
        this.battleTag = battleTag;
    }

    public Integer getParagonLevel() {
        return paragonLevel;
    }

    public void setParagonLevel(Integer paragonLevel) {
        this.paragonLevel = paragonLevel;
    }

    public Integer getParagonLevelHardcore() {
        return paragonLevelHardcore;
    }

    public void setParagonLevelHardcore(Integer paragonLevelHardcore) {
        this.paragonLevelHardcore = paragonLevelHardcore;
    }

    public Integer getParagonLevelSeason() {
        return paragonLevelSeason;
    }

    public void setParagonLevelSeason(Integer paragonLevelSeason) {
        this.paragonLevelSeason = paragonLevelSeason;
    }

    public Integer getParagonLevelSeasonHardcore() {
        return paragonLevelSeasonHardcore;
    }

    public void setParagonLevelSeasonHardcore(Integer paragonLevelSeasonHardcore) {
        this.paragonLevelSeasonHardcore = paragonLevelSeasonHardcore;
    }

    public ArrayList<Hero> getHeroes() {
        return heroes;
    }

    public void setHeroes(ArrayList<Hero> heroes) {
        this.heroes = heroes;
    }

    public Integer getLastHeroPlayed() {
        return lastHeroPlayed;
    }

    public void setLastHeroPlayed(Integer lastHeroPlayed) {
        this.lastHeroPlayed = lastHeroPlayed;
    }

    public Integer getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Integer lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Kills getKills() {
        return kills;
    }

    public void setKills(Kills kills) {
        this.kills = kills;
    }

    public Integer getHighestDifficulty() {
        return highestDifficulty;
    }

    public void setHighestDifficulty(Integer highestDifficulty) {
        this.highestDifficulty = highestDifficulty;
    }

    public Integer getHighestHardcoreLevel() {
        return highestHardcoreLevel;
    }

    public void setHighestHardcoreLevel(Integer highestHardcoreLevel) {
        this.highestHardcoreLevel = highestHardcoreLevel;
    }

    public TimePlayed getTimePlayed() {
        return timePlayed;
    }

    public void setTimePlayed(TimePlayed timePlayed) {
        this.timePlayed = timePlayed;
    }

    public Progression getProgression() {
        return progression;
    }

    public void setProgression(Progression progression) {
        this.progression = progression;
    }

    public List<Object> getFallenHeroes() {
        return fallenHeroes;
    }

    public void setFallenHeroes(List<Object> fallenHeroes) {
        this.fallenHeroes = fallenHeroes;
    }

    public Blacksmith getBlacksmith() {
        return blacksmith;
    }

    public void setBlacksmith(Blacksmith blacksmith) {
        this.blacksmith = blacksmith;
    }

    public Jeweler getJeweler() {
        return jeweler;
    }

    public void setJeweler(Jeweler jeweler) {
        this.jeweler = jeweler;
    }

    public Mystic getMystic() {
        return mystic;
    }

    public void setMystic(Mystic mystic) {
        this.mystic = mystic;
    }

    public BlacksmithHardcore getBlacksmithHardcore() {
        return blacksmithHardcore;
    }

    public void setBlacksmithHardcore(BlacksmithHardcore blacksmithHardcore) {
        this.blacksmithHardcore = blacksmithHardcore;
    }

    public JewelerHardcore getJewelerHardcore() {
        return jewelerHardcore;
    }

    public void setJewelerHardcore(JewelerHardcore jewelerHardcore) {
        this.jewelerHardcore = jewelerHardcore;
    }

    public MysticHardcore getMysticHardcore() {
        return mysticHardcore;
    }

    public void setMysticHardcore(MysticHardcore mysticHardcore) {
        this.mysticHardcore = mysticHardcore;
    }

    public BlacksmithSeason getBlacksmithSeason() {
        return blacksmithSeason;
    }

    public void setBlacksmithSeason(BlacksmithSeason blacksmithSeason) {
        this.blacksmithSeason = blacksmithSeason;
    }

    public JewelerSeason getJewelerSeason() {
        return jewelerSeason;
    }

    public void setJewelerSeason(JewelerSeason jewelerSeason) {
        this.jewelerSeason = jewelerSeason;
    }

    public MysticSeason getMysticSeason() {
        return mysticSeason;
    }

    public void setMysticSeason(MysticSeason mysticSeason) {
        this.mysticSeason = mysticSeason;
    }

    public BlacksmithSeasonHardcore getBlacksmithSeasonHardcore() {
        return blacksmithSeasonHardcore;
    }

    public void setBlacksmithSeasonHardcore(BlacksmithSeasonHardcore blacksmithSeasonHardcore) {
        this.blacksmithSeasonHardcore = blacksmithSeasonHardcore;
    }

    public JewelerSeasonHardcore getJewelerSeasonHardcore() {
        return jewelerSeasonHardcore;
    }

    public void setJewelerSeasonHardcore(JewelerSeasonHardcore jewelerSeasonHardcore) {
        this.jewelerSeasonHardcore = jewelerSeasonHardcore;
    }

    public MysticSeasonHardcore getMysticSeasonHardcore() {
        return mysticSeasonHardcore;
    }

    public void setMysticSeasonHardcore(MysticSeasonHardcore mysticSeasonHardcore) {
        this.mysticSeasonHardcore = mysticSeasonHardcore;
    }

}
