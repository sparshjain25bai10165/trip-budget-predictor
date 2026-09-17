# 💰 Trip Budget Predictor (Java)

A simple Java console application that helps users estimate the total budget needed for a trip. The program takes basic trip details such as destination, number of travellers, number of days, distance, food, hotel, activities, and other expenses, and then gives an estimated total cost and cost per person.

## 👨‍💻 Project Information

- **Student Name:** Sparsh Jain
- **Course Name:** Programming in Java
- **Project Topic:** Trip Budget Predictor
- **Project Type:** Java Console Application
- **Language:** Java
- **Main File:** `TripBudgetPredictor.java`

## 📖 Table of Contents

- [Overview](#overview)
- [Objectives](#objectives)
- [Key Features](#key-features)
- [How the Program Works](#how-the-program-works)
- [Tech Stack](#tech-stack)
- [Requirements](#requirements)
- [Installation](#installation)
- [Usage](#usage)
- [Calculation Formula](#calculation-formula)
- [Sample Input](#sample-input)
- [Sample Calculation](#sample-calculation)
- [Project Structure](#project-structure)
- [Advantages](#advantages)
- [Limitations](#limitations)
- [Future Enhancements](#future-enhancements)
- [Conclusion](#conclusion)
- [Author](#author)

## 🔎 Overview

Planning a trip can sometimes become confusing because there are many expenses to think about. Transport, hotel, food, activities, and other small expenses all add up.

The **Trip Budget Predictor** makes this process easier. The user enters the required information, and the Java program automatically calculates an estimated trip budget. It also shows the approximate cost for each traveller.

This project is made as a simple Java console application, so it is easy to understand and run for a beginner-level Java project.

## 🎯 Objectives

The main objectives of this project are:

1. To create a simple Java program for estimating a trip budget.
2. To take trip-related information from the user through the console.
3. To calculate different types of travel expenses.
4. To find the total estimated budget.
5. To calculate the approximate cost per person.
6. To classify the trip as a budget, moderate, or premium trip.

## 🚀 Key Features

### 🧾 User Input

The program asks the user for important trip information, including:

- Destination
- Number of travellers
- Number of days
- One-way travel distance
- Daily food cost per person
- Daily hotel cost per person
- Daily activity cost per person
- Miscellaneous expenses

### 🧮 Automatic Calculation

The program calculates the major expenses automatically using separate Java methods.

### 👥 Cost Per Person

After finding the total budget, the program divides it by the number of travellers to show the estimated individual cost.

### 🏷️ Budget Classification

The program classifies the trip according to the estimated cost per person:

- Up to Rs 5,000 — **LOW / BUDGET TRIP**
- Rs 5,001 to Rs 10,000 — **MODERATE TRIP**
- Above Rs 10,000 — **PREMIUM TRIP**

## ⚙️ How the Program Works

The program works in three simple stages:

1. **Input:** The user enters all the required trip details.
2. **Processing:** Java methods calculate transport, food, hotel, activities, and other expenses.
3. **Output:** The program displays the total budget, cost per person, and trip category.

The program uses the `Scanner` class to take input from the keyboard.

## 🛠️ Tech Stack

- **Programming Language:** Java
- **JDK:** Java 8 or later
- **IDE/Editor:** VS Code, IntelliJ IDEA, Eclipse, or NetBeans
- **Input:** Java `Scanner`
- **Output:** Java console
- **Operating System:** Windows / macOS / Linux

## 📋 Requirements

Before running the project, make sure Java is installed on your computer.

You can check Java installation by running:

```bash
java -version
```

A Java Development Kit (JDK) 8 or later is recommended.

## 💻 Installation

### 1. Get the Project

Download or clone the project repository.

```bash
git clone <your-repository-link>
```

Then open the project folder:

```bash
cd trip-budget-predictor
```

### 2. Compile the Java Program

Open the terminal in the project folder and run:

```bash
javac TripBudgetPredictor.java
```

### 3. Run the Program

After successful compilation, run:

```bash
java TripBudgetPredictor
```

The program will start in the console and ask for the trip details.

## ▶️ Usage

When the program starts, enter the information requested on the screen.

For example:

```text
Destination: Manali
Persons: 4
Duration: 5
One-way distance: 600
Daily food/person: 500
Daily hotel/person: 900
Daily activities/person: 400
Miscellaneous: 2000
```

The program then calculates the complete estimated budget and displays the result.

## 🧮 Calculation Formula

The project uses simple formulas to calculate the expenses.

### Transport

```text
Transport = Round-trip distance × estimated cost per kilometre
```

The project uses an estimated transport rate of **Rs 12 per kilometre**.

### Food

```text
Food = Days × Persons × Daily food cost per person
```

### Hotel

```text
Hotel = Days × Persons × Daily hotel cost per person
```

### Activities

```text
Activities = Days × Persons × Daily activity cost per person
```

### Total Budget

```text
Total Budget = Transport + Food + Hotel + Activities + Miscellaneous
```

### Cost Per Person

```text
Cost Per Person = Total Budget ÷ Number of Persons
```

## 📝 Sample Input

| Field | Sample Value |
|---|---|
| Destination | Manali |
| Persons | 4 |
| Duration | 5 days |
| One-way distance | 600 km |
| Daily food/person | Rs 500 |
| Daily hotel/person | Rs 900 |
| Daily activities/person | Rs 400 |
| Miscellaneous | Rs 2,000 |

## 📊 Sample Calculation

For the above example:

```text
Transport = 600 × 2 × Rs 12
          = Rs 14,400

Food = 5 × 4 × Rs 500
     = Rs 10,000

Hotel = 5 × 4 × Rs 900
      = Rs 18,000

Activities = 5 × 4 × Rs 400
           = Rs 8,000

Miscellaneous = Rs 2,000
```

Therefore:

```text
Total Budget = Rs 52,400

Cost Per Person = Rs 52,400 ÷ 4
                = Rs 13,100
```

According to the predefined classification, this example is a **PREMIUM TRIP** because the estimated cost per person is above Rs 10,000.

## 📂 Project Structure

```text
trip-budget-predictor/
│
├── TripBudgetPredictor.java
│
└── README.md
```

## 🧠 Java Concepts Used

This project demonstrates several basic Java concepts:

- `Scanner` for taking user input
- Variables for storing trip information
- Methods for separating different calculations
- Arithmetic operators for expense calculations
- `if-else` statements for budget classification
- `printf` for formatted output
- Modular program design
- Basic problem-solving and decision-making

## ✅ Advantages

- Easy to understand and use.
- Reduces repeated manual calculations.
- Gives the total estimated trip budget quickly.
- Shows the approximate cost per person.
- Uses separate methods, which makes the program easier to read.
- Useful for basic trip planning.

## ⚠️ Limitations

The current version has some limitations:

- Transport cost uses a fixed estimated rate and does not use live ticket prices.
- Hotel, food, and activity costs depend on the values entered by the user.
- The program is currently console-based.
- Previous trip calculations are not stored.
- Taxes and discounts are not included.
- Currency conversion is not included.
- Real-time booking and price information are not included.

## 🔮 Future Enhancements

The project can be improved in the future by adding:

- A graphical interface using Java Swing or JavaFX.
- Saving previous trip calculations.
- A trip history feature.
- Separate transport options such as bus, train, car, and flight.
- Dynamic transport and hotel rates.
- Currency conversion.
- Budget alerts when the estimated cost crosses a selected limit.
- More detailed travel reports.

## 🏁 Conclusion

The **Trip Budget Predictor** is a simple Java project that solves a practical everyday problem. It takes basic travel information from the user and uses simple calculations to estimate the overall trip expense.

The project is also a good example of how Java concepts such as input handling, methods, arithmetic operations, conditional statements, and formatted output can be used together to create a useful application.

Although the current version uses user-provided estimates instead of live prices, it provides a clear foundation for developing a more advanced travel budget application in the future.

## 👨‍💻 Author

**Sparsh Jain**

**Course:** Programming in Java

**Project:** Trip Budget Predictor

