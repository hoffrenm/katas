const consecutiveSum = n => {
  for (let i = 1; i < n; i++) {
    let sum = 0;

    for (let j = i; j < n; j++) {
      if (sum === n) return true;
      
      sum += j;
    }
  }

  return false;
};

console.log(consecutiveSum(9));   // true
console.log(consecutiveSum(10));  // true
console.log(consecutiveSum(64));  // false
