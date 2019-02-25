package org.pixelgalaxy.faction;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class FactionRaidsEntityPK implements Serializable {
    private int factionId;
    private Date raidDate;

    @Column(name = "faction_id", nullable = false)
    @Id
    public int getFactionId() {
        return factionId;
    }

    public void setFactionId(int factionId) {
        this.factionId = factionId;
    }

    @Column(name = "raid_date", nullable = false)
    @Id
    public Date getRaidDate() {
        return raidDate;
    }

    public void setRaidDate(Date raidDate) {
        this.raidDate = raidDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FactionRaidsEntityPK that = (FactionRaidsEntityPK) o;
        return factionId == that.factionId &&
                Objects.equals(raidDate, that.raidDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(factionId, raidDate);
    }
}
