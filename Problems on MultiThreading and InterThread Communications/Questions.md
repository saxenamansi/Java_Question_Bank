# Programs on Multithreading, Interthread Communication, 

1. Demonstrate multithreading by creating two threads, one for printing the odd numbers and the other for printing even numbers with in a given range of your choice.

2. Five events E1, E2, E3, E4 and E5 are going to be organized for Rivera in VIT, registration is open for all B.Tech students. With the total strength of 1000 students, simulate the registration
for each event by generating 1000 random numbers in the range of 1 – 5. (1 for event E1, 2 for E2… 5 for E5) and store the values in an array. Create six threads to equally share the task of
counting the number of registration details for all the events. Use synchronized method or synchronized block to update the count variables. The main thread should receive the final registration
count for all events and display the list of students who have not registered in any event.

3. Write a java program to create thread that stores a set of unique numbers from 100 to 200, whose sum of digits is a factor of the same number. If the input string is not in the range, raise a user
defined exception. Another thread that stores the set of unique numbers from 1 to 100 whose sum of digits is prime number. Both the threads should execute in equal intervals of 10 numbers.
