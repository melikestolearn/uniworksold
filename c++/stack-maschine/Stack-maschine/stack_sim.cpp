#include<assert.h>
#include<iostream>
class stack{
private:

	int numberA;
	int numberB;
	int numberC;

	int count;
	int stacks[10];
public:
	stack(){
		stacks[10];
		for(int i=0;i<=9;i++){
			stack[i] = 0;
			count = 0;
		}
	}
	void push(int number){
		assert((number >= 0)&&(count <= 9));
		stacks[count] = number;
		count++;
	}
	void pop(){
		std::cout << stacks[count] << '\0';
		assert((count >= 0)&&(count <= 9));
		stacks[count] = 0;
		count--;
	}
	void push(std::string operand){
		assert(count >= 1);
		if(operand=="SUB"){
			stacks[count-1] = stacks[count] - stacks[count-1];
			pop();
		}
		if(operand == "DIV"){
			stacks[count-1] = stacks[count]/stack[count-1];
			pop();
		}
		;
	}
}
