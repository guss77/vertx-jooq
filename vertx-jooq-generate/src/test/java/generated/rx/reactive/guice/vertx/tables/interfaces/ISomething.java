/*
 * This file is generated by jOOQ.
 */
package generated.rx.reactive.guice.vertx.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ISomething extends VertxPojo, Serializable {

    /**
     * Setter for <code>vertx.something.someId</code>.
     */
    public ISomething setSomeid(Integer value);

    /**
     * Getter for <code>vertx.something.someId</code>.
     */
    public Integer getSomeid();

    /**
     * Setter for <code>vertx.something.someString</code>.
     */
    public ISomething setSomestring(String value);

    /**
     * Getter for <code>vertx.something.someString</code>.
     */
    public String getSomestring();

    /**
     * Setter for <code>vertx.something.someHugeNumber</code>.
     */
    public ISomething setSomehugenumber(Long value);

    /**
     * Getter for <code>vertx.something.someHugeNumber</code>.
     */
    public Long getSomehugenumber();

    /**
     * Setter for <code>vertx.something.someSmallNumber</code>.
     */
    public ISomething setSomesmallnumber(Short value);

    /**
     * Getter for <code>vertx.something.someSmallNumber</code>.
     */
    public Short getSomesmallnumber();

    /**
     * Setter for <code>vertx.something.someRegularNumber</code>.
     */
    public ISomething setSomeregularnumber(Integer value);

    /**
     * Getter for <code>vertx.something.someRegularNumber</code>.
     */
    public Integer getSomeregularnumber();

    /**
     * Setter for <code>vertx.something.someDouble</code>.
     */
    public ISomething setSomedouble(Double value);

    /**
     * Getter for <code>vertx.something.someDouble</code>.
     */
    public Double getSomedouble();

    /**
     * Setter for <code>vertx.something.someJsonObject</code>.
     */
    public ISomething setSomejsonobject(JsonObject value);

    /**
     * Getter for <code>vertx.something.someJsonObject</code>.
     */
    public JsonObject getSomejsonobject();

    /**
     * Setter for <code>vertx.something.someJsonArray</code>.
     */
    public ISomething setSomejsonarray(JsonArray value);

    /**
     * Getter for <code>vertx.something.someJsonArray</code>.
     */
    public JsonArray getSomejsonarray();

    /**
     * Setter for <code>vertx.something.someTimestamp</code>.
     */
    public ISomething setSometimestamp(LocalDateTime value);

    /**
     * Getter for <code>vertx.something.someTimestamp</code>.
     */
    public LocalDateTime getSometimestamp();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ISomething
     */
    public void from(generated.rx.reactive.guice.vertx.tables.interfaces.ISomething from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ISomething
     */
    public <E extends generated.rx.reactive.guice.vertx.tables.interfaces.ISomething> E into(E into);

    @Override
    public default ISomething fromJson(io.vertx.core.json.JsonObject json) {
        setSomeid(json.getInteger("someId"));
        setSomestring(json.getString("someString"));
        setSomehugenumber(json.getLong("someHugeNumber"));
        setSomesmallnumber(json.getInteger("someSmallNumber")==null?null:json.getInteger("someSmallNumber").shortValue());
        setSomeregularnumber(json.getInteger("someRegularNumber"));
        setSomedouble(json.getDouble("someDouble"));
        setSomejsonobject(json.getJsonObject("someJsonObject"));
        setSomejsonarray(json.getJsonArray("someJsonArray"));
        // Omitting unrecognized type java.time.LocalDateTime for column someTimestamp!
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("someId",getSomeid());
        json.put("someString",getSomestring());
        json.put("someHugeNumber",getSomehugenumber());
        json.put("someSmallNumber",getSomesmallnumber());
        json.put("someRegularNumber",getSomeregularnumber());
        json.put("someDouble",getSomedouble());
        json.put("someJsonObject",getSomejsonobject());
        json.put("someJsonArray",getSomejsonarray());
        // Omitting unrecognized type java.time.LocalDateTime for column someTimestamp!
        return json;
    }

}
