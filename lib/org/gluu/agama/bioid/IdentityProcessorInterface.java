package org.gluu.agama.bioid;

import java.util.Map;

public interface IdentityProcessorInterface {

    public boolean authenticate(String username, String password);

    public Map<String, String> accountFromUsername(String username);

}
