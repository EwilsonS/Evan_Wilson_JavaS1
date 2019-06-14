package com.company;

public class Basement {
    private boolean centralAc;
    private boolean finished;

    public Basement(boolean centralAc, boolean finished) {
        this.centralAc = centralAc;
        this.finished = finished;
    }

    public boolean isCentralAc() {
        return centralAc;
    }

    public void setCentralAc(boolean centralAc) {
        this.centralAc = centralAc;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
}
