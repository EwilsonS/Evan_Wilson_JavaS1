package com.company;

public class Kitchen {
private String refrigeratorManufacturer;
private Boolean island;

    public Kitchen(String refrigeratorManufacturer, Boolean island) {
        this.refrigeratorManufacturer = refrigeratorManufacturer;
        this.island = island;
    }

    public String getRefrigeratorManufacturer() {
        return refrigeratorManufacturer;
    }

    public void setRefrigeratorManufacturer(String refrigeratorManufacturer) {
        this.refrigeratorManufacturer = refrigeratorManufacturer;
    }

    public Boolean getIsland() {
        return island;
    }

    public void setIsland(Boolean island) {
        this.island = island;
    }
}
