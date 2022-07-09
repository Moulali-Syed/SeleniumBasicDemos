package java4;

public class SDifferenceBetweenStringStringBufferStringBuilder {

}
/*

String:
storage - Heap area , SCP 
			created with literal then in SCP
			created with String Class , creates in heap and SCP
Objects - Immutable Object
Memory - if we change value of String lot of times it will allocate more memory
Thread safe -  not thread safe, because methods are non synchronized
Performance - slow
USE - if data not changing frequently

StringBuffer
storage - Heap area
Objects - mutable Object
Memory - consumes less memory
Thread safe - all methods are synchronized , so thread safe
performance - fast compared to String
USE - if data is changing frequently

StringBuilder:
storage - Heap area
Objects - mutable Object
Memory - consumes less memory
Thread safe - methods are non-synchronized , so not thread safe
performance - fast compared to StringBuffer
USE - if data is changing frequently


*/