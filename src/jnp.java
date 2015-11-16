// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jnp extends jno
{

    final String b;
    final jno c;

    jnp(jno jno1, jno jno2, String s)
    {
        c = jno1;
        b = s;
        super(jno2);
    }

    CharSequence a(Object obj)
    {
        if (obj == null)
        {
            return b;
        } else
        {
            return c.a(obj);
        }
    }

    public jno b(String s)
    {
        throw new UnsupportedOperationException("already specified useForNull");
    }
}
