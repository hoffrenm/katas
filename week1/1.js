const getUpperCaseLetters = (string) => {
  return string.replace(/[0-9]/g, "").replace(/[a-z]/g, "")
}

const getLowerCaseLetters = (string) => {
  return string.replace(/[0-9]/g, "").replace(/[A-Z]/g, "")
}

const getNumbersFromString = (string) => {
  return string.replace(/\D/g, "")
}

const reorder = (string) => {
  const upper = getUpperCaseLetters(string)
  const lower = getLowerCaseLetters(string)
  const numbers = getNumbersFromString(string)

  return upper + lower + numbers
}

console.log(reorder("hA2p4Py"))       // APHpy24
console.log(reorder("m11oveMENT"))    // MENTmove11
console.log(reorder("s9hOrt4CAKE"))   // OCAKEshrt94
