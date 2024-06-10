# PhoneBook

In this challenge, we are tasked with creating a simple phone book application in Java. The application allows users to manage a list of contacts, each containing a first name, last name, institution, and phone number. The primary functionalities include initializing a list of contacts, displaying them, and sorting them based on different criteria: first name, last name, institution, and phone number.

**Solution Overview**
To solve this challenge, we implemented a Java program with the following components:

**Contact Class:**

Represents individual contacts with attributes: first name, last name, institution, and phone number.
Contains a toString() method for formatted display of contact information.
**PhoneBook Class:**

Contains the main logic for managing and interacting with the list of contacts.
Initializes contacts and allows sorting and displaying them based on user input.
**Sorting Mechanism:**

Implements a custom bubble sort algorithm using Comparator to allow sorting based on different attributes of the Contact class.
Implementation Details
**Contact Class:**

The Contact class is defined with the attributes firstName, lastName, institution, and phoneNumber.
The constructor initializes these attributes, and the toString() method provides a formatted string representation of a contact.
**PhoneBook Class:**

Contains a static ArrayList<Contact> to store the list of contacts.
The main method initializes the contacts and provides a user interface for sorting and displaying contacts.
The initializeContacts method populates the list with sample contacts.
The displayContacts method prints the list of contacts to the console.
The sortContacts method uses a custom bubbleSort method to sort the list based on user choice.
The bubbleSort method sorts the list using the provided Comparator<Contact>
