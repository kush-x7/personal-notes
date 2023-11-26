The 13 rules of Codd, also known as Codd's Rules for Relational Database Management Systems (RDBMS), were formulated by Dr. E.F. Codd, the pioneer of relational databases. These rules set the foundation for the relational database model. Here they are explained in a simplified manner:

**Codd's Rules for Relational Database Management Systems (RDBMS):**

1. **Information Rule:**
    
    - **Definition:** All information in the database is to be stored in one and only one place, the table.
    - **Simplified:** Every piece of information has a designated home (table).
2. **Guaranteed Access Rule:**
    
    - **Definition:** Each unique piece of data (atomic value) must be accessible by specifying the table name, primary key value, and column name.
    - **Simplified:** You can find any specific piece of data using a unique identifier.
3. **Systematic Treatment of Null Values:**
    
    - **Definition:** Null values (unknown or undefined) must be treated in a systematic way.
    - **Simplified:** Dealing with unknown information is handled consistently.
4. **Dynamic Online Catalog Based on the Relational Model:**
    
    - **Definition:** The database schema (structure) is stored in a table called the data dictionary, making it accessible and queryable.
    - **Simplified:** Information about the database structure is also kept in the database.
5. **Comprehensive Data Sublanguage Rule:**
    
    - **Definition:** The database must support a relational language that can be used both for defining data structures and for manipulating data.
    - **Simplified:** There's a common language for both describing and interacting with the data.
6. **View Updating Rule:**
    
    - **Definition:** Views that are theoretically updatable should also be updatable by the system.
    - **Simplified:** If you can theoretically update a view, the system should allow you to do it.
7. **High-Level Insert, Update, and Delete:**
    
    - **Definition:** The capability to insert, update, or delete multiple records using a single statement is provided.
    - **Simplified:** You can make changes to many records at once using one command.
8. **Physical Data Independence:**
    
    - **Definition:** The internal details of storage and access methods should be hidden from the user.
    - **Simplified:** Users are shielded from knowing exactly how data is stored and accessed.
9. **Logical Data Independence:**
    
    - **Definition:** The logical schema can be changed without changing the application programs.
    - **Simplified:** The way data is organized can change without affecting the programs using the data.
10. **Integrity Independence:**
    
    - **Definition:** Integrity constraints are part of the relational database, separate from application programs.
    - **Simplified:** Rules about data accuracy are maintained by the database itself.
11. **Distribution Independence:**
    
    - **Definition:** The distribution of portions of the database to various locations should be invisible to users.
    - **Simplified:** Users shouldn't know or care if parts of the database are stored in different places.
12. **Nonsubversion Rule:**
    
    - **Definition:** If a relational system has a low-level language, that low-level language cannot be used to subvert or bypass the integrity rules and constraints of the relational model.
    - **Simplified:** You can't use a lower-level language to break the rules of the relational model.
13. **The Rule of Completeness for the Information Rule:**
    
    - **Definition:** If the DBMS is unable to directly express a certain kind of information, it should provide a way to express this information via a user-defined language.
    - **Simplified:** If the system can't do something directly, it should provide a way for users to define how to do it.

These rules lay the foundation for the principles of relational databases, ensuring consistency, reliability, and ease of use.