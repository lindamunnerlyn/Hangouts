// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jsc extends jsr
{

    private static final long serialVersionUID = 0L;

    jsc(jsa jsa)
    {
        super(jsa);
    }

    Object readResolve()
    {
        return a(new jsb());
    }
}
