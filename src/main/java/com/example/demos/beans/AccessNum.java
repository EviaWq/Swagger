package com.example.demos.beans;

import java.io.Serializable;
import java.util.List;

public class AccessNum implements Serializable {

private List<Integer> nums;

    public void setNums(List<Integer> nums) {
        this.nums = nums;
    }

    public List<Integer> getNums() {
        return nums;
    }
}
