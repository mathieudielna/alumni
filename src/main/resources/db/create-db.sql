CREATE TABLE utilisateur
(
    id              BIGINT       NOT NULL,
    login           VARCHAR(255) NULL,
    nom             VARCHAR(255) NULL,
    prenom          VARCHAR(255) NULL,
    password        VARCHAR(255) NULL,
    annee_promotion datetime     NULL,
    CONSTRAINT pk_utilisateur PRIMARY KEY (id)
);

ALTER TABLE utilisateur
    ADD CONSTRAINT uc_utilisateur_login UNIQUE (login);

CREATE TABLE `role`
(
    id   BIGINT       NOT NULL,
    name VARCHAR(255) NULL,
    CONSTRAINT pk_role PRIMARY KEY (id)
);

CREATE TABLE evenement
(
    id_event        BIGINT       NOT NULL,
    date_event      datetime     NULL,
    nom_event       VARCHAR(255) NULL,
    heure_event     time         NULL,
    lieu_event      VARCHAR(255) NULL,
    nb_personne_max INT          NULL,
    CONSTRAINT pk_evenement PRIMARY KEY (id_event)
);

ALTER TABLE evenement
    ADD CONSTRAINT uc_evenement_nomevent UNIQUE (nom_event);

