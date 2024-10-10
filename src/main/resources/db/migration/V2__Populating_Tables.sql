INSERT INTO `tb_category` VALUES (1,'Sneakers'),
                                 (2,'Shoe'),
                                 (3,'Loafer'),
                                 (4,'Slides'),
                                 (5,'Flip Flop');


INSERT INTO `tb_client` VALUES (1,'123 Main St','123','1990-01-01 12:00:00.000000','(123) 456-7890','12345-678','CityA','Apt 101','12345678900','client1@example.com','Client One','NeighborhoodA','password1','(123) 456-7899','123456789123456','XY'),
                               (2,'456 Oak St','456','1985-05-10 12:00:00.000000','(234) 567-8901','23456-789','CityB','Suite 202','23456789001','client2@example.com','Client Two','NeighborhoodB','password2','(234) 567-8900','234567890234567','XY'),
                               (3,'789 Pine St','789','1992-03-15 12:00:00.000000','(345) 678-9012','34567-890','CityC','Apt 303','34567890123','client3@example.com','Client Three','NeighborhoodC','password3','(345) 678-9001','345678901234567','XY'),
                               (4,'101 Cedar St','101','1987-07-22 12:00:00.000000','(456) 789-0123','45678-901','CityD','Suite 404','45678901234','client4@example.com','Client Four','NeighborhoodD','password4','(456) 789-0123','456789012345678','XY'),
                               (5,'202 Birch St','202','1995-10-30 12:00:00.000000','(567) 890-1234','56789-012','CityE','Apt 505','56789012345','client5@example.com','Client Five','NeighborhoodE','password5','(567) 890-1234','567890123456789','XY'),
                               (6,'303 Maple St','303','1993-02-18 12:00:00.000000','(678) 901-2345','67890-123','CityF','Suite 606','67890123456','client6@example.com','Client Six','NeighborhoodF','password6','(678) 901-2345','678901234567890','XY'),
                               (7,'404 Elm St','404','1989-09-09 12:00:00.000000','(789) 012-3456','78901-234','CityG','Apt 707','78901234567','client7@example.com','Client Seven','NeighborhoodG','password7','(789) 012-3456','789012345678901','XY'),
                               (8,'505 Spruce St','505','1991-12-12 12:00:00.000000','(890) 123-4567','89012-345','CityH','Suite 808','89012345678','client8@example.com','Client Eight','NeighborhoodH','password8','(890) 123-4567','890123456789012','XY'),
                               (9,'606 Poplar St','606','1986-06-25 12:00:00.000000','(901) 234-5678','90123-456','CityI','Apt 909','90123456789','client9@example.com','Client Nine','NeighborhoodI','password9','(901) 234-5678','901234567890123','XY'),
                               (10,'707 Willow St','707','1984-08-16 12:00:00.000000','(012) 345-6789','01234-567','CityJ','Suite 1010','01234567890','client10@example.com','Client Ten','NeighborhoodJ','password10','(012) 345-6789','012345678901234','XY');

INSERT INTO `tb_employee` VALUES (1,'Alice Smith','(123) 456-7890'),
                                 (2,'Bob Johnson','(234) 567-8901'),
                                 (3,'Charlie Williams','(345) 678-9012'),
                                 (4,'David Brown','(456) 789-0123'),
                                 (5,'Emma Davis','(567) 890-1234'),
                                 (6,'Frank Miller','(678) 901-2345'),
                                 (7,'Grace Wilson','(789) 012-3456'),
                                 (8,'Hannah Moore','(890) 123-4567'),
                                 (9,'Ivy Taylor','(901) 234-5678'),
                                 (10,'Jack Anderson','(012) 345-6789');


INSERT INTO `tb_payment_method` VALUES
                                    (1, 1),
                                    (2, 2),
                                    (3, 3),
                                    (4, 4);



INSERT INTO `tb_installment` VALUES (1,150,'2024-10-01 10:00:00.000000','2024-10-02 10:00:00.000000',150,3,1,1,1),
                                    (2,200,'2024-10-15 10:00:00.000000','2024-10-16 10:00:00.000000',200,2,1,2,2),
                                    (3,250,'2024-11-01 10:00:00.000000','2024-11-02 10:00:00.000000',250,4,2,3,3),
                                    (4,300,'2024-11-15 10:00:00.000000',NULL,300,5,2,4,4),
                                    (5,350,'2024-12-01 10:00:00.000000','2024-12-02 10:00:00.000000',350,1,3,5,5),
                                    (6,400,'2024-12-15 10:00:00.000000',NULL,400,4,3,6,6),
                                    (7,450,'2025-01-01 10:00:00.000000','2025-01-02 10:00:00.000000',450,2,4,7,7),
                                    (8,500,'2025-01-15 10:00:00.000000','2025-01-16 10:00:00.000000',500,3,4,8,8),
                                    (9,550,'2025-02-01 10:00:00.000000',NULL,550,5,1,9,9),
                                    (10,600,'2025-02-15 10:00:00.000000',NULL,600,1,1,10,10);


INSERT INTO `tb_phone` VALUES (1,'John Doe','john.doe@example.com','1234567890',1),
                              (2,'Jane Smith','jane.smith@example.com','1234567891',2),
                              (3,'Bob Johnson','bob.johnson@example.com','1234567892',3),
                              (4,'Alice Brown','alice.brown@example.com','1234567893',4),
                              (5,'Charlie Davis','charlie.davis@example.com','1234567894',5),
                              (6,'Emily Clark','emily.clark@example.com','1234567895',1),
                              (7,'David Wilson','david.wilson@example.com','1234567896',2),
                              (8,'Fiona Martinez','fiona.martinez@example.com','1234567897',3),
                              (9,'George Garcia','george.garcia@example.com','1234567898',4),
                              (10,'Hannah Lopez','hannah.lopez@example.com','1234567899',5);


