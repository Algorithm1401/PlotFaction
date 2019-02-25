package org.pixelgalaxy.faction;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "faction_raids", schema = "faction")
@IdClass(FactionRaidsEntityPK.class)
public class FactionRaidsEntity {
    private int factionId;
    private Date raidDate;
    private short raidPoints;

    @Id
    @Column(name = "faction_id", nullable = false)
    public int getFactionId() {
        return factionId;
    }

    public void setFactionId(int factionId) {
        this.factionId = factionId;
    }

    @Id
    @Column(name = "raid_date", nullable = false)
    public Date getRaidDate() {
        return raidDate;
    }

    public void setRaidDate(Date raidDate) {
        this.raidDate = raidDate;
    }

    @Basic
    @Column(name = "raid_points", nullable = false)
    public short getRaidPoints() {
        return raidPoints;
    }

    public void setRaidPoints(short raidPoints) {
        this.raidPoints = raidPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FactionRaidsEntity that = (FactionRaidsEntity) o;
        return factionId == that.factionId &&
                raidPoints == that.raidPoints &&
                Objects.equals(raidDate, that.raidDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(factionId, raidDate, raidPoints);
    }
}
