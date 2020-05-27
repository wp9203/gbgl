package com.nantian.vo;

import java.util.List;

public class ListComVO {

    List<ComDisInsReOpVO> infos;

    public List<ComDisInsReOpVO> getInfos() {
        return infos;
    }

    public void setInfos(List<ComDisInsReOpVO> infos) {
        this.infos = infos;
    }

    @Override
    public String toString() {
        return "ListComVO{" +
                "infos=" + infos +
                '}';
    }
}

