//create an array of  5 floats and calaculate their sum
class Addition_of_Arrays{
public static void main(String[] args){
	float [] marks = {45.5f, 97.6f, 78.8f, 78.5f};
	float sum = 0;
	for(float element:marks){
		sum = sum + element;
	}
	
		System.out.println("The value of sum is :" +sum);
	}
}