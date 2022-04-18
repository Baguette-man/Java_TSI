Run code without synchronised methode performTask

Name = Thread 1
Name = Thread 2
Name = Thread 3
ID = 2
ID = 3
Name = Thread 4
ID = 1
ID = 4
Name = Thread 5
ID = 5
Name = Thread 2
Name = Thread 3
ID = 2
ID = 3
Name = Thread 1
Name = Thread 4
ID = 4
ID = 1
Name = Thread 5
ID = 5

Run code without synchronised methode performTask

Name = Thread 1
ID = 1
Name = Thread 1
ID = 1
Name = Thread 5
ID = 5
Name = Thread 5
ID = 5
Name = Thread 4
ID = 4
Name = Thread 4
ID = 4
Name = Thread 3
ID = 3
Name = Thread 3
ID = 3
Name = Thread 2
ID = 2
Name = Thread 2
ID = 2


We can see in the second run,  the thread output are sorted.
It looks like this because performTask finish his action before start another.