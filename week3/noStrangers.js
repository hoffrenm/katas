const REGEX = /[.,\/#!$%\^&\*;:{}=\-_`~()]/g

const noStrangers = string => {
  const map = new Map()
  const acquaintances = []
  const friends = []

  const stringArr = string.toLowerCase().replace(REGEX, "").split(" ")

  for (let i = 0; i < stringArr.length; i++) {
    const word = stringArr[i];

    map.get(word) ? map.set(word, map.get(word) + 1) : map.set(word, 1)

    if (map.get(word) === 3) {
      acquaintances.push(word)
    } else if (map.get(word) === 5) {
      acquaintances.splice(acquaintances.indexOf(word), 1)
      friends.push(word)
    }
  }

  return [acquaintances, friends]
}

console.log(noStrangers("See Spot run. See Spot jump. Spot likes jumping. See Spot fly.")) // [["spot", "see"], []]
