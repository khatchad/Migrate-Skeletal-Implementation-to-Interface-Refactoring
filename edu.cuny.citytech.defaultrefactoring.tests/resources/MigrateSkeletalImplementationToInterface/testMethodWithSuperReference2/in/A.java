package p;

interface I {
    void m();
}


abstract class A implements I {
    @Override
    public void m() {
    	super.equals(null);
    }
}