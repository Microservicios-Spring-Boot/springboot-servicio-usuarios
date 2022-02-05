INSERT INTO usuarios(username, password, enabled, nombre, apellido, email) VALUES ('andres', '$2a$10$O/TIl7Mx/YcPtSZPLx9Y3.Ymw0YJwIoAc4GXtynxldjHkZSF1.Diq', 1, 'Andres', 'Guzman', 'profesor@bolsadeideas.com');
INSERT INTO usuarios(username, password, enabled, nombre, apellido, email) VALUES ('admin', '$2a$10$NjcpbalkkiidUWSAZ0nseeK6PsYJZt96Ficzr885VCSaWkLFeTD3.', 1, 'Jhon', 'Doe', 'jhon.doe@gmail.com');

INSERT INTO roles(nombre) VALUES('ROLE_USER');
INSERT INTO roles(nombre) VALUES('ROLE_ADMIN');

INSERT INTO usuarios_roles(usuario_id, role_id) VALUES(1, 1);
INSERT INTO usuarios_roles(usuario_id, role_id) VALUES(2, 1);
INSERT INTO usuarios_roles(usuario_id, role_id) VALUES(2, 2);