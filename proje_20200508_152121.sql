--
-- PostgreSQL database dump
--

-- Dumped from database version 12.2
-- Dumped by pg_dump version 12rc1

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: proje; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA proje;


ALTER SCHEMA proje OWNER TO postgres;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: kulanci_bilgi; Type: TABLE; Schema: proje; Owner: postgres
--

CREATE TABLE proje.kulanci_bilgi (
    kualnci_adi text,
    kulanci_email text,
    kulanci_no integer NOT NULL,
    kulanci_sifre text
);


ALTER TABLE proje.kulanci_bilgi OWNER TO postgres;

--
-- Name: kulanci_bilgi_kulanci_no_seq; Type: SEQUENCE; Schema: proje; Owner: postgres
--

CREATE SEQUENCE proje.kulanci_bilgi_kulanci_no_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE proje.kulanci_bilgi_kulanci_no_seq OWNER TO postgres;

--
-- Name: kulanci_bilgi_kulanci_no_seq; Type: SEQUENCE OWNED BY; Schema: proje; Owner: postgres
--

ALTER SEQUENCE proje.kulanci_bilgi_kulanci_no_seq OWNED BY proje.kulanci_bilgi.kulanci_no;


--
-- Name: personel_bilgi; Type: TABLE; Schema: proje; Owner: postgres
--

CREATE TABLE proje.personel_bilgi (
    personel_adi text,
    personel_email text,
    personel_no integer NOT NULL,
    personel_sifre text NOT NULL
);


ALTER TABLE proje.personel_bilgi OWNER TO postgres;

--
-- Name: personel_bilgi_personel_no_seq; Type: SEQUENCE; Schema: proje; Owner: postgres
--

CREATE SEQUENCE proje.personel_bilgi_personel_no_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE proje.personel_bilgi_personel_no_seq OWNER TO postgres;

--
-- Name: personel_bilgi_personel_no_seq; Type: SEQUENCE OWNED BY; Schema: proje; Owner: postgres
--

ALTER SEQUENCE proje.personel_bilgi_personel_no_seq OWNED BY proje.personel_bilgi.personel_no;


--
-- Name: kulanci_bilgi kulanci_no; Type: DEFAULT; Schema: proje; Owner: postgres
--

ALTER TABLE ONLY proje.kulanci_bilgi ALTER COLUMN kulanci_no SET DEFAULT nextval('proje.kulanci_bilgi_kulanci_no_seq'::regclass);


--
-- Name: personel_bilgi personel_no; Type: DEFAULT; Schema: proje; Owner: postgres
--

ALTER TABLE ONLY proje.personel_bilgi ALTER COLUMN personel_no SET DEFAULT nextval('proje.personel_bilgi_personel_no_seq'::regclass);


--
-- Data for Name: kulanci_bilgi; Type: TABLE DATA; Schema: proje; Owner: postgres
--



--
-- Data for Name: personel_bilgi; Type: TABLE DATA; Schema: proje; Owner: postgres
--



--
-- Name: kulanci_bilgi_kulanci_no_seq; Type: SEQUENCE SET; Schema: proje; Owner: postgres
--

SELECT pg_catalog.setval('proje.kulanci_bilgi_kulanci_no_seq', 1, false);


--
-- Name: personel_bilgi_personel_no_seq; Type: SEQUENCE SET; Schema: proje; Owner: postgres
--

SELECT pg_catalog.setval('proje.personel_bilgi_personel_no_seq', 1, false);


--
-- Name: kulanci_bilgi unique_kulanci_bilgi_kualnci_adi; Type: CONSTRAINT; Schema: proje; Owner: postgres
--

ALTER TABLE ONLY proje.kulanci_bilgi
    ADD CONSTRAINT unique_kulanci_bilgi_kualnci_adi UNIQUE (kualnci_adi);


--
-- Name: kulanci_bilgi unique_kulanci_bilgi_kulanci_no; Type: CONSTRAINT; Schema: proje; Owner: postgres
--

ALTER TABLE ONLY proje.kulanci_bilgi
    ADD CONSTRAINT unique_kulanci_bilgi_kulanci_no PRIMARY KEY (kulanci_no);


--
-- Name: personel_bilgi unique_personel_bilgi_personel_adi; Type: CONSTRAINT; Schema: proje; Owner: postgres
--

ALTER TABLE ONLY proje.personel_bilgi
    ADD CONSTRAINT unique_personel_bilgi_personel_adi UNIQUE (personel_adi);


--
-- Name: personel_bilgi unique_personel_bilgi_personel_no; Type: CONSTRAINT; Schema: proje; Owner: postgres
--

ALTER TABLE ONLY proje.personel_bilgi
    ADD CONSTRAINT unique_personel_bilgi_personel_no PRIMARY KEY (personel_no);


--
-- PostgreSQL database dump complete
--

