def readVariablesFromFile(Map input) {

  def varMap = [:]

  varMap = readVariablesFromFile('', varMap)
  return varMap
}

def readVariablesFromFile(String fileName, Map varMap) {
  try {
    def file = readFile fileName
    for (line in file.readLines()) {
      item = line.split('=')
      varMap[item[0]] = item[1]
    }
  } catch(Exception e) {
    print e
  }
  return varMap
}

def getSelf() {
  echo 'shared.groovy'
  return 'shared.groovy'
}

return this
