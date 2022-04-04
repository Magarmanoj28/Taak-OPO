# Breakout Part 2

In this second part of the Breakout project (course project for the course Objectgericht Programmeren), you will extend the system of Part 1 with special types of blocks and special behavior of ball and paddle.
You will also implement a Facade object that will allow us to more easily test your implementation.

The deadline for iteration 2 of the course project is Thursday, April 28th at 15u30.

## Start from model solution or your own

For the second iteration, you are allowed to start from the model solution of the first iteration or your own solution of the first iteration and you are even allowed to mix and match code from both (at your own responsibility, of course).
Some of the explanations below refer to classes like `Rect` that have been added in the model solution.
You are required to start from a few extra source files provided by us that can be found [here](https://gitlab.kuleuven.be/distrinet/education/ogp/ogp-project-2021-2022-iteratie-2/-/tree/main/Breakout%20-%20opgave%202).
Additionally, the assignment (i.e.\ this text) is available online [here](https://gitlab.kuleuven.be/distrinet/education/ogp/ogp-project-2021-2022-iteratie-2/-/blob/main/README.md).
Although we strive to keep any changes to the assignment to a minimum, it is possible that we will publish changes or corrections on this git repository.
You are required to regularly check the repository for updates until the deadline. 

## Implement a Facade

To make our life easier, you must now implement a facade class `breakout.BreakoutFacade` provided by us.
This object contains various methods that allow us to more easily test and grade your implementation.
Your implementation of these methods should consist of very simple code that simply forwards the invocation to the relevant method in the other classes you've implemented.

## Game Update Frequency

In the previous assignment, the game used a very high refresh rate of 1KHz.
This was unrealistically high and meant in practice that the real refresh rate came to depend on the speed of the computer being used to play the game.
In this iteration, we will change to a more realistic refresh rate of 50Hz.
However, to ensure smooth motion, we will measure the real number of milliseconds elapsed between updates and use this to calculate the vector traveled by a ball moving at a certain velocity.
We provide a new version of the class `breakout.gui.GameView` which implements this.
It relies on `breakout.BreakoutFacade` for accessing information about the objects you've implemented.
Because of the change in game update frequency, you must modify the method `BreakoutState.tick` to accept an extra argument: `BreakoutState.tick(int paddleDir, int elapsedTime)` and take it into account where relevant.

## Blocks

In Part 1, all blocks behaved the same. In Part 2, there are different types of blocks.
Make BlockState into an abstract class that generalizes over all types of blocks in the game.
Implement the relevant methods in the facade class (see above), so that the following letters in a game description are interpreted as follows:
- 'S': a "sturdy" block, which is only destroyed after it is hit three times by a ball.
- '!': A "powerup" block: after the ball hits this block, it bounces back as usual.
       However, the ball is replaced by a "supercharged ball" (with the same position and velocity), which behaves differently for the next 10 seconds.
       If the ball hits and destroys other blocks during this period, it does not bounce back, but simply continues moving in the same direction.
       However, if the ball hits a block and the block does not disappear, the ball bounces back as usual.
- 'R': a replication block: after the ball hits this block, it is immediately destroyed, but the paddle temporarily changes into a "replicator" paddle.
       The next 3 times that a ball hits the paddle, the ball will be replicated: 3 resp. 2 resp. 1 additional balls will be created.
       After that, the paddle becomes normal again.
       The new balls must start at the same location as the pre-existing ball.
       Their starting velocity must be computed by adding vectors (2,-2), (-2,2), (2,2) respectively to the velocity of the pre-existing ball.

Every different type of block must be drawn on screen in a different color.
Additionally, when the ball or paddle is temporarily in a special state, this must also be indicated to the user by drawing it in a different color.
The color of a sturdy block must differ based on how many times it still needs to be hit before it is destroyed.

The class BreakoutState must deal only with blocks generally, not with specific types of blocks specifically.

## Make BallState mutable

Furthermore, the class `BallState` that used to be immutable in the first iteration of this project must now be made mutable (classes `BlockState` and `PaddleState` must remain immutable).
In other words, a ball that is moved, changes velocity or otherwise changes, must now continue to be represented by the same object of type `BallState`, but the change must be reflected by modifications to the state of this object.
To reflect the change in meaning of the abstraction, you should rename the class `BallState` to `Ball`.
The class `Ball` must be abstract and there must be two subclasses representing a normal ball and a supercharged ball.
The methods in `Ball` must be documented with specifications that specify (in a reasonable way) the behavior that is common between all subclasses.
Specifications in subclasses need not be more precise than the parent specification, with one exception.
There must be a method `Ball.hitBlock(Rect rect, boolean destroyed)` that is invoked when the ball hits a block (the boolean argument indicating whether the block was destroyed or not), and this method is responsible for changing the velocity of the ball in accordance.
The specifications of this method must be strictly more precise in subclasses than in the superclass `Ball`.

To accomodate this change, you should remove all invariants in `BreakoutState` which mention `Ball`.

## What to submit

You have to submit all classes and interfaces of your implementation, all of which must reside in package `breakout`.

In addition to the methods specified above, you may add any additional methods you deem useful to any of these classes.
You may also add additional classes or interfaces that you find useful.

For this Part, you must write complete formal documentation for all classes, methods and interfaces you add as part of this assignment.
Make sure to respect behavioral subtyping. (Note: behavioral subtyping is not in the scope of course H02C5A; students of course H02C5A need not write any documentation at all.)

We also expect you to write a test suite for all classes you add, which tests the expected behavior of your implementations.

We also expect you to monitor the discussion forum on Toledo, where clarifications or corrections of the project assignment may be communicated.

To obtain a score of 3/6 or 4/6, your solution must compile without errors, and must pass a sufficiently high fraction of the official test cases and our own secret test suite. To obtain a score of 5/6 or 6/6, your solution must pass all of the official test cases, not use instanceof or otherwise perform explicit case analysis on the type of ball, block or paddle state; instead, it must only use dynamic binding to realize behavior that differs between the types of ball, block, or paddle.
