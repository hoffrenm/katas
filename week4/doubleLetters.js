const doubleLetters = str => {
  return /(.)\1/.test(str)
};

console.log(doubleLetters("loop"));      // true 
console.log(doubleLetters("yummy"));     // true 
console.log(doubleLetters("orange"));    // false 
console.log(doubleLetters("munchkin"));  // false
console.log(doubleLetters("AaA"));       // false
