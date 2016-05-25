package org.rundeck.client.belt;

/**
 * Created by greg on 5/23/16.
 */
public class CommandRunFailure extends Exception {
    public CommandRunFailure() {
    }

    public CommandRunFailure(final String message) {
        super(message);
    }

    public CommandRunFailure(final String message, final Throwable cause) {
        super(message, cause);
    }

    public CommandRunFailure(final Throwable cause) {
        super(cause);
    }

    public CommandRunFailure(
            final String message,
            final Throwable cause,
            final boolean enableSuppression,
            final boolean writableStackTrace
    )
    {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}