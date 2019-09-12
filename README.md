# Rover

## Description

A squad of robotic rovers are to be landed by NASA on a plateauDto on Mars.
This plateauDto, which is curiously rectangular, must be navigated by the
rovers so that their on-board cameras can get a complete view of the
surrounding terrain to send back to Earth.
A roverDto's position and location is represented by a combination of x and y
co-ordinates and a letter representing one of the four cardinal compass
points. The plateauDto is divided up into a grid to simplify navigation. An
example position might be 0, 0, N, which means the roverDto is in the bottom
left corner and facing North.
In order to control a roverDto, NASA sends a simple string of letters. The
possible letters are 'L', 'R' and 'M'. 'L' and 'R' makes the roverDto spin 90
degrees left or right respectively, without moving from its current spot.
'M' means move forward one grid point, and maintain the same heading.
Assume that the square directly North from (x, y) is (x, y+1).

INPUT:
<br>The first line of input is the upper-right coordinates of the plateauDto, the
lower-left coordinates are assumed to be 0,0.
The rest of the input is information pertaining to the rovers that have
been deployed. Each roverDto has two lines of input. The first line gives the
roverDto's position, and the second line is a series of instructions telling
the roverDto how to explore the plateauDto.
The position is made up of two integers and a letter separated by spaces,
corresponding to the x and y co-ordinates and the roverDto's orientation.
Each roverDto will be finished sequentially, which means that the second roverDto
won't start to move until the first one has finished moving.

OUTPUT:
<br>The output for each roverDto should be its final co-ordinates and heading.

INPUT AND OUTPUT
<br>Test Input:
<br>5 5
<br>1 2 N
<br>LMLMLMLMM
<br>3 3 E
<br>MMRMMRMRRM
<br>Expected Output:
<br>1 3 N
<br>5 1 E

COMMAND LINE:
<br>The program will be runned with this command line:

 	java -jar Rover.jar inputs.txt
