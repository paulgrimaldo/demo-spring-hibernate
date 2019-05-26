CREATE TABLE Libros
(
	id BIGINT NOT NULL,
	titulo VARCHAR(255),
	descripcion VARCHAR(255),
	autor_id BIGINT NOT NULL,
	PRIMARY KEY (id),
	KEY (autor_id)
) 
;


CREATE TABLE Autores
(
	id BIGINT NOT NULL,
	nombre VARCHAR(255),
	PRIMARY KEY (id)
) 
;





ALTER TABLE Libros ADD CONSTRAINT FK_Libros_Autores 
	FOREIGN KEY (autor_id) REFERENCES Autores (id)
	ON DELETE CASCADE ON UPDATE CASCADE
;
