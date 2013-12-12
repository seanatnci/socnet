function hosturl(method,env){
      var querystring = "";

      if ( env != "development") {
         querystring = "http://" + this.location.host + "/api/" + method;
      } else {
          //querystring = "http://" + this.location.host + "/socialnet/api/" + method;
          querystring = "/socialnet/api/" + method;
         // var uri = "/api/" + method;
         // querystring = "${createLink(uri: uri)}"

      }
      return querystring
     }
