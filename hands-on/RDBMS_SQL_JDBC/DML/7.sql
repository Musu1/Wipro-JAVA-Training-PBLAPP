UPDATE employees SET salary= CASE department_id 
                          WHEN 90 THEN salary+(salary*.1) 
                          ELSE salary
                        END;