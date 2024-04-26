package pl.edu.pwsztar.chess.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.edu.pwsztar.chess.domain.RulesOfGame;
import pl.edu.pwsztar.chess.dto.FigureMoveDto;
import pl.edu.pwsztar.chess.dto.FigureType;
import pl.edu.pwsztar.chess.service.ChessService;

import java.util.HashMap;
import java.util.Map;

@Service
public class ChessServiceImpl implements ChessService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ChessServiceImpl.class);

    private Map<FigureType, RulesOfGame> mapper = new HashMap<>();

    public ChessServiceImpl() {
        mapper = Map.of(
                FigureType.BISHOP, new RulesOfGame.Bishop(),
                FigureType.KNIGHT, new RulesOfGame.Knight(),
                FigureType.PAWN, new RulesOfGame.Pawn(),
//                FigureType.QUEEN, new RulesOfGame.Queen(),
//                FigureType.ROOK, new RulesOfGame.Rook(),
                  FigureType.KING, new RulesOfGame.King()
        );
    }

    public boolean isCorrectMove(FigureMoveDto figureMoveDto) {

        final var source = figureMoveDto.convertToSourcePoint();
        final var destination = figureMoveDto.convertToDestinationPoint();

        LOGGER.info("*** move after convert, source      : {}", source);
        LOGGER.info("*** move after convert, destination : {}", destination);

        return mapper.get(figureMoveDto.figureType()).isCorrectMove(source, destination);

    }
}
