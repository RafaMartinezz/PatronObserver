# Virtual Store - Observer Pattern Demo

This Java project simulates a virtual store where products can be observed for price changes. Using the Observer pattern, **clients** and **marketing employees** receive notifications when a product they are observing drops in price. The project demonstrates object-oriented programming principles and the observer design pattern.

## Table of Contents

- [Overview](#overview)
- [Design Pattern](#design-pattern)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Example Output](#example-output)
- [Classes and Structure](#classes-and-structure)
- [Customization](#customization)
- [License](#license)

---

## Overview

This application models a virtual store where products can be monitored for price changes. When a product's price decreases, all registered observers (such as customers and marketing employees) are notified of the new price. The program demonstrates how to use the Observer pattern to create a flexible and scalable notification system.

## Design Pattern

The project is built around the **Observer Pattern**, which allows an object (the observable product) to notify a list of observers (clients and employees) about changes. This pattern is ideal for implementing a **one-to-many** dependency, where multiple objects need to respond to changes in a single object.

## Features

- **Price Drop Notifications**: Observers receive notifications when a product price drops.
- **Observer Registration and Removal**: Observers can be added or removed dynamically.
- **Object-Oriented Design**: Demonstrates interfaces, encapsulation, and real-world use of the Observer pattern.

### Example Interaction

1. **Adding Observers**: Clients and employees are added as observers to the product.
2. **Price Drop**: When the price decreases, all observers receive a notification.
3. **Removing an Observer**: One observer is removed, and a subsequent price change only notifies the remaining observers.

## Example Output

```plaintext
El cliente Ana ha recibido el aviso: Bajada de precio del producto p1 a 90€ el día Fri Nov 03 12:00:00 UTC 2023.
El empleado de marketing 111 ha recibido el aviso: Bajada de precio del producto p1 a 90€ el día Fri Nov 03 12:00:00 UTC 2023.
El cliente Juan ha recibido el aviso: Bajada de precio del producto p1 a 90€ el día Fri Nov 03 12:00:00 UTC 2023.

# Observer "EmpleadoMarketing 111" is removed

El cliente Ana ha recibido el aviso: Bajada de precio del producto p1 a 80€ el día Fri Nov 03 12:00:05 UTC 2023.
El cliente Juan ha recibido el aviso: Bajada de precio del producto p1 a 80€ el día Fri Nov 03 12:00:05 UTC 2023.
```

## Classes and Structure

- **`Producto`**: Represents a product in the store with a price that can change. Implements the `Observable` interface, allowing observers to register and receive notifications when the price drops.
- **`Cliente`**: Represents a customer observing product prices. Implements the `Observador` interface to receive notifications.
- **`EmpleadoMarketing`**: Represents a marketing employee interested in price changes. Implements the `Observador` interface to receive notifications.
- **`Aviso`**: Contains details about a price drop, including product ID, new price, and the date of the change.
- **`Observable` Interface**: Defines methods for adding, removing, and notifying observers.
- **`Observador` Interface**: Defines the `update` method for receiving notifications.
- **`TiendaVirtual`**: Main class demonstrating the observer pattern by adding/removing observers and simulating price changes.

## Customization

- **Adding New Observers**: Create classes that implement the `Observador` interface to represent different types of observers.
- **Custom Notifications**: Modify the `Aviso` class to include additional information about price changes.
- **Observer Behavior**: Override the `update` method in observer classes (e.g., `Cliente`, `EmpleadoMarketing`) to customize how each observer reacts to price changes.
