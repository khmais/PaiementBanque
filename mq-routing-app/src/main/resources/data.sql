 INSERT INTO message (content, timestamp)
VALUES 
    ('Message de test 1', '2024-11-27 10:00:00'),
    ('Message de test 2', '2024-11-27 10:05:00'),
    ('Message de test 3', '2024-11-27 10:10:00'),
    ('Message de test 4', '2024-11-27 10:15:00'),
    ('Message de test 5', '2024-11-27 10:20:00');

 INSERT INTO partner (alias, type, direction, application, processed_flow_type, description)
VALUES
    ('Partner1', 'TypeA', 'INBOUND', 'App1', 'MESSAGE', 'Description du partenaire 1'),
    ('Partner2', 'TypeB', 'OUTBOUND', 'App2', 'ALERTING', 'Description du partenaire 2'),
    ('Partner3', 'TypeA', 'INBOUND', 'App3', 'NOTIFICATION', 'Description du partenaire 3'),
    ('Partner4', 'TypeC', 'OUTBOUND', 'App4', 'MESSAGE', 'Description du partenaire 4'),
    ('Partner5', 'TypeB', 'INBOUND', 'App5', 'ALERTING', 'Description du partenaire 5');