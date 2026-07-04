$ErrorActionPreference = "Stop"

Push-Location "$PSScriptRoot/../backend"
if (Test-Path ./mvnw.cmd) {
    ./mvnw.cmd test
} else {
    mvn test
}
Pop-Location

Push-Location "$PSScriptRoot/../frontend"
npm install
npm run build
Pop-Location
