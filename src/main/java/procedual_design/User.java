package procedual_design;

import java.time.LocalDateTime;

public class User {
    private License license;

    public User(License license) {
        this.license = license;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }
}
