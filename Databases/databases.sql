--
-- PostgreSQL database dump
--

-- Dumped from database version 16.2
-- Dumped by pg_dump version 16.2

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

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: ecole; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.ecole (
    numecole character varying(5) NOT NULL,
    design character varying(50),
    adresse character varying(50)
);


ALTER TABLE public.ecole OWNER TO postgres;

--
-- Name: eleve; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.eleve (
    numeleve character varying(5) NOT NULL,
    numecole character varying(5) NOT NULL,
    nom character varying(50),
    prenom character varying(50)
);


ALTER TABLE public.eleve OWNER TO postgres;

--
-- Name: matiere; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.matiere (
    nummat character varying(5) NOT NULL,
    designmat character varying(20),
    coef integer
);


ALTER TABLE public.matiere OWNER TO postgres;

--
-- Name: note; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.note (
    numeleve character varying(5) NOT NULL,
    nummat character varying(5) NOT NULL,
    annescolaire character varying(10),
    note integer
);


ALTER TABLE public.note OWNER TO postgres;

--
-- Data for Name: ecole; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.ecole (numecole, design, adresse) FROM stdin;
E1	Saint Jean	Tanambao
E3	dsde	Stella Maris
E2	Saint Jan	Tanambao
E4	ENI	Tanambao
\.


--
-- Data for Name: eleve; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.eleve (numeleve, numecole, nom, prenom) FROM stdin;
00004	E2	Bernard	Rakoto
00003	E1	Rakoto	Thierry
00005	E1	Jaosoa	Rina
00002	E1	Beloha	Beloaha
00006	E1	Jospeh	Daf
00001	E1	Arnoaud	Pierre
00007	E1	Rakoto	Bernard
00008	E1	F	d
00009	E4	Maxim	Jean
\.


--
-- Data for Name: matiere; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.matiere (nummat, designmat, coef) FROM stdin;
M3	Problème	5
M1	Malagasy	6
M7	SVT	5
M2	Calcul	4
M4	Tantara	4
M5	Géographie	4
M6	Français	4
M8	ES	5
\.


--
-- Data for Name: note; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.note (numeleve, nummat, annescolaire, note) FROM stdin;
00001	M2	2022-2023	15
00001	M4	2022-2023	18
00001	M5	2022-2023	17
00001	M7	2022-2023	18
00002	M1	2022-2023	12
00002	M2	2022-2023	12
00002	M3	2022-2023	12
00002	M4	2022-2023	12
00002	M5	2022-2023	12
00002	M6	2022-2023	12
00002	M7	2022-2023	12
00003	M1	2022-2023	9
00003	M2	2022-2023	4
00003	M4	2022-2023	9
00003	M6	2022-2023	12
00003	M3	2022-2023	13
00001	M6	2022-2023	20
00005	M1	2022-2023	15
00005	M2	2022-2023	16
00005	M4	2022-2023	15
00005	M5	2022-2023	15
00005	M6	2022-2023	15
00005	M7	2022-2023	15
00004	M1	2022-2023	15
00004	M2	2022-2023	15
00004	M3	2022-2023	15
00004	M4	2022-2023	15
00004	M5	2022-2023	18
00004	M7	2022-2023	0
00001	M3	2022-2023	0
00001	M1	2022-2023	18
00004	M6	2022-2023	12
00003	M7	2022-2023	14
00005	M3	2022-2023	15
00007	M5	2022-2023	11
00007	M6	2022-2023	14
00007	M7	2022-2023	9
00007	M1	2022-2023	10
00007	M2	2022-2023	10
00007	M4	2022-2023	0
00003	M5	2022-2023	12
00007	M3	2022-2023	0
00006	M1	2022-2023	12
00006	M2	2022-2023	19
00006	M3	2022-2023	19
00006	M4	2022-2023	11
00006	M5	2022-2023	14
00006	M6	2022-2023	15
00006	M7	2022-2023	9
00008	M1	2022-2023	10
00008	M2	2022-2023	14
00008	M3	2022-2023	10
00008	M4	2022-2023	12
00008	M5	2022-2023	10
00008	M6	2022-2023	12
00008	M7	2022-2023	10
00009	M1	2022-2023	15
00009	M2	2022-2023	10
00009	M3	2022-2023	14
00009	M4	2022-2023	10
00009	M5	2022-2023	10
00009	M6	2022-2023	10
00009	M7	2022-2023	10
\.


--
-- Name: ecole ecole_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ecole
    ADD CONSTRAINT ecole_pkey PRIMARY KEY (numecole);


--
-- Name: eleve eleve_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.eleve
    ADD CONSTRAINT eleve_pkey PRIMARY KEY (numeleve, numecole);


--
-- Name: matiere matiere_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.matiere
    ADD CONSTRAINT matiere_pkey PRIMARY KEY (nummat);


--
-- Name: note note_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.note
    ADD CONSTRAINT note_pkey PRIMARY KEY (numeleve, nummat);


--
-- PostgreSQL database dump complete
--

