package xyz.segurapass.api.credentials;

import java.util.UUID;

public record CredentialsWritePayload(
        byte[] website,
        byte[] username,
        byte[] password,
        byte[] ivWebsite,
        byte[] ivUsername,
        byte[] ivPassword,
        String nonce,
        CredentialsOperation operation,
        UUID credentialId
) {}
