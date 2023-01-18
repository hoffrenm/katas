const bestFriend = (string, first, second) => {
  if (string[string.length - 1] === first) return false;
  
  let flag = false;

  for (let i = 0; i < string.length; i++) {
    if (string[i] === first && string[i + 1] === second) {
      flag = true;
    } else if (string[i] === first && string[i + 1] !== second) {
      return false;
    }
  }

  return flag;
};

console.log(bestFriend("he headed to the store", "h", "e"));           // true
console.log(bestFriend("i found an ounce with my hound", "o", "u"));   // true
console.log(bestFriend("we found your dynamite", "d", "y"));           // false
