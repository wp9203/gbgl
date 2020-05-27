package com.nantian.vo;

import java.util.List;

public class ListFlowVO {

    List<FlowVO> infos;

    public List<FlowVO> getInfos() {
        return infos;
    }

    public void setInfos(List<FlowVO> infos) {
        this.infos = infos;
    }

    @Override
    public String toString() {
        return "ListFlowVO{" +
                "infos=" + infos +
                '}';
    }
}
