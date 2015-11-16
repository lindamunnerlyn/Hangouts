// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


abstract class jlu extends jlh
{

    jlu(Object obj, Object obj1)
    {
        super(obj, obj1);
        g.d(obj, obj1);
    }

    jlu(jlu jlu1)
    {
        super(jlu1.getKey(), jlu1.getValue());
    }

    abstract jlu a();

    abstract jlu b();
}
