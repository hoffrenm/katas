const countBoomerangs = array => {
  if (array.some(a => isNaN(a)) || array.length < 3) return "error";

  let count = 0;

  for (let i = 0; i < array.length - 2; i++) {
    (array[i] === array[i + 2] && array[i] !== array[i + 1]) ? count++ : 0;;
  }

  return count;
};

console.log(countBoomerangs([9, 5, 9, 5, 1, 1, 1]));      // 2
console.log(countBoomerangs([5, 6, 6, 7, 6, 3, 9]));      // 1
console.log(countBoomerangs([4, 4, 4, 9, 9, 9, 9]));      // 0
console.log(countBoomerangs([1, 7, 1, 7, 1, 7, 1]));      // 5
console.log(countBoomerangs([]));                         // error
console.log(countBoomerangs([1, 7]));                     // error
console.log(countBoomerangs([1, 7, 1, 7, "one", 7, 1]));  // error
