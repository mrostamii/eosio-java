package one.block.eosiojava.error.session;

import org.jetbrains.annotations.NotNull;

public class TransactionSerializeError extends TransactionProcessorError {

    public TransactionSerializeError() {
    }

    public TransactionSerializeError(@NotNull String message) {
        super(message);
    }

    public TransactionSerializeError(@NotNull String message,
            @NotNull Exception exception) {
        super(message, exception);
    }

    public TransactionSerializeError(@NotNull Exception exception) {
        super(exception);
    }
}
