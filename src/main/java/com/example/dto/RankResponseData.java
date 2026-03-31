package com.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class RankResponseData {

    @JsonProperty("PageCount")
    private int pageCount;

    @JsonProperty("RankDatas")
    private List<RankData> rankDatas;

    // getter / setter
    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public List<RankData> getRankDatas() {
        return rankDatas;
    }

    public void setRankDatas(List<RankData> rankDatas) {
        this.rankDatas = rankDatas;
    }
}
