const existsHigher = (arr, n) => arr.some(x => x >= n);

console.log(existsHigher([5, 3, 15, 22, 4], 10))    // true 
console.log(existsHigher([1, 2, 3, 4, 5], 8))       // false 
console.log(existsHigher([4, 3, 3, 3, 2, 2, 2], 4)) // true 
console.log(existsHigher([-10, -99, -57, -4], -4))  // true 
console.log(existsHigher([5], 5))                   // true 
console.log(existsHigher([99, 99], 99))             // true 
console.log(existsHigher([], 5))                    // false
