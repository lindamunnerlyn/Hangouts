// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

final class jpx
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private final jlb a;

    jpx(jlb jlb1)
    {
        a = jlb1;
    }

    Object readResolve()
    {
        return a.a();
    }
}
