# Corona Virus Detection Software

April 18, 2020

A Java-based simulation software that models contact tracing and proximity detection for corona virus exposure tracking. This project simulates devices with GPS coordinates and tracks encounters between them to aid in contact tracing efforts.

## Project Overview

This software simulates a network of detection devices that:
- Track GPS coordinates (latitude and longitude)
- Monitor proximity between devices using distance calculations
- Generate detailed encounter reports
- Perform contact tracing when an infection is detected
- Provide comprehensive data sheets for each device

## System Architecture

### Core Components

- **CoronaDistanceDetectionDevice**: Represents individual tracking devices with unique IDs, GPS coordinates, and encounter history
- **CoronaDeviceSimmulator**: Orchestrates the simulation, comparing distances between all devices and tracking encounters
- **CoronaSoftwareAlgorithems**: Contains mathematical algorithms for distance calculations between GPS coordinates
- **CoronaSoftwareDataSheet**: Generates formatted reports showing encounter statistics for each device
- **CoronaFound**: Implements contact tracing functionality to identify potentially exposed devices
- **CoronaSoftwareTester**: Main application entry point that sets up and runs simulations

## Features

- **Proximity Detection**: Automatically detects when devices come within a specified distance threshold
- **Contact Tracking**: Maintains lists of all encountered devices for each individual device
- **Distance Calculation**: Uses mathematical distance formulas to calculate proximity between GPS coordinates
- **Data Reporting**: Generates comprehensive encounter reports for analysis
- **Contact Tracing**: Traces infection chains through device encounter networks
- **Configurable Parameters**: Adjustable minimum distance thresholds for encounter detection

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Java IDE (recommended: IntelliJ IDEA, Eclipse, or Visual Studio Code)

### Installation

1. Clone or download this repository to your local machine
2. Open the project in your preferred Java IDE
3. Ensure the project structure matches the expected package hierarchy: `me.levy`

### Running the Application

1. Navigate to the main class: `src/me/levy/CoronaSoftwareTester.java`
2. Run the main method to start the simulation
3. The application will:
   - Generate random GPS coordinates for 5 detection devices
   - Simulate encounters based on a 50-meter proximity threshold
   - Display detailed encounter reports for each device

### Sample Output

```
------INFO SHEET FOR DEVICE WITH ID #1-----
3 people encountered with
Encountered with the following other devices (ID's): [2, 4, 5]

------INFO SHEET FOR DEVICE WITH ID #2-----
1 people encountered with
Encountered with the following other devices (ID's): [1]
```

## Configuration

### Adjusting Parameters

You can modify simulation parameters in `CoronaSoftwareTester.java`:

```java
int minDistance = 50;
```

### Custom Device Setup

Replace the random device generation with specific coordinates:

```java
ArrayList<CoronaDistanceDetectionDevice> devices = new ArrayList<>();
devices.add(new CoronaDistanceDetectionDevice(1, -74.0060, 40.7128)); // NYC coordinates
devices.add(new CoronaDistanceDetectionDevice(2, -73.9857, 40.7484)); // Another NYC location
```

## Understanding the Results

- **Device ID**: Unique identifier for each tracking device
- **Encounter Count**: Total number of close-proximity encounters
- **Encountered Devices**: List of device IDs that came within the specified distance threshold
- **GPS Coordinates**: Latitude (-90 to 90) and Longitude (-180 to 180) positioning

## Contact Tracing Feature

The `CoronaFound` class enables contact tracing when a device tests positive:

```java
CoronaFound found = new CoronaFound(devices, infectedDevice);
// Traces all direct and indirect contacts of the infected device
```

## Development

### Project Structure

```
src/me/levy/
├── CoronaSoftwareTester.java          # Main application entry point
├── CoronaDistanceDetectionDevice.java # Device representation class
├── CoronaDeviceSimmulator.java        # Simulation engine
├── CoronaSoftwareAlgorithems.java     # Mathematical calculations
├── CoronaSoftwareDataSheet.java       # Report generation
└── CoronaFound.java                   # Contact tracing functionality
```

### Coordinate System

- **Latitude**: -90 (South) to +90 (North)
- **Longitude**: -180 (West) to +180 (East)
- **Distance Calculation**: Uses Euclidean distance formula for proximity detection

## Use Cases

This simulation software can be used for:
- Understanding contact tracing algorithms
- Modeling disease spread patterns
- Testing proximity detection systems
- Educational purposes in epidemiology and computer science
- Prototyping real-world contact tracing applications
