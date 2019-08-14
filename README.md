# battleship

Java Fabric hackathon project to demonstrate private data collections

## Objective

To store each player's ship locations in their own private data collection in such a way as to prevent cheating, e.g.

- a player brute force guessing where ships are by repeatedly evaluating transactions without commiting anything to the ledger
- a player being able to move their ships during play

## Rough plan

- Each player's private data collection contains an entry for each board location containing a unique salt (to prevent guessing) and whether the location contains a ship or not. The hash for each location is stored on the public ledger (to prevent ships moving).

- Guesses are committed to the public ledger, along with the result (hit or miss), providing a public record of the game and allowing turns to be tracked.

- When a player makes a guess, they need the salt for the guessed location in order for getPrivateDataHash to work. Can the salt required for a guess be exchanged using a private data collection shared between both players? (Presumably changes to a private data collection require a transaction to be committed to the ledger.)

- When both players know the salt for the guessed location, getPrivateDataHash can be used to record a hit or miss on the public ledger, i.e. if a hash of _the salt + wether it contains a ship_ matches the hash in the public ledger, it's a hit. (Is this true?!!)

Comments, suggestions and corrections welcome!
