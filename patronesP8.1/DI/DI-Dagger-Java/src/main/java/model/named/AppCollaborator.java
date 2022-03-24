package model.named;

import java.util.UUID;

public class AppCollaborator implements IAppCollaborator {
    private final String id = UUID.randomUUID().toString();


    @Override
    public String getName() {
        return "AppCollaborator id: " + id;
    }

    @Override
    public String toString() {
        return "AppCollaborator{" +
                "id='" + id + '\'' +
                '}';
    }
}
