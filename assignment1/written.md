# Written Exercise

https://canvas.case.edu/courses/49167/assignments/686165

1. Determine whether the statement is true and prove or disprove it.
    a. $3n^2+5n+3=O(n^4)$
        True. The largest exponent of *n* is *2*, so the best representation of this function is $\Theta(n^2)$. However, big-O notation is not the tightest or best representation of a function, so the too-large approximation, $O(n^4)$, still accurately describes this function.
    b. $n^2-4n-7=\Omega(n)$
		True. While this isn't the best representation of this function, big-Omega notation allows smaller values of $n$. So, $\Omega(n)$ accurately describes this function.
2. Determine tight Big-O notation. Explain reasoning.
	a. $O(n*log(n))$. The outer loop is $log(n)$ and the inner loop is $n$, so this function has a big-O time complexity of $O(n^3)$.
	b. $O(n^3)$. The outer loop is $n$ and the inner loop is $n^2$, and $n*n^2=n^3$, so this function has a big-O time complexity of $O(n^3)$.
	c. $O(n)$. The outer loop is $log(n)$, and the inner loop is every value repeated. So, this code snippet iterates on the order of $2n$ which is $O(n)$.
3. Simplify and explain:
	a. $O(1)\to$ For this function, a variable increases by $1$ until it is equal to $500$. Every operation is constant time, so the entire function can be reduced to $O(1)$.
	b. $O()\to$
4. Fibonacci snippet
	a. No, this will not work. The base case will never happen and the program will recurse infinitely causing a `StackOverflowError`.
	```java
	// broken code
	int fib(int n) {
		if (n <= 1) {
			return n;
		}
		return fib(n + 1) + fib(n + 2);
	}
	```
	The corrected code should use the previous values of fib(), not the next values of fib(). Practically, this means converting the two calls in the final line of the function to subtract $1$ and $2$ respectively.
	```java
	// fixed code
	int fib(int n) {
		if (n <= 1) {
			return n;
		}
		return fib(n - 1) + fib(n - 2);
	}
	```
	b. Fibonacci implementation using iterative looping rather than recursion.
	```java
	int fib(int n) {
		int a = 1;
		int b = 1;
		int temp;
		while (n > 1) {
			a += b;
			n--;
			temp = a;
			a = b;
			b = temp;
		}
		return b;
	}
	```
