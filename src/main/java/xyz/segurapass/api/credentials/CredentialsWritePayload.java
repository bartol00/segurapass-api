package xyz.segurapass.api.credentials;

import java.util.UUID;

public record CredentialsWritePayload(
        String website,
        String username,
        String password,
        String ivWebsite,
        String ivUsername,
        String ivPassword,
        String nonce,
        CredentialsOperation operation,
        UUID credentialId
) {}
