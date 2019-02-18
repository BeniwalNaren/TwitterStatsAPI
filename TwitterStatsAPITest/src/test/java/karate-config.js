function config () {

  // mvn8 clean test-compile failsafe:integration-test failsafe:verify -DargLine=-Dkarate.env=local
  var karateEnv = karate.env || 'local'; // get java system property 'karate.env' OR default to local.
  karate.log('karate.env system property is:', karateEnv);

  var envProp = read('classpath:env.json');
  var commonFunctions = read('classpath:common.js')

  //and all keys and values in that config object will be made available as script variables
  var config = { // base config
    env: envProp.json()[karateEnv],
    commonFunctions: commonFunctions()
  };

  // don't waste time waiting for a connection or if servers don't respond within 5 seconds
  karate.configure('connectTimeout', 5000);
  karate.configure('readTimeout', 5000);

  karate.configure('logPrettyRequest', true);
  karate.configure('logPrettyResponse', true);

  //true => enables https calls without needing to configure a trusted certificate or key-store.
  karate.configure('ssl', config.env.ssl);

  return config;
}
