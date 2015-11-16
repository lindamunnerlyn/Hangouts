// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

final class jsw
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final jso a;

    jsw(jso jso1)
    {
        a = jso1;
    }

    Object readResolve()
    {
        return a.d();
    }
}
