// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

final class jxi
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private final jsa a;

    jxi(jsa jsa1)
    {
        a = jsa1;
    }

    Object readResolve()
    {
        return a.a();
    }
}
