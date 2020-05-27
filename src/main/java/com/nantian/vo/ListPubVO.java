package com.nantian.vo;

import java.util.List;

public class ListPubVO {

    java.util.List<PubBeforeInOfficeVO> infos;

    public List<PubBeforeInOfficeVO> getInfos() {
        return infos;
    }

    public void setInfos(List<PubBeforeInOfficeVO> infos) {
        this.infos = infos;
    }

    @Override
    public String toString() {
        return "ListPubVO{" +
                "infos=" + infos +
                '}';
    }
}
