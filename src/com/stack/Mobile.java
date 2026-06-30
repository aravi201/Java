package com.stack;

public class Mobile {
	
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("destroyed objects");
		
		super.finalize();
	}

	public static void main(String[] args) {
		Mobile vivo=new Mobile();
		System.out.println(vivo);
		System.out.println(vivo.hashCode());//com.stack.Mobile@2b2fa4f7
		
		Mobile i=new Mobile();
		System.out.println(i);
		System.out.println(i.hashCode());//com.stack.Mobile@1dbd16a6
		
		Mobile mi=new Mobile();
		System.out.println(mi);//com.stack.Mobile@7ad041f3
		System.out.println(mi.hashCode());//2060468723
		
		
		
		
		
		
		int m=0x2b2fa4f7;
		System.out.println(m);
		
		int k=0x1dbd16a6;
		System.out.println(k);
		
		int n=0x7ad041f3;
		System.out.println(n);
		
		
		vivo=null;
		i=null;
		
		System.gc();
		System.out.println(vivo);
		System.out.println(i);
		
		
		
	}

}
