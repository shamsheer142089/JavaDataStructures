# JavaDataStructures
This solution is to demonstrate the various types of array rotation algorithms.
##ArrayRotation
##ArrayRotationByReversal Algorithm
  The reversal algorithm is the simplest to explain, using rotations. A rotation is an in-place reversal of array elements. This method swaps two elements of an array from outside in within a range. The rotation works for an even number of elements or an odd number of array elements. The reversal algorithm uses three in-place rotations to accomplish an in-place block swap:

Rotate region A
Rotate region B
Rotate region AB
Gries-Mills and Reversal algorithms perform better than Bentley's Juggling, because of their cache-friendly memory access pattern behavior.

The Reversal algorithm parallelizes well, because rotations can be split into sub-regions, which can be rotated independently of others.
Reference# --> https://en.wikipedia.org/wiki/Block_swap_algorithms

##ArrayCyclicRotation

