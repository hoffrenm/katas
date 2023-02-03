const vowels = ['a', 'e', 'i', 'o', 'u'];

const pigLatinSentence = (string) => {
  const strArr = string.toLowerCase().split(' ');

  for (let i = 0; i < strArr.length; i++) {
    const charArr = strArr[i].split('');

    if (vowels.includes(charArr[0])) {
      charArr.push('way');
      strArr[i] = charArr.join('');
      continue;
    }

    while (true) {
      if (!vowels.includes(charArr[0])) {
        charArr.push(charArr.shift());
      } else {
        charArr.push('ay');
        strArr[i] = charArr.join('');
        break;
      }
    }
  }

  return strArr.join(' ');
};

console.log(pigLatinSentence("this is pig latin"));     // "isthay isway igpay atinlay" 
console.log(pigLatinSentence("wall street journal"));   // "allway eetstray ournaljay" 
console.log(pigLatinSentence("raise the bridge"));      // "aiseray ethay idgebray" 
console.log(pigLatinSentence("all pigs oink"));         // "allway igspay oinkway
console.log(pigLatinSentence("sdfghj"));         // "allway igspay oinkway

