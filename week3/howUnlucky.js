const howUnlucky = year => {
  let count = 0;

  for (let month = 0; month < 12; month++) {
    if (new Date(year, month, 13).getDay() === 5) count++;
  }

  return count;
};

console.log(howUnlucky(2020)); // 2
console.log(howUnlucky(2026)); // 3
console.log(howUnlucky(2016)); // 1
