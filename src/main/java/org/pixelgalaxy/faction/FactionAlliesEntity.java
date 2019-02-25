package org.pixelgalaxy.faction;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "faction_allies", schema = "faction")
@IdClass(FactionAlliesEntityPK.class)
public class FactionAlliesEntity {
    private int factionId;
    private int factionAlly;

    @Id
    @Column(name = "faction_id", nullable = false)
    public int getFactionId() {
        return factionId;
    }

    public void setFactionId(int factionId) {
        this.factionId = factionId;
    }

    @Id
    @Column(name = "faction_ally", nullable = false)
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
        FactionAlliesEntity that = (FactionAlliesEntity) o;
        return factionId == that.factionId &&
                factionAlly == that.factionAlly;
    }

    @Override
    public int hashCode() {
        return Objects.hash(factionId, factionAlly);
    }
}
