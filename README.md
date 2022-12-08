# Market Trading Service

This project provides a Market Trading Service that processes market data and exposes APIs for retrieving order information.

## Table of Contents
- [Project Description](#project-description)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [API Endpoints](#api-endpoints)
- [Usage](#usage)
- [Contributing](#contributing)

## Project Description

The Market Trading Service is designed to handle market data and provide necessary endpoints for retrieving and processing this data.

## Prerequisites

- Java Development Kit (JDK) 11 or later
- Apache Kafka

## Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/nhpquy/market-trading-service.git
    cd market-trading-service
    ```

2. Build the project using Gradle:
    ```sh
    ./gradlew build
    ```

3. Set up and start Kafka:
    1. Download Kafka from [Kafka Downloads](https://kafka.apache.org/downloads)
    2. Start the ZooKeeper service:
        - **Windows:**
            ```sh
            .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
            ```
        - **Mac/Linux:**
            ```sh
            bin/zookeeper-server-start.sh config/zookeeper.properties
            ```
    3. Start the Kafka broker service:
        - **Windows:**
            ```sh
            .\bin\windows\kafka-server-start.bat .\config\server.properties
            ```
        - **Mac/Linux:**
            ```sh
            bin/kafka-server-start.sh config/server.properties
            ```

## API Endpoints

### Market Data Processing Service

| METHOD | URL        | DESCRIPTION |
|--------|------------|-------------|
| GET    | /api/v1/md | Retrieve order data |

*(Ensure this matches the actual endpoint in your code)*

## Usage

1. Start the application:
    ```sh
    ./gradlew bootRun
    ```

2. Access the API at `http://localhost:8082/api/v1/md` to retrieve order data.

## Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes.