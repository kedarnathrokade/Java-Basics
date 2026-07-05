# Java Basics

A hands-on Java learning library with concise, runnable examples and interview-style problems across strings, collections, concurrency, streams, OOP, design patterns, and sorting — ideal for beginners and developers preparing for interviews.

## Table of Contents

- About
- Repository Structure
- Prerequisites
- Build & Run
- Examples
- Contribution
- License
- Contact

## About

This repository contains small, focused Java examples and problems that you can run locally to learn core Java concepts and practice interview-style questions. Examples are intentionally short and explanatory.

## Repository Structure

- .classpath, .project, .settings/ — Eclipse project metadata
- bin/ — compiled classes (gitignored normally)
- src/ — Java source code organized by packages (main code and examples)

Explore the `src/` directory to find topics such as strings, collections, concurrency, streams, OOP, design patterns, and sorting.

## Prerequisites

- Java Development Kit (JDK) 11 or newer installed and JAVA_HOME set.
- An IDE such as IntelliJ IDEA or Eclipse (project files are included), or the command-line Java compiler.

## Build & Run (IDE)

1. Import the project into your IDE:
   - IntelliJ: File → New → Project from Existing Sources... → select this repository
   - Eclipse: File → Import → Existing Projects into Workspace
2. Locate a class with a `public static void main(String[] args)` method under `src/` and run it as a Java application.

## Build & Run (Command line)

From the repository root:

1. Compile specific example(s). Replace `path/to/YourClass.java` with the file you want to run:

   javac -d bin src/path/to/YourClass.java

2. Run the compiled class using its fully-qualified name (replace `com.example.YourClass`):

   java -cp bin com.example.YourClass

Tip: You can compile multiple files or entire packages by passing multiple source files or using a simple shell `find` command to list .java files.

## Examples

Each example contains inline comments explaining the idea and approach. Look for files named or grouped by topic (e.g., `strings`, `collections`, `concurrency`).

## Contribution

Contributions are welcome! Please:

1. Open an issue to discuss larger changes or suggested examples.
2. Fork the repo and create a branch for your feature or fix.
3. Submit a pull request with a clear description of your changes.

Coding style: keep examples small, focused, and well-commented. Include sample input/output where applicable.

## License

No license specified. If you'd like this repository to be open source, consider adding an OSI-approved license such as MIT by creating a `LICENSE` file.

## Contact

Maintainer: kedarnathrokade

Happy learning!
