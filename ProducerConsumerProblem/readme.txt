******************************************************************************
******************************************************************************
It' s a team work.

Author: Jing Zhang
Student ID: 17956190

Author: Tiancheng Hou
Student ID: 17967739
******************************************************************************
******************************************************************************
Directory task-2
	task-2/ProducerConsumerProblem
	task-2/readme.txt
******************************************************************************
******************************************************************************
Instruction 
Requirements:
	Netbeans installed on the laptop
Steps to run the code:
	1.Open Netbeans IDE
	2.Open the project in the task-2 folder
	3.Run the Main.java
	4.Then you will need to enter the parameters one by one with ENTER at the end (in this case, I did not do any validation for input so you have to ensure you are entering an integer)
		Sleep time (second): 10
		The number of producer threads: 5
		The number of consumer threads: 5
	5.You will get the output
******************************************************************************
******************************************************************************
Running result analysis
******************************************************************************
Test 1:
	Condition: 
		buffer size 5
		producer 1
		consumer 1
		sleep time 10
	Output:
		run:
		Sleep time (second): 
		10
		The number of producer threads: 
		1
		The number of consumer threads: 
		1
		Producer 10 produced 52, the buffer now contains 1
		Consumer 11 consumed 52, the buffer now contains 0
		Producer 10 produced 31, the buffer now contains 1
		Consumer 11 consumed 31, the buffer now contains 0
		Producer 10 produced 76, the buffer now contains 1
		Consumer 11 consumed 76, the buffer now contains 0
		Producer 10 produced 49, the buffer now contains 1
		Consumer 11 consumed 49, the buffer now contains 0
		Producer 10 produced 1, the buffer now contains 1
		Consumer 11 consumed 1, the buffer now contains 0
		Producer 10 produced 76, the buffer now contains 0
		Consumer 11 consumed 76, the buffer now contains 0
		Producer 10 produced 7, the buffer now contains 1
		Consumer 11 consumed 7, the buffer now contains 0
		Producer 10 produced 5, the buffer now contains 1
		Consumer 11 consumed 5, the buffer now contains 0
		Producer 10 produced 92, the buffer now contains 1
		Consumer 11 consumed 92, the buffer now contains 0
		Producer 10 produced 27, the buffer now contains 1
		Producer 10 produced 28, the buffer now contains 2
		Consumer 11 consumed 27, the buffer now contains 1
		Consumer 11 consumed 28, the buffer now contains 0
		Producer 10 produced 63, the buffer now contains 1
		Producer 10 produced 60, the buffer now contains 2
		Consumer 11 consumed 63, the buffer now contains 1
		Consumer 11 consumed 60, the buffer now contains 0
		Producer 10 produced 8, the buffer now contains 1
		Consumer 11 consumed 8, the buffer now contains 0
		Producer 10 produced 79, the buffer now contains 1
		Consumer 11 consumed 79, the buffer now contains 0
		Producer 10 produced 59, the buffer now contains 1
		Producer 10 produced 35, the buffer now contains 2
		Consumer 11 consumed 59, the buffer now contains 1
		Consumer 11 consumed 35, the buffer now contains 0
		Producer 10 produced 6, the buffer now contains 1
		BUILD SUCCESSFUL (total time: 13 seconds)
	Analysis:
		There is only one producer and one consumer. The producer thread id is 10 and the consumer thread id is 11. As it is a multex method, if the producer is producing then the consumer cannot consume and versus. Both of producer and consumer has a random opportunity to sleep one second or not. From the output, we can see the buffer has never been full. If one item has been produced, during the sleeping time of producer, the comsumer can start consume if there is an item produced otherwise it will wait for an item to be produced. 
		The buffer usually contain 0 or 1 and sometimes contains 2 items. At the beginning, no matter if the consumer starts firstly or not, it has to wait item produced. After a producer produces, consumer has an opportunity to consume the item. Then, next time, if the consumer gets the chance to consume, it still needs to wait. So it is like a circle from the begining. It is hard to get more than 2 items in the buffer.
