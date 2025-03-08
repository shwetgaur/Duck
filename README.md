# Duck Behavior Simulation 

## Overview
This project demonstrates the **Strategy Pattern** using a Duck behavior simulation. It implements different types of ducks with interchangeable behaviors for **flying** and **swimming**.

## Project Structure
The project consists of multiple Java files implementing different classes and interfaces:

### **1. Main.java**
- **Main class** that creates instances of different duck types.
- Calls `performSwim()` and `performFly()` for each duck.

### **2. Duck.java (Abstract Class)**
- Defines a base class for all ducks.
- Contains two behavior references: `FlyBehavior` and `SwimBehavior`.
- Implements `performFly()` and `performSwim()` methods that delegate to the behavior objects.

### **3. Interfaces**
- **FlyBehavior.java** → Defines `fly()` method.
- **SwimBehavior.java** → Defines `swim()` method.

### **4. Fly Behavior Implementations**
- **Fly.java** → Implements `fly()` with "Flying High" output.
- **NotFly.java** → Implements `fly()` with "Cannot Fly" output.

### **5. Swim Behavior Implementations**
- **Swim.java** → Implements `swim()` with "Swimming in the water" output.
- **Float.java** → Implements `swim()` with "Floating on water" output.
- **Drown.java** → Implements `swim()` with "Drowning in water" output.

### **6. Duck Implementations**
- **MallardDuck.java** → Can fly and swim.
- **RubberDuck.java** → Cannot fly, but can float.
- **DecoyDuck.java** → Cannot fly and drowns.
- **RedHeadDuck.java** → Can fly and swim.

## How to Run
1. Compile all Java files.
2. Run `Main.java`.
3. The program prints which duck can **fly, float, or swim**.

## UML Class Diagram
(A class diagram is provided in the submission PDF, generated via IntelliJ Professional Edition.)

## GitHub Repository
[GitHub Repo Link](https://github.com/shwetgaur/Duck.git)


