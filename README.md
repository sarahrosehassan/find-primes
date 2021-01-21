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

## Sieve of Eratosthenes Algorithm

- Start a the prime number 2 and eliminate all other multiples of 2, thus eliminating composite numbers

- Move on to 3 and elminate all other multiples of 3

- Move on to 5 and eliminate all other multiples of 5 etc... 

- After the list of primes is created, the nth prime is obtained from the list

![Sieve_of_Eratosthenes_animation](https://user-images.githubusercontent.com/59797227/105047827-d26d9f00-5a38-11eb-8242-3ca2cbfda342.gif)

Kudos to the Creator of the Gif SKopp!

# Prime Factors of an Integer Algorithm
The returned list of the method needs to contain all the prime factors in ascending sorted order. For example, if n = 220 [2, 2, 5, 11] is returned.

- If the integer is even, list all occurences of 2 that divide the integer. The integer n is repeatedly divided by 2 and each successful division is listed.

- If the integer is odd or the even integer has been divided into an odd number, n is repeatedly divided by 3 and each successful division is listed.
If the number is not divisible by 3 move on to the next odd prime number until the square root of the integer n is reached.

- When the integer cannot be divided anymore and a prime number is left, list that prime number.

![prime-factorization-calculator](https://user-images.githubusercontent.com/59797227/105271225-21b0ee00-5b65-11eb-83e0-d6bf88bb5f00.gif)

Kudos to the Creator of the Gif
