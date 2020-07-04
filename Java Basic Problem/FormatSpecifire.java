class FormatSpecifire{
	public static void main(String[] args){
		boolean bol = true;
		char c = 'C';
		short s = 125;
		int i =  153;
		//float f = 25.025f;	Error Found in Print Section
		double d = 12.12;
		
		System.out.printf("Boolean = %b\n",bol);
		System.out.printf("Charecter = %c\n",c);
		System.out.printf("Short = %s\n",s);
		System.out.printf("Integer = %d\n",i);
		//System.out.printf("Float = %lf",f);
		System.out.printf("Double = %.2f\n",d);
	}
}