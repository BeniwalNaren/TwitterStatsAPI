function() {
  /*
    for functions making use of "this" context (to be able to inject environment config values),
     make sure to pass proper context when invoking (applying) that function from karate DSL
    commonFunctions.func.apply(this, [args...])
    eg:  commonFunctions.getPOXPaymentRequestIdFromResponse.apply(this, [response])
  */
  return {
    concat: function (a, b) {
      return a + b
    },
    mixin: function (a, b) {
      var mixedObject = {};
      for (var i in a) {
        mixedObject[i] = a[i];
      }
      for (var i in b) {
        mixedObject[i] = b[i];
      }
      return mixedObject;
    }
  }
}
