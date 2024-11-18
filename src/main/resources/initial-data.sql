INSERT INTO cliente (id, cpf, email, bairro, cep, cidade, estado, logradouro, numero, nome, telefone)
VALUES (1, '12345678901', 'joao.silva@gmail.com', 'Centro', '01010-010', 'São Paulo', 'SP', 'Rua A', '10', 'João Silva',
		'11987654321'),
	   (2, '98765432100', 'maria.santos@gmail.com', 'Jardim Paulista', '02020-020', 'São Paulo', 'SP', 'Avenida B',
		'20', 'Maria Santos', '11987654322'),
	   (3, '45678912345', 'carlos.souza@gmail.com', 'Vila Mariana', '03030-030', 'São Paulo', 'SP', 'Rua C', '30',
		'Carlos Souza', '11987654323'),
	   (4, '65432198765', 'ana.martins@gmail.com', 'Moema', '04040-040', 'São Paulo', 'SP', 'Rua D', '40',
		'Ana Martins', '11987654324'),
	   (5, '78912345678', 'fernando.alves@gmail.com', 'Pinheiros', '05050-050', 'São Paulo', 'SP', 'Avenida E', '50',
		'Fernando Alves', '11987654325'),
	   (6, '32165498701', 'lucia.costa@gmail.com', 'Liberdade', '06060-060', 'São Paulo', 'SP', 'Rua F', '60',
		'Lúcia Costa', '11987654326'),
	   (7, '85296374123', 'roberto.lima@gmail.com', 'Saúde', '07070-070', 'São Paulo', 'SP', 'Avenida G', '70',
		'Roberto Lima', '11987654327'),
	   (8, '74185296345', 'carla.silveira@gmail.com', 'Ipiranga', '08080-080', 'São Paulo', 'SP', 'Rua H', '80',
		'Carla Silveira', '11987654328'),
	   (9, '36925814701', 'paulo.monteiro@gmail.com', 'Tatuapé', '09090-090', 'São Paulo', 'SP', 'Avenida I', '90',
		'Paulo Monteiro', '11987654329'),
	   (10, '14785236958', 'mariana.oliveira@gmail.com', 'Santana', '11011-011', 'São Paulo', 'SP', 'Rua J', '100',
		'Mariana Oliveira', '11987654330'),
	   (11, '95175385247', 'ricardo.fernandes@gmail.com', 'Vila Madalena', '12012-012', 'São Paulo', 'SP', 'Avenida K',
		'110', 'Ricardo Fernandes', '11987654331'),
	   (12, '75395148627', 'julia.santos@gmail.com', 'Lapa', '13013-013', 'São Paulo', 'SP', 'Rua L', '120',
		'Júlia Santos', '11987654332'),
	   (13, '25874136985', 'renata.moraes@gmail.com', 'Barra Funda', '14014-014', 'São Paulo', 'SP', 'Avenida M', '130',
		'Renata Moraes', '11987654333'),
	   (14, '36914785296', 'sergio.nascimento@gmail.com', 'Bela Vista', '15015-015', 'São Paulo', 'SP', 'Rua N', '140',
		'Sérgio Nascimento', '11987654334'),
	   (15, '98732165489', 'patricia.rodrigues@gmail.com', 'Butantã', '16016-016', 'São Paulo', 'SP', 'Avenida O',
		'150', 'Patrícia Rodrigues', '11987654335');



