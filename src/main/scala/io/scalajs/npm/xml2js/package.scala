package io.scalajs.npm

import io.scalajs.nodejs.Error
import io.scalajs.util.PromiseHelper._

import scala.concurrent.Future
import scala.scalajs.js

/**
  * xml2js package object
  * @author lawrence.daniels@gmail.com
  */
package object xml2js {

  /**
    * XML2JS Enrichment
    * @param xml2js the given [[Xml2js]] instance
    */
  implicit class XML2JSEnrichment(val xml2js: Xml2js) extends AnyVal {

    @inline
    def parseStringFuture[T <: js.Any](xml: String): Future[T] = {
      promiseWithError1[Error, T](xml2js.parseString[T](xml, _))
    }

  }

}
