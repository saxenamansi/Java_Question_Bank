# List of Problems on Class and Objects, Array of Objects, Constructors and Static

1. A training centre conducts a total of 7 tests for its students. Students are allowed to skip few tests. Let there be 25 students in the batch. So in the main class for every student,
read the number of tests taken and the marks scored in each test. A class ‘TestDetails’ should be defined with a 2D array of float type to store the marks of all the students.
Define a method ‘storeMarks()’ that will receive the following details for every student from the main class and create in the 2D array, those many columns equal to the number
of tests, so as to store the marks. There is no need to store the number of tests. Define another method ‘displayMarks()’ to print the details. Also the training centre wishes to
keep those students in notice period who have taken < 3 tests and those who have not scored ≥ 50 in at least 3 tests. Derive another class ‘NoticePeriod’ from ‘TestDetails’ that
includes a method to count and print the number of students in bench. Also it should print the ID of those students assuming the row index of the array to be their ID. While
checking do not proceed to check the marks in all tests, if the student has already scored more than 50 in 3 tests. Instantiate this class from the main class and do the required
processing.

2. Design a class called Participants with properties like Name, Phno, Branch and University, TestResult_Classification[L1,L2,L3,L4,L5]. Create a static method to display a
message as follows based on the selection criteria, (i) If student test result classification is L1, congratulate the student and inform that he/she has been selected for both Full
time intership as well as Full time job (ii) If student test result classification is L2 or L3, inform the student that he/she has been selected for Full time intership and Job may be
offered based on intership Performance. (iii) If student test result classification is L4 or L5, inform that he/she has been selected for Part time intership of 21 days. Create atleast
three Participants objects of array and then invoke static method to display the message. Note: Don’t use if statement for conditional check, instead use Switch Case statement.

3. Create a class called Student with Data members (1) Regno (2) Name (3) static data member named as Univ_name and static counter variable to store number of objects
created and Methods (1) GetMethod (2) PrintMethod (3)Constructor (4) Parameterized constructor Also create a class called Courses with details like Course code, name, slot
and venue along with necessary methods. (1)Main method has to be provided in Registration class (2) create 4 course objects with two A1 slot courses, two B1 slot
courses (3)create two students objects and get display all course details to them and inform them to choose two subjects (4) if the selected courses have same slots, ask
student to choose without clashing (5) print the selected course in a table format with all necessary details.


