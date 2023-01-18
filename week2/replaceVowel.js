const vowels = { 'a': 1, 'e': 2, 'i': 3, 'o': 4, 'u': 5 };

const replaceVowel = str => {
  return str.toLowerCase().split("").map(char => vowels[char] ? vowels[char] : char).join("");
};

console.log(replaceVowel("karAchi"));     // k1r1ch3
console.log(replaceVowel("chEmBur"));     // ch2mb5r
console.log(replaceVowel("khandbari"));   // kh1ndb1r3
console.log(replaceVowel("lexiCAl"));     // l2x3c1l
console.log(replaceVowel("fuNctions"));   // f5nct34ns
console.log(replaceVowel("EASY"));        // 21sy
