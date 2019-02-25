package org.pixelgalaxy.faction;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "faction_perms", schema = "faction")
public class FactionPermsEntity {
    private int factionId;
    private short groupPermRaidgui;
    private short groupPermRaidjoin;
    private short groupPermInventories;
    private short groupPermInteract;
    private short groupPermBuild;
    private short groupPermInvitePlayers;
    private short groupPermUninvitePlayers;
    private short groupPermPromoteMembers;
    private short groupPermDemoteMembers;
    private short groupPermKickMembers;
    private short groupPermAllyFactions;
    private short groupPermUnallyFactions;
    private short groupPermWithdrawFunds;

    @Id
    @Column(name = "faction_id", nullable = false)
    public int getFactionId() {
        return factionId;
    }

    public void setFactionId(int factionId) {
        this.factionId = factionId;
    }

    @Basic
    @Column(name = "group_perm_raidgui", nullable = false)
    public short getGroupPermRaidgui() {
        return groupPermRaidgui;
    }

    public void setGroupPermRaidgui(short groupPermRaidgui) {
        this.groupPermRaidgui = groupPermRaidgui;
    }

    @Basic
    @Column(name = "group_perm_raidjoin", nullable = false)
    public short getGroupPermRaidjoin() {
        return groupPermRaidjoin;
    }

    public void setGroupPermRaidjoin(short groupPermRaidjoin) {
        this.groupPermRaidjoin = groupPermRaidjoin;
    }

    @Basic
    @Column(name = "group_perm_inventories", nullable = false)
    public short getGroupPermInventories() {
        return groupPermInventories;
    }

    public void setGroupPermInventories(short groupPermInventories) {
        this.groupPermInventories = groupPermInventories;
    }

    @Basic
    @Column(name = "group_perm_interact", nullable = false)
    public short getGroupPermInteract() {
        return groupPermInteract;
    }

    public void setGroupPermInteract(short groupPermInteract) {
        this.groupPermInteract = groupPermInteract;
    }

    @Basic
    @Column(name = "group_perm_build", nullable = false)
    public short getGroupPermBuild() {
        return groupPermBuild;
    }

    public void setGroupPermBuild(short groupPermBuild) {
        this.groupPermBuild = groupPermBuild;
    }

    @Basic
    @Column(name = "group_perm_invitePlayers", nullable = false)
    public short getGroupPermInvitePlayers() {
        return groupPermInvitePlayers;
    }

    public void setGroupPermInvitePlayers(short groupPermInvitePlayers) {
        this.groupPermInvitePlayers = groupPermInvitePlayers;
    }

    @Basic
    @Column(name = "group_perm_uninvitePlayers", nullable = false)
    public short getGroupPermUninvitePlayers() {
        return groupPermUninvitePlayers;
    }

    public void setGroupPermUninvitePlayers(short groupPermUninvitePlayers) {
        this.groupPermUninvitePlayers = groupPermUninvitePlayers;
    }

    @Basic
    @Column(name = "group_perm_promoteMembers", nullable = false)
    public short getGroupPermPromoteMembers() {
        return groupPermPromoteMembers;
    }

    public void setGroupPermPromoteMembers(short groupPermPromoteMembers) {
        this.groupPermPromoteMembers = groupPermPromoteMembers;
    }

    @Basic
    @Column(name = "group_perm_demoteMembers", nullable = false)
    public short getGroupPermDemoteMembers() {
        return groupPermDemoteMembers;
    }

    public void setGroupPermDemoteMembers(short groupPermDemoteMembers) {
        this.groupPermDemoteMembers = groupPermDemoteMembers;
    }

    @Basic
    @Column(name = "group_perm_kickMembers", nullable = false)
    public short getGroupPermKickMembers() {
        return groupPermKickMembers;
    }

    public void setGroupPermKickMembers(short groupPermKickMembers) {
        this.groupPermKickMembers = groupPermKickMembers;
    }

    @Basic
    @Column(name = "group_perm_allyFactions", nullable = false)
    public short getGroupPermAllyFactions() {
        return groupPermAllyFactions;
    }

    public void setGroupPermAllyFactions(short groupPermAllyFactions) {
        this.groupPermAllyFactions = groupPermAllyFactions;
    }

    @Basic
    @Column(name = "group_perm_unallyFactions", nullable = false)
    public short getGroupPermUnallyFactions() {
        return groupPermUnallyFactions;
    }

    public void setGroupPermUnallyFactions(short groupPermUnallyFactions) {
        this.groupPermUnallyFactions = groupPermUnallyFactions;
    }

    @Basic
    @Column(name = "group_perm_withdrawFunds", nullable = false)
    public short getGroupPermWithdrawFunds() {
        return groupPermWithdrawFunds;
    }

    public void setGroupPermWithdrawFunds(short groupPermWithdrawFunds) {
        this.groupPermWithdrawFunds = groupPermWithdrawFunds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FactionPermsEntity that = (FactionPermsEntity) o;
        return factionId == that.factionId &&
                groupPermRaidgui == that.groupPermRaidgui &&
                groupPermRaidjoin == that.groupPermRaidjoin &&
                groupPermInventories == that.groupPermInventories &&
                groupPermInteract == that.groupPermInteract &&
                groupPermBuild == that.groupPermBuild &&
                groupPermInvitePlayers == that.groupPermInvitePlayers &&
                groupPermUninvitePlayers == that.groupPermUninvitePlayers &&
                groupPermPromoteMembers == that.groupPermPromoteMembers &&
                groupPermDemoteMembers == that.groupPermDemoteMembers &&
                groupPermKickMembers == that.groupPermKickMembers &&
                groupPermAllyFactions == that.groupPermAllyFactions &&
                groupPermUnallyFactions == that.groupPermUnallyFactions &&
                groupPermWithdrawFunds == that.groupPermWithdrawFunds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(factionId, groupPermRaidgui, groupPermRaidjoin, groupPermInventories, groupPermInteract, groupPermBuild, groupPermInvitePlayers, groupPermUninvitePlayers, groupPermPromoteMembers, groupPermDemoteMembers, groupPermKickMembers, groupPermAllyFactions, groupPermUnallyFactions, groupPermWithdrawFunds);
    }
}
