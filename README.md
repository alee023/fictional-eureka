# Fictional Eureka
#### Alison Lee

## Design

### HELP DESK
The help desk takes 5 problems and adds each to the ArrayPriorityList of tickets. Afterwards, those 5 tickets will be dequeued. The help desk is ready to take another 5 tickets.

( - ) ArrayPriorityList<Ticket> tickets // stores the tickets
<br>
( - ) int probNum // stores the number of problems. It will be used to ID the person (like Person #5 if he/she is the 5th person)

( + ) void addTicket()
1. Prints out the questions
2. Some instance variables in Ticket will take the values of the responses. VIPLevel is randomized
3. Ticket added to tickets list

( + ) void findSoln( Ticket x )
1. solved variable for given ticket is set to true
2. If a keyword (like "health", "money", etc.) is found in the problem phrase, a corresponding solution will be stored in the solution variable  

( + ) void probDone()
1. findSoln is called on the highest-priority ticket
2. Solution is printed
3. Ticket is dequeued

### TICKET
( - ) int ID 
<br>
( - ) int VIPLevel
<br>
( - ) String problem
<br>
( - ) boolean solved
<br>
( - ) String name
<br>
( - ) String solution


( + ) int compareTo( Ticket o ) // compares VIPLevel of this and o
<br>
( + ) int getID()
<br>
( + ) int getLevel()
<br>
( + ) String getProb()
<br>
( + ) boolean isSolved()
<br>
( + ) String getName()
<br>
( + ) String getSoln()
<br>
( + ) void setSoln( String soln )
<br>
( + ) void setSolved( boolean x )

## Embellishments
-- None, I think --