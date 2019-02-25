package org.pixelgalaxy.faction;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class FactionAlliesEntityPK implements Serializable {
    private int factionId;
    private int factionAlly;

    @Column(name = "faction_id", nullable = false)
    @Id
    public int getFactionId() {
        return factionId;
    }

    public void setFactionId(int factionId) {
        this.factionId = factionId;
    }

    @Column(name = "faction_ally", nullable = false)
    @Id
    public int getFactionAlly() {
        return factionAlly;
    }

    public void setFactionAlly(int factionAlly) {
        this.factionAlly = factionAlly;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FactionAlliesEntityPK that = (FactionAlliesEntityPK) o;
        return factionId == that.factionId &&
                factionAlly == that.factionAlly;
    }

    @Override
    public int hashCode() {
        return Objects.hash(factionId, factionAlly);
    }
}
