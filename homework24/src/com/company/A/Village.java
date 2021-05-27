package com.company.A;

public class Village extends Locality{
    public Village(){}

    public Village(String nameLocality, String nameLeader) {
        super(nameLocality, nameLeader);
    }

    @Override
    public String toString() {
        return String.format("Аким села %s, %s", getNameLocality(), getNameLeader());
    }
}
