package com.company;

public class Skeleton extends Boss{
    int arrows = 50;

    public int getArrows() {
        return arrows;
    }
    public String printInfo(){
        return super.printInfo() + arrows;
    }
}


