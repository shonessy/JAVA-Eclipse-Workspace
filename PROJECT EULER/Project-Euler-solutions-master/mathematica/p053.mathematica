(* 
 * Solution to Project Euler problem 53
 * by Project Nayuki
 * 
 * https://www.nayuki.io/page/project-euler-solutions
 * https://github.com/nayuki/Project-Euler-solutions
 *)


Length[Select[Flatten[Table[Binomial[n, r], {n, 1, 100}, {r, 0, n}]], Function[x, x > 1000000]]]
