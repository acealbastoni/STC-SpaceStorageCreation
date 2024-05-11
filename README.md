# STC-SpaceStorageCreation

# Project Name

[Description of your project]

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Technologies Used](#technologies-used)
- [Contributing](#contributing)
- [License](#license)

## Installation

1. Clone the repository:

    - git clone https://github.com/your-username/your-project.git

    
2. Navigate to the project directory:


3. Install dependencies:



## Usage

[Instructions on how to use or run the project]

## API Endpoints

- **Create Space**
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
- Endpoint: `POST /folders/create`
- Description: Create a new folder under a specified space.
- Request Body:
 ```json
 {
     "name": "Folder Name",
     "spaceId": 1
 }
 ```
- Response: Returns the created folder.

- **Create File**
- Endpoint: `POST /files/create`
- Description: Create a new file under a specified folder.
- Request Body:
 ```json
 {
     "name": "File Name",
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

[License information]

