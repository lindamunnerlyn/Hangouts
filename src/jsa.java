// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jsa
{

    private static final jru a = new jsc();
    private static final jpp b = jpp.b().a(new jsd()).a();

    public static jsj a(Object obj)
    {
        return new jsi(obj);
    }

    public static jsj a(Throwable throwable)
    {
        n.b(throwable);
        return new jsg(throwable);
    }

    public static jsj a(jsj jsj1, jgt jgt)
    {
        n.b(jgt);
        jgt = new jse(new jsb(jgt), jsj1);
        jsj1.a(jgt, g.A());
        return jgt;
    }

}
