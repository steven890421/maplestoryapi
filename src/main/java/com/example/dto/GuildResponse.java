package com.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class GuildResponse {

    private String date;

    @JsonProperty("world_name")
    private String worldName;

    @JsonProperty("guild_name")
    private String guildName;

    @JsonProperty("guild_level")
    private int guildLevel;

    @JsonProperty("guild_fame")
    private long guildFame;

    @JsonProperty("guild_point")
    private long guildPoint;

    @JsonProperty("guild_master_name")
    private String guildMasterName;

    @JsonProperty("guild_member_count")
    private int guildMemberCount;

    @JsonProperty("guild_member")
    private List<String> guildMember;

    @JsonProperty("guild_skill")
    private List<GuildSkill> guildSkill;

    @JsonProperty("guild_noblesse_skill")
    private List<GuildNoblesseSkill> guildNoblesseSkill;

    // getters
    public String getDate() { return date; }
    public String getWorldName() { return worldName; }
    public String getGuildName() { return guildName; }
    public int getGuildLevel() { return guildLevel; }
    public long getGuildFame() { return guildFame; }
    public long getGuildPoint() { return guildPoint; }
    public String getGuildMasterName() { return guildMasterName; }
    public int getGuildMemberCount() { return guildMemberCount; }
    public List<String> getGuildMember() { return guildMember; }
    public List<GuildSkill> getGuildSkill() { return guildSkill; }
    public List<GuildNoblesseSkill> getGuildNoblesseSkill() { return guildNoblesseSkill; }
}