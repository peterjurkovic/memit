begin;

CREATE TABLE public.m_user
(
  id bigint NOT NULL,
  changed timestamp without time zone,
  created timestamp without time zone,
  email character varying(50) NOT NULL,
  first_name character varying(50),
  last_name character varying(50),
  password character varying(62) NOT NULL,
  user_status character varying(10) NOT NULL,
  username character varying(32) NOT NULL,
  CONSTRAINT m_user_pkey PRIMARY KEY (id),
  CONSTRAINT uk_brmb54ld0gqstogmb812xw951 UNIQUE (username),
  CONSTRAINT uk_rycw44p7cruupkosx3ibmj9q3 UNIQUE (email)
)
WITH (
  OIDS=FALSE
);

CREATE SEQUENCE m_user_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;

end;