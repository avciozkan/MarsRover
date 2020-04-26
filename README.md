# MARS ROVER
 A squad of robotic rovers are to be landed by NASA on a plateau on Mars. This plateau, which is curiously rectangular, must be navigated by the rovers so that their on board cameras can get a complete view of the surrounding terrain to send back to Earth. 
A rover's position and location is represented by a combination of x and y co-ordinates and a letter representing one of the four cardinal compass points. The plateau is divided up into a grid to simplify navigation. An example position might be 0, 0, N, which means the rover is in the bottom left corner and facing North. 
In order to control a rover, NASA sends a simple string of letters. The possible letters are 'L', 'R' and 'M'. 'L' and 'R' makes the rover spin 90 degrees left or right respectively, without moving from its current spot. 'M' means move forward one grid point, and maintain the same heading. 
Assume that the square directly North from (x, y) is (x, y+1). 

#### Input: 
The first line of input is the upper-right coordinates of the plateau, the lower-left coordinates are assumed to be 0,0. 
The rest of the input is information pertaining to the rovers that have been deployed. Each rover has two lines of input. The first line gives the rover's position, and the second line is a series of instructions telling the rover how to explore the plateau.
The position is made up of two integers and a letter separated by spaces, corresponding to the x and y co-ordinates and the rover's orientation. 
Each rover will be finished sequentially, which means that the second rover won't start to move until the first one has finished moving. 

#### Output: 
The output for each rover should be its final co-ordinates and heading. 
#### Input and Output 

#### Test Input: 
<pre>5 5
1 2 N
LMLMLMLMM
3 3 E
MMRMMRMRRM</pre>

#### Expected Output:
<pre>1 3 N
5 1 E</pre>

# HOW TO TEST

When the program is run, it requires some input parameters.

These;

1. Grid Size
2. Rover Initial Location (Example : 4 2 E)
3. Rover Move Commands (Example : LRMLMRMLMM)

When the program first starts, the text below appears

`Grid Size [int int]: `

Here, you are asked to enter 2 int values, with spaces between them. For example;

`Grid Size [int int]: 5 5`

Then, the text below appears

`Rover initial Location [int int String] : `

Then, you are asked to enter the location information with 2 int and 1 string value and a space. For example;

`Rover initial Location [int int String] : 3 2 N`

Then, the text below appears

`Rover move commands [String...] : `

Here you will be prompted for a script containing the letters L, M and R. For example;

`Rover move commands [String...] : LMMRMRRMLM`

The current location information is written as the final output.

`Location of RangeRoverEvoque : 2 2 E`

Then return to the beginning to enter other information. (Except Grid information)
