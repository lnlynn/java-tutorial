package com.liuning.ChainOfResponsibilityPattern.impl;

import com.liuning.ChainOfResponsibilityPattern.Emperor;
import com.liuning.ChainOfResponsibilityPattern.Official;

public class ShangdongOfficial extends Official {

    public ShangdongOfficial() {
        this.title = "山东总督";
    }

    @Override
    protected void serve(Emperor emperor) {
        emperor.play(this, "孔庙");
    }
}
