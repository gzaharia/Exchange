INSERT INTO employees (id, name_of_employee, number_of_employee)
VALUES
(1, 'operator', 1),
(2, 'operator', 2),
(3, 'operator', 3);

INSERT INTO cash (id, operator_id, currency_code, amount, exchange_date)
VALUES
(1,1,'EUR',1450, '2021-02-12'),
(2,3,'USD',1200, '2021-02-14'),
(3,2,'EUR',2000, '2021-02-15');

INSERT INTO exchange_rates (id, currency_code, rate, exchange)
VALUES
(1, 'EUR', 1, 19.70),
(2, 'KZT', 10, 0.40),
(3, 'JPY', 100, 16.00);

INSERT INTO exchange(id, name_of_exchange, currency_code, exchange_rate_id, received_amount, released_amount, operator_id )
VALUES
(1, 'Exchange-Botanica', 'EUR', 1, 100, 1970,1),
(2, 'Exchange-Centru', 'USD', 1, 50, 985,2);

INSERT INTO companies(id, name_of_company, exchange_id, operator_id)
VALUES
(1,'Exchange-Pro' ,1, 1),
(2,'Money-Factory', 1, 1);
