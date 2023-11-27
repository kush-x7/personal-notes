### **AND Keyword:**

1. **Definition:**
    
    - **In Simple Terms:**
        - The `AND` keyword is like a filter that narrows down results. It's used to combine multiple conditions in a query, and all conditions must be true for a row to be included in the result.
    - **Example:**
        - Selecting employees who are both managers and have a salary greater than 50000.
2. **SQL Query:**

```sql
SELECT employee_name, salary
FROM employees
WHERE job_title = 'Manager' AND salary > 50000;

+----------------+--------+
| employee_name  | salary |
+----------------+--------+
| John Doe       | 60000  |
| Jane Smith     | 55000  |
+----------------+--------+
```

### **OR Keyword:**

1. **Definition:**
    
    - **In Simple Terms:**
        - The `OR` keyword is like an alternative filter. It's used to combine multiple conditions in a query, and at least one condition must be true for a row to be included in the result.
    - **Example:**
        - Selecting employees who are either managers or have a salary greater than 60000.
2. **SQL Query:**

```sql
SELECT employee_name, salary
FROM employees
WHERE job_title = 'Manager' OR salary > 60000;

+----------------+--------+
| employee_name  | salary |
+----------------+--------+
| John Doe       | 60000  |
| Bob Johnson    | 62000  |
+----------------+--------+
```

### **In a Nutshell:**

- **AND Keyword:**
    
    - Combines multiple conditions, and all conditions must be true.
    - Example: `WHERE condition1 AND condition2`.
- **OR Keyword:**
    
    - Combines multiple conditions, and at least one condition must be true.
    - Example: `WHERE condition1 OR condition2`.



![[Pasted image 20231127141859.png]]
```sql
SELECT count(customers)
from customers
where gender= 'F' AND (state ='OR' OR state='NY')
```
