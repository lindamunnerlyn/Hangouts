// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

final class jla
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final jle a;

    jla(jle jle1)
    {
        a = jle1;
    }

    Object readResolve()
    {
        return a.b();
    }
}
