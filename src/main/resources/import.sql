-- Insert roles
INSERT INTO role (name) VALUES ('ROLE_USER');

-- Insert users (passwords are both 'password')
INSERT INTO user (username, enabled, password, role_id)
  VALUES ('user', TRUE, '$2a$08$SuE48E18izYdripeojcCMOp2kPhH6fupCmLFN3u1ojX5f3wgkCjoK', 1);
INSERT INTO user (username, enabled, password, role_id)
  VALUES ('user2', TRUE, '$2a$08$SuE48E18izYdripeojcCMOp2kPhH6fupCmLFN3u1ojX5f3wgkCjoK', 1);

-- Insert tasks
INSERT INTO task (complete, description, user_id) VALUES (TRUE, 'Code Task entity', 1);
INSERT INTO task (complete, description, user_id) VALUES (FALSE, 'Discuss users and roles', 1);
INSERT INTO task (complete, description, user_id) VALUES (FALSE, 'Enable Spring Security', 2);
INSERT INTO task (complete, description, user_id) VALUES (FALSE, 'Test application', 2);