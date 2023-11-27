If you want to give a new name to a column temporarily when selecting it in a query without changing the actual column name, you can use an alias. An alias is like a nickname you give to a column for the duration of a query. Here's how you can do it:

**Creating an Alias for a Column in a Select Query:**

1. **Definition:**
    
    - **In Simple Terms:**
        - Creating an alias for a column is like giving it a temporary nickname just for the current query.
    - **Example:**
        - If you have a column named "full_name," you can alias it as "Name" in a specific query.
2. **SQL Query:**

```sql
SELECT column_name AS alias_name
FROM table_name;
```

- **Easy Language:**
        - "Hey database, when showing me the results from 'table_name,' call the 'column_name' as 'alias_name' just for this query."
3. **Keywords:**
    
    - **SELECT:** Specify the columns you want to see in the result.
    - **AS:** Use to create an alias.
    - **column_name:** The original name of the column.
    - **alias_name:** The temporary name you want to use for the column in this query.

**In a Nutshell:**

- Creating an alias is like giving a temporary nickname to a column for a specific query.
- Use the `AS` keyword to assign an alias.

Here's an example:

```sql
SELECT full_name AS Name
FROM students;
```

In this query, "full_name" is temporarily referred to as "Name" in the result set.