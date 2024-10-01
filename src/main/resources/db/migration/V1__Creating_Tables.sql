CREATE TABLE `tb_category` (
                               `id` bigint NOT NULL AUTO_INCREMENT,
                               `category` varchar(50) NOT NULL,
                               PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `tb_client` (
                             `id` bigint NOT NULL AUTO_INCREMENT,
                             `address` varchar(100),
                             `address_number` varchar(4),
                             `birth_date` datetime(6) NOT NULL,
                             `cellphone_number` varchar(14) NOT NULL,
                             `cep` varchar(10),
                             `city` varchar(100),
                             `complement` varchar(100),
                             `cpf` varchar(11) NOT NULL,
                             `email` varchar(100) NOT NULL,
                             `name` varchar(100) NOT NULL,
                             `neighborhood` varchar(100),
                             `password` varchar(100) NOT NULL,
                             `phone_number` varchar(15),
                             `rg` varchar(17),
                             `uf` varchar(2),
                             PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `tb_employee` (
                                             `id` bigint NOT NULL AUTO_INCREMENT,
                                             `name` varchar(100) NOT NULL,
                                             `phone_number` varchar(15) NOT NULL,
                                             PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `tb_installment` (
                                  `id` bigint NOT NULL AUTO_INCREMENT,
                                  `installment_amount` double NOT NULL,
                                  `installment_due_date` datetime(6) NOT NULL,
                                  `installment_payment_date` datetime(6) DEFAULT NULL,
                                  `installment_price` double NOT NULL,
                                  `installment_quantity` int NOT NULL,
                                  `payment_method_id` bigint DEFAULT NULL,
                                  `purchase_id` bigint DEFAULT NULL,
                                  `sale_id` bigint DEFAULT NULL,
                                  PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `tb_payment_method` (
                                     `id` bigint NOT NULL AUTO_INCREMENT,
                                     `payment_method` tinyint NOT NULL,
                                     PRIMARY KEY (`id`),
                                     CONSTRAINT `tb_payment_method_chk_1` CHECK ((`payment_method` in (1,2,3,4)))
);

CREATE TABLE IF NOT EXISTS `tb_phone` (
                                          `id` bigint NOT NULL AUTO_INCREMENT,
                                          `contact` varchar(255) NOT NULL,
                                          `email` varchar(100) NOT NULL,
                                          `number` varchar(15) NOT NULL,
                                          `supplier_id` bigint DEFAULT NULL,
                                          PRIMARY KEY (`id`)

);

CREATE TABLE IF NOT EXISTS `tb_product` (
                                            `id` bigint NOT NULL AUTO_INCREMENT,
                                            `brand` varchar(50) NOT NULL,
                                            `description` varchar(255) NOT NULL,
                                            `model` varchar(50) NOT NULL,
                                            `category_id` bigint DEFAULT NULL,
                                            PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `tb_product_purchase` (
                                                     `id` bigint NOT NULL AUTO_INCREMENT,
                                                     `price` double NOT NULL,
                                                     `quantity` int NOT NULL,
                                                     `product_id` bigint DEFAULT NULL,
                                                     `purchase_id` bigint DEFAULT NULL,
                                                     PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `tb_purchase` (
                                             `id` bigint NOT NULL AUTO_INCREMENT,
                                             `date` datetime(6) NOT NULL,
                                             `total` double NOT NULL,
                                             `employee_id` bigint DEFAULT NULL,
                                             `supplier_id` bigint DEFAULT NULL,
                                             PRIMARY KEY (`id`)
);


CREATE TABLE IF NOT EXISTS `tb_sale` (
                                         `id` bigint NOT NULL AUTO_INCREMENT,
                                         `date` datetime(6) NOT NULL,
                                         `local` varchar(100) NOT NULL,
                                         `tax_cupon` varchar(3) NOT NULL,
                                         `total` double NOT NULL,
                                         `client_id` bigint DEFAULT NULL,
                                         `employee_id` bigint DEFAULT NULL,
                                         PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `tb_sale_prod` (
                                              `id` bigint NOT NULL AUTO_INCREMENT,
                                              `price` double NOT NULL,
                                              `quantity` int NOT NULL,
                                              `product_id` bigint DEFAULT NULL,
                                              `sale_id` bigint DEFAULT NULL,
                                              PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `tb_size` (
                                         `id` bigint NOT NULL AUTO_INCREMENT,
                                         `maximum_quantity` int NOT NULL,
                                         `minimum_quantity` int NOT NULL,
                                         `size` varchar(2) NOT NULL,
                                         `stock_quantity` int NOT NULL,
                                         `product_id` bigint DEFAULT NULL,
                                         PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `tb_supplier` (
                                             `id` bigint NOT NULL AUTO_INCREMENT,
                                             `address` varchar(100) NOT NULL,
                                             `address_number` varchar(4) NOT NULL,
                                             `cep` varchar(10) NOT NULL,
                                             `city` varchar(100) NOT NULL,
                                             `cnpj` varchar(18) NOT NULL,
                                             `complement` varchar(100) NOT NULL,
                                             `fantasy_name` varchar(50) NOT NULL,
                                             `ie` varchar(255) NOT NULL,
                                             `neighborhood` varchar(100) NOT NULL,
                                             `social_reason` varchar(255) NOT NULL,
                                             `uf` varchar(2) NOT NULL,
                                             PRIMARY KEY (`id`)
);



