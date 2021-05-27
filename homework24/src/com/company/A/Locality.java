package com.company.A;

public abstract class Locality {
    private String nameLocality;
    private String nameLeader;

    public Locality(){}

    public Locality(String nameLocality, String nameLeader) {
        this.nameLocality = nameLocality;
        this.nameLeader = nameLeader;
    }

    public String getNameLocality() {
        return nameLocality;
    }

    public void setNameLocality(String nameLocality) {
        this.nameLocality = nameLocality;
    }

    public String getNameLeader() {
        return nameLeader;
    }

    public void setNameLeader(String nameLeader) {
        this.nameLeader = nameLeader;
    }
}
