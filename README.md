# Rock, Paper, Scissors Game

A command-line implementation of Rock-Paper-Scissors in Java, played against the computer — a Java port of my [Snake-Water-Gun C game](https://github.com/subhamkar-codes/snake-water-gun-game), reimplementing the same match logic in a different language.

## Features

- Random computer choice using `Random`
- Best-of-N match modes: choose 1, 3, 5, or 7 rounds
- Live score tracking after every round
- Automatic match-winner detection once a player reaches the target score
- Replay option — play multiple matches in a single run without restarting the program

## How the game works

- 0 = Rock, 1 = Paper, 2 = Scissor
- Rock crushes Scissor, Scissor cuts Paper, Paper covers Rock
- First to reach the majority of chosen rounds wins the match (e.g. Best of 5 → first to 3 wins)

## Concepts used

- Nested loops (`do-while` for match replay, `while` for round-by-round play)
- Random number generation (`java.util.Random`)
- Score tracking with counters
- Conditional logic (if-else chains for win/lose/draw outcomes)
- Scanner for user input

## How to run

\`\`\`
javac rock_paper_scissors.java
java rock_paper_scissors
\`\`\`

Example:
\`\`\`
Choose Best of 1, 3, 5, or 7: 3
You chose Best of 3

Enter your choice: 0
Your choice is 0
Computer's choice is 1
You Lose!! Paper covers Rock
Score -> You: 0 | Computer: 1
...
=== Match Over ===
Computer won the match 2-0!

Want to play again? 0 for yes, 1 for no: 1

Thank you for your cooperation!
\`\`\`
