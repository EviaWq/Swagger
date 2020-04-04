package com.example.demos.beans;

import java.io.Serializable;
import java.util.List;

public class Access implements Serializable {

    private List<String> sysname;

    private List<String> createtime;

    public void setCreatetime(List<String> createtime) {
        this.createtime = createtime;
    }

    public List<String> getCreatetime() {
        return createtime;
    }

    public void setSysname(List<String> sysname) {
        this.sysname = sysname;
    }

    public List<String> getSysname() {
        return sysname;
    }
}
