# Hashtables
<!-- Short summary or background information -->
hash table (hash map) is a data structure that implements an associative array abstract data type, a structure that can map keys to values. A hash table uses a hash function to compute an index, also called a hash code, into an array of buckets or slots, from which the desired value can be found. During lookup, the key is hashed and the resulting hash indicates where the corresponding value is stored.

## Challenge
<!-- Description of the challenge -->
Implement a Hashtable Class with the following methods:

* add

* get

* contains

* hash

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Big O for : 

* add : 

Big O space/time O (n)

* get


Big O space/time O (n)


* contains


Big O space/time O (n)


* hash


Big O space/time O (n)



## API
<!-- Description of each method publicly available in each of your hashtable -->

add(T key, T value) --> adds the key/value pairs to the table.


get(T key) --> return the value from the table based on inserted key.


contains(T key) --> takes key as an Arguments and Returns Boolean, indicating if the key exists in the table already.


hash function --> takes key as an Arguments key and Returns Index in the collection for that key.

# hashmap-repeated-word
<!-- Short summary or background information -->

problem domain


Write a function called repeated word that finds the first word to occur more than once in a string
Arguments: string
Return: string

## Challenge
<!-- Description of the challenge -->
![](./img/cc31.PNG)
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
time : O(n^2)


space : O(n)

# hashmap-left-join
<!-- Short summary or background information -->

problem domain
Write a function that LEFT JOINs two hashmaps into a single data structure.

Write a function called left join
Arguments: two hash maps
The first parameter is a hashmap that has word strings as keys, and a synonym of the key as values.
The second parameter is a hashmap that has word strings as keys, and antonyms of the key as values.
Return: The returned data structure that holds the results is up to you. It doesn???t need to exactly match the output below, so long as it achieves the LEFT JOIN logic
## Challenge
<!-- Description of the challenge -->
![](./img/cc33.PNG)
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
time : O(n)


space : O(n)




