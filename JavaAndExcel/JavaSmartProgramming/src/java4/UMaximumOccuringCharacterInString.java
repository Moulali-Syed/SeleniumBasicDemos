package java4;

public class UMaximumOccuringCharacterInString {

	public static void main(String[] args) {
		String s="abbccc";
		int[] arr = new int[127];
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)] = arr[s.charAt(i)]+1;
		}
		
		int max=-1;
		char c = ' ';
		for(int i=0;i<s.length();i++) {
			if(max<arr[s.charAt(i)]) {
				max = arr[s.charAt(i)];
				c = s.charAt(i);
			}
		}
		System.out.println("maximum repeated character is "+c);
	}
}

/*
Computers cannot understand only numeric values
but is is not always certain that all inputs are given in
numeric form so there was a need for encoding system which could
convert text files into numeric values for this ASCII was developed
which is an encoding approach which is a code for reprsenting 128 characters
in english into seven bit integers

65-90[A-Z]
97-122[a-z]

48-57[0-9]
@ - 64
!-33
# - 35
$ - 36
& - 38

ASCII - [0-127] or [0-256]
*/