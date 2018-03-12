/*
 * This file is generated by jOOQ.
*/
package generated.cf.async.guice;


import generated.cf.async.guice.tables.Something;
import generated.cf.async.guice.tables.Somethingcomposite;
import generated.cf.async.guice.tables.Somethingwithoutjson;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code></code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index SOMETHING_PRIMARY = Indexes0.SOMETHING_PRIMARY;
    public static final Index SOMETHINGCOMPOSITE_PRIMARY = Indexes0.SOMETHINGCOMPOSITE_PRIMARY;
    public static final Index SOMETHINGWITHOUTJSON_PRIMARY = Indexes0.SOMETHINGWITHOUTJSON_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index SOMETHING_PRIMARY = Internal.createIndex("PRIMARY", Something.SOMETHING, new OrderField[] { Something.SOMETHING.SOMEID }, true);
        public static Index SOMETHINGCOMPOSITE_PRIMARY = Internal.createIndex("PRIMARY", Somethingcomposite.SOMETHINGCOMPOSITE, new OrderField[] { Somethingcomposite.SOMETHINGCOMPOSITE.SOMEID, Somethingcomposite.SOMETHINGCOMPOSITE.SOMESECONDID }, true);
        public static Index SOMETHINGWITHOUTJSON_PRIMARY = Internal.createIndex("PRIMARY", Somethingwithoutjson.SOMETHINGWITHOUTJSON, new OrderField[] { Somethingwithoutjson.SOMETHINGWITHOUTJSON.SOMEID }, true);
    }
}
