package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "related_accounts_xref")
public class RelatedAccountsXref {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "active_subaccount", nullable = false, length = 8)
    private String activeSubaccount;

    @Column(name = "inactive_subaccount", length = 8)
    private String inactiveSubaccount;

    @Column(name = "active_scorecard", nullable = false, length = 12)
    private String activeScorecard;

    @Column(name = "inactive_scorecard", length = 12)
    private String inactiveScorecard;

    @Column(name = "master_account_id")
    private Integer masterAccountId;

    @Column(name = "relationship_type", columnDefinition = "text")
    private String relationshipType;

    @Column(name = "identity_id", nullable = false, columnDefinition = "uuid")
    private UUID identityId;

    @Column(name = "account_type", nullable = false)
    private Integer accountType;

    @Column(name = "created_dttm", nullable = false, columnDefinition = "timestamp DEFAULT CURRENT_TIMESTAMP")
    private Instant createdDttm;

    @Column(name = "updated_dttm", nullable = false, columnDefinition = "timestamp DEFAULT CURRENT_TIMESTAMP")
    private Instant updatedDttm;

    @Column(name = "deleted", nullable = false, columnDefinition = "boolean DEFAULT false")
    private Boolean deleted;

    public RelatedAccountsXref() {}

    public RelatedAccountsXref(String activeSubaccount, String activeScorecard,
                               String inactiveScorecard, UUID identityId,
                               Integer accountType) {
        this.activeSubaccount = activeSubaccount;
        this.activeScorecard = activeScorecard;
        this.inactiveScorecard = inactiveScorecard;
        this.identityId = identityId;
        this.accountType = accountType;
        this.deleted = false;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActiveSubaccount() {
        return activeSubaccount;
    }

    public void setActiveSubaccount(String activeSubaccount) {
        this.activeSubaccount = activeSubaccount;
    }

    public String getInactiveSubaccount() {
        return inactiveSubaccount;
    }

    public void setInactiveSubaccount(String inactiveSubaccount) {
        this.inactiveSubaccount = inactiveSubaccount;
    }

    public String getActiveScorecard() {
        return activeScorecard;
    }

    public void setActiveScorecard(String activeScorecard) {
        this.activeScorecard = activeScorecard;
    }

    public String getInactiveScorecard() {
        return inactiveScorecard;
    }

    public void setInactiveScorecard(String inactiveScorecard) {
        this.inactiveScorecard = inactiveScorecard;
    }

    public Integer getMasterAccountId() {
        return masterAccountId;
    }

    public void setMasterAccountId(Integer masterAccountId) {
        this.masterAccountId = masterAccountId;
    }

    public String getRelationshipType() {
        return relationshipType;
    }

    public void setRelationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
    }

    public UUID getIdentityId() {
        return identityId;
    }

    public void setIdentityId(UUID identityId) {
        this.identityId = identityId;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public Instant getCreatedDttm() {
        return createdDttm;
    }

    public void setCreatedDttm(Instant createdDttm) {
        this.createdDttm = createdDttm;
    }

    public Instant getUpdatedDttm() {
        return updatedDttm;
    }

    public void setUpdatedDttm(Instant updatedDttm) {
        this.updatedDttm = updatedDttm;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "RelatedAccountsXref{" +
                "id=" + id +
                ", activeSubaccount='" + activeSubaccount + '\'' +
                ", inactiveSubaccount='" + inactiveSubaccount + '\'' +
                ", activeScorecard='" + activeScorecard + '\'' +
                ", inactiveScorecard='" + inactiveScorecard + '\'' +
                ", masterAccountId=" + masterAccountId +
                ", relationshipType='" + relationshipType + '\'' +
                ", identityId=" + identityId +
                ", accountType=" + accountType +
                ", createdDttm=" + createdDttm +
                ", updatedDttm=" + updatedDttm +
                ", deleted=" + deleted +
                '}';
    }
}