INSERT INTO produto (nome, descricao, preco, estoque, categoria)
VALUES ('Cerveja Pilsen', 'Cerveja Pilsen refrescante com notas de malte leve.', 12.50, 50, 'Lager'),
	   ('Cerveja IPA', 'Cerveja IPA com aromas cítricos e amargor equilibrado.', 14.00, 30, 'Ale'),
	   ('Cerveja Weiss', 'Cerveja de trigo com notas de banana e cravo.', 13.00, 40, 'Trigo'),
	   ('Cerveja Stout', 'Cerveja escura com sabores de café e chocolate.', 16.50, 20, 'Escura'),
	   ('Cerveja Amber Ale', 'Cerveja com corpo médio e toques de caramelo.', 15.00, 35, 'Ale'),
	   ('Cerveja Saison', 'Cerveja belga levemente ácida e frutada.', 17.50, 25, 'Belga'),
	   ('Cerveja Porter', 'Cerveja escura com sabor tostado e notas de cacau.', 18.00, 18, 'Escura'),
	   ('Cerveja Pale Ale', 'Cerveja Pale Ale com equilíbrio perfeito entre malte e lúpulo.', 13.75, 45, 'Ale'),
	   ('Cerveja American Lager', 'Cerveja leve e refrescante, estilo americano.', 11.50, 60, 'Lager'),
	   ('Cerveja Dubbel', 'Cerveja belga com sabores de frutas secas e caramelo.', 19.50, 15, 'Belga'),

	   ('Cerveja Tripel', 'Cerveja belga forte com notas de mel e especiarias.', 20.00, 12, 'Belga'),
	   ('Cerveja Quadrupel', 'Cerveja complexa com sabores de ameixa e figo.', 25.00, 10, 'Belga'),
	   ('Cerveja Witbier', 'Cerveja de trigo com casca de laranja e coentro.', 14.50, 38, 'Trigo'),
	   ('Cerveja Barleywine', 'Cerveja forte com toques de caramelo e frutas.', 24.00, 8, 'Ale'),
	   ('Cerveja Hazy IPA', 'Cerveja turva com aromas tropicais e amargor suave.', 18.25, 22, 'Ale'),
	   ('Cerveja Red Ale', 'Cerveja com coloração avermelhada e sabor maltado.', 15.75, 34, 'Ale'),
	   ('Cerveja Dark Lager', 'Cerveja escura com corpo leve e sabor tostado.', 17.00, 27, 'Lager'),
	   ('Cerveja Kellerbier', 'Cerveja não filtrada com sabor fresco e lupulado.', 16.00, 30, 'Lager'),
	   ('Cerveja Dunkel', 'Cerveja escura com notas de caramelo e malte torrado.', 18.75, 20, 'Escura'),
	   ('Cerveja Rauchbier', 'Cerveja defumada com aroma intenso de madeira.', 19.00, 18, 'Especial'),

	   ('Cerveja Vienna Lager', 'Cerveja lager com notas de biscoito e caramelo.', 14.25, 42, 'Lager'),
	   ('Cerveja Baltic Porter', 'Cerveja robusta com sabores de chocolate e café.', 21.00, 15, 'Escura'),
	   ('Cerveja Imperial Stout', 'Cerveja encorpada com alto teor alcoólico.', 28.00, 10, 'Escura'),
	   ('Cerveja Brown Ale', 'Cerveja de coloração marrom com toques de nozes.', 13.50, 36, 'Ale'),
	   ('Cerveja Strong Ale', 'Cerveja forte com sabor adocicado e notas frutadas.', 22.50, 12, 'Ale'),
	   ('Cerveja Bock', 'Cerveja forte com sabor maltado e adocicado.', 15.00, 32, 'Lager'),
	   ('Cerveja Maibock', 'Cerveja lager forte, levemente lupulada.', 16.50, 28, 'Lager'),
	   ('Cerveja Hefeweizen', 'Cerveja de trigo tradicional alemã.', 12.75, 50, 'Trigo'),
	   ('Cerveja Schwarzbier', 'Cerveja escura com corpo leve e sabor suave.', 14.75, 33, 'Escura'),
	   ('Cerveja Gose', 'Cerveja de trigo levemente salgada e ácida.', 17.25, 24, 'Especial');


INSERT INTO pedido_de_venda (id, cliente_id, logradouro, numero, bairro, cidade, estado, cep, dt_venda, modo_pagamento)
VALUES (1, 1, 'Rua A', '10', 'Centro', 'São Paulo', 'SP', '01010-010', '2024-11-18 10:30:00', 'PIX'),
	   (2, 2, 'Rua B', '20', 'Vila Nova', 'Rio de Janeiro', 'RJ', '20020-020', '2024-11-18 11:00:00', 'CARTAO_CREDITO');

INSERT INTO pedido_de_venda_item (id, pedido_de_venda_id, produto_id, qtde, desconto, subtotal)
VALUES (1, 1, 1, 2, 0.0, 200.0),
	   (2, 1, 2, 1, 0.0, 200.0),
	   (3, 2, 2, 2, 20.0, 400.0),
	   (4, 2, 3, 1, 0.0, 150.0);
