package com.example.demos.beans;

import java.io.Serializable;
import java.util.List;

public class ShowUserResult implements Serializable {

    private List<String> sn;
    private List<Integer> num;
    private List<String> tm;

    public List<String> getSn() {
        return sn;
    }

    public void setSn(List<String> sn) {
        this.sn = sn;
    }

    public void setNum(List<Integer> num) {
        this.num = num;
    }

    public List<Integer> getNum() {
        return num;
    }
    public List<String> getTm() {
        return tm;
    }

    public void setTm(List<String> tm) {
        this.tm = tm;
    }


}
