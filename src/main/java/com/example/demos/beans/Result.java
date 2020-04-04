package com.example.demos.beans;

import java.io.Serializable;
import java.util.List;

public class Result implements Serializable {

    private List<String> ct;
    private List<Integer> cnt;


    public void setCt(List<String> ct) {
        this.ct = ct;
    }

    @Override
    public String toString() {
        return "Result{" +
                "ct=" + ct +
                ", cnt=" + cnt +
                '}';
    }

    public List<String> getCt() {
        return ct;
    }

    public void setCnt(List<Integer> cnt) {
        this.cnt = cnt;
    }

    public List<Integer> getCnt() {
        return cnt;
    }
}
