const hasNumber = str => str.replaceAll(" ").split("").some(c => !isNaN(c));

const numInStr = arr => arr.filter(str => hasNumber(str));

console.log(numInStr(["1a", "a", "2b", "b"]));            // ["1a", "2b"]
console.log(numInStr(["abc", "abc10"]));                  // ["abc10"]
console.log(numInStr(["abc", "ab10c", "a10bc", "bcd"]));  // ["ab10c", "a10bc"]
console.log(numInStr(["this is a test", "test1"]));       // ["test1"]
console.log(numInStr(["who needs numbers", "not me"]));   // []
console.log(numInStr(["!!", "##", "@"]));                 // []
