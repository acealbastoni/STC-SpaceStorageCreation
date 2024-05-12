# (Task#1)  Problem solving
- Problem solving :
- solved under the pacakge: com.reverse.parentheses.task
- file name: STC_ReverseParentheses:
 package com.reverse.parentheses.task;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class STC_ReverseParentheses {

    public static String reverseParentheses(String s, int[] openingParenthesesIndices, int[] closingParenthesesIndices) {
        // Validate input constraints
        if (s.length() < 1 || s.length() > 2000) {
            throw new IllegalArgumentException("String length must be between 1 and 2000 characters.");
        }
        if (!s.matches("[a-z()]+")) {
            throw new IllegalArgumentException("String must only contain lowercase English characters and parentheses.");
        }

        // Method implementation remains the same
        Stack<Integer> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.push(i);
            } else if (chars[i] == ')') {
                int start = stack.pop();
                reverseSubstring(chars, start + 1, i - 1);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            if (c != '(' && c != ')') {
                result.append(c);
            }
        }

        // Check if both opening and closing parentheses are found before inserting them
        for (int i = 0; i < openingParenthesesIndices.length; i++) {
            if (openingParenthesesIndices[i] != -1 && closingParenthesesIndices[i] != -1) {
                result.insert(openingParenthesesIndices[i], "(");
                result.insert(closingParenthesesIndices[i], ")");
            }
        }
        return result.toString();
    }

    private static void reverseSubstring(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String[] testCases = { "abd(jnb)asdf", "abdjnbasdf", "dd(df)a(ghhh)" };
        for (String test : testCases) {
            System.out.println("Input: " + test);

            // Find all occurrences of indices for opening parentheses
            List<Integer> openingParenthesesIndicesList = new ArrayList<>();
            for (int i = 0; i < test.length(); i++) {
                if (test.charAt(i) == '(') {
                    openingParenthesesIndicesList.add(i);
                }
            }
            int[] openingParenthesesIndices = openingParenthesesIndicesList.stream().mapToInt(Integer::intValue)
                    .toArray();

            // Find all occurrences of indices for closing parentheses
            List<Integer> closingParenthesesIndicesList = new ArrayList<>();
            for (int i = 0; i < test.length(); i++) {
                if (test.charAt(i) == ')') {
                    closingParenthesesIndicesList.add(i);
                }
            }
            int[] closingParenthesesIndices = closingParenthesesIndicesList.stream().mapToInt(Integer::intValue)
                    .toArray();
            System.out.println(
                    "Output: " + reverseParentheses(test, openingParenthesesIndices, closingParenthesesIndices));
        }
    }

}

# (Task#2)  Database query
- solved under the pacakge: com.sql.query.task
- file name: stc.SQL

# (Task#3)  STC-SpaceStorageCreation

# Project Name: SpaceStorageCreation

 A springBoot Project for creating structure of a storage space 

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Technologies Used](#technologies-used)
- [Contributing](#contributing)
- [License](#license)

## Installation

1. Clone the repository:

    - git clone https://github.com/acealbastoni/STC-SpaceStorageCreation.git

    
2. Navigate to the project directory:


3. Install dependencies:

4. Install Docker Desktop

## Usage

  - go to root bath 
  - open terminal 
  - write command: docker compose up -d

## API Endpoints

- **Create Space**

- URL: POST http://localhost:8083/spaces/create

- Endpoint: `POST /spaces/create`
- Description: Create a new space.
- Request Body:
 ```json
{
     "name": "Space Name"
}
 ```
- Response: Returns the created space.

- **Create Folder**
- URL: POST http://localhost:8083/spaces/1/folders/create
- Endpoint: `POST /spaces/{spaceId}/folders/create`
- Description: Create a new folder under a specified space.
- Request Body:
 ```json
{
    "name": "MyFolder",
    "spaceId": 1 
}

 ```
- Response: Returns the created folder.

- **Create File**
- URL: POST http://localhost:8083/folders/1/files/create
- Endpoint: `POST /files/create`
- Description: Create a new file under a specified folder.
- Request Body:
 ```json
{
    "name": "MyFile",
    "content": "Base64EncodedContent",
    "folderId": 1
}
 ```
- Response: Returns the created file.

## Technologies Used

- Spring Boot
- PostgreSQL
- Docker

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request.

## License

Appache License, written and developed by Mohamed Abdelhamid

