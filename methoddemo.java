
public  class methoddemo {
	public int add(int var1,int var2)
	{
		return var1+var2;
	}

	public static void main(String[] args) {
		methoddemo obj1= new methoddemo();
		int ret_val = obj1.add(10,20);
		System.out.println("the value is "+ret_val);
		// TODO Auto-generated method stub

	}

}
