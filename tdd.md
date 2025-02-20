# Ping Pong TDD

This document explains the approach of "Ping Pong TDD" used during development of the Tic Tac Toe game.

## What is Ping Pong TDD?
Ping Pong TDD is a variant of Test-Driven Development where the process alternates between writing tests and production code in small increments. The idea is to:

1. Write a failing test.
2. Implement the minimal amount of code needed to make the test pass.
3. Refactor if necessary.
4. Write the next failing test.

This cycle continues, ensuring that both tests and production code evolve hand-in-hand.

## How It Was Implemented
- **Step 1: Write a Test:** Initially, tests were created in the `TestTicTacToe.java` file, outlining expected behaviors (e.g., winning conditions, tie scenarios, and button interactions).
- **Step 2: Failing Test:** Running these tests immediately resulted in failures, confirming that the current implementation did not yet support the desired features.
- **Step 3: Implement Minimal Code:** The production code in `App.java` was then updated to address the failing tests. Only the minimal changes required to pass the tests were made.
- **Step 4: Alternate:** With a passing test, the cycle continued by writing another test focused on a different aspect of the game (e.g., UI behavior, game state updates) and then writing code to pass that new test.

## Benefits of Ping Pong TDD
- **Incremental Development:** By focusing on one small test at a time, developers were able to concentrate on specific functionality, reducing the risk of introducing new bugs.
- **Immediate Feedback:** Each small iterative change was validated by a running test, ensuring confidence in the code's correctness.
- **Improved Design:** The need to make small, testable changes encouraged a natural separation between testing and production logic, leading to a cleaner design.

This agile and incremental approach led to a more maintainable and robust Tic Tac Toe application, while also streamlining the development process.
