package one.block.eosiojava.error.session;

import org.jetbrains.annotations.NotNull;

public class TransactionPrepareError extends TransactionProcessorError{

    public TransactionPrepareError() {
    }

    public TransactionPrepareError(@NotNull String message) {
        super(message);
    }

    public TransactionPrepareError(@NotNull String message,
            @NotNull Exception exception) {
        super(message, exception);
    }

    public TransactionPrepareError(@NotNull Exception exception) {
        super(exception);
    }
}
