Word Anagram
Requirements:

    Input: a word or sentence, ranging from a-z, case-insensitive.
    Output: boolean result if given input is palindrome

 

Deliverable

    Submit your code to github.com and email us the link of your code repo, where the repo contains the following.
    One source code file for the main program.
    One runme.sh bash script to (compile and) run the program on Linux or Mac terminal.
    [Optional] one README file with additional instructions, if needed.
    [Bonus] one additional file with test cases.


How to test

    git clone git clone https://github.com/username/xyz.git
    cd xyz && ./runme.sh


OutCome:

Requirements

    Maven 3 (using mvn 4.0.0 version)
    Java 8 (using 1.8.0_171)

#How to build

In terminal run command:

    mvn clean install

How to run

   After building, run:

    ./run.sh <given string/character>

# Example:
    ./run.sh "dog"

Or calling jar directly:

    java -jar target/Palindrome-1.0-SNAPSHOT-jar-with-dependencies.jar <given string/character>



    java -jar target/Palindrome-1.0-SNAPSHOT-jar-with-dependencies.jar "dog"

Output:

    Given input is dog, start running.....
    dog is not palindrome
