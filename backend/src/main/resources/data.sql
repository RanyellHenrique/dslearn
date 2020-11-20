INSERT INTO tb_user (name, email, password) VALUES ('Alex Brown', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Bob Brown', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Maria Green', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_role (authority) VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);

INSERT INTO tb_course (name, img_Uri, img_Gray_Uri) VALUES ('Bootcamp HTML', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT4hKyBpLdoJQXdbFkhCCRx0h0qy5j_vxAlEw&usqp=CAU','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT4hKyBpLdoJQXdbFkhCCRx0h0qy5j_vxAlEw&usqp=CAU');

INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('1.0', TIMESTAMP WITH TIME ZONE '2020-07-14T03:00:00Z', TIMESTAMP WITH TIME ZONE '2021-07-14T03:00:00Z', 1);
INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('2.0', TIMESTAMP WITH TIME ZONE '2020-08-14T03:00:00Z', TIMESTAMP WITH TIME ZONE '2021-08-14T03:00:00Z', 1);

INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) VALUES ('Trilha HTML', 'Conteúdo principal', 1, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT4hKyBpLdoJQXdbFkhCCRx0h0qy5j_vxAlEw&usqp=CAU', 1, 1);
INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) VALUES ('Forum', 'perguntas', 2, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT4hKyBpLdoJQXdbFkhCCRx0h0qy5j_vxAlEw&usqp=CAU', 2, 1);

INSERT INTO tb_section (title, description, position, img_Uri, resource_id, prerequisite_id) VALUES ('Capitulo 1', 'primeiros passos', 1, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT4hKyBpLdoJQXdbFkhCCRx0h0qy5j_vxAlEw&usqp=CAU', 1, null);
INSERT INTO tb_section (title, description, position, img_Uri, resource_id, prerequisite_id) VALUES ('Capitulo 2', 'HTML', 2, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT4hKyBpLdoJQXdbFkhCCRx0h0qy5j_vxAlEw&usqp=CAU', 1, 1);
INSERT INTO tb_section (title, description, position, img_Uri, resource_id, prerequisite_id) VALUES ('Capitulo 3', 'HTML + CSS', 3, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT4hKyBpLdoJQXdbFkhCCRx0h0qy5j_vxAlEw&usqp=CAU', 1, 2);

INSERT INTO tb_enrollment (available, enroll_moment, only_update, refund_moment, offer_id, user_id) VALUES (true, TIMESTAMP WITH TIME ZONE '2020-07-14T03:00:00Z', false, null, 1, 1); 
INSERT INTO tb_enrollment (available, enroll_moment, only_update, refund_moment, offer_id, user_id) VALUES (true, TIMESTAMP WITH TIME ZONE '2021-07-14T03:00:00Z', true, null, 2, 1); 

