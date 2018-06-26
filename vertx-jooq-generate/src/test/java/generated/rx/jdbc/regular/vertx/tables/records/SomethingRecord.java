/*
 * This file is generated by jOOQ.
 */
package generated.rx.jdbc.regular.vertx.tables.records;


import generated.rx.jdbc.regular.vertx.tables.Something;
import generated.rx.jdbc.regular.vertx.tables.interfaces.ISomething;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


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
public class SomethingRecord extends UpdatableRecordImpl<SomethingRecord> implements VertxPojo, Record10<Integer, String, Long, Short, Integer, Boolean, Double, JsonObject, JsonArray, LocalDateTime>, ISomething {

    private static final long serialVersionUID = -461884667;

    /**
     * Setter for <code>VERTX.SOMETHING.SOMEID</code>.
     */
    @Override
    public SomethingRecord setSomeid(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>VERTX.SOMETHING.SOMEID</code>.
     */
    @Override
    public Integer getSomeid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>VERTX.SOMETHING.SOMESTRING</code>.
     */
    @Override
    public SomethingRecord setSomestring(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>VERTX.SOMETHING.SOMESTRING</code>.
     */
    @Override
    public String getSomestring() {
        return (String) get(1);
    }

    /**
     * Setter for <code>VERTX.SOMETHING.SOMEHUGENUMBER</code>.
     */
    @Override
    public SomethingRecord setSomehugenumber(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>VERTX.SOMETHING.SOMEHUGENUMBER</code>.
     */
    @Override
    public Long getSomehugenumber() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>VERTX.SOMETHING.SOMESMALLNUMBER</code>.
     */
    @Override
    public SomethingRecord setSomesmallnumber(Short value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>VERTX.SOMETHING.SOMESMALLNUMBER</code>.
     */
    @Override
    public Short getSomesmallnumber() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>VERTX.SOMETHING.SOMEREGULARNUMBER</code>.
     */
    @Override
    public SomethingRecord setSomeregularnumber(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>VERTX.SOMETHING.SOMEREGULARNUMBER</code>.
     */
    @Override
    public Integer getSomeregularnumber() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>VERTX.SOMETHING.SOMEBOOLEAN</code>.
     */
    @Override
    public SomethingRecord setSomeboolean(Boolean value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>VERTX.SOMETHING.SOMEBOOLEAN</code>.
     */
    @Override
    public Boolean getSomeboolean() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>VERTX.SOMETHING.SOMEDOUBLE</code>.
     */
    @Override
    public SomethingRecord setSomedouble(Double value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>VERTX.SOMETHING.SOMEDOUBLE</code>.
     */
    @Override
    public Double getSomedouble() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>VERTX.SOMETHING.SOMEJSONOBJECT</code>.
     */
    @Override
    public SomethingRecord setSomejsonobject(JsonObject value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>VERTX.SOMETHING.SOMEJSONOBJECT</code>.
     */
    @Override
    public JsonObject getSomejsonobject() {
        return (JsonObject) get(7);
    }

    /**
     * Setter for <code>VERTX.SOMETHING.SOMEJSONARRAY</code>.
     */
    @Override
    public SomethingRecord setSomejsonarray(JsonArray value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>VERTX.SOMETHING.SOMEJSONARRAY</code>.
     */
    @Override
    public JsonArray getSomejsonarray() {
        return (JsonArray) get(8);
    }

    /**
     * Setter for <code>VERTX.SOMETHING.SOMETIMESTAMP</code>.
     */
    @Override
    public SomethingRecord setSometimestamp(LocalDateTime value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>VERTX.SOMETHING.SOMETIMESTAMP</code>.
     */
    @Override
    public LocalDateTime getSometimestamp() {
        return (LocalDateTime) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, Long, Short, Integer, Boolean, Double, JsonObject, JsonArray, LocalDateTime> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, Long, Short, Integer, Boolean, Double, JsonObject, JsonArray, LocalDateTime> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Something.SOMETHING.SOMEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Something.SOMETHING.SOMESTRING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Something.SOMETHING.SOMEHUGENUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return Something.SOMETHING.SOMESMALLNUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Something.SOMETHING.SOMEREGULARNUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return Something.SOMETHING.SOMEBOOLEAN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field7() {
        return Something.SOMETHING.SOMEDOUBLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<JsonObject> field8() {
        return Something.SOMETHING.SOMEJSONOBJECT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<JsonArray> field9() {
        return Something.SOMETHING.SOMEJSONARRAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field10() {
        return Something.SOMETHING.SOMETIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getSomeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getSomestring();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getSomehugenumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component4() {
        return getSomesmallnumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getSomeregularnumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component6() {
        return getSomeboolean();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component7() {
        return getSomedouble();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonObject component8() {
        return getSomejsonobject();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonArray component9() {
        return getSomejsonarray();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component10() {
        return getSometimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getSomeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSomestring();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getSomehugenumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value4() {
        return getSomesmallnumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getSomeregularnumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getSomeboolean();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value7() {
        return getSomedouble();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonObject value8() {
        return getSomejsonobject();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonArray value9() {
        return getSomejsonarray();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value10() {
        return getSometimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SomethingRecord value1(Integer value) {
        setSomeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SomethingRecord value2(String value) {
        setSomestring(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SomethingRecord value3(Long value) {
        setSomehugenumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SomethingRecord value4(Short value) {
        setSomesmallnumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SomethingRecord value5(Integer value) {
        setSomeregularnumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SomethingRecord value6(Boolean value) {
        setSomeboolean(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SomethingRecord value7(Double value) {
        setSomedouble(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SomethingRecord value8(JsonObject value) {
        setSomejsonobject(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SomethingRecord value9(JsonArray value) {
        setSomejsonarray(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SomethingRecord value10(LocalDateTime value) {
        setSometimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SomethingRecord values(Integer value1, String value2, Long value3, Short value4, Integer value5, Boolean value6, Double value7, JsonObject value8, JsonArray value9, LocalDateTime value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ISomething from) {
        setSomeid(from.getSomeid());
        setSomestring(from.getSomestring());
        setSomehugenumber(from.getSomehugenumber());
        setSomesmallnumber(from.getSomesmallnumber());
        setSomeregularnumber(from.getSomeregularnumber());
        setSomeboolean(from.getSomeboolean());
        setSomedouble(from.getSomedouble());
        setSomejsonobject(from.getSomejsonobject());
        setSomejsonarray(from.getSomejsonarray());
        setSometimestamp(from.getSometimestamp());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ISomething> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SomethingRecord
     */
    public SomethingRecord() {
        super(Something.SOMETHING);
    }

    /**
     * Create a detached, initialised SomethingRecord
     */
    public SomethingRecord(Integer someid, String somestring, Long somehugenumber, Short somesmallnumber, Integer someregularnumber, Boolean someboolean, Double somedouble, JsonObject somejsonobject, JsonArray somejsonarray, LocalDateTime sometimestamp) {
        super(Something.SOMETHING);

        set(0, someid);
        set(1, somestring);
        set(2, somehugenumber);
        set(3, somesmallnumber);
        set(4, someregularnumber);
        set(5, someboolean);
        set(6, somedouble);
        set(7, somejsonobject);
        set(8, somejsonarray);
        set(9, sometimestamp);
    }

    public SomethingRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