INSERT INTO `tb_product` VALUES (1,'Nike','Comfortable running shoes with air cushioning','Air Max 270',1),
                                (2,'Adidas','Lightweight sneakers for daily wear','Ultraboost 21',2),
                                (3,'Puma','Stylish training shoes for gym enthusiasts','Ignite Flash',3),
                                (4,'Reebok','Classic lifestyle sneakers','Club C 85',4),
                                (5,'New Balance','Supportive shoes for long-distance running','Fresh Foam 1080',5),
                                (6,'Under Armour','Durable shoes for intense workouts','HOVR Phantom',1),
                                (7,'Asics','High-performance running shoes with gel cushioning','Gel-Kayano 27',2),
                                (8,'Skechers','Casual slip-on shoes for everyday use','Go Walk 5',3),
                                (9,'Saucony','Quality shoes for serious runners','Ride 13',4),
                                (10,'Vans','Classic skate shoes with a timeless design','Old Skool',5);

INSERT INTO `tb_product_purchase` VALUES (1,45.99,6,1,1),
                                                    (40,19.99,1,2,2),
                                                    (41,49.99,3,3,3),
                                                    (42,39.99,1,4,4),
                                                    (43,15.99,5,5,5),
                                                    (44,25.5,4,6,6),
                                                    (45,32.75,2,7,7),
                                                    (46,44.99,3,8,8),
                                                    (47,20,1,9,9),
                                                    (48,10.5,6,10,10);

INSERT INTO `tb_purchase` VALUES (1,'2023-08-24 08:25:35.876543',400.8,10,5),
                                 (2,'2024-09-01 10:30:00.000000',150.5,1,1),
                                 (3,'2024-09-02 11:15:00.000000',180.75,2,2),
                                 (4,'2024-09-03 09:45:00.000000',120,3,3),
                                 (5,'2024-09-04 14:00:00.000000',200.25,4,4),
                                 (6,'2024-09-05 13:30:00.000000',175.1,5,5),
                                 (7,'2024-09-06 15:00:00.000000',210.6,6,1),
                                 (8,'2024-09-07 12:20:00.000000',190.4,7,2),
                                 (9,'2024-09-08 10:00:00.000000',130.99,8,3),
                                 (10,'2024-09-09 11:50:00.000000',165.85,9,4),
                                 (11,'2024-09-10 09:30:00.000000',145.7,10,5);


INSERT INTO `tb_sale` VALUES (1,'2024-09-01 10:30:00.000000','Store A','S',250.5,1,1),
                             (2,'2024-09-02 11:15:00.000000','Store B','N',180.75,2,2),
                             (3,'2024-09-03 09:45:00.000000','Store C','S',320,3,3),
                             (4,'2024-09-04 14:00:00.000000','Store D','N',150.25,4,4),
                             (5,'2024-09-05 13:30:00.000000','Store E','S',275.1,5,5),
                             (6,'2024-09-06 15:00:00.000000','Store A','N',210.6,6,6),
                             (7,'2024-09-07 12:20:00.000000','Store B','S',190.4,7,7),
                             (8,'2024-09-08 10:00:00.000000','Store C','N',130.99,8,8),
                             (9,'2024-09-09 11:50:00.000000','Store D','S',165.85,9,9),
                             (10,'2024-09-10 09:30:00.000000','Store E','N',145.7,10,10);


INSERT INTO `tb_sale_prod` VALUES (1,50,2,1,1),
                                  (2,60,1,2,2),
                                  (3,45,3,3,3),
                                  (4,30,1,4,4),
                                  (5,40,2,5,5),
                                  (6,55,1,6,6),
                                  (7,25,4,7,7),
                                  (8,20,3,8,8),
                                  (9,35,2,9,9),
                                  (10,70,1,10,10);

INSERT INTO `tb_size` VALUES (1,50,1,'40',20,1),
                             (2,60,1,'41',15,2),
                             (3,45,1,'42',10,3),
                             (4,30,1,'43',5,4),
                             (5,40,1,'44',12,5),
                             (6,55,1,'45',18,6),
                             (7,25,1,'46',8,7),
                             (8,35,1,'47',6,8),
                             (9,20,1,'48',4,9),
                             (10,50,1,'49',25,10);

INSERT INTO `tb_supplier` VALUES (1,'Main St','1234','12345-678','City A','12.345.678/0001-90','Suite 100','Supplier A','1234567890','Downtown','Supplier A LTDA','SP'),
                                 (2,'Second St','2345','23456-789','City B','23.456.789/0001-90','Suite 200','Supplier B','2345678901','Uptown','Supplier B LTDA','RJ'),
                                 (3,'Third St','3456','34567-890','City C','34.567.890/0001-90','Suite 300','Supplier C','3456789012','Midtown','Supplier C LTDA','MG'),
                                 (4,'Fourth St','4567','45678-901','City D','45.678.901/0001-90','Suite 400','Supplier D','4567890123','Suburb','Supplier D LTDA','RS'),
                                 (5,'Fifth St','5678','56789-012','City E','56.789.012/0001-90','Suite 500','Supplier E','5678901234','Village','Supplier E LTDA','PR');