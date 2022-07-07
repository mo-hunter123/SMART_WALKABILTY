
create table if not exists "organisations"(
    "id" uuid not null,
    "name" varchar(255) not null,
    "type" int not null, -- 1 for non commercial, 2 for enterprises
    "date_creation" date not null,
    "login" varchar(255) not null,
    "email" varchar(255) not null,
    "password" varchar(255) not null,

    primary key("id")
);

create table if not exists "sites" (
    "id" int not null,

    "organisation_id" uuid not null,
    "geopoint_id" int not null,

    "name" varchar(255) not null,
    "date_creation" DATE not null,

    primary key("id")
);

create table if not exists "categories" (
    "id" uuid not null,
    "name" varchar(255) not null,
    primary key ("id")
);

create table if not exists "annonces" (
    "id" uuid not null ,

    "categorie_id" uuid not null,
    "site_id" int not null,

    "date_debut" DATE not null,
    "date_fin" DATE not null,
    "titre" varchar(255) not null,
    "description" varchar(255) not null,
    "principal_image_url" varchar(255),

    primary key("id")
);

alter table "annonces"
add constraint fk_categoriesAnnonce
FOREIGN KEY ("categorie_id") REFERENCES "categories"("id");

alter table "annonces"
add constraint fk_sitesAnnonce
FOREIGN KEY ("site_id") REFERENCES "sites"("id");

alter table "sites"
add constraint fk_organisationSite
FOREIGN KEY ("organisation_id") REFERENCES "organisations"("id");