// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public final class efm
    implements Serializable
{

    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final int e;

    public efm(String s, String s1, int i)
    {
        a = s;
        b = s1;
        c = null;
        d = false;
        e = i;
    }

    public efm(String s, String s1, String s2)
    {
        a = s;
        b = s1;
        c = s2;
        d = true;
        e = 0;
    }
}
