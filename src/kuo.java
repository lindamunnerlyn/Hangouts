// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public abstract class kuo extends ktn
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public kvu b;

    public kuo()
    {
        b = kvu.a();
    }

    public abstract kuo d();

    protected Object writeReplace()
    {
        return new kup(this);
    }
}
