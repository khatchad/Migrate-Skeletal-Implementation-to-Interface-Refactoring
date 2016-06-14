package p;

interface I {
	void m();
}

interface J extends I {
	void m();
}

public abstract class A implements I {

	@Override
	public void m() {
	}
}

abstract class C extends A implements J {
}

class B extends C {
	@Override
	public void m() {
		super.m();
	}
}