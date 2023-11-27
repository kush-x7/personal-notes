### **Aggregate Functions:**

1. **Definition:**
    
    - **In Simple Terms:**
        - Aggregate functions operate on a set of values and return a single value as output. They perform operations like sum, average, count, etc., on a group of rows.
    - **Example:**
        - Calculating the average salary or counting the number of employees.
2. **SQL Query:**
    
    - Common aggregate functions include `SUM`, `AVG`, `COUNT`, `MIN`, and `MAX`.

```sql
SELECT AVG(salary) AS average_salary
FROM employees;

+----------------+
| average_salary |
+----------------+
| 50000          |
+----------------+
```

![[Pasted image 20231127133833.png]]

3. **In a Nutshell:**

- Aggregate functions perform calculations on a set of values and return a single result.

---

### **Scalar Functions:**

1. **Definition:**
    
    - **In Simple Terms:**
        - Scalar functions operate on a single value and return a modified or computed value. They are applied to each row individually.
    - **Example:**
        - Converting a string to uppercase or extracting the length of a text.
2. **SQL Query:**
    
    - Common scalar functions include `UPPER`, `LOWER`, `LENGTH`, `ROUND`, etc.

```sql
SELECT UPPER(employee_name) AS upper_name
FROM employees;

+------------+
| upper_name |
+------------+
| JOHN DOE   |
| JANE SMITH |
| BOB JOHNSON|
+------------+

```


1. **In a Nutshell:**
    
    - Scalar functions operate on individual values and return modified or computed results.

### **Key Differences:**

- **Aggregate Functions:**
    
    - Operate on a set of values.
    - Return a single result.
    - Examples: `SUM`, `AVG`, `COUNT`, `MIN`, `MAX`.
- **Scalar Functions:**
    
    - Operate on individual values.
    - Return a modified or computed result for each row.
    - Examples: `UPPER`, `LOWER`, `LENGTH`, `ROUND`.




![[Pasted image 20231127134304.png]]

![[Pasted image 20231127134317.png]]
