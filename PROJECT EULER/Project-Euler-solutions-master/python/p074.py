# 
# Solution to Project Euler problem 74
# by Project Nayuki
# 
# https://www.nayuki.io/page/project-euler-solutions
# https://github.com/nayuki/Project-Euler-solutions
# 


def compute():
	LIMIT = 10**6
	ans = sum(1 for i in range(LIMIT) if get_chain_length(i) == 60)
	return str(ans)


def get_chain_length(n):
	seen = set()
	while True:
		seen.add(n)
		n = factorialize(n)
		if n in seen:
			return len(seen)


def factorialize(n):
	result = 0
	while n != 0:
		result += FACTORIAL[n % 10]
		n //= 10
	return result

# Hard-coded values for factorial(0), factorial(1), ..., factorial(9)
FACTORIAL = [1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880]


if __name__ == "__main__":
	print(compute())
