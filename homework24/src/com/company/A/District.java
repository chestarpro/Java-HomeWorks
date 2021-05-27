package com.company.A;

public class District extends Locality {
    private Village village;

    public District(){}

    public District(String nameLocality, String nameLeader) {
        super(nameLocality, nameLeader);
    }

    public District(String nameLocality, String nameLeader, Village village) {
        super(nameLocality, nameLeader);
        this.village = village;
    }

    public Village getVillage() {
        return village;
    }

    public void setVillage(Village village) {
        this.village = village;
    }

    @Override
    public String toString() {
        return String.format("Глава  района: %s, %s ", getNameLocality(), getNameLeader());
    }
}