******************************************************************************
Test 2:
	Condition: 
		buffer size 1
		producer 5
		consumer 5
		sleep time 10
	Output:
		run:
		Sleep time (second): 
		10
		The number of producer threads: 
		5
		The number of consumer threads: 
		5
		Producer 12 produced 85, the buffer now contains 0
		Consumer 15 consumed 85, the buffer now contains 0
		Producer 10 produced 55, the buffer now contains 1
		Consumer 19 consumed 55, the buffer now contains 0
		Producer 10 produced 94, the buffer now contains 1
		Consumer 17 consumed 94, the buffer now contains 0
		Producer 13 produced 37, the buffer now contains 1
		Consumer 16 consumed 37, the buffer now contains 0
		Producer 11 produced 12, the buffer now contains 1
		Consumer 18 consumed 12, the buffer now contains 0
		Producer 10 produced 87, the buffer now contains 1
		Consumer 15 consumed 87, the buffer now contains 0
		Producer 14 produced 78, the buffer now contains 1
		Consumer 16 consumed 78, the buffer now contains 0
		Producer 12 produced 1, the buffer now contains 1
		Consumer 19 consumed 1, the buffer now contains 0
		Producer 12 produced 17, the buffer now contains 1
		Consumer 17 consumed 17, the buffer now contains 0
		Producer 13 produced 20, the buffer now contains 1
		Consumer 19 consumed 20, the buffer now contains 0
		Producer 11 produced 46, the buffer now contains 1
		Consumer 19 consumed 46, the buffer now contains 0
		Producer 10 produced 73, the buffer now contains 1
		Consumer 19 consumed 73, the buffer now contains 0
		Producer 11 produced 89, the buffer now contains 1
		Consumer 16 consumed 89, the buffer now contains 0
		Producer 14 produced 50, the buffer now contains 1
		Consumer 15 consumed 50, the buffer now contains 0
		Producer 14 produced 71, the buffer now contains 1
		Consumer 18 consumed 71, the buffer now contains 0
		Producer 10 produced 50, the buffer now contains 1
		Consumer 15 consumed 50, the buffer now contains 0
		Producer 13 produced 87, the buffer now contains 1
		Consumer 17 consumed 87, the buffer now contains 0
		Producer 12 produced 20, the buffer now contains 1
		Consumer 19 consumed 20, the buffer now contains 0
		Producer 12 produced 2, the buffer now contains 1
		Consumer 15 consumed 2, the buffer now contains 0
		Producer 14 produced 11, the buffer now contains 1
		Consumer 15 consumed 11, the buffer now contains 0
		Producer 13 produced 28, the buffer now contains 1
		Consumer 17 consumed 28, the buffer now contains 0
		Producer 10 produced 77, the buffer now contains 1
		Consumer 18 consumed 77, the buffer now contains 0
		Producer 13 produced 45, the buffer now contains 1
		Consumer 16 consumed 45, the buffer now contains 0
		Producer 11 produced 22, the buffer now contains 1
		Consumer 17 consumed 22, the buffer now contains 0
		Producer 14 produced 98, the buffer now contains 1
		Consumer 16 consumed 98, the buffer now contains 0
		Producer 11 produced 78, the buffer now contains 1
		Consumer 19 consumed 78, the buffer now contains 0
		Producer 12 produced 16, the buffer now contains 1
		Consumer 15 consumed 16, the buffer now contains 1
		Producer 14 produced 67, the buffer now contains 1
		Consumer 17 consumed 67, the buffer now contains 0
		Producer 10 produced 19, the buffer now contains 1
		Consumer 16 consumed 19, the buffer now contains 0
		Producer 12 produced 76, the buffer now contains 1
		Consumer 15 consumed 76, the buffer now contains 0
		Producer 13 produced 99, the buffer now contains 1
		Consumer 18 consumed 99, the buffer now contains 0
		Producer 14 produced 76, the buffer now contains 1
		Consumer 17 consumed 76, the buffer now contains 0
		Producer 13 produced 35, the buffer now contains 1
		Consumer 19 consumed 35, the buffer now contains 0
		Producer 14 produced 99, the buffer now contains 1
		Consumer 16 consumed 99, the buffer now contains 0
		Producer 11 produced 29, the buffer now contains 1
		Consumer 15 consumed 29, the buffer now contains 0
		Producer 14 produced 80, the buffer now contains 1
		Consumer 19 consumed 80, the buffer now contains 0
		Producer 10 produced 4, the buffer now contains 1
		Consumer 18 consumed 4, the buffer now contains 0
		Producer 12 produced 78, the buffer now contains 1
		Consumer 17 consumed 78, the buffer now contains 0
		Producer 13 produced 7, the buffer now contains 1
		Consumer 16 consumed 7, the buffer now contains 0
		Producer 12 produced 29, the buffer now contains 1
		Consumer 16 consumed 29, the buffer now contains 0
		Producer 11 produced 61, the buffer now contains 1
		Consumer 17 consumed 61, the buffer now contains 0
		Producer 13 produced 81, the buffer now contains 1
		Consumer 16 consumed 81, the buffer now contains 0
		Producer 11 produced 2, the buffer now contains 1
		Consumer 15 consumed 2, the buffer now contains 0
		Producer 13 produced 15, the buffer now contains 1
		Consumer 19 consumed 15, the buffer now contains 0
		Producer 14 produced 27, the buffer now contains 1
		Consumer 18 consumed 27, the buffer now contains 0
		Producer 11 produced 61, the buffer now contains 1
		Consumer 16 consumed 61, the buffer now contains 0
		Producer 10 produced 54, the buffer now contains 1
		Consumer 17 consumed 54, the buffer now contains 0
		Producer 12 produced 17, the buffer now contains 1
		Consumer 18 consumed 17, the buffer now contains 0
		Producer 14 produced 92, the buffer now contains 1
		Consumer 16 consumed 92, the buffer now contains 0
		Consumer 15 consumed 70, the buffer now contains 0
		Producer 10 produced 70, the buffer now contains 0
		Producer 13 produced 77, the buffer now contains 1
		Consumer 19 consumed 77, the buffer now contains 0
		Producer 12 produced 69, the buffer now contains 1
		Consumer 16 consumed 69, the buffer now contains 0
		Producer 11 produced 62, the buffer now contains 1
		Consumer 18 consumed 62, the buffer now contains 0
		Producer 14 produced 96, the buffer now contains 1
		Consumer 18 consumed 96, the buffer now contains 0
		Producer 10 produced 73, the buffer now contains 1
		Consumer 17 consumed 73, the buffer now contains 0
		Producer 13 produced 76, the buffer now contains 1
		Consumer 15 consumed 76, the buffer now contains 0
		Producer 11 produced 14, the buffer now contains 1
		Consumer 19 consumed 14, the buffer now contains 0
		Producer 12 produced 72, the buffer now contains 1
		Consumer 17 consumed 72, the buffer now contains 1
		Producer 10 produced 66, the buffer now contains 1
		Consumer 16 consumed 66, the buffer now contains 0
		Producer 13 produced 95, the buffer now contains 1
		Consumer 15 consumed 95, the buffer now contains 0
		Producer 12 produced 99, the buffer now contains 1
		Consumer 18 consumed 99, the buffer now contains 0
		Producer 10 produced 38, the buffer now contains 1
		Consumer 17 consumed 38, the buffer now contains 0
		Producer 14 produced 80, the buffer now contains 1
		Consumer 16 consumed 80, the buffer now contains 0
		Producer 13 produced 10, the buffer now contains 1
		Consumer 18 consumed 10, the buffer now contains 0
		Producer 12 produced 77, the buffer now contains 1
		Consumer 18 consumed 77, the buffer now contains 0
		Producer 11 produced 62, the buffer now contains 1
		Consumer 19 consumed 62, the buffer now contains 0
		Producer 14 produced 25, the buffer now contains 1
		Consumer 18 consumed 25, the buffer now contains 0
		Producer 12 produced 72, the buffer now contains 1
		Consumer 15 consumed 72, the buffer now contains 0
		Producer 13 produced 14, the buffer now contains 1
		Consumer 18 consumed 14, the buffer now contains 0
		Producer 12 produced 88, the buffer now contains 1
		Consumer 19 consumed 88, the buffer now contains 0
		Producer 13 produced 64, the buffer now contains 1
		Consumer 17 consumed 64, the buffer now contains 0
		Producer 14 produced 12, the buffer now contains 1
		Producer 10 produced 41, the buffer now contains 1
		Consumer 16 consumed 12, the buffer now contains 1
		Consumer 15 consumed 41, the buffer now contains 0
		Producer 13 produced 24, the buffer now contains 1
		Consumer 16 consumed 24, the buffer now contains 0
		Producer 11 produced 10, the buffer now contains 1
		Consumer 17 consumed 10, the buffer now contains 0
		Producer 14 produced 90, the buffer now contains 1
		Consumer 19 consumed 90, the buffer now contains 0
		Producer 12 produced 17, the buffer now contains 1
		Consumer 16 consumed 17, the buffer now contains 0
		Producer 11 produced 40, the buffer now contains 1
		Consumer 18 consumed 40, the buffer now contains 0
		Producer 13 produced 20, the buffer now contains 1
		Consumer 15 consumed 20, the buffer now contains 0
		Producer 10 produced 86, the buffer now contains 1
		Consumer 17 consumed 86, the buffer now contains 0
		Producer 14 produced 49, the buffer now contains 1
		Consumer 19 consumed 49, the buffer now contains 0
		Producer 11 produced 68, the buffer now contains 1
		Consumer 19 consumed 68, the buffer now contains 0
		Producer 12 produced 43, the buffer now contains 1
		Consumer 15 consumed 43, the buffer now contains 0
		Producer 10 produced 89, the buffer now contains 1
		Consumer 16 consumed 89, the buffer now contains 0
		Producer 13 produced 42, the buffer now contains 1
		Consumer 15 consumed 42, the buffer now contains 0
		Producer 12 produced 28, the buffer now contains 1
		Consumer 17 consumed 28, the buffer now contains 0
		Producer 14 produced 27, the buffer now contains 1
		Consumer 16 consumed 27, the buffer now contains 0
		Producer 11 produced 72, the buffer now contains 1
		Consumer 18 consumed 72, the buffer now contains 0
		Producer 10 produced 34, the buffer now contains 1
		Consumer 15 consumed 34, the buffer now contains 0
		Producer 10 produced 51, the buffer now contains 1
		Consumer 17 consumed 51, the buffer now contains 0
		Producer 14 produced 13, the buffer now contains 1
		BUILD SUCCESSFUL (total time: 19 seconds)
	Analysis:
		There are five producer threads from 10 to 14 and five consumer threads from 15 to 19. 
		In this situation, there is only one buffer place. So after a item produced, other producer can not produce more items because there is no permit (place) to place the item. The consumer has to consume first. And also after a consumer consumes an item, other consumers have no item to consume so consumers has to wait for producer to produce. Thus, the producer and consumer are running alternatively.
