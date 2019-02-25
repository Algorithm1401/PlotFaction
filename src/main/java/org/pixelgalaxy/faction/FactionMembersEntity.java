package org.pixelgalaxy.faction;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "faction_members", schema = "faction")
public class FactionMembersEntity {
    private String factionMemberUuid;
    private short factionMemberType;

    @Id
    @Column(name = "faction_member_uuid", nullable = false, length = 36)
    public String getFactionMemberUuid() {
        return factionMemberUuid;
    }

    public void setFactionMemberUuid(String factionMemberUuid) {
        this.factionMemberUuid = factionMemberUuid;
    }

    @Basic
    @Column(name = "faction_member_type", nullable = false)
    public short getFactionMemberType() {
        return factionMemberType;
    }

    public void setFactionMemberType(short factionMemberType) {
        this.factionMemberType = factionMemberType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FactionMembersEntity that = (FactionMembersEntity) o;
        return factionMemberType == that.factionMemberType &&
                Objects.equals(factionMemberUuid, that.factionMemberUuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(factionMemberUuid, factionMemberType);
    }
}
