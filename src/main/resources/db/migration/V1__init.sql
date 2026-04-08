
CREATE TABLE related_accounts_xref
(
    id                      BIGSERIAL PRIMARY KEY,
    active_subaccount       VARCHAR(8) NOT NULL,
    inactive_subaccount     VARCHAR(8),
    active_scorecard        VARCHAR(12) NOT NULL,
    inactive_scorecard      VARCHAR(12),
    master_account_id       INTEGER,
    relationship_type       TEXT,
    identity_id             UUID NOT NULL,
    account_type            INTEGER NOT NULL,
    created_dttm            TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_dttm            TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    deleted                 BOOLEAN NOT NULL DEFAULT FALSE
);

