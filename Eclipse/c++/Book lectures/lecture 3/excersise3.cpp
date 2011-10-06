#include <iostream>

using namespace std;

int main(){
	string satz = "Schon wieder was dazugelernt!";
	string satz2;
	string satz3;
	cout << satz << satz.length() << endl;
	getline(cin, satz2);
	getline(cin, satz3);
	satz2 = satz2 + " * " + satz3;
	cout << satz2 << endl;
	return 0;
}

