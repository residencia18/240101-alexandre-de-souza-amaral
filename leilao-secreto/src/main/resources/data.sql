INSERT INTO Leilao (descricao, valor_minimo, status) VALUES 
('Chapeu', 250.00, 'Aberto'),
('Colar', 350.00, 'Fechado'),
('Blusa', 100.00, 'Aberto');


INSERT INTO Concorrente (nome, cpf) VALUES 
('Roberto Carlos', '87345678450'),
('Joana Ribeiro', '36265431992'),
('Andre albuquerque', '33355533399');


INSERT INTO Lance (id_leilao, id_concorrente, valor) VALUES
(1, 1, 450.00),
(2, 2, 340.00),
(3, 2, 950.00);