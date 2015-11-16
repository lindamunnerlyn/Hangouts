// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public abstract class kml extends klk
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public knr b;

    public kml()
    {
        b = knr.a();
    }

    public abstract kml d();

    protected Object writeReplace()
    {
        return new kmm(this);
    }
}
