-- Insert roles
INSERT INTO role (name) VALUES ('ROLE_USER');

-- Insert users
INSERT INTO user (username, enabled, password, role_id) VALUES ('user', TRUE, 'password', 1);
INSERT INTO user (username, enabled, password, role_id) VALUES ('user2', TRUE, 'password', 1);

-- Insert tasks
INSERT INTO task (complete, description) VALUES (TRUE, 'Code Task entity');
INSERT INTO task (complete, description) VALUES (FALSE, 'Discuss users and roles');
INSERT INTO task (complete, description) VALUES (FALSE, 'Enable Spring Security');
INSERT INTO task (complete, description) VALUES (FALSE, 'Test application');