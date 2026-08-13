package xyz.segurapass.api.mfa;

public record TotpPayload(
        MfaType mfaType,
        String nonce
)
{}
