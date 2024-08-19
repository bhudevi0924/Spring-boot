-- Drop the function if it already exists
DROP FUNCTION IF EXISTS gettotalemployees();

-- Create or replace the function
CREATE OR REPLACE FUNCTION gettotalemployees()
RETURNS integer
LANGUAGE plpgsql
AS $$
DECLARE
    totalemployees integer;
BEGIN
    SELECT count(*) INTO totalemployees FROM employee;
    RETURN totalemployees;
END;
$$;
