
1. **Relational Database:**
    
    - **Definition:** Organizes data into tables with rows and columns, and establishes relationships between tables.
    - **Example:** Think of a university database where you have separate tables for students, courses, and grades, and relationships between them.
    
2. **Document Model Database:**
    
    - **Definition:** Stores data as documents, typically in JSON  format, allowing for flexible and hierarchical structures.
    
    - **Example: <mark style="background: #BBFABBA6;">Library Catalog System**</mark>
    - **Scenario:**
	    - In a library catalog system, each book is represented as a document.
	    - Each document (book) is stored in a flexible format, like JSON  allowing for varying information based on the type of book.

     - **Advantages of Document Model:**
	    - **Flexibility:** Different types of books (fiction, non-fiction, reference) can have different attributes without the need to conform to a rigid structure.
	    - **Easy Retrieval:** Retrieving all information about a specific book is efficient since it's stored in a single document.
	
 -  **Representation:**
	 - Each book is a document, and the entire library catalog is a collection of these documents, allowing for easy expansion and modification.
 
Code Example:
```JSON
{
  "books": [
    {
      "title": "The Hitchhiker's Guide to the Galaxy",
      "author": "Douglas Adams",
      "publication_year": 1979,
      "genre": "Science Fiction",
      "chapters": ["Introduction", "Chapter 1", "Chapter 2"],
      "available_copies": 10,
      "borrowing_history": [
	        {"borrower": "John Doe", "borrow_date": "2022-01-15",
	        "return_date": "2022-02-01"},
	        {"borrower": "Jane Smith", "borrow_date": "2022-02-10",
	        "return_date": "2022-03-01"}
        // Additional borrowing history entries
      ],
	  "related_books": ["The Restaurant at the End of the Universe",
	  "Life, the Universe and Everything"]
    },
    
    {
      "title": "To Kill a Mockingbird",
      "author": "Harper Lee",
      "publication_year": 1960,
      "genre": "Fiction",
      "chapters": ["Chapter 1", "Chapter 2", "Chapter 3", "..."],
      "available_copies": 5,
      "borrowing_history": [
        {"borrower": "Alice Johnson", "borrow_date": "2022-03-05",
         "return_date": "2022-03-20"}
        // Additional borrowing history entries
      ],
      "related_books": []
    },
    // Additional book entries
  ]
}
```


3. **Key-Value Databases:**
    
    - **Definition:** Stores data as key-value pairs, where each piece of data is associated with a unique key.
    - **Example:** In an e-commerce system, you might use a key-value database to store customer profiles, with the customer ID as the key and their information as the value.
    
4. **Graph Model Databases:**
    
    - **Definition:** Represents data as nodes and edges, allowing for efficient handling of complex relationships.
    - **Example:** In a social network database, each person is a node, and connections (friendships) between them are edges, enabling efficient navigation of the network.

5. **Wide Columnar Database:**
    
    - **Definition:** Stores data in columns rather than rows, optimizing for queries on specific columns.
    - **Example:** Imagine an analytics system tracking user interactions on a website, where each column represents a specific type of interaction (e.g., clicks, views), allowing for efficient analysis.


**Keywords:**

- **Relational Database:** Tables, Rows, Columns, Relationships.
- **Document Model Database:** Documents, JSON, Flexible Structures.
- **Key-Value Databases:** Key-Value Pairs, Unique Keys.
- **Graph Model Databases:** Nodes, Edges, Relationships.
- **Wide Columnar Database:** Columns, Query Optimization.