package org.pixelgalaxy.faction;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "faction_ranking", schema = "faction")
@IdClass(FactionRankingEntityPK.class)
public class FactionRankingEntity {
    private int factionRank;
    private int factionId;

    @Id
    @Column(name = "faction_rank", nullable = false)
    public int getFactionRank() {
        return factionRank;
    }

    public void setFactionRank(int factionRank) {
        this.factionRank = factionRank;
    }

    @Id
    @Column(name = "faction_id", nullable = false)
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
        FactionRankingEntity that = (FactionRankingEntity) o;
        return factionRank == that.factionRank &&
                factionId == that.factionId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(factionRank, factionId);
    }
}
