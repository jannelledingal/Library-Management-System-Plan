# 2nd-Deliverable-CCE105

**Project title** 

# The University of Davao (UD) Library Management System

**Description**

The system will allow students to search and view books, while librarians (admins) will manage books, approve or decline borrowing requests, and generate reports.

# Team members’ names and roles 

***Backend Developer*** 

Ramos, Alfert Jr.

Dingal, Jannelle


***Frontend  Developer***

Oñez, Milalyn

Dingal, Jannelle 

Ramos, Alfert Jr.


***Documenter***

Basan, Hannah Kaye

Dos Pueblos, Axel

Tapia, Rodmark

---
## **Library Management Booking System Instruction Plan**

### **Home Screen (User, Admin)**

This is the entry point of the application for both users and administrators. The home screen will provide options for logging in as a user or as an admin.

1. **Home Screen Components**:

   * **User Login Button**: Takes the user to the user-side interface (Search Frame).
   * **Admin Login Button**: Takes the admin to the Admin Login Frame for authentication.

---

### **User Side**


This section allows users to search for books, view book details, and request to borrow books.

### **1. Home / Search Frame**

* **View Books**:

  * This section displays a list of available books from the database.
  * The list will show a short preview of the title, author, and availability.

* **Search Bar**:

  * Users can search books by **Title**, **Author**, **Category**, or **ISBN**.
  * Provide a clear label for each search option and an input field.

* **Search Button**:

  * When clicked, the system searches for books that match the entered query in the search bar.
  * After the search, it will display the results in the **Results Area**.

* **Results Area**:

  * Displays a list of books that match the search criteria. Each entry will show:

    * **Book Title**
    * **Author**
    * **Category**
    * **Availability Status**
    * **Shelf Location Number**

* **Read Button**:

  * Once a user selects a book, they will click **Read** to view the **Book Details Frame**.

---

### **2. Book Details Frame**

* **Book Title**:

  * Displays the title of the selected book.

* **Author**:

  * Displays the author of the selected book.

* **Category**:

  * Displays the category of the selected book (e.g., Fiction, Science, History).

* **Shelf Location Number**:

  * Displays where the book is located in the library (e.g., shelf number or section).

* **Availability Status**:

  * Shows whether the book is available for borrowing or if it’s currently checked out.

* **Instruction**:

  * A message instructing the user on how to borrow the book:

    * Example: "Get the book and go to the Admin Desk to request borrowing."

* **Back Button**:

  * Allows the user to go back to the **Search Frame** to perform a new search.

---

### **Admin Side**


This section allows the administrator to manage the library system, including managing books, handling borrow requests, and generating reports.


### **1. Admin Login Frame**

* **Password (Encrypted)**:

  * Admin must enter their password to log into the system. The password is stored securely using encryption techniques (e.g., SHA-256).

* **Login Button**:

  * When the admin clicks **Login**, they are directed to the **Admin Dashboard**.

---

### **2. Admin Dashboard Frame**

The admin dashboard is the central hub for managing the library's books, borrowing requests, and reports.

#### **2.1 Manage Books Frame**

* **Add Book**:

  * The admin can add a new book to the system.
  * Fields to fill out include:

    * **Title**
    * **Author**
    * **Category**
    * **Shelf Location**
    * **Availability** (set to "Available" by default)
    * **ISBN** (must be unique)

* **Update Book**:

  * The admin can update information for an existing book. This allows for correcting details like the book's title, author, or availability.

* **Delete Book**:

  * The admin can delete a book from the system. The book will be permanently removed from the database.

---

#### **2.2 Borrow Requests Frame**

* **Input: User ID, ISBN Code**:

  * The admin can input the **User ID** and the **ISBN code** of the book that the user is requesting to borrow.

* **Borrow Button**:

  * Once the admin inputs the User ID and ISBN, they click **Borrow** to initiate the borrowing process.

* **Requests Table**:

  * Displays a list of pending borrow requests.
  * Each row should display:

    * **Request ID**
    * **User ID**
    * **Book ISBN**
    * **Request Date**
    * **Status** (Pending)

* **Approve Button**:

  * Clicking **Approve** will:

    * Record the transaction in the **Borrowing Records Table**.
    * Update the book's status to **"Borrowed"**.
    * Print a receipt or confirmation for the user.

* **Decline Button**:

  * If the admin declines the request, a notification will be sent to the user.
  * The request is marked as **Declined**.

---

#### **2.3 Borrowing Records Frame**

* **Transactions Table**:

  * Displays a list of all borrowing records, including:

    * **User ID**
    * **Book ISBN**
    * **Borrow Date**
    * **Return Date**
    * **Status** (Borrowed/Returned)
  * This table helps the admin keep track of which books have been borrowed, when they were borrowed, and when they are expected to be returned.

---

#### **2.4 Reports Frame**

* **Generate Summaries**:

  * The admin can generate reports for various library statistics:

    * **Most Borrowed Books**: Shows which books have been borrowed the most.
    * **Overdue Returns**: Lists books that were not returned by their due dates.
    * **Book Availability**: Shows the current status of all books in the library (available or borrowed).

  * Reports will help in decision-making, ensuring that the library runs smoothly and efficiently.








