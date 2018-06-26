/*
 * This file is generated by jOOQ.
 */
package generated.rx.reactive.regular.vertx;


import generated.rx.reactive.regular.vertx.tables.Something;
import generated.rx.reactive.regular.vertx.tables.Somethingcomposite;
import generated.rx.reactive.regular.vertx.tables.Somethingwithoutjson;
import generated.rx.reactive.regular.vertx.tables.records.SomethingRecord;
import generated.rx.reactive.regular.vertx.tables.records.SomethingcompositeRecord;
import generated.rx.reactive.regular.vertx.tables.records.SomethingwithoutjsonRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>vertx</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<SomethingRecord, Integer> IDENTITY_SOMETHING = Identities0.IDENTITY_SOMETHING;
    public static final Identity<SomethingwithoutjsonRecord, Integer> IDENTITY_SOMETHINGWITHOUTJSON = Identities0.IDENTITY_SOMETHINGWITHOUTJSON;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<SomethingRecord> SOMETHING_PKEY = UniqueKeys0.SOMETHING_PKEY;
    public static final UniqueKey<SomethingcompositeRecord> SOMETHINGCOMPOSITE_PKEY = UniqueKeys0.SOMETHINGCOMPOSITE_PKEY;
    public static final UniqueKey<SomethingwithoutjsonRecord> SOMETHINGWITHOUTJSON_PKEY = UniqueKeys0.SOMETHINGWITHOUTJSON_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<SomethingRecord, Integer> IDENTITY_SOMETHING = Internal.createIdentity(Something.SOMETHING, Something.SOMETHING.SOMEID);
        public static Identity<SomethingwithoutjsonRecord, Integer> IDENTITY_SOMETHINGWITHOUTJSON = Internal.createIdentity(Somethingwithoutjson.SOMETHINGWITHOUTJSON, Somethingwithoutjson.SOMETHINGWITHOUTJSON.SOMEID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<SomethingRecord> SOMETHING_PKEY = Internal.createUniqueKey(Something.SOMETHING, "something_pkey", Something.SOMETHING.SOMEID);
        public static final UniqueKey<SomethingcompositeRecord> SOMETHINGCOMPOSITE_PKEY = Internal.createUniqueKey(Somethingcomposite.SOMETHINGCOMPOSITE, "somethingComposite_pkey", Somethingcomposite.SOMETHINGCOMPOSITE.SOMEID, Somethingcomposite.SOMETHINGCOMPOSITE.SOMESECONDID);
        public static final UniqueKey<SomethingwithoutjsonRecord> SOMETHINGWITHOUTJSON_PKEY = Internal.createUniqueKey(Somethingwithoutjson.SOMETHINGWITHOUTJSON, "somethingWithoutJson_pkey", Somethingwithoutjson.SOMETHINGWITHOUTJSON.SOMEID);
    }
}
