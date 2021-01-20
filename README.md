# Goals of this Prime Number Study
1. Establish whether a number is prime
2. Return the kth element from the infinite sequence of prime numbers
3. Return the prime factors of a certain integer

# What is a Prime Number?
A prime number has only two factors: one and itself. A factor of a number divides the number perfectly leaving no remainder behind. 

In mathematical terms: number % factor = 0 

To determine whether a number is prime, loop through all the numbers starting from 2 up to the square root until a factor is found. If a factor is found, the number is composite because it has factors other than one or itself.

# Finding The nth Prime Number
The method kthPrime searches for the 1st - 30 000th prime number in less than one minute from the infinite sequence of prime numbers.

Implementing the "Sieve of Eratosthenes" swiftly finds all the prime numbers within the time constraint.

## Sieve of Eratosthenes

- Start a the prime number 2 and eliminate all other multiples of 2, thus eliminating composite numbers

- Move on to 3 and elminate all other multiples of 3

- Move on to 5 and eliminate all other multiples of 5 etc...

![Sieve_of_Eratosthenes_animation](https://user-images.githubusercontent.com/59797227/105047827-d26d9f00-5a38-11eb-8242-3ca2cbfda342.gif)

Kudos to the Creator of the Gif SKopp!

# Finding The Prime Factors of an Integer
The returned list of the method needs to contain all the prime factors in ascending sorted order. 

# Time Complexity and Caching

