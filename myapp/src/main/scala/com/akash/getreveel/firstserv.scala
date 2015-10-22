package com.akash.getreveel

import org.scalatra._
import scalate.ScalateSupport

class firstserv extends MyappStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

}
