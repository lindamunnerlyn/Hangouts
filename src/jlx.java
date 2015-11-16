// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

final class jlx
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final jlr a;

    jlx(jlr jlr1)
    {
        a = jlr1;
    }

    Object readResolve()
    {
        return a.b();
    }
}
