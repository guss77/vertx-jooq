/*
 * This file is generated by jOOQ.
*/
package generated.classic.async.regular.tables.daos;


import generated.classic.async.regular.enums.SomethingSomeenum;
import generated.classic.async.regular.tables.Something;
import generated.classic.async.regular.tables.records.SomethingRecord;
import io.github.jklingsporn.vertx.jooq.classic.async.AsyncClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.async.AbstractAsyncVertxDAO;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import org.jooq.Configuration;

import javax.annotation.Generated;
import java.time.LocalDateTime;
import java.util.List;
/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SomethingDao extends AbstractAsyncVertxDAO<SomethingRecord, generated.classic.async.regular.tables.pojos.Something, Integer, Future<List<generated.classic.async.regular.tables.pojos.Something>>, Future<generated.classic.async.regular.tables.pojos.Something>, Future<Integer>, Future<Integer>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<SomethingRecord,generated.classic.async.regular.tables.pojos.Something,Integer> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the MYSQL types or POSTGRES.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public SomethingDao(Configuration configuration, io.vertx.ext.asyncsql.AsyncSQLClient delegate) {
        super(Something.SOMETHING, generated.classic.async.regular.tables.pojos.Something.class, new AsyncClassicQueryExecutor<SomethingRecord,generated.classic.async.regular.tables.pojos.Something,Integer>(configuration,delegate,generated.classic.async.regular.tables.pojos.Something::new, Something.SOMETHING));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(generated.classic.async.regular.tables.pojos.Something object) {
        return object.getSomeid();
    }

    /**
     * Find records that have <code>someString IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.async.regular.tables.pojos.Something>> findManyBySomestring(List<String> values) {
        return findManyByCondition(Something.SOMETHING.SOMESTRING.in(values));
    }

    /**
     * Find records that have <code>someHugeNumber IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.async.regular.tables.pojos.Something>> findManyBySomehugenumber(List<Long> values) {
        return findManyByCondition(Something.SOMETHING.SOMEHUGENUMBER.in(values));
    }

    /**
     * Find records that have <code>someSmallNumber IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.async.regular.tables.pojos.Something>> findManyBySomesmallnumber(List<Short> values) {
        return findManyByCondition(Something.SOMETHING.SOMESMALLNUMBER.in(values));
    }

    /**
     * Find records that have <code>someRegularNumber IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.async.regular.tables.pojos.Something>> findManyBySomeregularnumber(List<Integer> values) {
        return findManyByCondition(Something.SOMETHING.SOMEREGULARNUMBER.in(values));
    }

    /**
     * Find records that have <code>someDouble IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.async.regular.tables.pojos.Something>> findManyBySomedouble(List<Double> values) {
        return findManyByCondition(Something.SOMETHING.SOMEDOUBLE.in(values));
    }

    /**
     * Find records that have <code>someEnum IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.async.regular.tables.pojos.Something>> findManyBySomeenum(List<SomethingSomeenum> values) {
        return findManyByCondition(Something.SOMETHING.SOMEENUM.in(values));
    }

    /**
     * Find records that have <code>someJsonObject IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.async.regular.tables.pojos.Something>> findManyBySomejsonobject(List<JsonObject> values) {
        return findManyByCondition(Something.SOMETHING.SOMEJSONOBJECT.in(values));
    }

    /**
     * Find records that have <code>someJsonArray IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.async.regular.tables.pojos.Something>> findManyBySomejsonarray(List<JsonArray> values) {
        return findManyByCondition(Something.SOMETHING.SOMEJSONARRAY.in(values));
    }

    /**
     * Find records that have <code>someTimestamp IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.async.regular.tables.pojos.Something>> findManyBySometimestamp(List<LocalDateTime> values) {
        return findManyByCondition(Something.SOMETHING.SOMETIMESTAMP.in(values));
    }

    @Override
    public AsyncClassicQueryExecutor<SomethingRecord,generated.classic.async.regular.tables.pojos.Something,Integer> queryExecutor(){
        return (AsyncClassicQueryExecutor<SomethingRecord,generated.classic.async.regular.tables.pojos.Something,Integer>) super.queryExecutor();
    }

    @Override
    protected java.util.function.Function<Object,Integer> keyConverter(){
        return lastId -> Integer.valueOf(((io.vertx.core.json.JsonArray)lastId).getLong(0).intValue());
    }
}
