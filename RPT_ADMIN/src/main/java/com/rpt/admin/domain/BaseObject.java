package com.rpt.admin.domain;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * λͺ¨λ  ?λ©μΈ κ°μ²΄κ°? ??λ°μ?Ό?  κΈ°λ³Έ ?΄??€.
 *
 */
public class BaseObject implements Serializable {
    /**
     * Use serialVersionUID science
     */
    private static final long serialVersionUID = 4711031603329794236L;

    /**
     * ?΄?Ή κ°μ²΄? toString ?€λ²λΌ?΄?.
     *
     * @return κ°μ²΄? κ°? ?λ‘νΌ?°?? ?΄?Ή κ°μ textλ‘? ? κ³?
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    /**
     * ?΄?Ή κ°μ²΄? equals ?€λ²λΌ?΄?.
     *
     * @param obj λΉκ΅ ??? κ°μ²΄
     * @return λΉκ΅ ??? κ°μ²΄?? κ°? ?λ‘νΌ?°κ°μ΄ ??Ό? κ²½μ° <code>tue</code>λ°ν
     */
    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    /**
     * ?΄?Ή κ°μ²΄? hashCode ?€λ²λΌ?΄?.
     *
     * @return the int
     */
    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}