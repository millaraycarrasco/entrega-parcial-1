sealed trait Rango {
  val orden: Int
  val valor: Int
  val clasificacion: ClasificacionRango
}

case object As    extends Rango { val orden = 1;  val valor = 11; val clasificacion = Impar  }
case object Dos   extends Rango { val orden = 2;  val valor = 2;  val clasificacion = Par    }
case object Tres  extends Rango { val orden = 3;  val valor = 3;  val clasificacion = Impar  }
case object Cuatro extends Rango { val orden = 4; val valor = 4;  val clasificacion = Par    }
case object Cinco  extends Rango { val orden = 5; val valor = 5;  val clasificacion = Impar  }
case object Seis   extends Rango { val orden = 6; val valor = 6;  val clasificacion = Par    }
case object Siete  extends Rango { val orden = 7; val valor = 7;  val clasificacion = Impar  }
case object Ocho   extends Rango { val orden = 8; val valor = 8;  val clasificacion = Par    }
case object Nueve  extends Rango { val orden = 9; val valor = 9;  val clasificacion = Impar  }
case object Diez   extends Rango { val orden = 10; val valor = 10; val clasificacion = Par   }
case object Jota   extends Rango { val orden = 11; val valor = 10; val clasificacion = Figura }
case object Reina  extends Rango { val orden = 12; val valor = 10; val clasificacion = Figura }
case object Rey    extends Rango { val orden = 13; val valor = 10; val clasificacion = Figura }