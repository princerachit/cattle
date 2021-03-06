/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables.records;


import io.cattle.platform.core.model.AuthToken;
import io.cattle.platform.core.model.tables.AuthTokenTable;
import io.cattle.platform.db.jooq.utils.TableRecordJaxb;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "auth_token", schema = "cattle")
public class AuthTokenRecord extends UpdatableRecordImpl<AuthTokenRecord> implements TableRecordJaxb, Record9<Long, Long, Date, Date, String, String, String, String, Long>, AuthToken {

    private static final long serialVersionUID = 1354219238;

    /**
     * Setter for <code>cattle.auth_token.id</code>.
     */
    @Override
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>cattle.auth_token.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 19)
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>cattle.auth_token.account_id</code>.
     */
    @Override
    public void setAccountId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>cattle.auth_token.account_id</code>.
     */
    @Column(name = "account_id", nullable = false, precision = 19)
    @Override
    public Long getAccountId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>cattle.auth_token.created</code>.
     */
    @Override
    public void setCreated(Date value) {
        set(2, value);
    }

    /**
     * Getter for <code>cattle.auth_token.created</code>.
     */
    @Column(name = "created", nullable = false)
    @Override
    public Date getCreated() {
        return (Date) get(2);
    }

    /**
     * Setter for <code>cattle.auth_token.expires</code>.
     */
    @Override
    public void setExpires(Date value) {
        set(3, value);
    }

    /**
     * Getter for <code>cattle.auth_token.expires</code>.
     */
    @Column(name = "expires", nullable = false)
    @Override
    public Date getExpires() {
        return (Date) get(3);
    }

    /**
     * Setter for <code>cattle.auth_token.key</code>.
     */
    @Override
    public void setKey(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>cattle.auth_token.key</code>.
     */
    @Column(name = "key", unique = true, nullable = false, length = 40)
    @Override
    public String getKey() {
        return (String) get(4);
    }

    /**
     * Setter for <code>cattle.auth_token.value</code>.
     */
    @Override
    public void setValue(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>cattle.auth_token.value</code>.
     */
    @Column(name = "value", nullable = false, length = 16777215)
    @Override
    public String getValue() {
        return (String) get(5);
    }

    /**
     * Setter for <code>cattle.auth_token.version</code>.
     */
    @Override
    public void setVersion(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>cattle.auth_token.version</code>.
     */
    @Column(name = "version", nullable = false, length = 255)
    @Override
    public String getVersion() {
        return (String) get(6);
    }

    /**
     * Setter for <code>cattle.auth_token.provider</code>.
     */
    @Override
    public void setProvider(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>cattle.auth_token.provider</code>.
     */
    @Column(name = "provider", nullable = false, length = 255)
    @Override
    public String getProvider() {
        return (String) get(7);
    }

    /**
     * Setter for <code>cattle.auth_token.authenticated_as_account_id</code>.
     */
    @Override
    public void setAuthenticatedAsAccountId(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>cattle.auth_token.authenticated_as_account_id</code>.
     */
    @Column(name = "authenticated_as_account_id", precision = 19)
    @Override
    public Long getAuthenticatedAsAccountId() {
        return (Long) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, Long, Date, Date, String, String, String, String, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, Long, Date, Date, String, String, String, String, Long> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return AuthTokenTable.AUTH_TOKEN.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return AuthTokenTable.AUTH_TOKEN.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field3() {
        return AuthTokenTable.AUTH_TOKEN.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field4() {
        return AuthTokenTable.AUTH_TOKEN.EXPIRES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return AuthTokenTable.AUTH_TOKEN.KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return AuthTokenTable.AUTH_TOKEN.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return AuthTokenTable.AUTH_TOKEN.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return AuthTokenTable.AUTH_TOKEN.PROVIDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return AuthTokenTable.AUTH_TOKEN.AUTHENTICATED_AS_ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value3() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value4() {
        return getExpires();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getProvider();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getAuthenticatedAsAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthTokenRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthTokenRecord value2(Long value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthTokenRecord value3(Date value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthTokenRecord value4(Date value) {
        setExpires(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthTokenRecord value5(String value) {
        setKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthTokenRecord value6(String value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthTokenRecord value7(String value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthTokenRecord value8(String value) {
        setProvider(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthTokenRecord value9(Long value) {
        setAuthenticatedAsAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthTokenRecord values(Long value1, Long value2, Date value3, Date value4, String value5, String value6, String value7, String value8, Long value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(AuthToken from) {
        setId(from.getId());
        setAccountId(from.getAccountId());
        setCreated(from.getCreated());
        setExpires(from.getExpires());
        setKey(from.getKey());
        setValue(from.getValue());
        setVersion(from.getVersion());
        setProvider(from.getProvider());
        setAuthenticatedAsAccountId(from.getAuthenticatedAsAccountId());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends AuthToken> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuthTokenRecord
     */
    public AuthTokenRecord() {
        super(AuthTokenTable.AUTH_TOKEN);
    }

    /**
     * Create a detached, initialised AuthTokenRecord
     */
    public AuthTokenRecord(Long id, Long accountId, Date created, Date expires, String key, String value, String version, String provider, Long authenticatedAsAccountId) {
        super(AuthTokenTable.AUTH_TOKEN);

        set(0, id);
        set(1, accountId);
        set(2, created);
        set(3, expires);
        set(4, key);
        set(5, value);
        set(6, version);
        set(7, provider);
        set(8, authenticatedAsAccountId);
    }
}
