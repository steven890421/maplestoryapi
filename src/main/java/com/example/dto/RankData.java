package com.example.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RankData {

    @JsonProperty("Rank")
    private int rank;

    @JsonProperty("GameWorldId")
    private int gameWorldId;

    @JsonProperty("GameWorldName")
    private String gameWorldName;

    @JsonProperty("GameWorldImageUrl")
    private String gameWorldImageUrl;

    @JsonProperty("CharacterName")
    private String characterName;

    @JsonProperty("CharacterLookCipherText")
    private String characterLookCipherText;

    @JsonProperty("CharacterLookUrl")
    private String characterLookUrl;

    @JsonProperty("JobName")
    private String jobName;

    @JsonProperty("UnionDPS")
    private long unionDps;

    @JsonProperty("UnionTotalLevel")
    private int unionTotalLevel;

    @JsonProperty("UnionLevel")
    private int unionLevel;

    @JsonProperty("RankDPSChange")
    private String rankDpsChange;

    @JsonProperty("RankTotalLevelChange")
    private String rankTotalLevelChange;

    @JsonProperty("RankLevelChange")
    private String rankLevelChange;

    @JsonProperty("Guild")
    private String guild;

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getGameWorldId() {
        return gameWorldId;
    }

    public void setGameWorldId(int gameWorldId) {
        this.gameWorldId = gameWorldId;
    }

    public String getGameWorldName() {
        return gameWorldName;
    }

    public void setGameWorldName(String gameWorldName) {
        this.gameWorldName = gameWorldName;
    }

    public String getGameWorldImageUrl() {
        return gameWorldImageUrl;
    }

    public void setGameWorldImageUrl(String gameWorldImageUrl) {
        this.gameWorldImageUrl = gameWorldImageUrl;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterLookCipherText() {
        return characterLookCipherText;
    }

    public void setCharacterLookCipherText(String characterLookCipherText) {
        this.characterLookCipherText = characterLookCipherText;
    }

    public String getCharacterLookUrl() {
        return characterLookUrl;
    }

    public void setCharacterLookUrl(String characterLookUrl) {
        this.characterLookUrl = characterLookUrl;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public long getUnionDps() {
        return unionDps;
    }

    public void setUnionDps(long unionDps) {
        this.unionDps = unionDps;
    }

    public int getUnionTotalLevel() {
        return unionTotalLevel;
    }

    public void setUnionTotalLevel(int unionTotalLevel) {
        this.unionTotalLevel = unionTotalLevel;
    }

    public int getUnionLevel() {
        return unionLevel;
    }

    public void setUnionLevel(int unionLevel) {
        this.unionLevel = unionLevel;
    }

    public String getRankDpsChange() {
        return rankDpsChange;
    }

    public void setRankDpsChange(String rankDpsChange) {
        this.rankDpsChange = rankDpsChange;
    }

    public String getRankTotalLevelChange() {
        return rankTotalLevelChange;
    }

    public void setRankTotalLevelChange(String rankTotalLevelChange) {
        this.rankTotalLevelChange = rankTotalLevelChange;
    }

    public String getRankLevelChange() {
        return rankLevelChange;
    }

    public void setRankLevelChange(String rankLevelChange) {
        this.rankLevelChange = rankLevelChange;
    }

    public String getGuild() {
        return guild;
    }

    public void setGuild(String guild) {
        this.guild = guild;
    }
}