#include<assert.h>
#include<iostream>
class stack{
private:

	int numberA;
	int numberB;
	int numberC;

	int count;
	int stack[10];
public:
	stack(){
		stack[10];
		for(int i=0;i<=9;i++){
			stack[i] = 0;
			count = 0;
		}
	}
	void push(int number){
		assert((number >= 0)&&(count <= 9));
		stack[count] = number;
		count++;
	}
	void pop(){
		std::cout << stack[count] << '\0';
		assert((count >= 0)&&(count <= 9));
		stack[count] = 0;
		count--;
	}
	void push(std::string operand){
		assert(count >= 1);
		if(operand=="SUB"){
			stack[count-1] = stack[count] - stack[count-1];
			pop();
		}
		if(operand == "DIV"){
			stack[count-1] = stack[count]/stack[count-1];
			pop();
		}
		;
	}
}
