// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.EnumSet;

final class jlj
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final EnumSet a;

    jlj(EnumSet enumset)
    {
        a = enumset;
    }

    Object readResolve()
    {
        return new jli(a.clone());
    }
}
