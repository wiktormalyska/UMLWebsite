import com.wiktormalyska.Website;
import com.wiktormalyska.user.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TWebsite {

    @Test
    public void testLogin(){
        User user = Website.login("customer2", "customer");
        assertNotEquals(null, user);
    }

    @Test
    public void testCreateAccount(){
        Website.createAccount("customer3", "customer", false);
        User user = Website.login("customer3", "customer");
        assertNotEquals(null, user);
    }

}
