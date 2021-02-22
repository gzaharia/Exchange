INSERT INTO employees (name_of_employee, number_of_employee)
VALUES
('operator', 1),
('operator', 2),
('operator', 3);

INSERT INTO cash (operator_id, currency_code, amount, exchange_date)
VALUES
(1,'EUR',1450, '2021-02-12'),
(3,'USD',1200, '2021-02-14'),
(2,'EUR',2000, '2021-02-15');

INSERT INTO exchange_rates (currency_code, rate, exchange)
VALUES
('EUR', 1, 19.70),
('KZT', 10, 0.40),
('JPY', 100, 16.00);

INSERT INTO exchange(name_of_exchange, currency_code, exchange_rate_id, received_amount, released_amount, operator_id )
VALUES
('Exchange-Botanica', 'EUR', 1, 100, 1970,1),
('Exchange-Centru', 'USD', 1, 50, 985,2);

INSERT INTO companies(name_of_company, exchange_id, operator_id)
VALUES
('Exchange-Pro' ,1, 1),
('Money-Factory', 1, 1);
