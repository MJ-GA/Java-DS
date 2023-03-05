public class A {
int x;
public void a() {
x = 20;
}
public void b() {
a();
	System.out.println(x);
/* state of x here?*/
}
}