******************************************************************************
Test 3:
	Condition: 
		buffer size 10
		producer 5
		consumer 5
		sleep time 10
	Output:
		run:
		Sleep time (second): 
		10
		The number of producer threads: 
		5
		The number of consumer threads: 
		5
		Producer 11 produced 99, the buffer now contains 1
		Consumer 19 consumed 99, the buffer now contains 0
		Producer 14 produced 18, the buffer now contains 1
		Consumer 18 consumed 18, the buffer now contains 0
		Producer 13 produced 87, the buffer now contains 1
		Consumer 19 consumed 87, the buffer now contains 0
		Producer 11 produced 40, the buffer now contains 1
		Consumer 16 consumed 40, the buffer now contains 0
		Producer 10 produced 9, the buffer now contains 1
		Consumer 18 consumed 9, the buffer now contains 0
		Producer 12 produced 95, the buffer now contains 1
		Consumer 17 consumed 95, the buffer now contains 0
		Producer 10 produced 83, the buffer now contains 1
		Consumer 15 consumed 83, the buffer now contains 0
		Producer 11 produced 61, the buffer now contains 1
		Consumer 17 consumed 61, the buffer now contains 0
		Producer 14 produced 84, the buffer now contains 1
		Producer 13 produced 64, the buffer now contains 2
		Producer 14 produced 88, the buffer now contains 3
		Consumer 17 consumed 84, the buffer now contains 2
		Consumer 17 consumed 64, the buffer now contains 1
		Consumer 19 consumed 88, the buffer now contains 0
		Producer 12 produced 75, the buffer now contains 1
		Consumer 16 consumed 75, the buffer now contains 0
		Producer 13 produced 66, the buffer now contains 1
		Producer 13 produced 20, the buffer now contains 2
		Consumer 15 consumed 66, the buffer now contains 1
		Consumer 18 consumed 20, the buffer now contains 0
		Producer 11 produced 67, the buffer now contains 1
		Producer 13 produced 75, the buffer now contains 2
		Consumer 15 consumed 67, the buffer now contains 1
		Producer 10 produced 55, the buffer now contains 2
		Consumer 17 consumed 75, the buffer now contains 1
		Consumer 17 consumed 55, the buffer now contains 0
		Producer 11 produced 92, the buffer now contains 2
		Producer 13 produced 38, the buffer now contains 2
		Consumer 15 consumed 92, the buffer now contains 1
		Consumer 16 consumed 38, the buffer now contains 0
		Producer 14 produced 60, the buffer now contains 1
		Producer 13 produced 86, the buffer now contains 2
		Consumer 19 consumed 60, the buffer now contains 1
		Producer 12 produced 46, the buffer now contains 2
		Consumer 18 consumed 86, the buffer now contains 1
		Producer 10 produced 46, the buffer now contains 2
		Consumer 19 consumed 46, the buffer now contains 1
		Consumer 19 consumed 46, the buffer now contains 0
		Producer 11 produced 20, the buffer now contains 1
		Consumer 15 consumed 20, the buffer now contains 0
		Producer 13 produced 69, the buffer now contains 1
		Consumer 18 consumed 69, the buffer now contains 0
		Producer 12 produced 99, the buffer now contains 1
		Consumer 17 consumed 99, the buffer now contains 0
		Producer 14 produced 92, the buffer now contains 1
		Consumer 16 consumed 92, the buffer now contains 0
		Producer 12 produced 26, the buffer now contains 1
		Consumer 17 consumed 26, the buffer now contains 0
		Producer 11 produced 47, the buffer now contains 1
		Consumer 19 consumed 47, the buffer now contains 0
		Producer 13 produced 83, the buffer now contains 1
		Consumer 16 consumed 83, the buffer now contains 0
		Producer 10 produced 2, the buffer now contains 1
		Consumer 15 consumed 2, the buffer now contains 0
		Producer 12 produced 19, the buffer now contains 1
		Consumer 18 consumed 19, the buffer now contains 0
		Producer 12 produced 91, the buffer now contains 1
		Consumer 15 consumed 91, the buffer now contains 0
		Producer 14 produced 65, the buffer now contains 1
		Consumer 18 consumed 65, the buffer now contains 0
		Producer 13 produced 57, the buffer now contains 1
		Producer 10 produced 33, the buffer now contains 2
		Consumer 17 consumed 57, the buffer now contains 1
		Producer 11 produced 0, the buffer now contains 2
		Consumer 18 consumed 33, the buffer now contains 1
		Producer 12 produced 36, the buffer now contains 2
		Consumer 16 consumed 0, the buffer now contains 1
		Consumer 19 consumed 36, the buffer now contains 0
		Producer 10 produced 88, the buffer now contains 1
		Producer 12 produced 5, the buffer now contains 2
		Producer 10 produced 5, the buffer now contains 3
		Consumer 15 consumed 88, the buffer now contains 2
		Producer 11 produced 92, the buffer now contains 3
		Consumer 18 consumed 5, the buffer now contains 2
		Producer 14 produced 56, the buffer now contains 3
		Producer 13 produced 37, the buffer now contains 4
		Consumer 16 consumed 5, the buffer now contains 3
		Consumer 17 consumed 92, the buffer now contains 2
		Consumer 15 consumed 56, the buffer now contains 1
		Producer 11 produced 56, the buffer now contains 2
		Consumer 19 consumed 37, the buffer now contains 1
		Producer 11 produced 70, the buffer now contains 2
		Producer 12 produced 46, the buffer now contains 3
		Producer 14 produced 99, the buffer now contains 4
		Consumer 16 consumed 56, the buffer now contains 3
		Producer 10 produced 44, the buffer now contains 4
		Consumer 18 consumed 70, the buffer now contains 3
		Consumer 19 consumed 46, the buffer now contains 2
		Producer 10 produced 77, the buffer now contains 3
		Producer 14 produced 39, the buffer now contains 4
		Producer 13 produced 86, the buffer now contains 5
		Producer 13 produced 16, the buffer now contains 6
		Consumer 15 consumed 99, the buffer now contains 5
		Consumer 15 consumed 44, the buffer now contains 4
		Consumer 17 consumed 77, the buffer now contains 3
		Producer 11 produced 0, the buffer now contains 4
		Consumer 16 consumed 39, the buffer now contains 3
		Producer 13 produced 17, the buffer now contains 4
		Consumer 19 consumed 86, the buffer now contains 3
		Consumer 18 consumed 16, the buffer now contains 2
		Producer 12 produced 17, the buffer now contains 3
		Consumer 17 consumed 0, the buffer now contains 2
		Consumer 19 consumed 17, the buffer now contains 1
		Producer 11 produced 77, the buffer now contains 2
		Producer 13 produced 22, the buffer now contains 3
		Producer 12 produced 93, the buffer now contains 4
		Consumer 16 consumed 17, the buffer now contains 3
		Producer 14 produced 61, the buffer now contains 4
		Consumer 15 consumed 77, the buffer now contains 3
		Producer 10 produced 79, the buffer now contains 4
		Producer 10 produced 11, the buffer now contains 5
		Consumer 16 consumed 22, the buffer now contains 4
		Producer 12 produced 92, the buffer now contains 5
		Producer 11 produced 13, the buffer now contains 6
		Consumer 18 consumed 93, the buffer now contains 5
		Producer 14 produced 65, the buffer now contains 6
		Producer 10 produced 7, the buffer now contains 7
		Consumer 15 consumed 61, the buffer now contains 6
		Producer 10 produced 92, the buffer now contains 7
		Consumer 17 consumed 79, the buffer now contains 6
		Consumer 16 consumed 11, the buffer now contains 5
		Consumer 17 consumed 92, the buffer now contains 4
		Producer 13 produced 76, the buffer now contains 5
		Consumer 19 consumed 13, the buffer now contains 4
		Producer 10 produced 1, the buffer now contains 5
		Producer 11 produced 11, the buffer now contains 6
		Consumer 18 consumed 65, the buffer now contains 5
		Producer 12 produced 40, the buffer now contains 6
		Consumer 15 consumed 7, the buffer now contains 5
		Producer 11 produced 99, the buffer now contains 6
		Producer 14 produced 7, the buffer now contains 7
		Producer 11 produced 9, the buffer now contains 8
		Consumer 17 consumed 92, the buffer now contains 7
		Consumer 15 consumed 76, the buffer now contains 6
		Producer 13 produced 32, the buffer now contains 7
		Producer 11 produced 17, the buffer now contains 8
		Consumer 18 consumed 1, the buffer now contains 7
		Consumer 16 consumed 11, the buffer now contains 6
		Consumer 17 consumed 40, the buffer now contains 5
		Consumer 17 consumed 99, the buffer now contains 4
		Consumer 19 consumed 7, the buffer now contains 3
		Consumer 16 consumed 9, the buffer now contains 2
		Consumer 18 consumed 32, the buffer now contains 1
		Producer 13 produced 53, the buffer now contains 2
		Producer 10 produced 56, the buffer now contains 3
		Producer 11 produced 32, the buffer now contains 4
		Consumer 18 consumed 17, the buffer now contains 3
		Producer 12 produced 39, the buffer now contains 4
		Producer 14 produced 1, the buffer now contains 5
		Consumer 16 consumed 53, the buffer now contains 4
		Consumer 15 consumed 56, the buffer now contains 3
		Producer 10 produced 62, the buffer now contains 4
		Producer 13 produced 31, the buffer now contains 5
		Producer 13 produced 52, the buffer now contains 6
		Consumer 19 consumed 32, the buffer now contains 5
		Consumer 18 consumed 39, the buffer now contains 4
		Consumer 17 consumed 1, the buffer now contains 3
		Producer 14 produced 13, the buffer now contains 4
		Consumer 15 consumed 62, the buffer now contains 3
		Producer 11 produced 61, the buffer now contains 4
		Producer 10 produced 25, the buffer now contains 5
		Producer 10 produced 18, the buffer now contains 6
		Consumer 16 consumed 31, the buffer now contains 5
		Consumer 19 consumed 52, the buffer now contains 4
		Producer 12 produced 94, the buffer now contains 5
		Consumer 15 consumed 13, the buffer now contains 4
		Producer 11 produced 42, the buffer now contains 5
		Consumer 15 consumed 61, the buffer now contains 4
		Consumer 18 consumed 25, the buffer now contains 3
		Producer 13 produced 41, the buffer now contains 4
		Producer 11 produced 99, the buffer now contains 5
		Consumer 15 consumed 18, the buffer now contains 4
		Consumer 17 consumed 94, the buffer now contains 3
		Consumer 18 consumed 42, the buffer now contains 2
		Consumer 16 consumed 41, the buffer now contains 1
		Consumer 17 consumed 99, the buffer now contains 0
		Producer 14 produced 76, the buffer now contains 1
		Producer 11 produced 2, the buffer now contains 2
		Consumer 16 consumed 76, the buffer now contains 1
		BUILD SUCCESSFUL (total time: 14 seconds)
	Analysis:
		There are five producer threads from 10 to 14 and five consumer threads from 15 to 19. Still only one role can work at a time. There is no specific pattern for this situation. Any producer can produce an item until the buffer is full, which is hard to get 10 items in the buffer, and any consumer can consume when there is an item or are some items in the buffer. At the beginning, only one item has been produced so one it was consumed all other consumers needed to wait other items to be produced. So it is hard to have some items in the buffer at the beginning, it should take time to accumulate the items. 
