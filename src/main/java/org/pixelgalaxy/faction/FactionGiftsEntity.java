package org.pixelgalaxy.faction;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "faction_gifts", schema = "faction")
public class FactionGiftsEntity {
    private String memberGiftUuid;
    private Date memberGiftDate;

    @Id
    @Column(name = "member_gift_uuid", nullable = false, length = 36)
    public String getMemberGiftUuid() {
        return memberGiftUuid;
    }

    public void setMemberGiftUuid(String memberGiftUuid) {
        this.memberGiftUuid = memberGiftUuid;
    }

    @Basic
    @Column(name = "member_gift_date", nullable = false)
    public Date getMemberGiftDate() {
        return memberGiftDate;
    }

    public void setMemberGiftDate(Date memberGiftDate) {
        this.memberGiftDate = memberGiftDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FactionGiftsEntity that = (FactionGiftsEntity) o;
        return Objects.equals(memberGiftUuid, that.memberGiftUuid) &&
                Objects.equals(memberGiftDate, that.memberGiftDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberGiftUuid, memberGiftDate);
    }
}
