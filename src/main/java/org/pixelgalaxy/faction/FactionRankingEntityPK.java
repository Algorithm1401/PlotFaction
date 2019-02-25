package org.pixelgalaxy.faction;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class FactionRankingEntityPK implements Serializable {
    private int factionRank;
    private int factionId;

    @Column(name = "faction_rank", nullable = false)
    @Id
    public int getFactionRank() {
        return factionRank;
    }

    public void setFactionRank(int factionRank) {
        this.factionRank = factionRank;
    }

    @Column(name = "faction_id", nullable = false)
    @Id
    public int getFactionId() {
        return factionId;
    }

    public void setFactionId(int factionId) {
        this.factionId = factionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FactionRankingEntityPK that = (FactionRankingEntityPK) o;
        return factionRank == that.factionRank &&
                factionId == that.factionId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(factionRank, factionId);
    }
}
