create table employees (
id int not null,
name_of_employee varchar(255) not null,
number_of_employee int not null,
PRIMARY KEY(id)
);

create table cash (
id int not null,
operator_id int not null,
currency_code varchar(20) ,
amount int,
exchange_date date,
PRIMARY KEY(id),
CONSTRAINT FK_OperatorID FOREIGN KEY (operator_id) REFERENCES employees(id)
);

create table exchange_rates (
id int not null,
currency_code varchar(20) unique ,
rate int,
exchange real,
PRIMARY KEY(id)
);


create table exchange (
id int not null,
name_of_exchange varchar(255) not null,
currency_code varchar(20) not null unique ,
exchange_rate_id int not null,
received_amount real not null,
released_amount real not null,
operator_id int not null,
PRIMARY KEY(id),
CONSTRAINT FK_ExchangeRateID FOREIGN KEY (exchange_rate_id) REFERENCES exchange_rates(id),
CONSTRAINT FK_OperatorID FOREIGN KEY (operator_id) REFERENCES employees(id)
);

create table companies (
id int not null,
name_of_company varchar(255) not null,
exchange_id int not null,
operator_id int not null,
PRIMARY KEY(id),
CONSTRAINT FK_OperatorID FOREIGN KEY (operator_id) REFERENCES employees(id),
CONSTRAINT FK_ExchangeID FOREIGN KEY (exchange_id) REFERENCES exchange(id)
)