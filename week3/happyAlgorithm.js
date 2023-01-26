const happyAlgorithm = (num, loop) => {
  const numbers = Array.from(String(num), Number);
  const sum = numbers.map(x => Math.pow(x, 2)).reduce((a, b) => a + b);

  if (sum === 1) {
    return `HAPPY ${loop.length + 1}`;
  } else if (loop.includes(sum)) {
    return `SAD ${loop.length + 1}`;
  }

  return happyAlgorithm(sum, [...loop, num]);
};

console.log(happyAlgorithm(139, []));  // HAPPY 5
console.log(happyAlgorithm(67, []));   // SAD 10
console.log(happyAlgorithm(89, []));   // SAD 8
console.log(happyAlgorithm(1, []));    // HAPPY 1
