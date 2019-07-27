USE db;
CREATE TABLE IF NOT EXISTS email_info (
    id INT AUTO_INCREMENT PRIMARY KEY,
    email_to VARCHAR(255),
    email_from VARCHAR(255),
    subject VARCHAR(255),
    body VARCHAR(1000)
);