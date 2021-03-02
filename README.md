Bowling

Problem Description


• Create a program, which produces the total score for the game of bowling. Here are
  the program functionalities:
  
• Check for valid rolls.

• Check for correct number of rolls and frames.

• Provide scores for intermediate frames.

• We can briefly summarize the scoring for this form of bowling:

• A game consists of 10 frames

• In each frame, the bowler has two opportunities to knock down all the pins (10 pins).

• If in two tries, he fails to knock them all down, his score for that frame is the total
  number of pins knocked down in his two tries.

• If in two tries he knocks them all down, this is called a “spare” and his score for the
  frame is ten plus the number of pins knocked down on his next throw (in his next
  turn).

• If on his first try in the frame he knocks down all the pins, this is called a “strike”. His
  turn is over, and his score for the frame is ten plus the simple total of the pins
  knocked down in his next two rolls.

• If he gets a spare or strike in the last (tenth) frame, the bowler gets to throw one or
  two more bonus balls, respectively. These bonus throws are taken as part of the
  same turn. If the bonus throws knock down all the pins, the process does not repeat:
  the bonus throws are only used to calculate the score of the final frame.

• The game score is the total of all frame scores


More info on the rules at: How to Score for Bowling

Clues

What makes this game interesting is the lookahead in the scoring for strike and spare. At the
time we throw a strike or spare, we cannot calculate the frame score: we have to wait one or
two frames to find out what the bonus is.

Suggested Test Cases

(When scoring “X” indicates a strike, “/” indicates a spare, “-” indicates a miss)


•X X X X X X X X X X X X(12 rolls: 12 strikes) = 10 frames * 30 points = 300

•9- 9- 9- 9- 9- 9- 9- 9- 9- 9(20 rolls: 10 pairs of 9 and miss) = 10 frames * 9 points

•5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5 (21 rolls: 10 pairs of 5 and spare, with a final 5) = 10
frames * 15 points = 150


Compile & Run
-------------

    mvn clean install
    java -jar target/bowling-kata-1.0.jar 
    




