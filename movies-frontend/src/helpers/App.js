module.exports = { getAppEnvironmentFrom }

function getAppEnvironmentByPort (port) {
  const appName = 'Movies frontend application'
  const appVersion = '1.0.0'

  const environment = {
    appPort: JSON.stringify(port),
    appName: JSON.stringify(appName),
    appVersion: JSON.stringify(appVersion)
  }
  return environment
}

function getAppEnvironmentFrom (ctx) {
  const environment = ctx.dev
    ? getAppEnvironmentByPort('3000')
    : getAppEnvironmentByPort('81')
  return environment
}
