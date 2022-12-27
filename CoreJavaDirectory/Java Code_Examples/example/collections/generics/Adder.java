package example.collections.generics;

public interface Adder<T> {//Since the exact type is not mentioned, this interface is a generic interface
	T doAdd(T t1, T t2);
	//In case of classes it will behave like:
	//For Strings: String doAdd(String s1, String s2)
	//For Integers: Integer doAdd(Integer i1, Integer i2)
	
}
