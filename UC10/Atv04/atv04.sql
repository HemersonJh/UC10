create role novoPerfil;
create user Hemerson identified by 'senhaTeste123' default role novoPerfil;

grant select on listadeingredientes.* to Hemerson;
