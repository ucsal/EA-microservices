package user.user.shared;


import lombok.Getter;

@Getter
public class DomainException extends RuntimeException {

    private final DomainExceptionCode code;

    public DomainException(String message) {
        super(message);
        this.code = DomainExceptionCode.DOMAIN_ERROR;
    }

    public DomainException(String message, DomainExceptionCode code) {
        super(message);
        this.code = code;
    }

    public DomainException(String message, Throwable cause) {
        super(message, cause);
        this.code = DomainExceptionCode.DOMAIN_ERROR;
    }

    public DomainException(String message, DomainExceptionCode code, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}
