object Poker {
  def main(args: Array[String]): Unit = {
    println("Willkommen in Poker!")

  }

  /*
  Endziel:
  Das Spiel erlaubt ein bis zehn Spielern Poker zu spielen (wahlweise gegen Menschen oder eine AI)
  Dabei kann zwischen verschiedenen Pokervarianten und Startbedingungen (Anzahl Chips) gewählt werden
  Man kann das Aussehen der GUI anpassen

  Zuerst wird Draw Poker simulert, der Rest kommt später dazu.

  Schritt für Schritt Aufbau:
  Version 0.0:
    Ab hier hat jede Klasse einen Test!

    Simuliert ein volles Kartendeck mit Farben und Werten die angezeigt werden können
    das Deck kann gemischt werden
    Zwei Karten können miteinander auf ihren Wert verglichen werden.
    Dabei erkennt das Spiel, welcher Wert höher ist.
    Es gibt nur einen Spieler gegen die AI, dabei bekommen beide je eine zufällig Karte,
    Die höhere Karte gewinnt.

  Version 1.0:
    Travis einrichten!
    Ticketsystem erstellen
    Spieler erhalten nun Chips, die gesetzt werden können. Die Anzahl an Chips ist frei Wählbar.
    Spiel geht bis einer keine Chips mehr hat
    es werden Wahlweise 1-5 Karten ausgeteilt
    Die Hand mit der höchsten Karte gewinnt, bei gleichwertigen Karten gibt es unentschieden
    Das Spiel geht bis der Spieler aufhören will oder keine Chips mehr hat

  Version 2.0:
    Docker einrichten
    Anzahl Spieler lässt sich jetzt frei Wählen (bis zu zehn)
    Spieler können alle eine AI oder ein Mensch sein.
    Hand Rankings werden erkannt (e.g. Fullhouse)
    Implementiere einer Undo und Redo Funktion.

  Version 3.0:
    Volle Pattern Implementierung (Vor allem Observer)
    Implementieren einer Speicherversion
    Unterscheidung zwischen den Pokervarianten Texas Hold'em und Draw

  Version 4.0:
    Implementiere eine GUI

  Version 5.0:
    Implementiere Änderungsmöglichkeiten für die GUI

  Version X:
    Weitere Pokerversionen Implementieren

   */
}
