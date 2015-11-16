// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jgv extends jgu
{

    final String b;
    final jgu c;

    jgv(jgu jgu1, jgu jgu2, String s)
    {
        c = jgu1;
        b = s;
        super(jgu2);
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

    public jgu b(String s)
    {
        throw new UnsupportedOperationException("already specified useForNull");
    }
}
