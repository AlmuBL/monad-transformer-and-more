package com.logicaalternativa.monadtransformerandmore
package monad
package futeither

import function.{Function3 => JFunction3}
import com.logicaalternativa.monadtransformerandmore.container._
import errors._
import errors.impl._
import java.util.function.{Function => JFunction}
import syntax.Implicits._
import scala.concurrent._
import scala.util._

import scala.concurrent.ExecutionContext

import MonadFutEitherS.FutEitherError

object MonadFutEitherS {
  
    // import scala.concurrent.ExecutionContext.Implicits.global
  
    type FutEitherError[_] =  Future[Either[Error,_]]    
    
    def apply( implicit ec: ExecutionContext ) = new MonadFutEitherS
  
}

class MonadFutEitherS(implicit ec : ExecutionContext ) extends Monad[Error, FutEitherError] {
  
  def pure[T]( value : T ) : FutEitherError[T] = ???
  
  def flatMap[A,T]( from : FutEitherError[A], f : JFunction[A, FutEitherError[T]] ) : FutEitherError[T] = ???
  
  def raiseError[T] ( error: Error ) : FutEitherError[T] = ???

  def recoverWith[A,T]( from : FutEitherError[A], f : JFunction[Error, FutEitherError[T]] ) : FutEitherError[T] = ???
 
  
}
