insert INTO Unidades (ds_unidade) values ("Kilo");
insert INTO Unidades (ds_unidade) values ("Unidade");
insert INTO Unidades (ds_unidade) values ("Litro");
insert INTO Unidades (ds_unidade) values ("Metro");
insert INTO Unidades (ds_unidade) values ("Duzia");

insert into Produtos (ds_produto, vl_produto, qt_produto, cd_unidade) values ("Carne", 30.00, 2, 1);
insert into Produtos (ds_produto, vl_produto, qt_produto, cd_unidade) values ("Oleo", 10.00, 1, 2);
insert into Produtos (ds_produto, vl_produto, qt_produto, cd_unidade) values ("Leite", 5.00, 1.5, 3);
insert into Produtos (ds_produto, vl_produto, qt_produto, cd_unidade) values ("Alface", 3.00, 1,2);
insert into Produtos (ds_produto, vl_produto, qt_produto, cd_unidade) values ("Laranja", 8.00, 10, 5);

select * from Produtos;
select * from Unidades;

update Produtos set ds_produto = "Frango" where cd_produto = 1; 

delete from Produtos where cd_produto = 1;