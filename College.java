class College {
	public static void main(String[] args) {

		Student s1=new Student();
		Student s2=new Student();

		s1.sno		 =101;
		s1.sname	 ="ravi";
		s1.course	 ="java";
		s1.fee		 =2000;

		s2.sno		 =102;
		s2.sname	 ="ramu";
		s2.course	 ="acting";
		s2.fee		 =4000;

		System.out.println("\ns1 object values");
		System.out.println("s1.sno\t\t:"+s1.sno);
		System.out.println("s1.sname\t\t:"+s1.sname);
		System.out.println("s1.course\t\t:"+s1.course);
		System.out.println("s1.fee\t\t:"+s1.fee);
		System.out.println();
		
		System.out.println("\ns2 object values");
		System.out.println("s2.sno\t\t:"+s2.sno);
		System.out.println("s2.sname\t\t:"+s2.sname);
		System.out.println("s2.course\t\t:"+s2.course);
		System.out.println("s2.fee\t\t:"+s2.fee);
	}
}
