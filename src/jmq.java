// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jmq extends jnv
{

    static final jmq a = new jmq();
    private static final long serialVersionUID = 0L;

    private jmq()
    {
    }

    public static jnv a()
    {
        return a;
    }

    private Object readResolve()
    {
        return a;
    }

    public Object a(Object obj)
    {
        return n.b(obj, "use Optional.orNull() instead of Optional.or(null)");
    }

    public boolean b()
    {
        return false;
    }

    public Object c()
    {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public boolean equals(Object obj)
    {
        return obj == this;
    }

    public int hashCode()
    {
        return 0x79a31aac;
    }

    public String toString()
    {
        return "Optional.absent()";
    }

}
