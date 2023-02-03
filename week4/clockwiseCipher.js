const clockwiseCipher = (message) => {
  message = [...message];
  const size = Math.ceil(Math.sqrt(message.length));
  let square = Array.from({ length: size }, _ => new Array(size).fill(" "));

  let j = 0;
  let k = 4 * (size - 2 * j - 1) || 1;

  while (k > 0) {
    for (let i = 0; i < k && message.length; i++) {
      let y, x;
      if (i % 4 === 0) [y, x] = [j, i / 4 + j];
      if (i % 4 === 1) [y, x] = [(i - 1) / 4 + j, (size - 1) - j];
      if (i % 4 === 2) [y, x] = [(size - 1) - j, (size - 1) - ((i - 2) / 4 + j)];
      if (i % 4 === 3) [y, x] = [(size - 1) - ((i - 3) / 4 + j), j];

      square[y][x] = message.shift();
    }

    j++;
    k = 4 * (size - 2 * j - 1) || 1;
  }

  return square.flat().join("");
};

console.log(clockwiseCipher("Mubashir Hassan"));
