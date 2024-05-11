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

