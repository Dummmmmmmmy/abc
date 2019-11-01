package org.hibernate.dialect.identity;

import org.hibernate.dialect.Dialect;
import org.hibernate.id.PostInsertIdentityPersister;

public class TiberoIdentityColumnSupport
        extends IdentityColumnSupportImpl {
    public boolean supportsIdentityColumns() {
        return true;
    }

    public boolean supportsInsertSelectIdentity() {
        return true;
    }

    public String getIdentityColumnString(int type) {
        return "generated as identity";
    }

    public GetGeneratedKeysDelegate buildGetGeneratedKeysDelegate(PostInsertIdentityPersister persister, Dialect dialect) {
        return new TiberoGetGeneratedKeysDelegate(persister, dialect);
    }

    public String getIdentityInsertString() {
        return "default";
    }
}
