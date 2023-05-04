CREATE TABLE users(
     id uuid NOT NULL,
     name character varying(32) NOT NULL,
     phone character(16) NOT NULL,
     town text NOT NULL,
     CONSTRAINT users_pkey PRIMARY KEY (id)
);

INSERT INTO users(
    id, name, phone, town)
VALUES ('c5e8284f-c237-434e-b916-841425150c7d', 'Filip Fiat', '0745630370', 'Timisoara');

INSERT INTO users(
    id, name, phone, town)
VALUES ('035ba5b7-f44b-4087-80ca-049b5668634a', 'Marius Popescu', '0722321456', 'Calarasi');

create table hobbies (
     id uuid NOT NULL,
     user_id uuid NOT NULL,
     name character varying(32) NOT NULL,
     town text NOT NULL,
     CONSTRAINT hobbies_pkey PRIMARY KEY (id),
     FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE cascade
)

    INSERT INTO hobbies(
    id, user_id, name, town)
VALUES ('6a16a9f9-e849-48c1-8ea3-713f733dca4d', '035ba5b7-f44b-4087-80ca-049b5668634a', 'Fotbal', 'Calarasi');