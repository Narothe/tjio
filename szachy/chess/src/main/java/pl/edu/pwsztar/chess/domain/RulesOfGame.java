package pl.edu.pwsztar.chess.domain;

public interface RulesOfGame {

    /**
     * Metoda zwraca true, tylko gdy przejscie z polozenia
     * source na destination w jednym ruchu jest zgodne
     * z zasadami gry w szachy
     */
    boolean isCorrectMove(Point source, Point destination);

    class Bishop implements RulesOfGame {

        @Override
        public boolean isCorrectMove(Point source, Point destination) {
            if(source.x() == destination.x() && source.y() == destination.y()) {
                return false;
            }

            return Math.abs(destination.x() - source.x()) == Math.abs(destination.y() - source.y());
        }
    }

    class Knight implements RulesOfGame {

        @Override
        public boolean isCorrectMove(Point source, Point destination) {
            if (source.x() == destination.x() && source.y() == destination.y()) {
                return false;
            }

            return Math.abs(destination.x() - source.x()) == 2 && Math.abs(destination.y() - source.y()) == 1 ||
                    Math.abs(destination.x() - source.x()) == 1 && Math.abs(destination.y() - source.y()) == 2;
        }
    }

    class Pawn implements RulesOfGame {

        @Override
        public boolean isCorrectMove(Point source, Point destination) {
            if (source.x() == destination.x() && source.y() + 1 == destination.y()){
                return true;
            }

            return source.x() == destination.x() && source.y() == 2;
        }

    }

    class King implements RulesOfGame {

        @Override
        public boolean isCorrectMove(Point source, Point destination) {
            if (source.x() == destination.x() && source.y() == destination.y()) {
                return false;
            }

            return Math.abs(destination.x() - source.x()) <= 1 && Math.abs(destination.y() - source.y()) <= 1;
        }
    }

    class Rook implements RulesOfGame {

        @Override
        public boolean isCorrectMove(Point source, Point destination) {
            if (source.x() == destination.x() && source.y() == destination.y()) {
                return false;
            }

            return source.x() == destination.x() || source.y() == destination.y();

        }
    }

    class Queen implements RulesOfGame {

        @Override
        public boolean isCorrectMove(Point source, Point destination) {
            if (source.x() == destination.x() && source.y() == destination.y()) {
                return false;
            }

            return Math.abs(destination.x() - source.x()) == Math.abs(destination.y() - source.y()) ||
                    source.x() == destination.x() || source.y() == destination.y();
        }
    }
    // TODO: Prosze dokonczyc implementacje kolejnych figur szachowych: Knight, Queen
    // TODO: Prosze stosowac zaproponowane nazwy klas !!!
    // TODO: Kazda klasa powinna implementowac interfejs RulesOfGame
}
