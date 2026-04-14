import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ModeloSpec extends AnyFlatSpec with Matchers {

  // --- Puntaje ---
  "Puntaje" should "crearse con chips y multiplicador" in {
    val p = Puntaje(50, 2)
    p.chips          shouldEqual 50
    p.multiplicador  shouldEqual 2
  }

  it should "ser igual a otro Puntaje con los mismos valores" in {
    Puntaje(10, 3) shouldEqual Puntaje(10, 3)
  }

  // --- Rango ---
  "Rango" should "exponer orden y valor como conceptos distintos" in {
    As.orden shouldEqual 1
    As.valor shouldEqual 11   // distintos entre sí
    Dos.orden shouldEqual 2
    Dos.valor shouldEqual 2   // pueden coincidir
  }

  it should "clasificar correctamente As como Impar" in {
    As.clasificacion shouldEqual Impar
  }

  it should "clasificar figuras correctamente" in {
    Jota.clasificacion  shouldEqual Figura
    Reina.clasificacion shouldEqual Figura
    Rey.clasificacion   shouldEqual Figura
  }

  it should "clasificar rangos pares e impares" in {
    Dos.clasificacion   shouldEqual Par
    Tres.clasificacion  shouldEqual Impar
    Diez.clasificacion  shouldEqual Par
  }

  // --- Carta ---
  "Carta" should "crearse con rango y pinta" in {
    val carta = Carta(As, Corazon)
    carta.rango shouldEqual As
    carta.pinta shouldEqual Corazon
  }

  it should "ser igual a otra carta con mismos datos" in {
    Carta(Rey, Pica) shouldEqual Carta(Rey, Pica)
  }

  it should "ser distinta si difiere el rango o la pinta" in {
    Carta(Rey, Pica) should not equal Carta(Reina, Pica)
    Carta(Rey, Pica) should not equal Carta(Rey, Corazon)
  }

  // --- Joker ---
  "Joker" should "ser entidades diferenciables" in {
    (GreedyJoker: Joker)  should not equal DeviousJoker
    (EvenSteven: Joker)   should not equal ScaryFace
  }

  // --- Mano ---
  "Mano" should "contener una colección de cartas y jokers" in {
    val cartas = List(Carta(As, Corazon), Carta(Rey, Pica))
    val jokers  = List(GreedyJoker)
    val mano    = Mano(cartas, jokers)
    mano.cartas shouldEqual cartas
    mano.jokers shouldEqual jokers
  }

  it should "permitir mano vacía" in {
    val mano = Mano(List.empty, List.empty)
    mano.cartas shouldBe empty
    mano.jokers shouldBe empty
  }
}