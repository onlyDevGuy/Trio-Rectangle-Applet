# 🎨 Trio Rectangle Applet (Java Graphics Project)

## Overview

The Trio Rectangle Applet is a Java Graphics application that demonstrates object-oriented programming, Java 2D graphics, and event-driven programming. The application draws three overlapping colored rectangles and allows users to reposition the shape dynamically using mouse clicks.

This project introduces graphical coordinate systems, shape rendering, user interaction, and custom object drawing using Java Applets and the Java 2D API.

---

## Features

- Draws three overlapping rectangles
- Uses different colors for each rectangle
- Accepts user-defined starting coordinates
- Repositions the entire shape based on mouse clicks
- Object-Oriented Design using separate classes
- Dynamic graphical rendering

---

## Technologies Used

- Java
- Java Applets
- Java 2D Graphics
- Object-Oriented Programming (OOP)
- Event-Driven Programming
- Mouse Event Handling

---

## Project Structure

```text
Trio Rectangle Project
│
├── TrioRectApplet.java
│   ├── User coordinate input
│   ├── Applet setup
│   ├── Mouse event handling
│   └── Shape repainting
│
└── TrioRectClass.java
    ├── Rectangle creation
    ├── Shape positioning
    ├── Coordinate management
    └── Graphics rendering
```

---

## How It Works

1. The user enters initial X and Y coordinates.
2. A Trio Rectangle object is created.
3. Three colored rectangles are drawn.
4. Each rectangle is slightly offset from the previous one.
5. Clicking anywhere in the applet moves the entire shape to the clicked position.
6. The display automatically refreshes using repaint().

---

## Shape Design

The trio shape consists of:

### Rectangle 1
- Color: Orange
- Size: 100 × 100 pixels

### Rectangle 2
- Color: Red
- Offset from Rectangle 1
- Size: 100 × 100 pixels

### Rectangle 3
- Color: Magenta
- Offset from Rectangle 2
- Size: 100 × 100 pixels

The overlapping rectangles create a layered visual effect.

---

## User Interaction

### Startup

When the application starts:

```text
Enter x coord:
Enter y coord:
```

The entered values determine the starting position of the shape.

### Mouse Controls

| Action | Result |
|----------|----------|
| Mouse Click | Move Trio Rectangle Shape |

Clicking anywhere inside the applet updates the coordinates and redraws the shape at the selected position.

---

## Object-Oriented Concepts Demonstrated

### Encapsulation

The TrioRectClass stores:

- X Coordinate
- Y Coordinate

using private instance variables with getter and setter methods.

### Constructors

The project uses parameterized constructors to initialize shape coordinates.

### Object Interaction

The Applet class communicates with the shape class to:

- Create objects
- Update coordinates
- Render graphics
- Handle user events

---

## Graphics Concepts Demonstrated

### Java 2D API

- Graphics2D
- Rectangle2D
- Shape Rendering

### Coordinate Systems

- X and Y positioning
- Relative offsets
- Dynamic movement

### Color Management

- Orange
- Red
- Magenta

---

## Skills Demonstrated

- Java Programming
- Object-Oriented Programming
- Event Handling
- GUI Development
- Graphics Programming
- Java 2D API
- Coordinate-Based Drawing
- User Interaction Design

---

## Learning Outcomes

Through this project, the following concepts were practiced:

- Creating graphical applications
- Handling mouse events
- Working with coordinates
- Drawing custom shapes
- Using Java Applets
- Implementing object-oriented design principles

---

## Future Improvements

- Add keyboard controls
- Allow rectangle resizing
- Add custom color selection
- Animate rectangle movement
- Add collision detection
- Convert project to Java Swing or JavaFX

---

## Author

**Sizwe Ramokhali**

Software Developer | Java Developer | Graphics Programming Enthusiast

### Skills Demonstrated
- Java Development
- Java Graphics Programming
- OOP Design
- Event Handling
- GUI Programming
- Problem Solving
