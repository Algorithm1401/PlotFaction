package org.pixelgalaxy.faction;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "faction_stats", schema = "faction")
public class FactionStatsEntity {
    private int factionId;
    private String factionName;
    private String server;
    private Integer factionExperience;
    private int factionXCoordinate;
    private int factionZCoordinate;
    private Byte factionEnergy;
    private Byte factionPlotType;
    private Short factionPoints;
    private Double factionBalance;
    private Date factionProtectionDate;
    private String factionLastOnlineDate;
    private String factionBanner;

    @Id
    @Column(name = "faction_id", nullable = false)
    public int getFactionId() {
        return factionId;
    }

    public void setFactionId(int factionId) {
        this.factionId = factionId;
    }

    @Basic
    @Column(name = "faction_name", nullable = false, length = 15)
    public String getFactionName() {
        return factionName;
    }

    public void setFactionName(String factionName) {
        this.factionName = factionName;
    }

    @Basic
    @Column(name = "server", nullable = false, length = 3)
    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    @Basic
    @Column(name = "faction_experience", nullable = true)
    public Integer getFactionExperience() {
        return factionExperience;
    }

    public void setFactionExperience(Integer factionExperience) {
        this.factionExperience = factionExperience;
    }

    @Basic
    @Column(name = "faction_x_coordinate", nullable = false)
    public int getFactionXCoordinate() {
        return factionXCoordinate;
    }

    public void setFactionXCoordinate(int factionXCoordinate) {
        this.factionXCoordinate = factionXCoordinate;
    }

    @Basic
    @Column(name = "faction_z_coordinate", nullable = false)
    public int getFactionZCoordinate() {
        return factionZCoordinate;
    }

    public void setFactionZCoordinate(int factionZCoordinate) {
        this.factionZCoordinate = factionZCoordinate;
    }

    @Basic
    @Column(name = "faction_energy", nullable = true)
    public Byte getFactionEnergy() {
        return factionEnergy;
    }

    public void setFactionEnergy(Byte factionEnergy) {
        this.factionEnergy = factionEnergy;
    }

    @Basic
    @Column(name = "faction_plot_type", nullable = true)
    public Byte getFactionPlotType() {
        return factionPlotType;
    }

    public void setFactionPlotType(Byte factionPlotType) {
        this.factionPlotType = factionPlotType;
    }

    @Basic
    @Column(name = "faction_points", nullable = true)
    public Short getFactionPoints() {
        return factionPoints;
    }

    public void setFactionPoints(Short factionPoints) {
        this.factionPoints = factionPoints;
    }

    @Basic
    @Column(name = "faction_balance", nullable = true, precision = 0)
    public Double getFactionBalance() {
        return factionBalance;
    }

    public void setFactionBalance(Double factionBalance) {
        this.factionBalance = factionBalance;
    }

    @Basic
    @Column(name = "faction_protection_date", nullable = true)
    public Date getFactionProtectionDate() {
        return factionProtectionDate;
    }

    public void setFactionProtectionDate(Date factionProtectionDate) {
        this.factionProtectionDate = factionProtectionDate;
    }

    @Basic
    @Column(name = "faction_last_online_date", nullable = true, length = 10)
    public String getFactionLastOnlineDate() {
        return factionLastOnlineDate;
    }

    public void setFactionLastOnlineDate(String factionLastOnlineDate) {
        this.factionLastOnlineDate = factionLastOnlineDate;
    }

    @Basic
    @Column(name = "faction_banner", nullable = true, length = -1)
    public String getFactionBanner() {
        return factionBanner;
    }

    public void setFactionBanner(String factionBanner) {
        this.factionBanner = factionBanner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FactionStatsEntity that = (FactionStatsEntity) o;
        return factionId == that.factionId &&
                factionXCoordinate == that.factionXCoordinate &&
                factionZCoordinate == that.factionZCoordinate &&
                Objects.equals(factionName, that.factionName) &&
                Objects.equals(server, that.server) &&
                Objects.equals(factionExperience, that.factionExperience) &&
                Objects.equals(factionEnergy, that.factionEnergy) &&
                Objects.equals(factionPlotType, that.factionPlotType) &&
                Objects.equals(factionPoints, that.factionPoints) &&
                Objects.equals(factionBalance, that.factionBalance) &&
                Objects.equals(factionProtectionDate, that.factionProtectionDate) &&
                Objects.equals(factionLastOnlineDate, that.factionLastOnlineDate) &&
                Objects.equals(factionBanner, that.factionBanner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(factionId, factionName, server, factionExperience, factionXCoordinate, factionZCoordinate, factionEnergy, factionPlotType, factionPoints, factionBalance, factionProtectionDate, factionLastOnlineDate, factionBanner);
    }
}
