package ru.team.up.core.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;


/**
 * @author Alexey Tkachenko
 */
public class NoContentException extends ResponseStatusException {
    public NoContentException() {
        super(HttpStatus.NO_CONTENT, "Список пользователей пуст.");
    }
}
