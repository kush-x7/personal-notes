1. **Definition:**
    
    - Concatenation is like combining pieces of text from different columns into a single column.
2. **SQL Query:**
    
    - Use the `CONCAT` function or the `||` (double pipe) operator in SQL.
    
    
```sql
SELECT CONCAT(column1, ' ', column2) AS concatenated_column
FROM your_table;
```

or

```sql
SELECT column1 || ' ' || column2 AS concatenated_column
FROM your_table;
```

3. **Example:**

- If you have columns `first_name` and `last_name`, you can concatenate them to create a `full_name` column.

```sql
SELECT CONCAT(first_name, ' ', last_name) AS full_name
FROM employees;

+---------------+
| full_name     |
+---------------+
| John Doe      |
| Jane Smith    |
| Bob Johnson   |
+---------------+
```

1. - Here, the `full_name` column is created by concatenating `first_name` and `last_name` with a space in between.

### **In a Nutshell:**

- **Use `CONCAT` or `||` for Concatenation:**
    - Use the `CONCAT` function or the `||` operator to concatenate column values.
- **Example:**
    - Concatenate `first_name` and `last_name` to create a `full_name` column.