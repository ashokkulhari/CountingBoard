# CountingBoard
## Requirements:
The task is to develop a live counting board library for outdoor games (for kids) that shows all the ongoing games and
their scores in a school competition. The counting board must know the following operations:
1. At the start of a new match, assuming the initial score 0 – 0 and adding it the counting board which should capture
   these parameters:
   a. Home class
   b. Away class
2. Update point. This should receive a pair of absolute points: home class scores and away class score.
3. Finish match currently in progress. This removes a match from the counting board.
4. Get a summary of matches in progress ordered by their total score. The matches with the same total score will be
   returned ordered by the most recently started match in the scoreboard.
   E.g. if these matches are started in the order given and their scores respectively updated:
   a. ClassA 0 – 5 ClassB
   b. ClassC 10 – 2 ClassD
   c. ClassE 2 – 2 ClassF
   d. ClassG 6 – 6 ClassH
   e. ClassI 3 – 1 ClassJ
   The summary should be:
1. ClassG 6 – 6 ClassH
2. ClassC 10 – 2 ClassD
3. ClassA 0 – 5 ClassB
4. ClassI 3 – 1 ClassJ
5. ClassE 2 – 2 ClassF

## Create Match Class that will store both home and away class with their scores:
Match :
String homeClass;
String awayClass;
int homeScore;
int awayScore;
long startTime;
}

## Create Scoreboard as business logic class
## To startMatch, updateMatch, finishMatch and getSummary

## Logic is first soring based on total of score like Class A 0 - 5 Class B i.e 0+5 = 5.

## Then add sorting based on start time 