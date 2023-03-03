# Codility_Solutions
Solutions for the solved Codility problems
Here the solution provided is in Java 8

Binary Gap Problem
--------------------------------
- Given a positive integer find the binary of the number
- Check the greatest sequence of Zeroes (0) having 1 at both the ends
- For ex: in the binary: 1001000 ... the result should be 2 as only these Zeroes are having 1 at both ends
- If there is no sequence then return 0


Smallest Positive Integer in Given Array
--------------------------------------------
- An array can contain positive and negative integers
- We need to return the smallest positive integer that is not present in the array
- For ex: [-1,-10] should return 1 and [1,6,3,4] should return 2
- So traverse through the array and ignore negative integers and apply logic
