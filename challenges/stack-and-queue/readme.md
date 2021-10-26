# Stacks and Queues
<!-- Short summary or background information -->
stack is a list from elements where we can do add or remove are made in the same end
, where is the queue is the opposite. 

## Challenge
<!-- Description of the challenge -->
create for stack : push , pop , isEmpty , peek methods
create for queues : enqueue , dequeue , peek , isEmpty methods
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

for all method complexity : O(1)

## API
<!-- Description of each method publicly available to your Stack and Queue-->

* push Method : accept a value and add it to the stack.
* Enqueue Method : accept a value and add a node with the same value to the Queue
* is empty Method : accept a Queue or Stack and return a true if is empty or false if not
* peek : return the top node value on the stack or the front node value on the Queue
* pop :  delete the top on the stack and return its value
* deQueue : delete the front of the Queue and return its value

* push : receive a value and add it to a stack.
* Enqueue : receive a value and add it to a queue.
* isEmpty: chick if the stack or queue is empty.
* pop : delete the top node in the stack.
* deQueue: delete the front of the queue.
* peek for stack :return the top node value.
* peek for queue : return the front node value.

# Challenge Summary
<!-- Description of the challenge -->

Implement a Queue using two Stacks.


## Whiteboard Process
<!-- Embedded whiteboard image -->
![](C:\401java\newData\data-structures-and-algorithms-401\challenges\stack-and-queue\img\cc11.PNG)

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
enqueue : space and time O(1)
dequeue : space and time O(n)
## Solution
<!-- Show how to run your code, and examples of it in action -->
input 10 , 15 , 20 , 5 

output PseudoQueue{stack1=NULL, stack2=top -> 15 -> 20 -> 5 -> null}
15


# Challenge Summary
<!-- Description of the challenge -->

build a animal shilter that take dog and cat using enqueue and dequeue.

## Whiteboard Process
<!-- Embedded whiteboard image -->
![](C:\401java\newData\data-structures-and-algorithms-401\challenges\stack-and-queue\img\cc12.PNG)

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
enqueue : space and time O(1)
dequeue : space and time O(1)
## Solution
<!-- Show how to run your code, and examples of it in action -->
input cat1 , cat2 , dog , mouse 

output 
cat2 , dog