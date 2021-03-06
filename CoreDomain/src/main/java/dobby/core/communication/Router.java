package dobby.core.communication;

import dobby.core.stakeholder.App;
import dobby.core.stakeholder.Stakeholder;
import dobby.core.stakeholder.User;

/**
 * Created by gautierc on 19/01/16.
 */
public interface Router {
    void accept(Message msg);
    void notify(Stakeholder stakeholder);
    void logError(Exception e);
    void userHasLeft(User user);
    void appHasLeft(App app);
}
