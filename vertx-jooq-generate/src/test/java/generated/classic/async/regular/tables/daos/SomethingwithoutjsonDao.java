/*
 * This file is generated by jOOQ.
 */
package generated.classic.async.regular.tables.daos;


import generated.classic.async.regular.tables.Somethingwithoutjson;
import generated.classic.async.regular.tables.records.SomethingwithoutjsonRecord;

import io.github.jklingsporn.vertx.jooq.shared.async.AbstractAsyncVertxDAO;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;


import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.async.AsyncClassicQueryExecutor;
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
public class SomethingwithoutjsonDao extends AbstractAsyncVertxDAO<SomethingwithoutjsonRecord, generated.classic.async.regular.tables.pojos.Somethingwithoutjson, Integer, Future<List<generated.classic.async.regular.tables.pojos.Somethingwithoutjson>>, Future<generated.classic.async.regular.tables.pojos.Somethingwithoutjson>, Future<Integer>, Future<Integer>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<SomethingwithoutjsonRecord,generated.classic.async.regular.tables.pojos.Somethingwithoutjson,Integer> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the MYSQL types or POSTGRES.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public SomethingwithoutjsonDao(Configuration configuration, io.vertx.ext.asyncsql.AsyncSQLClient delegate) {
        super(Somethingwithoutjson.SOMETHINGWITHOUTJSON, generated.classic.async.regular.tables.pojos.Somethingwithoutjson.class, new AsyncClassicQueryExecutor<SomethingwithoutjsonRecord,generated.classic.async.regular.tables.pojos.Somethingwithoutjson,Integer>(configuration,delegate,generated.classic.async.regular.tables.pojos.Somethingwithoutjson::new, Somethingwithoutjson.SOMETHINGWITHOUTJSON));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(generated.classic.async.regular.tables.pojos.Somethingwithoutjson object) {
        return object.getSomeid();
    }

    /**
     * Find records that have <code>someString IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.async.regular.tables.pojos.Somethingwithoutjson>> findManyBySomestring(List<String> values) {
        return findManyByCondition(Somethingwithoutjson.SOMETHINGWITHOUTJSON.SOMESTRING.in(values));
    }

    @Override
    public AsyncClassicQueryExecutor<SomethingwithoutjsonRecord,generated.classic.async.regular.tables.pojos.Somethingwithoutjson,Integer> queryExecutor(){
        return (AsyncClassicQueryExecutor<SomethingwithoutjsonRecord,generated.classic.async.regular.tables.pojos.Somethingwithoutjson,Integer>) super.queryExecutor();
    }

    @Override
    protected java.util.function.Function<Object,Integer> keyConverter(){
        return lastId -> Integer.valueOf(((io.vertx.core.json.JsonArray)lastId).getLong(0).intValue());
    }
}
