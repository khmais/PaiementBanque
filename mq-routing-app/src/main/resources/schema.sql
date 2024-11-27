CREATE TABLE messages (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    content TEXT NOT NULL,
    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE partners (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    alias VARCHAR(255) NOT NULL,
    type VARCHAR(255) NOT NULL,
    direction ENUM('INBOUND', 'OUTBOUND') NOT NULL,
    application VARCHAR(255),
    processed_flow_type ENUM('MESSAGE', 'ALERTING', 'NOTIFICATION') NOT NULL,
    description VARCHAR(255) NOT NULL
);