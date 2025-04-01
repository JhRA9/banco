# JavaApplication3

## Overview
JavaApplication3 is a banking application that allows users to manage their accounts, perform transactions, and view their financial status. The application provides functionalities for user registration, login, account management, transfers, loans, and investments.

## Project Structure
```
JavaApplication3
├── src
│   ├── Cuenta.java          # Defines the Cuenta class for bank accounts
│   ├── mov.java             # Defines the mov class for account movements
│   ├── login.java           # User login interface
│   ├── Signup.java          # User signup interface
│   ├── PRINCIPAL.java       # Main interface of the application
│   ├── TRANFERENCIA.java    # Transfer functionality
│   ├── PRESTAMO.java        # Loan functionality
│   ├── INVERSION.java       # Investment options
│   ├── ESTADO.java          # Account status interface
│   ├── utils
│   │   ├── FileManager.java  # Utility methods for file operations
│   │   └── DatabaseManager.java # Utility methods for database operations
│   └── models
│       └── Usuario.java      # Defines the Usuario class for user details
├── data
│   └── usuarios.txt          # Stores user information
├── README.md                 # Project documentation
└── .gitignore                # Specifies files to ignore in version control
```

## Features
- **User Management**: Users can sign up and log in to their accounts.
- **Account Management**: Users can view and manage their bank accounts.
- **Transaction Handling**: Users can perform transfers and apply for loans.
- **Investment Options**: Users can explore different investment opportunities.
- **Account Status**: Users can check the status of their accounts.

## Setup Instructions
1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Open the project in your preferred IDE.
4. Ensure you have Java Development Kit (JDK) installed.
5. Compile the source files and run the application.

## Usage
- Launch the application and navigate through the user interface.
- Use the signup form to create a new user account.
- Log in with your credentials to access account features.
- Perform transactions, apply for loans, and explore investment options.

## Contributing
Contributions are welcome! Please submit a pull request or open an issue for any enhancements or bug fixes.

## License
This project is licensed under the MIT License.